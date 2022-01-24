package com.programming.service;

import com.pairprogramming.service.ExternalModuleService;
import com.pairprogramming.service.ValidationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ValidationServiceTest {

    @InjectMocks
    private ValidationService validationService;

    @Mock
    private ExternalModuleService mockExternalModuleService;

    @Test
    // to modify test scenario once implementation is included
    public void testReturnFalse(){
        assertFalse(validationService.validate());
    }

    @Test
    public void testCallsExternalModuleIfToggledOn(){
        validationService.toggleOn();
        validationService.validate();
        verify(mockExternalModuleService, times(1)).getWorkDayRecordFromExternal();
    }

    @Test
    public void testDoesNotCallExternalModuleIfToggledOff(){
        validationService.toggleOff();
        validationService.validate();
        verify(mockExternalModuleService, never()).getWorkDayRecordFromExternal();
    }
}

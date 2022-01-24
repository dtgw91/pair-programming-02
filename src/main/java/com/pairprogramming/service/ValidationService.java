package com.pairprogramming.service;

import com.pairprogramming.model.WorkDay;

import java.time.DayOfWeek;
import java.util.List;

public class ValidationService {

    public ValidationService(ExternalModuleService externalModuleService) {
        this.externalModuleService = externalModuleService;
    }

    // default to Off
    private boolean includeExternalToggle = false;
    private ExternalModuleService externalModuleService;

    public boolean validate(){
        if (includeExternalToggle){
            //to call externalservicemodule method here
            List<WorkDay> mondayWorkDay = externalModuleService.getWorkDayRecordFromExternal();
        }
        //to implement
        return false;
    }

    public void toggleOn(){
        includeExternalToggle = true;
    }

    public void toggleOff(){
        includeExternalToggle = false;
    }
}

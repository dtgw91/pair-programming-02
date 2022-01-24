package com.pairprogramming.service;

import com.pairprogramming.model.WorkDay;

import java.util.Collections;
import java.util.List;

public class ExternalModuleService {

    // can return null, empty list or list of WorkDay
    public List<WorkDay> getWorkDayRecordFromExternal(){
        //to mock
        return Collections.emptyList();
    }
}

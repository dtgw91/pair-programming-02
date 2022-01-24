package com.pairprogramming.model;

import java.time.DayOfWeek;

public class WorkDay {

    private DayOfWeek day;

    //workdays can be 0,0.5 or 1
    private double workdays;

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public double getWorkdays() {
        return workdays;
    }

    public void setWorkdays(double workdays) {
        this.workdays = workdays;
    }
}

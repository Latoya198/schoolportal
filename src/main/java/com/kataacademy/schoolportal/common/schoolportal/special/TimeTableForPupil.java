package com.kataacademy.schoolportal.common.schoolportal.special;

import com.kataacademy.schoolportal.common.models.schoolatribute.DayTimeTable;

import java.util.List;

public interface TimeTableForPupil {
    DayTimeTable getDayTimeTable();
    List<DayTimeTable> getWeekTimeTable();
}

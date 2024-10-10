package com.rhtoolrental;

import java.math.BigDecimal;

public class ToolPricing {
    private String toolType;
    private BigDecimal dailyCharge;
    private boolean weekdayCharge;
    private boolean weekendCharge;
    private boolean holidayCharge;

    public ToolPricing(String toolType, BigDecimal dailyCharge, boolean weekdayCharge, boolean weekendCharge, boolean holidayCharge) {
        this.toolType = toolType;
        this.dailyCharge = dailyCharge;
        this.weekdayCharge = weekdayCharge;
        this.weekendCharge = weekendCharge;
        this.holidayCharge = holidayCharge;
    }

    public String getToolType() {
        return toolType;
    }
    public BigDecimal getDailyCharge() {
        return dailyCharge;
    }
    public boolean isWeekdayCharge() {
        return weekdayCharge;
    }
    public boolean isWeekendCharge() {
        return weekendCharge;
    }
    public boolean isHolidayCharge() {
        return holidayCharge;
    }
    public String toString() {
        return toolType + " DailyChrg: $" + dailyCharge + " WeekDayChrg: " + weekdayCharge + " WeekEndChrg: " + weekendCharge + " HolidayChrg: " + holidayCharge;
    }
}

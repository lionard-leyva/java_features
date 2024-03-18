package com.java.features.oop.models;

import com.java.features.oop.interfaces.Empleado;
import lombok.Builder;

@Builder
public class PartTime implements Empleado {

    private final String name;
    private final int hoursWeek;
    private final boolean isIndefiniteContract;
    private final long grossSalary;

    public PartTime(String name,
                    int hoursWeek,
                    boolean isIndefiniteContract,
                    long grossSalary) {
        this.name = name;
        if (hoursWeek >= 40 || hoursWeek <= 20) {
            throw new IllegalArgumentException("Hours per week must be between 1 and 39");
        }
        this.hoursWeek = hoursWeek;
        this.isIndefiniteContract = isIndefiniteContract;
        this.grossSalary = grossSalary;
    }
    @Override
    public String name() {
        return name;
    }

    @Override
    public int hoursWeek() {
        return hoursWeek;
    }

    @Override
    public boolean indefiniteContract() {
        return isIndefiniteContract;
    }
    @Override
    public long liquidSalary() {
        return Math.round(grossSalary * 0.85);
    }


}

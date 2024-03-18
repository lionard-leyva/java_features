package com.java.features.oop.models;

import com.java.features.oop.interfaces.Empleado;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
public class FullTime implements Empleado {

    @NonNull
    private final String name;
    private final boolean isIndefiniteContract;
    private final long grossSalary;
    @Getter
    @NonNull
    private final String livingPlace;

    // seguro de vida en ingles es life insurance

    public FullTime(String name,
                    boolean isIndefiniteContract,
                    long grossSalary,
                    String livingPlace) {
        this.name = name;
        this.isIndefiniteContract = isIndefiniteContract;
        this.grossSalary = grossSalary;
        this.livingPlace = livingPlace;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int hoursWeek() {
        return 40;
    }

    @Override
    public boolean indefiniteContract() {
        return isIndefiniteContract;
    }

    @Override
    public long liquidSalary() {
        return Math.round(grossSalary * 0.85);
    }

    public long lifeInsurance() {
        return Math.round(grossSalary * 0.1);
    }
}
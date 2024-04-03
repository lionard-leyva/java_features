package com.java.features.deop.models;

public record FullTime(
        String name,
        int hoursWeek,
        boolean isIndefiniteContract,
        long grossSalary,
        String livingPlace
) implements Empleado {
    public FullTime {
        if (name == null || livingPlace == null) {
            throw new IllegalArgumentException("Name and living place cannot be null");
        }
    }

    public long liquidSalary() {
        return Math.round(grossSalary * 0.85);
    }

    public long lifeInsurance() {
        return Math.round(grossSalary * 0.1);
    }
}
package com.java.features.deop.models;

public record PartTime(
        String name,
        int hoursWeek,
        boolean isIndefiniteContract,
        long grossSalary
) implements Empleado {
    public PartTime {
        if (name == null || hoursWeek >= 40 || hoursWeek <= 20) {
            throw new IllegalArgumentException("Name and hours per week must be between 1 and 39");
        }
    }
    public long liquidSalary() {
        return Math.round(grossSalary * 0.1);
    }
}
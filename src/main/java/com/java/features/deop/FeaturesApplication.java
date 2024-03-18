package com.java.features.deop;

import com.java.features.deop.models.Empleado;
import com.java.features.deop.models.FullTime;
import com.java.features.deop.models.PartTime;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.Set;
import java.util.logging.Logger;

@SpringBootApplication
public class FeaturesApplication {
    private static final Logger LOGGER = Logger.getLogger(FeaturesApplication.class.getName());

    public static void main(String[] args) {
        FullTime lionard = new FullTime("Lionard", true, 100000, "Lima");
        PartTime foo = new PartTime("Leyva", 30, false, 100000);
        printSalary(Set.of(lionard, foo));
    }

    static void printSalary(Collection<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            String resumen = switch (empleado) {
                case FullTime(String name, boolean isIndefiniteContract, long grossSalary, String livingPlace) ->
                        "El sueldo líquido " + name + " es " + Math.round(grossSalary * 0.85) + " soles";
                case PartTime(String name, int hoursWeek, boolean isIndefiniteContract, long grossSalary) ->
                        "El sueldo líquido " + name + " es " + Math.round(grossSalary * 0.85) + " soles";
            };
        }
    }
}
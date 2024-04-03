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
        FullTime lionard = new FullTime("Lionard", 48, true, 100000, "Lima");
        PartTime foo = new PartTime("Leyva", 30, false, 100000);
        printSalary(Set.of(lionard, foo));
        printSalary2(Set.of(lionard, foo));
    }

    static void printSalary(Collection<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            String resumen = switch (empleado) {
                case FullTime ft -> "El sueldo líquido de " + ft.name() + " es " + ft.liquidSalary() + " soles. "+
                                    "El gasto seguro de vida es " + ft.lifeInsurance() + " soles.";
                case PartTime pt -> "El sueldo líquido de " + pt.name() + " es " + pt.liquidSalary() + " soles.";
            };
            LOGGER.info(resumen);
        }
    }

    static void printSalary2(Collection<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            String resumen = switch (empleado) {
                case FullTime(
                        String name, int hoursWeek, boolean isIndefiniteContract, long grossSalary, String livingPlace
                         ) -> "El sueldo líquido de " + name + " es " + Math.round(grossSalary * 0.85) + " soles. " +
                        "El gasto seguro de vida es " + Math.round(grossSalary * 0.1) + " soles.";

                case PartTime pt -> "El sueldo líquido de " + pt.name() + " es " + pt.liquidSalary() + " soles.";
            };
            LOGGER.info(resumen);
        }
    }
}
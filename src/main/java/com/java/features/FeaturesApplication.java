package com.java.features;

import com.java.features.oop.interfaces.Empleado;
import com.java.features.oop.models.FullTime;
import com.java.features.oop.models.PartTime;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.Set;
import java.util.logging.Logger;

@SpringBootApplication
public class FeaturesApplication {
private static final Logger LOGGER = Logger.getLogger(FeaturesApplication.class.getName());
    public static void main(String[] args) {
        Empleado lionard = FullTime.builder()
                .name("Lionard")
                .isIndefiniteContract(true)
                .grossSalary(100000) // gross salary es el salario bruto
                .livingPlace("Lima")
                .build();

        Empleado foo = PartTime.builder()
                .name("Leyva")
                .isIndefiniteContract(false)
                .hoursWeek(30)
                .grossSalary(100000)
                .build();
        printSalary(Set.of(lionard, foo));
    }
    static void printSalary(Collection<Empleado> empleados) {
        empleados.forEach(empleado ->
                LOGGER.info(empleado.name() + " earn " + empleado.liquidSalary() + " per month"));
    }
}

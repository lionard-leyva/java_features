package com.java.features.oop.interfaces;


/**
 * Interface Empleado que contiene los metodos de las clases FullTime y PartTime
 * @version 1.0
 * @author Lionard  Leyva https://www.linkedin.com/in/lionardleyva/
 */
public interface Empleado {

    String name();
    int hoursWeek();
    boolean indefiniteContract();
    long liquidSalary();

    //Que pasaria si agregamos un metodo como la eps, pero sabemos que no todos los empleados tienen eps
    // esto romperia el principio de segregacion de interfaces, ya que no todos los empleados tienen eps
    // por lo que se deberia crear una interfaz para los empleados que tienen eps y otra para los que no
    // pero en jdk 17 y 21 se puede agregar un metodo default para solucionar este problema implmentando solo el metodo en las clases que lo necesiten
    default long eps() {
        return 0;
    }

   // Boolean isAffiliatedToEps(); // este metodo romperia el principio de segregacion de interfaces
    // ya que no todos los empleados tienen eps
    // por lo que se deberia crear una interfaz para los empleados que tienen eps y otra para los que no
    // pero en jdk 17 y 21 se puede agregar un metodo default para solucionar este problema implmentando solo el metodo en las clases que lo necesiten
    //default boolean isAffiliatedToEps() {
    //    return false;
    //}
}

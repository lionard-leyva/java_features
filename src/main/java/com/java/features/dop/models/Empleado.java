package com.java.features.dop.models;

/**
 * Interface Empleado que contiene los metodos de las clases FullTime y PartTime
 * @version 1.0
 * @author Lionard  Leyva https://www.linkedin.com/in/lionardleyva/
 */
public sealed interface Empleado permits FullTime, PartTime {
}

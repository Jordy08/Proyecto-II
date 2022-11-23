/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacorreo;

/**
 *
 * @author jordi
 */
public class Student extends Person{
    
    
    private String license;

    /**
     * constructor vacio 
     */
    public Student() {
    }
    /**
     *
     * @param license atributo que identifica al estudiante
     */
    public Student(String license) {
        this.license = license;
    }
    
    /**
     * patito
     * @param license identifica por canet del estudiante
     * @param name hereda de la clase persona el nombre 
     * @param gender hereda de la clase persona el genero
     * @param location hereda de la clase persona la ubicación
     */
    public Student(String license, String name, String gender, String location) {
        super(name, gender, location);
        this.license = license;
    }
    
    /**
     * Por medio de los getters accedemos al valor del atributo 
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * Por medio de los setters nos fijan el valor del atributo
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }
    /**
     * nos permite comprobar la escritura correcta de un metodo
     * @return 
     */
    @Override
    
    public String toString() {
        return "Studen{" + "license=" + license + '}';
    }
    
    
}

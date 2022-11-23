/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacorreo;

/**
 *
 * @author jordi
 */
public class Person {
    
    private String name;
    private String gender;
    private String location;
  /**
   * Tenemos los atributos de la clase persona
   */
    public Person() {
    }
/**
 * constructor lleno 
 * @param name nos indica el nombre que se le va asignar
 * @param gender nos indica el genero que se le va asignar
 * @param location nos indica la ubicación que se le va asignar
 */
    public Person(String name, String gender, String location) {
        this.name = name;
        this.gender = gender;
        this.location = location;
    }

    /**
     * Por medio de los getters accedemos al valor del atributo 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Por medio de los setters nos fijan el valor del atributo
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
/**
 * nos permite comprobar la escritura correcta de un metodo
 * @return 
 */
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", location=" + location + '}';
    }
    
    
    
}

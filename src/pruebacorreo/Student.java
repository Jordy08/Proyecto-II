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

    public Student() {
    }

    public Student(String license) {
        this.license = license;
    }

    public Student(String license, String name, String gender, String location) {
        super(name, gender, location);
        this.license = license;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Studen{" + "license=" + license + '}';
    }
    
    
}

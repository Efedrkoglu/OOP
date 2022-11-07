/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Efe
 */
public class Person {
    private String name, surName;
    private String job;
    private int age;
    
    public Person() {
        
    }    
    
    public Person(String name, String surName, String job, int age) {
        this.name = name;
        this.surName = surName;
        this.job = job;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurName() {
        return this.surName;
    }
    
    public void setSurName(String surName) {
        this.surName = surName;
    }
    
    public String getJob() {
        return this.job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return this.name+";"+this.surName+";"+this.age+";"+this.job;
    }
}

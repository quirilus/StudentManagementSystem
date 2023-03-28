package com.arjuncodes.student.system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
   private String email;
   private int contact;


    // constructor
    public Student(){

    }
    //getters and setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //ADDRESS
    public String getAddress(){

        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    //email
    public String getEmail(){

        return email;
    }
    public void setContact(String email){
        this.email = email;
    }
    //contact
    public int getContact(){

        return contact;
    }
    public void setContact(int contact){
        this.contact = contact;
    }
}











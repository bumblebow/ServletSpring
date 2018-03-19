/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletspring.bean;

/**
 *
 * @author 90462
 */
public class Dog extends Mamal{
    public String name;
    private final int leg = 4;
    
    public Dog(){
        this.setName("no name");
    }
    public Dog(String name){
        this.setName(name);
    }
    @Override
    public void feed(){
        System.out.print("Dog feed");
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "Dog{" + "name" + name + '}';
    }
}

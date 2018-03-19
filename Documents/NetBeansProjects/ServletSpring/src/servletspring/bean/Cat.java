/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletspring.bean;
import servletspring.bean.*;
/**
 *
 * @author 90462
 */
public class Cat extends Mamal {
//    public void walk(){
//        System.out.println("Cat can walk");
//    }
    public String say(){
        return "Hello form cat";
    }
    
    @Override
    public void feed(){
        System.out.println("cat feed");
    }
}

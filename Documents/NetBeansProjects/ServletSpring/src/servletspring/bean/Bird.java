/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletspring.bean;
import servlet.spring.interfaces.Canfly;
/**
 *
 * @author 90462
 */
public class Bird extends Animal implements Canfly{
    @Override
    public void fly(){
        System.out.println("Bird Can Fly...");
    }
}

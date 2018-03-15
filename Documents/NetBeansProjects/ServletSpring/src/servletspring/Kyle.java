/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletspring;

/**
 *
 * @author 90462
 */
public class Kyle {
   // Kyle(){
        
  //  }
    String name;
    Kyle(String name){ //have to send parameter
        this.name = name; //this. = access variable
        this.hello();
    }
    public String sayHello(){
        return "hello"+this.name;
    }
    public void hello(){
        System.out.println(
            "Local say hello!" + this.name);
    }
}

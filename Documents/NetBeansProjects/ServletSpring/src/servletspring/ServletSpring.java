/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletspring;
import servletspring.bean.*;
/**
 *
 * @author 90462
 */
public class ServletSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Kyle k = new Kyle("John");
        //System.out.println(k.sayHello());
        
    //    Kyle[] arr;
    //    arr = new Kyle[2]; //สร้างอาเรย์ที่จะเก็บตัวแปรของ Kyle ขนาด 2 ตัว
    //    arr[0] = new Kyle("John"); //เก็บข้อมูล John ใน index 0
    //    arr[1] = new Kyle("Jimmy");
        
    //    System.out.println(arr[1].sayHello());
        
    //    System.out.println(Kyle.prefix);
        
    //    String str = new String("ABCDEFG");
    //    System.out.println(str.substring(0,2));
    Animal a = new Animal();
    Animal c = new Cat(); //
    System.out.println(a.say());
    System.out.println(c.say());
    ((Cat)c).walk(); //การทำ casting ใช้พฤติกรรมของ Cat
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletspring;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import servletspring.bean.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.InputStream;
import java.io.InputStreamReader;
import servletspring.bean.Dog;

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
    //Animal a = new Animal();
    //Animal c = new Cat(); //
    //System.out.println(a.say());
    //System.out.println(c.say());
    //((Cat)c).walk(); //การทำ casting ใช้พฤติกรรมของ Cat
    
   // Mamal m = new Dog();
    //m.feed();
   // System.out.println(m.say());
    
    //Mamal c = new Cat();
   // c.feed();
    
   // Duck d = new Duck();
    //d.say();
    //d.fly();
//    d.swim();
//    
//    Bird b = new Bird();
//    Circus c = new Circus();
//    c.showFlyAnimal(d);
//    c.showFlyAnimal(b);
    
//       java.util.List<Duck> ducks = new ArrayList(); //เป็นการบอกว่าคลาสนี้จะใช้จาก Package ไหน
//       for(int i=0;i<10;i++){
//           ducks.add(new Duck());
//       }
//       
//       System.out.println(ducks.size());
//       ducks.get(9).fly();
//       ducks.remove(0);
//       
//       System.out.println(ducks.size());
//       ducks.get(9).fly();
        
        Map<String, Dog> dogs = new HashMap();
        String[] dogName = new String[]{"Jimmy", "Johny", "Jame", "Indy"};
        
        for(int i=0;i<dogName.length;i++){
            dogs.put(dogName[i], new Dog(dogName[i]));
            System.out.println(dogs.get(dogName[i]));
        }
        try{
            InputStream fis = new FileInputStream(
                    "C:/Users/90462/Documents/NetBeansProjects/ServletSpring/.gitignore"
            );
            InputStreamReader bis = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(bis);
            System.out.println( br.readLine() );
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}


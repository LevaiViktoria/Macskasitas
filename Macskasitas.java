/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macskasitas;

/**
 *
 * @author levai
 */
public class Macskasitas {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
            Cat cat1 =new Cat("Cirmi", 8);
            System.out.println(cat1.getName()+" "+cat1.getWeigth()+"kg!");
            cat1.makeSound();
           
            
            
    }
    
}
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

public abstract class Animal {
        private String name; 
        private int weigth;

        
        public void makeSound(){
            System.out.println("AAAAA!");
        }
        
        
        
        
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeigth() {
            return this.weigth;
        }

        public void setWeigth(int weigth) {
            this.weigth = weigth;
        }

}
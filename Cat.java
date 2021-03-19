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
public class Cat extends Animal implements Pet{
    
        public Cat(){  //ezt a konstruktort csak akkor kötelező megadni ha több félét is megszeretnénk
            this.getName();
        }
        
        public Cat(String nev){
            this.setName(nev);
        }
        
        public Cat(String nev, int weight){
            this.setName(nev);
            this.setWeigth(weight);
        }
        
        
        public void meow(){
            System.out.println("Meow!");
        }
        
        @Override   //felülírja az őse metódusát
        public void makeSound(){
            System.out.println("Miiiaauuuu!");
        }

    @Override
    public void oleles() {
       }

    @Override
    public void leul() {
        }

    @Override
    public void fekszik() {
       }
    
    
}
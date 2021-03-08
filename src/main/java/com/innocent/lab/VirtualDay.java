package com.innocent.lab;

import java.util.ArrayList;

public class VirtualDay {
   ArrayList<VirtualClass> classes;
   public VirtualDay() {
       classes = new ArrayList<>();
   } 
   public void addClass(VirtualClass classe) {
       classes.add(classe);
   }

   public void go() {
       for(VirtualClass classe:classes) { // [1,2,3,4]
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Starting new class");
            
            classe.teach();
       }
   }
}

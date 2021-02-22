package com.innocent.lab;

import java.util.ArrayList;


/**
 * Hello world!
 *
 */

class ProductItem {
  private String productName;
  private double price;
  private int quantity;
  private String uniqueId;

  ProductItem(String productName, double price, int quantity, String uuid) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
    this.uniqueId = uuid;
  }

  /** Gettes */

  public String getUuid() {
    return uniqueId;
  }
  
  double totalPrice() {
    return price * quantity;
  };

  void printTotal() {
    System.out.println("My name is " + productName + " " + " I have " + quantity 
    + " In the cart for " + totalPrice());
  }
}

class Cart {
  ArrayList<ProductItem> listOfItems;

  public Cart() {
    listOfItems = new ArrayList<ProductItem>();
  }

  public void addToCart(ProductItem item) {
    listOfItems.add(item);
  }

  public void removeFromCart(String uuid) {
    ProductItem toRemove = null;
    for(ProductItem item:listOfItems) {
      if(item.getUuid() == uuid) {
        toRemove = item;
      }
    }
    if(toRemove != null) {
      listOfItems.remove(toRemove);
    }
  }

  public double totalPrice() {
    double total = 0;
    for(ProductItem item:listOfItems) {
      total += item.totalPrice();
    }
    return total;
  }

}

class Teacher{
  //Parent class constructor
  String mainSubject;
  Teacher(String a){
    mainSubject = a;
 System.out.println("Constructor of Teacher with int " + a);
  }

  void teach() {
    System.out.println("I am a teacher I write on the blackboard.");//
  }
}

class MathTeacher extends Teacher {
  String sepecialty;
  MathTeacher(String a, String specialty){

  super(a);
 System.out.println("Constructor of math teacher");
  }

  void teach() {
    super.teach();
    System.out.println("I am a match teacher sometimes I run computations");
  }
}



public class App 
{
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }


    public int findGreatest(int a, int b, int c) {
        return Math.max( Math.max(a, b), c); 
    }

    public int findGreatest2(int a, int b, int c) {
        int maxAb = Math.max(a, b);
        return Math.max( maxAb, c); 
    }

    public int cummulativeSum(int a) {
      int res = 0;
      for(int i = 0; i <= a; i++) {
        res+= i;
      }
      return res;
    }

    public int cummulativeSumWhile(int a) {
      int res = 0;
      int i = 0;
      while( i <= a) {
        res+= i;
        i++;
      }
      return res;
    }

    public int cummulativeSumDoWhile(int a) {
      int res = 0;
      int i = 0;
      do {
        res+= i; // => res = res + i;
        i++;
      }while( i <= a); 
      return res;
    }

    public int cumSumEfficient(int a) {
      return a*(a+1)/2;
    }


    class Person {
      public String name;
    }

    public void setParamTo10(int a) {//passed by value so  a is going to be copied
      a = 10;// a here is in reality a copy of a not a itself.
      System.out.println("the value of a in setParamTo10 is " + a);
    } 

    public void changePersonName(Person p, final String newName) {
      p = new Person();
      p.name = newName;
    }

    public double getAverages(int a, int b, int c) {
      double average = (a +b +c)/3;
      System.out.println("The average of 1,1,1 is " + average);
      return average;
    }

    public static void main( String[] args )
    {
        App ap = new App();
        //ap.addTwoNumbers(2, 3);
        // System.out.println("The sume of 2 and 2 is " + ap.addTwoNumbers(2, 2));
        // System.out.println( "Hello World Denis!" );
        //int a = 14;
        //ap.setParamTo10(a);
        //System.out.println("The value of a is " + a);
       /* Person p = new Person();
        Person anotherPerson = new Person();
        p.name = "Adrian";
        System.out.println("Before name change, persons name is " + p.name);
        ap.changePersonName(p, "Denis");
        System.out.println("persons name is " + p.name);*/
        // double average = ap.getAverages(1,1,1);

        ProductItem item1 = new ProductItem("tartine", 20, 3, "uuid");
        item1.printTotal();

       Teacher mathTeacher = new MathTeacher("Maths");
       mathTeacher.teach();
        
   }
}

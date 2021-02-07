package com.innocent.lab;

/**
 * Hello world!
 *
 */



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
        ap.addTwoNumbers(2, 3);
        // System.out.println("The sume of 2 and 2 is " + ap.addTwoNumbers(2, 2));
        // System.out.println( "Hello World Denis!" );
        int a = 14;
        ap.setParamTo10(a);
        System.out.println("The value of a is " + a);
       /* Person p = new Person();
        Person anotherPerson = new Person();
        p.name = "Adrian";
        System.out.println("Before name change, persons name is " + p.name);
        ap.changePersonName(p, "Denis");
        System.out.println("persons name is " + p.name);*/
        double average = ap.getAverages(1,1,1);
        
   }
}

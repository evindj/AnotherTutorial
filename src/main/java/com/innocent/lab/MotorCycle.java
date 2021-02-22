package com.innocent.lab;

enum Color {
    Blue,
    Red,
    Yellow,
}

/*
 Alternate actual definition of a color in graphics
a color is a combination for Red, blue and Green. ranging from 0 to 255
class Color {
    int red;
    int blue;
    int Green
} 
*/

public class MotorCycle { //==> public MotorCycle extends Object{}
    private int speed;
    private int gear;
    private Color color;
    private Pilot pilot;
    MotorCycle(int speed, int gear, Color color, Pilot pilot) {
        this.speed = speed;
        this.color = color;
        this.gear = gear;
        this.pilot = pilot;
    }

    void applyBrakes(int decrement) {
        // gear-- ==> gear = gear - 1
        gear-= decrement;
        speed-= decrement;
    }

    void speedUp(int increment){
        gear+= increment;
    }

    int getSpeed() {
        return speed * gear ;
    }

    @Override
    public String toString() {
        String toString = "MotorCycle color is " + this.color + " Owner is " + pilot.getPilotName() ;
        return toString;
    }

}

class Pilot  {
    String name;
    int age;
    public Pilot(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getPilotName() {
        return name;
    }
}

class MountainMotorCycle extends  MotorCycle{
    private int height;
    public MountainMotorCycle(int speed, int gear, Color color, Pilot pilot, int height) {
        super(speed, gear, color, pilot);
        this.height = height;
    }
    void setHeight(int height) {
        this.height = height;
    }
}

class Program{
    public static void main(String[] args) {
        
    }
}
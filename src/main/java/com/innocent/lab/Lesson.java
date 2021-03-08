package com.innocent.lab;

public  abstract class Lesson {
   String title;
    Lesson(String title) {
        this.title = title;
    }
   public abstract void teach();
}

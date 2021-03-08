package com.innocent.lab;

public class AudioLesson extends Lesson{
    AudioLesson(String title) {
        super(title);
    }

    @Override
    public  void teach() {
        System.out.print(title + " I am an audio lesson ");
    }
}

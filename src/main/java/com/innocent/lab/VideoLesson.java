package com.innocent.lab;

public class  VideoLesson extends Lesson {

    VideoLesson(String title) {
        super(title);
    }

    @Override
    public  void teach() {
        System.out.print(title + " I am a video lesson ");
    }
}

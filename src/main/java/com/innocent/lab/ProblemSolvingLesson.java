package com.innocent.lab;

public class ProblemSolvingLesson extends Lesson {
    ProblemSolvingLesson(String title) {
        super(title);
    }

    @Override
    public  void teach() {
        System.out.print(title + " I am a problem sloving lesson ");
    }
}

package com.innocent.lab;

public class MathClass extends VirtualClass {

    MathClass(Instructor instructor) {
        super(instructor);
        // add video lesson
        this.addLesson(new VideoLesson("Linear Algebra"));
        // add problemSloving lesson
        this.addLesson(new ProblemSolvingLesson("biggest problems in linear algebra"));
    }

    @Override
    public void doCraft() {
        System.out.println("This is a math class");
        super.doCraft();
    }
    
}

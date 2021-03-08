package com.innocent.lab;

import java.util.ArrayList;

public abstract class VirtualClass {
    // data member
    ArrayList<Lesson> lessons;
    Instructor teacher; // a virtual class has an instructor.

    // constructor
    VirtualClass(Instructor instructor) {
        this.teacher = instructor;
        lessons = new ArrayList<>();
    }

    public void teach() {
        teacher.presentInstructor(); // Every virtual class starts with the short introduction to the instructor
        doCraft();
    }

    public void doCraft() {
        System.out.println("Starting lesson: ");
        int i = 1;
        for(Lesson lesson : lessons) {
            System.out.println("=======================================");
            System.out.println("Teaching lessons number: " + i);
            lesson.teach();
            i++;
        }
    }

    public void addLesson(Lesson lesson) {
        
        lessons.add(lesson);
    }
    
}

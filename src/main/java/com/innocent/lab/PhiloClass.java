package com.innocent.lab;

public class PhiloClass extends VirtualClass {
    PhiloClass(Instructor instructor) {
        super(instructor);
        // add video lesson
        this.addLesson(new VideoLesson("Ethics"));
        // add problemSloving lesson
        this.addLesson(new AudioLesson("Eugenics"));
    }

    @Override
    public void doCraft() {
        System.out.println("This is a philo class");
        super.doCraft();
    }
}

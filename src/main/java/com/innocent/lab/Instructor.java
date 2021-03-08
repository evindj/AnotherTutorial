package com.innocent.lab;

public class Instructor {
    private String firstName;
    private String lastName;
    Instructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName =   lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName ;
    }

	public void presentInstructor() {
        String presentation = toString();
        System.out.println("I am " + presentation);
	}
    
}

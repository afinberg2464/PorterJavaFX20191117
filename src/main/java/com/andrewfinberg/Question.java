package com.andrewfinberg;

/**
 * Created by Andrew Finberg 2019/11/17
 */
public class Question {

    /*
    Variables to hold the name and details of each question
     */
    private String name;
    private String details;

    public Question(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return name;
    }
}

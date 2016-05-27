package com.test;

import javax.inject.Inject;


public class Student {
    @Inject
    School school;

    public Student() {

    }

    public void doWork() {
        school.doSomething();
    }
}

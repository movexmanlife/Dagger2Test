package com.testapplication;

import javax.inject.Inject;


public class TClass {
    @Inject
    Teacher teacher;

    public TClass() {

    }

    public void doWork() {
        teacher.doSomething();
    }
}

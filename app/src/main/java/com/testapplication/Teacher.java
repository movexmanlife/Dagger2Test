package com.testapplication;


import android.util.Log;

import javax.inject.Inject;


public class Teacher {
    private static final String TAG = Teacher.class.getSimpleName();
    private int age;
    private String name;

    @Inject
    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void doSomething() {
        Log.e(TAG, "doSomething()");
    }
}

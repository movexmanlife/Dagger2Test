package com.testapplication;

import dagger.Module;
import dagger.Provides;

@Module
public class ConstructModule {
    private int age;
    private String name;

    public ConstructModule(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Provides
    int provideAge() {
        return age;
    }

    @Provides
    String provideName() {
        return name;
    }
}

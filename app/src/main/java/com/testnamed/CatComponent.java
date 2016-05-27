package com.testnamed;

import com.test.SchoolModule;
import com.test.Student;

import dagger.Component;

@Component(modules = CatModule.class)
public interface CatComponent {
    void inject(Cat cat);
}

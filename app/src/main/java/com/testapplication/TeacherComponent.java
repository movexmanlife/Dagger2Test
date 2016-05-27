package com.testapplication;


import com.test.SchoolModule;
import com.test.Student;

import dagger.Component;

@Component(modules = ConstructModule.class)
public interface TeacherComponent {
    /**
     * （1）注意这里必须提供一个getTeacher的方法。
     *
     * （2）还要注意这里需要注入到TClass中，而不是注入到Teacher中
     */
    Teacher getTeacher();
    void inject(TClass tClass);
}
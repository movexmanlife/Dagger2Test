package com.test;

import com.robot.dagger2test.ActivityScope;

import dagger.Component;

/**
 * 注意这里必须传入一个Student，因为这个就是“目标类”，我们需要将“目标依赖类”注入到“目标类”中
 *
 *
 * （1）注意其实Module中的方法是没有直接被调用的。
 * （2）它是通过DaggerXXXComponent注入的时候调用的。
 */
@Component(modules = SchoolModule.class)
public interface StudentComponent {
    void inject(Student student);
}

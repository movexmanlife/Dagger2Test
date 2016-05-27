package com.test1;

import javax.inject.Inject;


/**
 * 这里没有使用任何Component，直接在Home的构造函数中使用了@Inject就可以了。
 */
public class Worker {
    @Inject
    Home home;

    public Worker() {

    }

    public void doWork() {
        home.doSomething();
    }
}

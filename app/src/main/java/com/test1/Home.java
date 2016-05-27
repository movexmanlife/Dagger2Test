package com.test1;


import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * 在构造函数中直接使用@Inject，那么这个就不需要使用Component来进行连接了。
 */
public class Home {
    private static final String TAG = Home.class.getSimpleName();

    @Inject
    public Home() {

    }

    /**
     * 05-27 11:14:11.844 8140-8140/com.robot.dagger2test E/Home: doSomething()
     */
    public void doSomething() {
        Log.e(TAG, "doSomething()");
    }
}

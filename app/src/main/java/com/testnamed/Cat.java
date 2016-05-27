package com.testnamed;


import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 这里为了测试如何提供不同的实例，如何调用它，非常简单使用Named就可以了。
 */
public class Cat {
    private static final String TAG = Cat.class.getSimpleName();
    @Inject
    @Named("SanWen")
    Fish fish;

    public void likeFish() {
        Log.e(TAG, fish.getName());
    }
}

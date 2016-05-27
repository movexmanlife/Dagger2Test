package com.robot.dagger2test;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;


@Module
public class UserModule {
    private static final int COUNT = 10;
    private final Context context;

    public UserModule(Context context) {
        this.context = context;
    }

    @Provides
    @ActivityScope
    Context provideActivityContext() {
        return context;
    }

    @Provides
    @ActivityScope
    List<String> provideUsers() {
        List<String> users = new ArrayList<>(COUNT);

        for (int i = 0; i < COUNT; i++) {
            users.add("item " + i);
        }

        return users;
    }
}

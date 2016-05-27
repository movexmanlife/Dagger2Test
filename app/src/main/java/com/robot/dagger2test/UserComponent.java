package com.robot.dagger2test;

import dagger.Component;

/**
 * Created by Administrator on 2016/5/25.
 */
@ActivityScope
@Component(modules = {UserModule.class})
public interface UserComponent {
    void inject(MainActivity activity);
}

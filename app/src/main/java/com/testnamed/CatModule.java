package com.testnamed;

import com.test.School;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class CatModule {
    public CatModule() {

    }

    @Named("SanWen")
    @Provides
    Fish provideFishSanwen() {
        return new Fish("sanwenFish");
    }

    @Named("Common")
    @Provides
    Fish provideFishCommon() {
        return new Fish("commonFish");
    }


}

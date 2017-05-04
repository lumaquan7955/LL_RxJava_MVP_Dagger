package com.deitel.ll_rxjava_mvp_dagger.injection.mainactivity;

import com.deitel.ll_rxjava_mvp_dagger.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;


@Module
public class MainActivityModule {

    @Provides
    public  MainActivityPresenter provideMainActivityPresenter(){
        return new MainActivityPresenter();

    }
}

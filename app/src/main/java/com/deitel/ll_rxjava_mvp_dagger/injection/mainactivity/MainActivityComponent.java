package com.deitel.ll_rxjava_mvp_dagger.injection.mainactivity;

import com.deitel.ll_rxjava_mvp_dagger.view.mainactivity.MainActivity;

import dagger.Component;

@Component(modules=MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

}

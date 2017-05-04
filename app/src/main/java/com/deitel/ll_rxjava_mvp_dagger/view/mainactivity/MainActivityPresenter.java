package com.deitel.ll_rxjava_mvp_dagger.view.mainactivity;

public class MainActivityPresenter implements MainActivityContract.Presenter{

    MainActivityContract.View view;


    @Override
    public void addView(MainActivityContract.View view) {
        this.view=view;
    }

    @Override
    public void doCalculation(String log) {
        view.updateView(log);
    }
}

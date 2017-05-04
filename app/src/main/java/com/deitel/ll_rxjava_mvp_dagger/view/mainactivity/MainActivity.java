package com.deitel.ll_rxjava_mvp_dagger.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.deitel.ll_rxjava_mvp_dagger.R;
import com.deitel.ll_rxjava_mvp_dagger.injection.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;



public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    private static final String TAG = "MainActivityTAG";

    @Inject
    MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.create().inject(this);
        presenter.addView(this);
        presenter.doCalculation("Hello");


    }

    @Override
    public void updateView(String log) {
        Log.d(TAG,log);
    }
}

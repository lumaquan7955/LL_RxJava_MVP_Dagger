package com.deitel.ll_rxjava_mvp_dagger.view.mainactivity;

public class MainActivityContract {



    public interface View{
        void updateView(String log);
    }
    public interface Presenter<V extends View>{
        void addView(V view);
        void doCalculation(String log);

    }

}

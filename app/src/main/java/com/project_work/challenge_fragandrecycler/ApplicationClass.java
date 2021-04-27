package com.project_work.challenge_fragandrecycler;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Cars_class> car;

    @Override
    public void onCreate() {
        super.onCreate();

        car=new ArrayList<Cars_class>();
        car.add(new Cars_class("Polo","Chuck Norris","8976458543","Polo"));
        car.add(new Cars_class("Dezire","Shekhar Rathore","7894567432","Dezire"));
        car.add(new Cars_class("BMW","Not Me","9843892343","BMW"));
    }
}

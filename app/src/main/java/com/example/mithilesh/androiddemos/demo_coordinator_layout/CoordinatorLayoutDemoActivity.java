package com.example.mithilesh.androiddemos.demo_coordinator_layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.mithilesh.androiddemos.R;

/**
 * Created by mithilesh on 19/5/17.
 */

public class CoordinatorLayoutDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);
        init();
    }

    private void init() {
        initViews();
        initMembers();
        initListeners();
        initData();
    }

    private void initViews() {

    }

    private void initMembers() {

    }

    private void initListeners() {

    }

    private void initData() {

    }

}

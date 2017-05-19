package com.example.mithilesh.androiddemos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mithilesh.androiddemos.demo_coordinator_layout.CoordinatorLayoutDemoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        initViews();
        initListeners();
    }

    private TextView demoCoordinatorLayout;

    private void initViews() {
        demoCoordinatorLayout = (TextView) findViewById(R.id.demoCoordinatorLayout);
    }

    private void initListeners() {
        demoCoordinatorLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.demoCoordinatorLayout:

                openDemo(CoordinatorLayoutDemoActivity.class);

                break;
        }
    }

    private void openDemo(Class<?> activityToOpen) {
        Intent intent = new Intent(this, activityToOpen);
        startActivity(intent);
    }
}

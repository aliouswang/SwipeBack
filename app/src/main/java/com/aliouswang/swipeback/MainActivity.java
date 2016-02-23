package com.aliouswang.swipeback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.aliouswang.swipeback.helper.SwipeHelper;

public class MainActivity extends AppCompatActivity {

    private Button btn_view_drag_helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initView();
    }

    private void initView() {
        btn_view_drag_helper = (Button) findViewById(R.id.btn_view_drag_helper);
        btn_view_drag_helper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewDragerHelperDemoAct.class);
                startActivity(intent);
            }
        });

    }


}

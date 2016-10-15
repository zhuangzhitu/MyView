package com.mytext.myview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = (MyView) findViewById(R.id.mytext);
        myView.setMyonClickLister(new MyView.MyonClickLister() {
            @Override
            public void MyOnclick(View v) {
                Toast.makeText(getApplicationContext(), "被点击了", Toast.LENGTH_LONG).show();
            }
        });
    }
}

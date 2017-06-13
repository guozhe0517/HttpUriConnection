package com.guozhe.android.httpuriconnection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TaskInterface{

    TextView textView;
    String url = "https://google.com";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Task.newTask(this);
        textView = (TextView)findViewById(R.id.textView);
    }

    @Override
    public String gerUrl() {
        return url;
    }

    @Override
    public void postExecute(String result){
        textView.setText(result);
    }


}

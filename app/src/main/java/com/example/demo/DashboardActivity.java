package com.example.demo;

public class DashboardActivity extends MainActivity {

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.demo.R.layout.activity_dashboard);

        android.widget.Button balebtn = (android.widget.Button) findViewById(com.example.demo.R.id.balebtn);
        android.widget.Button inwardbtn = (android.widget.Button) findViewById(com.example.demo.R.id.inwardbtn);
        android.widget.Button dispatchbtn = (android.widget.Button) findViewById(com.example.demo.R.id.dispatchbtn);

        balebtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                android.content.Intent i = new android.content.Intent(DashboardActivity.this, ViewBaleActivity.class);
                startActivity(i);
            }
        });

        inwardbtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                android.content.Intent i = new android.content.Intent(DashboardActivity.this, StockInwardActivity.class);
                startActivity(i);
            }
        });
        dispatchbtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                android.content.Intent i = new android.content.Intent(DashboardActivity.this, StockDispatchActivity.class);
                startActivity(i);
            }
        });
    }
}
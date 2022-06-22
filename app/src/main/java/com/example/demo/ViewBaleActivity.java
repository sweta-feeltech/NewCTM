package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ViewBaleActivity extends AppCompatActivity {

    android.widget.Button btn_scan;
    android.widget.TextView tv_data, id, category, subCategory, name, description, status;

    final String url_Login = "https://ctm.feeltechsolutions.com/api/v1/product";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.demo.R.layout.activity_view_bale);

        btn_scan = (android.widget.Button) findViewById(com.example.demo.R.id.btn_scan);
        tv_data = (android.widget.TextView) findViewById(com.example.demo.R.id.tv_data);
        category = (android.widget.TextView) findViewById(com.example.demo.R.id.category);
        subCategory = (android.widget.TextView) findViewById(com.example.demo.R.id.subCategory);
        name = (android.widget.TextView) findViewById(com.example.demo.R.id.name);
        description = (android.widget.TextView) findViewById(com.example.demo.R.id.description);
        status = (android.widget.TextView) findViewById(com.example.demo.R.id.status);

        btn_scan.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                com.google.zxing.integration.android.IntentIntegrator intent = new com.google.zxing.integration.android.IntentIntegrator(ViewBaleActivity.this);
                intent.setPrompt("Scan QR Code");
                intent.setOrientationLocked(false);
                intent.initiateScan();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @androidx.annotation.Nullable android.content.Intent data) {
        com.google.zxing.integration.android.IntentResult intentResult = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (intentResult != null)
        {
            if (intentResult.getContents() == null)
            {
                android.widget.Toast.makeText(this, "No Code Scanned", android.widget.Toast.LENGTH_SHORT).show();
            }
            else
            {
                tv_data.setText(intentResult.getContents());
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
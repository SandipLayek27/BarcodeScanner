package com.sandiplayek.barcodescannerlibcaller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sandiplayek.masterbarcodescanner.ScannedBarcodeActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv_response;
    Button btnGo;
    private static final int SCANNER_REQUEST_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_response = findViewById(R.id.tv_response);
        btnGo = findViewById(R.id.btnGo);
        btnGo.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View view) {
        if(view == btnGo){
            Intent intent = new Intent(this, ScannedBarcodeActivity.class);
            startActivityForResult(intent, SCANNER_REQUEST_CODE);
        }
    }

    // This method is called when the second activity finishes
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SCANNER_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String returnString = data.getStringExtra("dataset");
                tv_response.setText(returnString);
            }
        }
    }
}
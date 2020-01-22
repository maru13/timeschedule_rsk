package com.example.timeschedule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SubActivity extends Activity {

    private EditText edittext1;
    private EditText edittext2;
    private EditText edittext3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button returnButton = findViewById(R.id.returnButton);
        //文字列取得（科目、担当、場所）
        edittext1 = (EditText) findViewById(R.id.editText);
        edittext2 = (EditText) findViewById(R.id.editText2);
        edittext3 = (EditText) findViewById(R.id.editText3);


        returnButton.setOnClickListener((View view2)->{
            finish();
        });

        Button result =  findViewById(R.id.result_bt);
        result.setOnClickListener((View view3)-> {
            Intent intent= new Intent(SubActivity.this, MainActivity.class);
            String kyoka = edittext1.getText().toString();
            String tanto = edittext2.getText().toString();
            String basyo = edittext3.getText().toString();

            intent.putExtra("edit1", kyoka);
            intent.putExtra("edit2", tanto);
            intent.putExtra("edit3", basyo);
            setResult(RESULT_OK, intent);
            finish();
            /*
            if(edittext1.getText() != null){
                String str = edittext1.getText().toString();
                intent.putExtra("edit1", str);
                startActivity(intent);
            }
             */

        });

    }
}

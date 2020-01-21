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
    private String message;

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
            if(edittext1.getText() != null){
                String str = edittext1.getText().toString();
                intent.putExtra("edit1", str);
                startActivity(intent);
            }
            /*int[] textview = new int[]{R.id.text1, R.id.text2,R.id.text3, R.id.text4, R.id.text5,
                    R.id.text6, R.id.text7, R.id.text8, R.id.text9, R.id.text10,
                    R.id.text11, R.id.text12, R.id.text13, R.id.text14, R.id.text15,
                    R.id.text16, R.id.text17, R.id.text18, R.id.text19, R.id.text20,
                    R.id.text21, R.id.text22, R.id.text23, R.id.text24, R.id.text25,};
            while(true){
                int i = 1;
                if (i < 25) {
                    String edit = edittext1.getText().toString();
                    TextView str1 = main.findViewById(textview[i]);
                    str1.setText(edit);
                    i++;
                }break;
            }
             */

        });

    }
}

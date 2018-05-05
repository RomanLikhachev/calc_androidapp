package com.lihstudios.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cleartext = (TextView)findViewById(R.id.Result);
        cleartext1 = (TextView)findViewById(R.id.Perchisl);
        cleartext2 = (TextView)findViewById(R.id.Vtorchisl);
    }
    public void onButtonClick(View v){
        EditText el1 = (EditText)findViewById(R.id.Perchisl);
        EditText el2 = (EditText)findViewById(R.id.Vtorchisl);
        TextView resultplus = (TextView)findViewById(R.id.Result);
        if (el1.getText().length() == 0) {
            cleartext.setText("err");
        }
        else if (el2.getText().length() == 0) {
            cleartext.setText("err");
        }
        else {
            int num1 = Integer.parseInt(el1.getText().toString());
            int num2 = Integer.parseInt(el2.getText().toString());
            int resSes = num1 + num2;
            resultplus.setText(Integer.toString(resSes));
        }
    }
    public void onClickButton2(View v) {
        EditText el3 = (EditText) findViewById(R.id.Perchisl);
        EditText el4 = (EditText) findViewById(R.id.Vtorchisl);
        TextView resultminus = (TextView) findViewById(R.id.Result);
        if (el3.getText().length() == 0) {
            cleartext.setText("err");
        } else if (el4.getText().length() == 0) {
            cleartext.setText("err");
        } else {
            int num1 = Integer.parseInt(el3.getText().toString());
            int num2 = Integer.parseInt(el4.getText().toString());
            int resMinus = num1 - num2;
            resultminus.setText(Integer.toString(resMinus));
        }
    }

    public void onClickButton3(View v){
        EditText el5 = (EditText)findViewById(R.id.Perchisl);
        EditText el6 = (EditText)findViewById(R.id.Vtorchisl);
        TextView resuldel = (TextView)findViewById(R.id.Result);
        if (el5.getText().length() == 0) {
            cleartext.setText("err");
        }
        else if (el6.getText().length() == 0) {
            cleartext.setText("err");
        }
        else {
            float num1 = Integer.parseInt(el5.getText().toString());
            float num2 = Integer.parseInt(el6.getText().toString());
            float res1Del = num1 / num2;
            resuldel.setText(Float.toString(res1Del));
        }
    }
    public void onClickButton4(View v) {
        EditText el7 = (EditText) findViewById(R.id.Perchisl);
        EditText el8 = (EditText) findViewById(R.id.Vtorchisl);
        TextView resulumn = (TextView) findViewById(R.id.Result);
        if (el7.getText().length() == 0) {
            cleartext.setText("err");
        } else if (el8.getText().length() == 0) {
            cleartext.setText("err");
        } else {
            int num1 = Integer.parseInt(el7.getText().toString());
            int num2 = Integer.parseInt(el8.getText().toString());
            int resUmn = num1 * num2;
            resulumn.setText(Integer.toString(resUmn));
        }
    }

    public void onClickButton5(View v) {
        EditText el9 = (EditText) findViewById(R.id.Perchisl);
        TextView resulumn = (TextView) findViewById(R.id.Result);

        if (el9.getText().length() == 0) {
            cleartext.setText("err");
        }
        else {
            int num1 = Integer.parseInt(el9.getText().toString());
            int resnum1quad = num1 * num1;
            resulumn.setText(Integer.toString(resnum1quad));
        }
    }
    public void onClickButton6(View v){
        EditText el10 = (EditText) findViewById(R.id.Vtorchisl);
        TextView resulumn = (TextView) findViewById(R.id.Result);

        if (el10.getText().length() == 0) {
            cleartext.setText("err");
        }
        else {
            int num1 = Integer.parseInt(el10.getText().toString());
            float ressqrt = (float) Math.sqrt(num1);
            resulumn.setText(Float.toString(ressqrt));
        }
    }
    private TextView cleartext;
    private TextView cleartext1;
    private TextView cleartext2;

    public void onClickButton7(View v){
        cleartext.setText("");
        cleartext1.setText("");
        cleartext2.setText("");
    }
}

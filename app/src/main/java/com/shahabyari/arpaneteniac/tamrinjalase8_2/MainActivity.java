package com.shahabyari.arpaneteniac.tamrinjalase8_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnkama, btnc, btnce, btntaghsim, btnzarb, btntafrigh, btnjam, btnmosavi;
    TextView txtper, txtinput;
    int op = 0;
    double num1 = 0, num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        config();
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn0:
                insertnumber("0");
                break;
            case R.id.btn1:
                insertnumber("1");
                break;
            case R.id.btn2:
                insertnumber("2");
                break;
            case R.id.btn3:
                insertnumber("3");
                break;
            case R.id.btn4:
                insertnumber("4");
                break;
            case R.id.btn5:
                insertnumber("5");
                break;
            case R.id.btn6:
                insertnumber("6");
                break;
            case R.id.btn7:
                insertnumber("7");
                break;
            case R.id.btn8:
                insertnumber("8");
                break;
            case R.id.btn9:
                insertnumber("9");
                break;
            case R.id.btnc:
                clearinput();
                cleartxtPre();
                break;
            case R.id.btnce:
                clearinput();
                break;
            case R.id.btnjam:
                operand(1);
                break;
            case R.id.btnkama:
                break;
            case R.id.btnmosavi:
                mosavi();
                break;
            case R.id.btntafrigh:
                operand(2);
                break;
            case R.id.btntaghsim:
                operand(3);
                break;
            case R.id.btnzarb:
                operand(4);
                break;

        }

    }

    private void mosavi() {
        if (num2 != 0) {
            insertnumberpre(insertstringop(op));
            insertnumberpre(txtinput.getText().toString());
            txtinput.setText(String.valueOf(num2));
        } else if (num1 != 0) {
            num2 = executeoperand(op, num1, Double.parseDouble(txtinput.getText().toString()));
            insertnumberpre(txtinput.getText().toString());
            txtinput.setText(String.valueOf(num2));

        } else {
            txtinput.setText("0");
        }

    }

    private void operand(int opinput) {
        if (op == 0) {
            op = opinput;
            insertnumberpre(txtinput.getText().toString());
            insertnumberpre(insertstringop(op));
            num1 = Double.parseDouble(txtinput.getText().toString());
            clearinput();

        } else {
            num2 = executeoperand(op, num1, Double.parseDouble(txtinput.getText().toString()));
            op = opinput;

            insertnumberpre(txtinput.getText().toString());
            insertnumberpre(insertstringop(op));
            clearinput();

        }

    }


    private double executeoperand(int opinput, double number1, double number2) {
        double ret = 0;
        switch (opinput) {
            case 1:
                ret = number1 + number2;
                break;
            case 2:
                ret = number1 - number2;
                break;
            case 3:
                ret = number1 * number2;
                break;
            case 4:
                ret = number1 / number2;
                break;

        }
        return ret;


    }

    // -------- insert string op
    private String insertstringop(int input) {
        String a = null;
        switch (input) {
            case 1:
                a = "+";
                break;
            case 2:
                a = "-";
                break;
            case 3:
                a = "*";
                break;
            case 4:
                a = "/";
                break;

        }

        return a;
    }

    // -------- insert numberpre
    private void insertnumberpre(String input) {
        txtper.append(input);
    }

    // -------- insert number
    private void insertnumber(String input) {
        if (txtinput.getText().toString().equals("0")) {
            txtinput.setText(input);
        } else {
            txtinput.append(input);
        }

    }

    // -------- clearinput
    private void clearinput() {

        txtinput.setText("0");
    }

    // -------- cleartxtPre
    private void cleartxtPre() {

        txtper.setText("");

    }

    // -------- ClearEveryThing
    private void cleareverythings() {
        op = 0;
        num1 = 0;
        num2 = 0;
        txtper.setText("");
        txtinput.setText("0");

    }

    // -------- config
    private void config() {
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        btnkama = (Button) findViewById(R.id.btnkama);
        btnkama.setOnClickListener(this);
        btnc = (Button) findViewById(R.id.btnc);
        btnc.setOnClickListener(this);
        btnce = (Button) findViewById(R.id.btnce);
        btnce.setOnClickListener(this);
        btntaghsim = (Button) findViewById(R.id.btntaghsim);
        btntaghsim.setOnClickListener(this);
        btnzarb = (Button) findViewById(R.id.btnzarb);
        btnzarb.setOnClickListener(this);
        btntafrigh = (Button) findViewById(R.id.btntafrigh);
        btntafrigh.setOnClickListener(this);
        btnjam = (Button) findViewById(R.id.btnjam);
        btnjam.setOnClickListener(this);
        btnmosavi = (Button) findViewById(R.id.btnmosavi);
        btnmosavi.setOnClickListener(this);
        txtinput = (TextView) findViewById(R.id.txtinput);
        txtper = (TextView) findViewById(R.id.txtPreview);
    }
}

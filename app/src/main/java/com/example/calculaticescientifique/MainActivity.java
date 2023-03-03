package com.example.calculaticescientifique;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean Portrait = true;
    TextView input,operation;
    String op, value1, value2;
    Double num1, num2, result;
    boolean point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=(TextView) findViewById(R.id.input);
        operation=(TextView) findViewById(R.id.operation);
        point = false;
    }
    public void Rotation(View view){
        if (Portrait){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);
        }
        else{
            setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT);
        }
        Portrait = !Portrait;
    }

    public void btn_0(View view) {
        input.setText(input.getText() + "0");
    }


    public void btn_1(View view) {
        input.setText(input.getText() + "1");
    }


    public void btn_2(View view) {
        input.setText(input.getText() + "2");
    }


    public void btn_3(View view) {
        input.setText(input.getText() + "3");
    }


    public void btn_4(View view) {
        input.setText(input.getText() + "4");
    }


    public void btn_5(View view) {
        input.setText(input.getText() + "5");
    }


    public void btn_6(View view) {
        input.setText(input.getText() + "6");
    }


    public void btn_7(View view) {
        input.setText(input.getText() + "7");
    }


    public void btn_8(View view) {
        input.setText(input.getText() + "8");
    }


    public void btn_9(View view) {
        input.setText(input.getText() + "9");
    }


    public void btn_point(View view) {
        if (!point) {
            if (input.getText().equals("")) {

                input.setText("0.");
            } else {

                input.setText(input.getText() + ".");
            }

            point = true;
        }

    }

    public void btn_add(View view) {
        op = "+";
        value1 = input.getText().toString();
        input.setText(null);
        operation.setText("+");
        point = false;
    }

    public void btn_sus(View view) {
        op = "-";
        value1 = input.getText().toString();
        input.setText(null);
        operation.setText("-");
        point = false;
    }

    public void btn_mul(View view) {
        op = "x";
        value1 = input.getText().toString();
        input.setText(null);
        operation.setText("x");
        point = false;
    }

    public void btn_div(View view) {
        op = "/";
        value1 = input.getText().toString();
        input.setText(null);
        operation.setText("/");
        point = false;
    }


    public void btn_log(View view) {
        op = "log";
        input.setText(null);
        operation.setText("log");
        point = false;
    }


    public void btn_ln(View view) {
        op = "ln";
        input.setText(null);
        operation.setText("ln");
        point = false;
    }

    public void btn_power(View view) {
        op = "power";
        value1 = input.getText().toString();
        input.setText(null);
        point = false;
        operation.setText("x^y");
    }
    public void btn_power2(View view) {
        op = "power2";
        value1 = input.getText().toString();
        input.setText(null);
        point = false;
        operation.setText("x^2");
    }
    public void btn_arcsin(View view) {
        op = "arcsin";
        input.setText(null);
        point = false;
        operation.setText("arcsin");
    }
    public void btn_arccos(View view) {
        op = "arccos";
        input.setText(null);
        point = false;
        operation.setText("arccos");
    }
    public void btn_arctan(View view) {
        op = "arctan";
        input.setText(null);
        point = false;
        operation.setText("arctan");
    }
    public void btn_sin(View view) {
        op = "sin";
        input.setText(null);
        point = false;
        operation.setText("sin");
    }
    public void btn_e(View view) {
        op = "e";
        input.setText(null);
        point = false;
        operation.setText("e");
    }
    public void btn_abs(View view) {
        op = "abs";
        input.setText(null);
        point = false;
        operation.setText("abs");
    }
    public void btn_pi(View view) {
        op = "pi";
        input.setText(null);
        point = false;
        operation.setText("pi");
    }


    public void btn_cos(View view) {
        op = "cos";
        input.setText(null);
        point = false;
        operation.setText("cos");
    }


    public void btn_tan(View view) {
        op = "tan";
        input.setText(null);
        point = false;
        operation.setText("tan");
    }

    public void btn_racine(View view) {
        op = "racine";
        input.setText(null);
        point = false;
        operation.setText("√");
    }

    public void btn_egal(View view) {
        if (op == null) {
            operation.setText("Error!");
        } else if (input.getText().equals("")) {
            operation.setText("Error!");
        } else if ((op.equals("+") || op.equals("-") || op.equals("x") || op.equals("/")) && value1.equals("")) {
            operation.setText("Error!");
        } else {
            switch (op) {
                default:
                    break;
                case "log":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log10(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((value1));
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);
                    input.setText(Math.pow(num1, num2) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "power2":
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.pow(num1, 2) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "racine":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sin(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.cos(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "tan":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.tan(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "e":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.exp(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "abs":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.abs(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "arcsin":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.asin(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "arccos":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.acos(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "arctan":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.atan(num1) + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "+":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setText(result + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "-":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "x":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    op = null;
                    operation.setText(null);
                    break;
                case "/":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    input.setText(result + "");
                    op = null;
                    operation.setText(null);
                    break;
            }

        }
    }


    public void btn_effacer(View view) {
        if (input.getText().equals("")) {
            input.setText(null);
        } else {
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                point = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));

            } else {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
        }
    }

    public void btn_ac(View view) {

        input.setText(null);
        operation.setText(null);
        value1 = null;
        value2 = null;
        op = null;
        point = false;
    }


}



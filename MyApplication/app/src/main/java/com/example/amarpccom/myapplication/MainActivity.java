package com.example.amarpccom.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    Button btn_delete,btn_small_bracket,btn_percentage,btn_back,btn_seven,btn_eight,btn_nine,btn_multiple,btn_four,
            btn_five,btn_six,btn_minus,btn_one,btn_two,btn_three,btn_plus,btn_dot,btn_zero,btn_divide,btn_equal;
    float mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_small_bracket = (Button) findViewById(R.id.btn_small_bracket);
        btn_percentage = (Button) findViewById(R.id.btn_percentage);
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_seven = (Button) findViewById(R.id.btn_seven);
        btn_eight = (Button) findViewById(R.id.btn_eight);
        btn_nine = (Button) findViewById(R.id.btn_nine);
        btn_multiple = (Button) findViewById(R.id.btn_multiple);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_five = (Button) findViewById(R.id.btn_five);
        btn_six = (Button) findViewById(R.id.btn_six);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_dot = (Button) findViewById(R.id.btn_dot);
        btn_zero = (Button) findViewById(R.id.btn_zero);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        edt1 = (EditText) findViewById(R.id.edt1);


        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });

        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 try{    if (edt1 == null){
                      edt1.setText("");
                            }else {
                               mValueOne = Float.parseFloat(edt1.getText() + "");
                                     mAddition = true;
                                     edt1.setText(null);
                             }}catch(Exception e){
                     Toast.makeText(getApplicationContext(),"no Entry", Toast.LENGTH_LONG).show();


                 }

            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             try{
                 mValueOne = Float.parseFloat(edt1.getText() + "");
                 mSubtract = true ;
                 edt1.setText(null);
             }catch(Exception e){
                 Toast.makeText(getApplicationContext(),"no Entry", Toast.LENGTH_LONG).show();


             }
            }
        });

        btn_multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              try{
                  mValueOne = Float.parseFloat(edt1.getText() + "");
                  mMultiplication = true ;
                  edt1.setText(null);
              }catch(Exception e){
                  Toast.makeText(getApplicationContext(),"no Entry", Toast.LENGTH_LONG).show();


              }
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mValueOne = Float.parseFloat(edt1.getText()+"");
                    mDivision = true ;
                    edt1.setText(null);
                }catch(Exception e){
                    Toast.makeText(getApplicationContext(),"no Entry", Toast.LENGTH_LONG).show();


                }


            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mValueTwo = Float.parseFloat(edt1.getText() + "");

                    if (mAddition == true){

                        edt1.setText(mValueOne + mValueTwo +"");
                        mAddition=false;
                    }


                    if (mSubtract == true){
                        edt1.setText(mValueOne - mValueTwo+"");
                        mSubtract=false;
                    }

                    if (mMultiplication == true){
                        edt1.setText(mValueOne * mValueTwo+"");
                        mMultiplication=false;
                    }

                    if (mDivision == true){
                        edt1.setText(mValueOne / mValueTwo+"");
                        mDivision=false;
                    }
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Invalid Entry", Toast.LENGTH_LONG).show();


                }


            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
    }
    }








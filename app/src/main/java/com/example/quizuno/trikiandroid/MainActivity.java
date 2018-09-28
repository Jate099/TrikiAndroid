package com.example.quizuno.trikiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int contador;
    int turno;

    Button btn_boton1;
    Button btn_boton2;
    Button btn_boton3;
    Button btn_boton1_1;
    Button btn_boton2_1;
    Button btn_boton3_1;
    Button btn_boton1_2;
    Button btn_boton2_2;
    Button btn_boton3_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_boton1 = findViewById(R.id.btn_boton1);
        btn_boton2 = findViewById(R.id.btn_boton2);
        btn_boton3 = findViewById(R.id.btn_boton3);

        btn_boton1_1 = findViewById(R.id.btn_boton1_1);
        btn_boton2_1 = findViewById(R.id.btn_boton2_1);
        btn_boton3_1 = findViewById(R.id.btn_boton3_1);

        btn_boton1_2 = findViewById(R.id.btn_boton1_2);
        btn_boton2_2 = findViewById(R.id.btn_boton2_2);
        btn_boton3_2 = findViewById(R.id.btn_boton3_2);

        btn_boton1.setOnClickListener(this);
        btn_boton2.setOnClickListener(this);
        btn_boton3.setOnClickListener(this);
        btn_boton1_1.setOnClickListener(this);
        btn_boton2_1.setOnClickListener(this);
        btn_boton3_1.setOnClickListener(this);
        btn_boton1_2.setOnClickListener(this);
        btn_boton2_2.setOnClickListener(this);
        btn_boton3_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        contador++;
        turno = contador%2;

        if(turno == 1) {
            imprimirX('x', view);
        }
    }

    public void imprimirX(char letra, View view) {
        if (view.getId() == R.id.btn_boton1) {
            btn_boton1.setText(letra + "");
            btn_boton1.setEnabled(false);

        } else if (view.getId() == R.id.btn_boton2) {
            btn_boton2.setText(letra + "");
            btn_boton2.setEnabled(false);

        } else if (view.getId() == R.id.btn_boton2) {
            btn_boton2.setText(letra + "");
            btn_boton2.setEnabled(false);

        }else if (view.getId() == R.id.btn_boton3) {
            btn_boton3.setText(letra + "");
            btn_boton3.setEnabled(false);

        }else if (view.getId() == R.id.btn_boton1_1) {
            btn_boton1_1.setText(letra + "");
            btn_boton1_1.setEnabled(false);

        }else if (view.getId() == R.id.btn_boton2_1) {
            btn_boton2_1.setText(letra + "");
            btn_boton2_1.setEnabled(false);

        }else if (view.getId() == R.id.btn_boton3_1) {
            btn_boton3_1.setText(letra + "");
            btn_boton3_1.setEnabled(false);

        }else if (view.getId() == R.id.btn_boton1_2) {
            btn_boton1_2.setText(letra + "");
            btn_boton1_2.setEnabled(false);

        }else if (view.getId() == R.id.btn_boton2_2) {
            btn_boton2_2.setText(letra + "");
            btn_boton2_2.setEnabled(false);

        }else {
            btn_boton3_2.setText(letra + "");
            btn_boton3_2.setEnabled(false);
        }
    }

}

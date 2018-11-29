package com.example.burfitzam.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static double nilaiSekarang=0;
    public static String operasiSekarang="";
    public static double hasil=0.0;

    EditText editTextLayer;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button buttonTambah,buttonKurang,buttonKali,buttonBagi,buttonSamaDengan;
    Button buttonClear;
//fitr0 firmansyah
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    void init() {
        editTextLayer = (EditText)findViewById(R.id.editTextLayar);

        button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1 = (Button)findViewById((R.id.button1));
        button1.setOnClickListener(this);
        button2 = (Button)findViewById((R.id.button2));
        button2.setOnClickListener(this);
        button3 = (Button)findViewById((R.id.button3));
        button3.setOnClickListener(this);
        button4 = (Button)findViewById((R.id.button4));
        button4.setOnClickListener(this);
        button5 = (Button)findViewById((R.id.button5));
        button5.setOnClickListener(this);
        button6 = (Button)findViewById((R.id.button6));
        button6.setOnClickListener(this);
        button7 = (Button)findViewById((R.id.button7));
        button7.setOnClickListener(this);
        button8 = (Button)findViewById((R.id.button8));
        button8.setOnClickListener(this);
        button9 = (Button)findViewById((R.id.button9));
        button9.setOnClickListener(this);

        buttonTambah = (Button)findViewById((R.id.buttonTambah));
        buttonTambah.setOnClickListener(this);
        buttonKurang = (Button)findViewById((R.id.buttonKurang));
        buttonKurang.setOnClickListener(this);
        buttonBagi = (Button)findViewById((R.id.buttonBagi));
        buttonBagi.setOnClickListener(this);
        buttonKali = (Button)findViewById((R.id.buttonKali));
        buttonKali.setOnClickListener(this);

        buttonClear = (Button)findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);
        buttonSamaDengan = (Button)findViewById(R.id.buttonSamaDengan);
        buttonSamaDengan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"0");
                break;
            case R.id.button1:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"1");
                break;
            case R.id.button2:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"2");
                break;
            case R.id.button3:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"3");
                break;
            case R.id.button4:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"4");
                break;
            case R.id.button5:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"5");
                break;
            case R.id.button6:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"6");
                break;
            case R.id.button7:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"7");
                break;
            case R.id.button8:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"8");
                break;
            case R.id.button9:
                editTextLayer.setText(editTextLayer.getText().toString().trim()+"9");
                break;

            case R.id.buttonTambah:
                nilaiSekarang = Double.parseDouble(editTextLayer.getText().toString());
                operasiSekarang = "tambah";
                editTextLayer.setText("");
                break;
            case R.id.buttonKurang:
                nilaiSekarang = Double.parseDouble(editTextLayer.getText().toString());
                operasiSekarang = "kurang";
                editTextLayer.setText("");
                break;
            case R.id.buttonKali:
                nilaiSekarang = Double.parseDouble(editTextLayer.getText().toString());
                operasiSekarang = "kali";
                editTextLayer.setText("");
                break;
            case R.id.buttonBagi:
                nilaiSekarang = Double.parseDouble(editTextLayer.getText().toString());
                operasiSekarang = "bagi";
                editTextLayer.setText("");
                break;

            case R.id.buttonClear:
                editTextLayer.setText("");
                break;
            case R.id.buttonSamaDengan:
                if (operasiSekarang.equals("tambah")){
                    hasil = nilaiSekarang + Double.parseDouble(editTextLayer.getText().toString().trim());

                    editTextLayer.setText(String.valueOf((int)hasil));
                }
                if (operasiSekarang.equals("kurang")){
                    hasil = nilaiSekarang - Double.parseDouble(editTextLayer.getText().toString().trim());

                    editTextLayer.setText(String.valueOf((int)hasil));
                }
                if (operasiSekarang.equals("kali")){
                    hasil = nilaiSekarang * Double.parseDouble(editTextLayer.getText().toString().trim());
                    editTextLayer.setText(String.valueOf((int)hasil));
                }
                if (operasiSekarang.equals("bagi")){
                    hasil = nilaiSekarang / Double.parseDouble(editTextLayer.getText().toString().trim());
                }
                    editTextLayer.setText(String.valueOf(hasil));
                    hasil = 0.0;

                break;
        }

    }
}

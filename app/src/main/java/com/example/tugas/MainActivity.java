package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Input1;
    EditText Input2;
    Spinner spinner;
    Button Jumlah;
    TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);

        Input1 = findViewById(R.id.Input1);
        Input2 = findViewById(R.id.Input2);
        tvHasil = findViewById(R.id.tvHasil);
        spinner = findViewById(R.id.spinner);
        Jumlah = findViewById(R.id.Jumlah);
        Jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            double angka1 = Integer.parseInt(Input1.getText().toString());
            double angka2 = Integer.parseInt(Input2.getText().toString());
            double hasil = 0;

                String text = spinner.getSelectedItem().toString();
                switch (text){
                    case "Tambah":
                        hasil = angka1 + angka2;
                        tvHasil.setText(hasil+"");
                        break;

                    case "Kurang":
                        hasil = angka1 - angka2;
                        tvHasil.setText(hasil+"");
                        break;

                    case "Kali":
                        hasil = angka1 * angka2;
                        tvHasil.setText(hasil+"");
                        break;

                    case "Bagi":
                        double angka1double = Double.parseDouble(Input1.getText().toString());
                        double angka2double = Double.parseDouble(Input2.getText().toString());
                        double hasilDouble = angka1double/angka2double;
                        tvHasil.setText(hasilDouble+"");
                        break;
                }
            }
        });


    }
}
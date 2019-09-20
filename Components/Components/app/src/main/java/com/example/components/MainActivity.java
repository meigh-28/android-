package com.example.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RadioGroup radioGroup;
    RadioButton radioyesanswer;
    RadioButton radionoanswer;
     SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radiog);
        radioyesanswer = findViewById(R.id.Rb_yes);
        radionoanswer = findViewById(R.id.Rb_no);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setMax(100);
        seekBar.setProgress(0);
        final TextView textView = findViewById(R.id.textView1);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean FrontUser) {
                textView.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        radionoanswer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean ischecked) {

                Toast.makeText(MainActivity.this,"no", Toast.LENGTH_SHORT).show();

            }
        });
        radioyesanswer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean ischecked) {

                Toast.makeText(MainActivity.this,"yes", Toast.LENGTH_SHORT).show();



            }
        });
        CheckBox checkBox = findViewById(R.id.checkbox1);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean ischecked) {

                Toast.makeText(MainActivity.this,"checked =" + ischecked, Toast.LENGTH_SHORT).show();

            }
        });
        ToggleButton toggleButton = findViewById(R.id.toggleButton1);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean ischecked) {

                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();



            }
        });
        Spinner spinner = findViewById(R.id.spinner1);
        spinner.setOnItemSelectedListener(this);
        List<String> heros = new ArrayList<>();
        heros.add("superman");
        heros.add("batman");
        heros.add("spiderman");
        heros.add("cherryboi");
        heros.add("thor");

        ArrayAdapter<String> DataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,heros);
        DataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(DataAdapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String hero = parent.getItemAtPosition(position).toString();
        Toast.makeText(this,"selected: " + hero,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

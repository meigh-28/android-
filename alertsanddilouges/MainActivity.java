package com.felixtechlabs.alertsanddialogs;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.tv_title);

        textView.setText("Alerts & Dialogs");


    }

    public void showToastTapped(View view) {
        Toast.makeText(this, "Showing Toast", Toast.LENGTH_SHORT).show();
    }

    public void showSnackbarTapped(View view) {
        View parentLayout = findViewById(android.R.id.content);

        Snackbar.make(parentLayout, "Showing snackbar", Snackbar.LENGTH_SHORT)
                .setAction("Action Name", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Action
                Toast.makeText(MainActivity.this, "Action Tapped", Toast.LENGTH_SHORT).show();
            }
        }).show();

    }

    public void showAlertDialogTapped(View view) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("This is Title");

        alertDialogBuilder.setMessage("This is Message");

        alertDialogBuilder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Positive Tapped Toast", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Negative Tapped Toast", Toast.LENGTH_SHORT).show();

            }
        });

        alertDialogBuilder.show();
    }

    public void showCustomAlertDialogTapped(View view) {


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("This is Title");
        alertDialogBuilder.setMessage("This is Message");


        View alertView = LayoutInflater.from(this).inflate(R.layout.my_alert, null);

        ImageView imageView = alertView.findViewById(R.id.imageView);


        alertDialogBuilder.setView(alertView);

        alertDialogBuilder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Positive Tapped Toast", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Negative Tapped Toast", Toast.LENGTH_SHORT).show();

            }
        });

        alertDialogBuilder.show();
    }

    public void showDatePickerTapped(View view) {

        final Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, year);

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyy");

                Toast.makeText(MainActivity.this, simpleDateFormat.format(calendar.getTime()), Toast.LENGTH_SHORT).show();
            }
        };

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this, onDateSetListener, year, month, day);
        datePickerDialog.show();

    }

    public void showTimePickerTapped(View view) {

        final Calendar calendar = Calendar.getInstance();

        final int hour = calendar.get(Calendar.HOUR);
        final int minut = calendar.get(Calendar.MINUTE);

        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                Toast.makeText(MainActivity.this, String.valueOf(hour) + ":"+ String.valueOf(minut), Toast.LENGTH_SHORT).show();

            }
        };

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, onTimeSetListener, hour, minut, false);
        timePickerDialog.show();

    }
}

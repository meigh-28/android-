package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
    RelativeLayout contentView(){

        // container of 5 text views
        RelativeLayout contentView = new RelativeLayout(this);
        contentView.setOrientation(RelativeLayout.VERTICAL);

        // generate 5 sample text views
        for(int x = 0 ; x < 5 ; x++){

            // just some params for the text view
            RelativeLayout.LayoutParams params = new RelativeLayout().LayoutParams((int) ViewSize.computeWidth(100,this),(int) ViewSize.computeHeight(50,this));
            params.setMargins(5, 5, 0, 0);

            // a text view
            TextView textView = new TextView(this);
            textView.setText(x+"");
            textView.setPadding(2, 0, 2, 0);
            textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
            textView.setLayoutParams(params);

            // set the onClick() method of this class
            textView.setOnClickListener(this);

            // add to linear layout
            contentView.addView(textView);
        }

        return contentView;
    }

    @Override
    public void onClick(View view) {
        // our calculator instance
        CalculatorPopup calculatorPopup = new CalculatorPopup(this);

        // set the text view where click happened
        calculatorPopup.getCalculator().setViewWhereClickHappen(view);

        // show the calculator pop up
        calculatorPopup.show();
    }
}
}

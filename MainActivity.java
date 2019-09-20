package com.example.myquiz;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RadioButton answer1, answer2, answer3,answer4;
    TextView score, question, correct_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        ArrayList<Questions> questions = new ArrayList<>();

        Questions questions1 = new Questions();

        questions1.setquestion("Which is first planet of solar system?");
        questions1.setA("Mercury");
        questions1.setB("Venus");
        questions1.setC("Earth");
        questions1.setD("Mars");
        questions1.setRightAnswer("Mercury");

        Questions questions2 = new Questions();

        questions2.setquestion("Which is second planet of solar system?");
        questions2.setA("Mercury");
        questions2.setB("Venus");
        questions2.setC("Earth");
        questions2.setD("Mars");
        questions2.setRightAnswer("Venus");

        Questions questions3 = new Questions();

        questions3.setquestion("Which is third planet of solar system?");
        questions3.setA("Mercury");
        questions3.setB("Venus");
        questions3.setC("Earth");
        questions3.setD("Mars");
        questions3.setRightAnswer("Earth");

        Questions questions4 = new Questions();

        questions4.setquestion("Which is first planet of solar system?");
        questions4.setA("Mercury");
        questions4.setB("Venus");
        questions4.setC("Earth");
        questions4.setD("Mars");
        questions4.setRightAnswer("Mars");

        Questions questions5 = new Questions();

        questions5.setquestion("Which is first planet of solar system?");
        questions5.setA("Mercury");
        questions5.setB("Jupiter");
        questions5.setC("Neptune");
        questions5.setD("Mars");
        questions5.setRightAnswer("Jupiter");

        Questions questions6 = new Questions();

        questions6.setquestion("Which is first planet of solar system?");
        questions6.setA("Jupiter");
        questions6.setB("Sarturn");
        questions6.setC("Mercury");
        questions6.setD("Uranus");
        questions6.setRightAnswer("Sarturn");

        Questions questions7 = new Questions();

        questions7.setquestion("Which is first planet of solar system?");
        questions7.setA("Mercury");
        questions7.setB("Jupiter");
        questions7.setC("Earth");
        questions7.setD("Uranus");
        questions7.setRightAnswer("Uranus");

        Questions questions8 = new Questions();

        questions8.setquestion("Which is first planet of solar system?");
        questions8.setA("Mercury");
        questions8.setB("Neptune");
        questions8.setC("Earth");
        questions8.setD("Mars");
        questions8.setRightAnswer("Neptune");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        Adapter adapter = new Adapter(questions);
        recyclerView.setAdapter(adapter);
    }
}

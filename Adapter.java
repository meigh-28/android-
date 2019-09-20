package com.example.myquiz;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    ArrayList<Questions> questions;
    public String rightAnswer;
    public int correctAnswersCount=0;
    public   int quizCount = 1;

    public Adapter(ArrayList<Questions> questions){
      this.questions = questions;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.question_layout, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int i) {
    Questions question = questions.get(i);
    holder.question.setText(question.getquestion());
    holder.answer1.setText(question.A);
        holder.answer2.setText(question.B);
        holder.answer3.setText(question.C);
        holder.answer4.setText(question.D);

    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{


        RadioButton answer1, answer2, answer3,answer4;
        TextView score, question, correct_answer;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            answer1 = itemView.findViewById(R.id.q_answer1);
            answer2 = itemView.findViewById(R.id.q_answer2);
            answer3 = itemView.findViewById(R.id.q_answer3);
            answer4 = itemView.findViewById(R.id.q_answer4);


            score = itemView.findViewById(R.id.q_score);
            question = itemView.findViewById(R.id.q_question);
            correct_answer =itemView.findViewById(R.id.q_answer);
        }
    }
}

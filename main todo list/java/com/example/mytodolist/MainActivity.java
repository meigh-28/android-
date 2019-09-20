package com.example.mytodolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    NoteAdapter noteAdapter;
    static int INSERT_SUCCESS = 0;
    DBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this);
        noteAdapter = new NoteAdapter(dbHelper);

        RecyclerView recyclerView = findViewById(R.id.rv_notes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(noteAdapter);
    }

    public void addTapped(View view){
     Intent intent = new Intent(MainActivity.this, SaveNoteActivity.class);
        startActivityForResult(intent, INSERT_SUCCESS);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==INSERT_SUCCESS){
        noteAdapter.notifyDataSetChanged();
        }
    }
}

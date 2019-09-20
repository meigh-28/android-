package com.example.mytodolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SaveNoteActivity extends AppCompatActivity {

    static int INSERT_SUCCESS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_note);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNotes(view);
            }
        });
     }


    public void saveNotes(View view) {

        DBHelper dbHelper = new DBHelper(this);

        EditText et_title = findViewById(R.id.etTitle);
        EditText et_details = findViewById(R.id.etDetails);

        long id = dbHelper.saveNote(et_title.getText().toString(), et_details.getText().toString());

        //get newly inserted row from db
        NoteModel noteModel = dbHelper.getNote(id);

        if (noteModel != null) {
            Intent intent = new Intent();
            setResult(INSERT_SUCCESS, intent);
            finish();
        }
    }
}

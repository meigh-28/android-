package com.example.mytodolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NotesHolder> {

    DBHelper dbHelper;


    public NoteAdapter(DBHelper dbHelper) {
        this.dbHelper =dbHelper;

    }

    @NonNull
    @Override
    public NotesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notes_adapter, parent, false);
        return new NotesHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull NotesHolder holder, int i) {
        NoteModel noteModel = dbHelper.getAllNotes().get(i);
        holder.tvTitle.setText(noteModel.getNoteTitle());
        holder.tvBody.setText(noteModel.getNoteBody());

    }




    @Override
    public int getItemCount()
    {
        return dbHelper.getAllNotes().size();
    }

    public class NotesHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;

        TextView tvBody;


        public NotesHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle =itemView.findViewById(R.id.tv_title);
            tvBody = itemView.findViewById(R.id.tv_body);

        }
    }
}

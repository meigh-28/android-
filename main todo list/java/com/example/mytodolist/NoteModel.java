package com.example.mytodolist;

public class NoteModel {

    public static final String TABLE_NAME = "notes";
    public static final String COLOUM_NOTE_ID = "noteid";
    public static final String COLOUM_NOTE_TITLE = "noteTitle";
    public static final String COLOUM_NOTE_BODY = "noteBody";
    public static final String COLOUM_CREATED_AT = "createdAT";


    private int noteId;
    private String noteTitle;
    private String noteBody;
    private String createdAT;



    public  NoteModel(){

    }


    public NoteModel(int noteId,String noteTitle, String noteBody,String createdAT){
        this.noteId = noteId;
        this.noteBody = noteBody;
        this.noteTitle = noteTitle;
        this.createdAT = createdAT;

    }

    //create sql table
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COLOUM_NOTE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLOUM_NOTE_TITLE + " TEXT,"
            + COLOUM_NOTE_BODY + " TEXT,"
            + COLOUM_CREATED_AT + " DATETIME DEFAULT CURRENT_TIMESTAMP "
            +" ) ";


    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }

    public String getCreatedAT(String string) {
        return createdAT;
    }

    public void setCreatedAT(String createdAT) {
        this.createdAT = createdAT;
    }



}

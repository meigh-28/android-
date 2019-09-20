package com.example.mytodolist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

  //DataBase VErsion
    private static final int DATABASE_VERSION=1;
    //DATABASE NAME
    private static final String DATABASE_NAME = "notes_database";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



  @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(NoteModel.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

public long saveNote(String title, String body){
      //get writable database
      SQLiteDatabase sqLiteDatabase =this.getWritableDatabase();
      ContentValues contentValues =new ContentValues();
      contentValues.put(NoteModel.COLOUM_NOTE_TITLE, title);
      contentValues.put(NoteModel.COLOUM_NOTE_BODY, body);

      //insert row
      long id = sqLiteDatabase.insert(NoteModel.TABLE_NAME, null, contentValues);

      //close database connection
      sqLiteDatabase.close();

      //return newly inserted row id

      return id;

}
    public NoteModel getNote(long id){

     SQLiteDatabase sqLiteDatabase =this.getReadableDatabase();

      Cursor cursor = sqLiteDatabase.query(NoteModel.TABLE_NAME,
              new String[]{NoteModel.COLOUM_NOTE_ID,NoteModel.COLOUM_NOTE_TITLE,NoteModel.COLOUM_NOTE_BODY,NoteModel.COLOUM_CREATED_AT},NoteModel.COLOUM_NOTE_ID + "=?",
              new String[]{String.valueOf(id)},null,null,null, null);

      if (cursor!=null)
          cursor.moveToFirst();
      int noteId =cursor.getInt(cursor.getColumnIndex(NoteModel.COLOUM_NOTE_ID));

      NoteModel noteModel = new NoteModel(noteId,
              cursor.getString(cursor.getColumnIndex(NoteModel.COLOUM_NOTE_TITLE)),
              cursor.getString(cursor.getColumnIndex(NoteModel.COLOUM_NOTE_BODY)),
              cursor.getString(cursor.getColumnIndex(NoteModel.COLOUM_CREATED_AT))
              );

            cursor.close();

          return noteModel;
       }

        public ArrayList<NoteModel> getAllNotes(){

        ArrayList<NoteModel> noteModels = new ArrayList<>();

//Select all queries
        String selectQuery = "SELECT * FROM " + NoteModel.TABLE_NAME + " ORDER BY " + NoteModel.COLOUM_CREATED_AT + " DESC";
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(selectQuery,null);


        //looping through all the objectsand adding it to array

          if (cursor.moveToFirst()){
        do {
            NoteModel noteModel = new NoteModel();

            noteModel.setNoteId(cursor.getInt(cursor.getColumnIndex(NoteModel.COLOUM_NOTE_ID)));
            noteModel.setNoteTitle(cursor.getString(cursor.getColumnIndex(NoteModel.COLOUM_NOTE_TITLE)));
            noteModel.setNoteBody(cursor.getString(cursor.getColumnIndex(NoteModel.COLOUM_NOTE_BODY)));
            noteModel.getCreatedAT(cursor.getString(cursor.getColumnIndex(NoteModel.COLOUM_CREATED_AT)));


            noteModels.add(noteModel);




        } while (cursor.moveToNext());
          }

          //close db connection
          sqLiteDatabase.close();

          //return note list
          return noteModels;

          }

          public int updateNotes(NoteModel noteModel){

          SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
          ContentValues values = new ContentValues();
          values.put(NoteModel.COLOUM_NOTE_ID, noteModel.getNoteTitle());


          //updating row

         return sqLiteDatabase.update(NoteModel.TABLE_NAME, values,NoteModel.COLOUM_NOTE_ID + "=?",
                 new String[]{String.valueOf(noteModel.getNoteId())});

          }

          public void deleteNote(NoteModel noteModel){

          SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

            sqLiteDatabase.delete(NoteModel.TABLE_NAME, NoteModel.COLOUM_NOTE_ID +"= ?",
                    new String[]{String.valueOf(noteModel.getNoteId())});

            sqLiteDatabase.close();



          }


}

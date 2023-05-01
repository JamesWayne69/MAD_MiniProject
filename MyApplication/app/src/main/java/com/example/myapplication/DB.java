package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DB extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;

    public DB(Context context) {
        super(context,"data.db",null,1);
        sqLiteDatabase=getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("Create table Cooking (Name text,Ingredients text,Method text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
/*
    public void save(String s1, String s2, String s3) {
        ContentValues cv=new ContentValues();
        cv.put("Name",s1);
        cv.put("Ingredients",s2);
        cv.put("Method",s3);
        sqLiteDatabase.insert("Cooking",null,cv);
    }



    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM Cooking" , null);
        return res;
    }
    */
}




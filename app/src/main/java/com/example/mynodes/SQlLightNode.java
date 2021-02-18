package com.example.mynodes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SQlLightNode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_ql_light_node);

    }
    public void onClick(View v){
        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS users (name TEXT, age INTEGER)");
        db.execSQL("INSERT INTO users VALUES('Max', 12)");
        db.execSQL("INSERT INTO users VALUES('Met', 20)");

        Cursor cursor = db.rawQuery("SELECT * FROM users", null);
        TextView textView = (TextView)findViewById(R.id.textView);
        while (cursor.moveToNext()){
            textView.append("\nName\t"+ cursor.getString(0) + " Age\t" + cursor.getInt(1));
        }
        cursor.close();
        db.close();
    }
}
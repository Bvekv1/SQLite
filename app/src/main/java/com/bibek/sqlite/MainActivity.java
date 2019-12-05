package com.bibek.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bibek.sqlite.myhelper.MyHelper;

public class MainActivity extends AppCompatActivity {
    EditText etWord, etMeaning;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWord = findViewById(R.id.etWord);
        etMeaning = findViewById(R.id.etMeaning);
        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyHelper myHelper = new MyHelper(MainActivity.this);

                SQLiteDatabase sqLiteDatabase = myHelper.getWritableDatabase();


            }
        });

    }
}

package com.example.android.idaayuanila_1202150280_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void allList(View view) {
        //untuk berpindah kelas ke ListMahasiswa
        Intent x = new Intent(this, ListMahasiswa.class);
        startActivity(x);
    }

    public void lihatGambar(View view) {
        //untuk berpindah kelas ke LihatGambar
        Intent y = new Intent(this, LihatGambar.class);
        startActivity(y);
    }
}

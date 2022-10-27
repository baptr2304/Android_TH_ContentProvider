package com.example.contentproviderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;

import kotlin.collections.UCollectionsKt;

public class AddActivity extends AppCompatActivity {
    private ContentResolver resolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        resolver = getContentResolver();
    }
}
package com;

import android.content.Intent;
import android.support.v4.app.RemoteActionCompatParcelizer ;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aplikasiresep.R;


public class DetailActivity extends AppCompatActivity {



        WebView webView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);

            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            DataModel dataModel= (DataModel) bundle.getSerializable("dataModel");

            setTitle(dataModel.getJudul());


            webView = (WebView) findViewById(R.id.webView);
            webView.loadUrl("file:///android_asset/"+dataModel.getKonten());
        }
    }


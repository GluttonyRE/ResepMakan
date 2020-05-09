package com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.aplikasiresep.R;

import java.io.Serializable;

public class DataModel implements Serializable {
    Integer viewType;
    String judul, konten;

    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public static class Detailactivity extends Activity {


        WebView webView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);

            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            DataModel dataModel= (DataModel) bundle.getSerializable("dataModel");

            setTitle(dataModel.getJudul());


            webView = findViewById(R.id.webView);
            webView.loadUrl("file:///android_asset/"+dataModel.getKonten());
        }
    }
}


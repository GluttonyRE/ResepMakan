package com.example.aplikasiresep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.DataAdapter;
import com.DataModel;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public DataAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<DataModel> dataModelArrayList=new ArrayList<DataModel>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputData("Ayam Bakar Bumbu Bali","artikel_1.html");
        inputData("Sate Ayam Srepeh","artikel_2.html");
        inputData("Pizza Sosis Jumbo (Tanpa Ulen)","artikel_3.html");
        inputData("Nasgor Mawut (Mawut Sayur)","artikel_4.html");
        inputData("Fuyung Hai ala Chef Lidya","artikel_5.html");
        inputData("Lobster bumbu Padang","artikel_6.html");
        inputData("Sop Iga Sapi Enak Sedep Banget","artikel_7.html");
        inputData("Opor Ayam Kampung","artikel_8.html");
        inputData("Bebek Goreng Sambel Ijo","artikel_9.html");
        inputData("Soto Ayam Kampung","artikel_10.html");
        inputData("Bakso Ayam","artikel_11.html");
        inputData("Ikan Gurame Bakar","artikel_12.html");
        inputData("Pisang Bakar Coklat Keju","artikel_13.html");
        inputData("Keto Martabak Terang Bulan","artikel_14.html");
        inputData("Ingkung Ayam Kampung","artikel_15.html");
        //inputData("Artikel 16","artikel_16.html");

        //menampilkan data ke dalam recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataAdapter(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

        //menambahakan header
        DataModel headerModel = new DataModel();
        headerModel.setViewType(2);
        dataModelArrayList.add(0,headerModel);

        //menambahkan footer
        DataModel footerModel = new DataModel();
        footerModel.setViewType(3);
        dataModelArrayList.add(footerModel);
    }

    //fungsi input
    public void inputData(String judul,String konten){
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }

}



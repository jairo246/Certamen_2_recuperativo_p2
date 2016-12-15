package com.example.jairo.certamenrecuperativo_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class List_Activity extends AppCompatActivity {

    RecyclerView rv;
    String url ="http://api.icndb.com/jokes/random?ﬁrstName=John&lastName=Doe" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_);

        rv = (RecyclerView) findViewById(R.id.lista);
        LinearLayoutManager lln = new LinearLayoutManager(this);
        rv.setLayoutManager(lln);

        List<Registro> listregistro = null;

        BackGroundTask backGroundTask = new BackGroundTask(List_Activity.this);
        backGroundTask.getList(url, listregistro);


            Adaptador adapter = new Adaptador(listregistro);

            rv.setAdapter(adapter);
    }
}

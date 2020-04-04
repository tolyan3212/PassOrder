package com.passorder.core;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView per;
    private Adapter adapter;
    private Button b;
    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        per=findViewById ( R.id.rv );

        LinearLayoutManager layoutManager = new LinearLayoutManager ( this );
        per.setLayoutManager ( layoutManager );
        adapter= new Adapter ( i );
        per.setAdapter ( adapter );
        b= findViewById ( R.id.button );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                i++;
                per.getLayoutParams ().height+=500;
                adapter= new Adapter ( i );
                per.setAdapter ( adapter );


            }
        } );
    }
}

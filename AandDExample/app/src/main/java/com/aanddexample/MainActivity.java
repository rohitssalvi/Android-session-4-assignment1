package com.aanddexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
ListView lv;
 Button btn1,btn2;
  Character[] alpha={'A','d','s','r','o','m','w','z','e'};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listv);
        btn1=(Button)findViewById(R.id.bt1);
        btn2=(Button)findViewById(R.id.bt2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        ArrayAdapter<Character> adpter=new ArrayAdapter<Character>(this,android.R.layout.simple_list_item_1,alpha);
        lv.setAdapter(adpter);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.bt1:
               Arrays.sort(alpha);
                ArrayAdapter<Character> adpter1=new ArrayAdapter<Character>(this,android.R.layout.simple_list_item_1,alpha);
                lv.setAdapter(adpter1);
                break;
            case R.id.bt2:
                Arrays.sort(alpha, Collections.reverseOrder());

                ArrayAdapter<Character> adpter2=new ArrayAdapter<Character>(this,android.R.layout.simple_list_item_1,alpha);
                lv.setAdapter(adpter2);
                break;
        }
    }
}

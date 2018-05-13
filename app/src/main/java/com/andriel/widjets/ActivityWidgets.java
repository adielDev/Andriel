package com.andriel.widjets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.andriel.R;

public class ActivityWidgets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        ListView lv = findViewById(R.id.lv);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String[] stringArray = getResources().getStringArray(R.array.widgets);
                Intent callingIntent = FragsWidgetAct.getCallingIntent(getApplicationContext(), stringArray[position]);
                startActivity(callingIntent);
            }
        });

    }
}

package com.bit2017.widget01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText)findViewById(R.id.editText);
                String name = editText.getText().toString();

                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText(name);
            }
        });

        Spinner spinner = (Spinner)findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                String itemName = (String)adapterView.getItemAtPosition( position );

                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText(itemName);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                System.out.println("==============");
                Log.d("MainActivicy","Nothing Selected");

            }
        });

    }
}

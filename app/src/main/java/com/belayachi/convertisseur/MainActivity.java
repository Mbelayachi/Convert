package com.belayachi.convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText pn;
    private EditText dn;
    private Button btConv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pn =(EditText) findViewById(R.id.pn);
        dn =(EditText) findViewById(R.id.dn);
        btConv=(Button) findViewById(R.id.btConv);

        btConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromEuroToDollar();

            }
        });



    }
    private void ConvertFromEuroToDollar(){
        String premiernb = pn.getText().toString();
        double Euro = Double.parseDouble(premiernb);
        double Dollar = Euro * 0.72;
        dn.setText(""+Dollar);






    }
}
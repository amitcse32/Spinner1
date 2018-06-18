package com.cssoft.spinner;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnItemSelected;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.button1)
    public void doClick() {


        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setView(R.layout.dialoglayout);
        Dialog dialog=builder.create();
        dialog.show();



      /*  AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("WELCOME");
        builder.setMessage("THIS IS A SAMPLE TITLE");


        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"SSS",Toast.LENGTH_SHORT).show();

            }
        });
        builder.setNegativeButton("NEG",null);
        builder.setNeutralButton("NUT",null);

        builder.setCancelable(false);
        Dialog dialog=builder.create();
        dialog.show();*/

    }


}

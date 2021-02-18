package com.example.mynodes.XMLWindow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mynodes.CostomDialog.CustomDialogFragment;
import com.example.mynodes.CostomDialog.CustomSave;
import com.example.mynodes.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showMyDialog(View v){
        CustomDialogFragment fragment = new CustomDialogFragment();
        fragment.show(getSupportFragmentManager(), "custom");
    }
    public void showMySave(View v){
        CustomSave fragment = new CustomSave();
        fragment.show(getSupportFragmentManager(), "custom");
    }
    public void NEwLayoutMain(View v){
        Intent intent = new Intent(this, LayoutMainActivity.class);
        startActivity(intent);
    }
    public void OpenSQL(View v){
        Intent intent = new Intent(this, SQlLightNode.class);
        startActivity(intent);
    }
}

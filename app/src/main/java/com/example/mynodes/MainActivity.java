package com.example.mynodes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ListView v = (ListView)findViewById(R.id.useritems);
//
//        XmlPullParser xpp = getResources().getXml(R.xml.users);
//        UserResourceParser parser = new UserResourceParser();
//        if(parser.parse(xpp)){
//            for(User user : parser.getUsers()) {
//                Log.d("XML", user.toString());
//            }
//
//            ArrayAdapter<User> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, parser.getUsers());
//            v.setAdapter(adapter);
//        }
    }
    public void showMyDialog(View v){
        CustomDialogFragment fragment = new CustomDialogFragment();
        fragment.show(getSupportFragmentManager(), "custom");
    }
    public void showMySave(View v){
        Intent intent = new Intent(this, LayoutMain.class);
        startActivity(intent);
        CustomSave fragment = new CustomSave();
        fragment.show(getSupportFragmentManager(), "custom");
    }
    public void NEwLayoutMain(View v){
        Intent intent = new Intent(this, LayoutMain.class);
        startActivity(intent);
    }
}

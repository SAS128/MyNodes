package com.example.mynodes.XMLWindow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mynodes.ClassJava.User;
import com.example.mynodes.ClassJava.UserResourceParser;
import com.example.mynodes.R;

import org.xmlpull.v1.XmlPullParser;

public class LayoutMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_main);
        ListView v = (ListView)findViewById(R.id.useritems);

        XmlPullParser xpp = getResources().getXml(R.xml.users);
        UserResourceParser parser = new UserResourceParser();
        if(parser.parse(xpp)){
            for(User user : parser.getUsers()) {
                Log.d("XML", user.toString());
            }

            ArrayAdapter<User> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, parser.getUsers());
            v.setAdapter(adapter);
        }
    }
}
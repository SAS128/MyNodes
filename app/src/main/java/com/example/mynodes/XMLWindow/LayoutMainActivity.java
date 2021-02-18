package com.example.mynodes.XMLWindow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mynodes.ClassJava.Node;
import com.example.mynodes.ClassJava.NodeResourceParser;
import com.example.mynodes.R;

import org.xmlpull.v1.XmlPullParser;

public class LayoutMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_main);
        ListView v = (ListView)findViewById(R.id.nodeitems);

        XmlPullParser xpp = getResources().getXml(R.xml.nodes);
        NodeResourceParser parser = new NodeResourceParser();
        if(parser.parse(xpp)){
            for(Node node : parser.getNodes()) {
                Log.d("XML", node.toString());
            }

            ArrayAdapter<Node> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, parser.getNodes());
            v.setAdapter(adapter);
        }
    }
}
package com.example.mynodes.ClassJava;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;

public class NodeResourceParser {
    private ArrayList<Node> nodes;
    public NodeResourceParser(){
        nodes = new ArrayList<>();
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public boolean parse(XmlPullParser xpp){
        boolean status = true;
        Node currentNode = null;
        boolean inEntity = false;
        String textValue = "";

        try {
            int eventType = xpp.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT){
                String tagName= xpp.getName();
                switch (eventType){
                    case XmlPullParser.START_TAG:{
                        if("node".equalsIgnoreCase(tagName)){
                            inEntity = true;
                            currentNode = new Node();
                        }
                        break;
                    }
                    case XmlPullParser.TEXT:{
                        textValue = xpp.getText();
                        break;
                    }
                    case XmlPullParser.END_TAG:{
                        if(inEntity) {
                            if ("node".equalsIgnoreCase(tagName)) {
                                inEntity = false;
                                nodes.add(currentNode);
                            } else if ("title".equalsIgnoreCase(tagName)) {
                                currentNode.setTitle(textValue);
                            } else if ("body".equalsIgnoreCase(tagName)) {
                                currentNode.setBody(textValue);
                            }
                        }
                        break;
                    }
                }
                eventType = xpp.next();
            }
        } catch (XmlPullParserException e) {
            status = false;
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return status;
    }
}

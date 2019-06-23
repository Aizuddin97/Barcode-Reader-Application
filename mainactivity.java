package com.example.activity.contactformurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.lang.*;
import android.webkit.WebView;


// add this to androidmanifest.xml else app will crash.
// <uses-permission android:name="android.permission.INTERNET" />

public class MainActivity extends AppCompatActivity
{

    private String url = "https://monostring.weebly.com/contact-us.html";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wv_page = (WebView) findViewById(R.id.wv_page);
        browserInit();
    }


public void browserInit()
{
    Toast.makeText(MainActivity.this, "Please wait for page to load.", Toast.LENGTH_LONG).show();

    WebView wv_page = (WebView) findViewById(R.id.wv_page);
    wv_page.getSettings().setJavaScriptEnabled(true);
    wv_page.loadUrl(url);
    wv_page.setHorizontalScrollBarEnabled(true);
    wv_page.setVerticalScrollBarEnabled(true);

}


}

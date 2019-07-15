package com.example.alcchallenge;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.Webview);
        webView.loadUrl("https://andela.com/alc/");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

    }
}

package fr.darkcity.ogsteaminfo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web_forum = new WebView(this);

        web_forum.setWebViewClient(new WebViewClient());
        setContentView(web_forum);

        web_forum.getSettings().setJavaScriptEnabled(true);
        web_forum.getSettings().setAllowContentAccess(true);

        web_forum.loadUrl("http://www.simplemachines.org/community/index.php");



    }
}

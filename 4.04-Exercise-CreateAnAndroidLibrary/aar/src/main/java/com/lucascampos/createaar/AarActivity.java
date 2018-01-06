package com.lucascampos.createaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AarActivity extends AppCompatActivity {

    public static final String JOKE_EXTRAS = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aar);

        ((TextView) findViewById(R.id.joke)).setText(getIntent().getStringExtra(JOKE_EXTRAS));
    }
}

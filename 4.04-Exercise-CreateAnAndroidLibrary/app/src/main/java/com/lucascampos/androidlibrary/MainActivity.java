package com.lucascampos.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lucascampos.createaar.AarActivity;
import com.lucascampos.joke.Joke;

import static com.lucascampos.createaar.AarActivity.JOKE_EXTRAS;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tell_joke).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(
                        new Intent(MainActivity.this, AarActivity.class)
                                .putExtra(JOKE_EXTRAS, Joke.tellJoke()));
            }
        });
    }
}

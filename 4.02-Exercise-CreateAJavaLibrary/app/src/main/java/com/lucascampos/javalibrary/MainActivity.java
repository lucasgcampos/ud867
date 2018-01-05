package com.lucascampos.javalibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lucascampos.joke.JokeSmith;
import com.lucascampos.jokewizard.JokeWizard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.joke)).setText(JokeSmith.getJoke());
        ((TextView) findViewById(R.id.joke_wizard)).setText(JokeWizard.getJokeWizard());
    }
}

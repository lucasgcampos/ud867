package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import br.com.wai.display.JokeActivity;
import br.com.wai.joke.Joke;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        B(this).execute();
    }


    class B extends AsyncTask<Void, Void, String> {

        private final AppCompatActivity activity;

        public B(final AppCompatActivity activity) {
            this.activity = activity;
        }

        @Override
        protected String doInBackground(Void... voids) {
            return Joke.tellJoke();
        }

        @Override
        protected void onPostExecute(String joke) {
            activity.startActivity(new Intent(activity, JokeActivity.class)
                    .putExtra("joke", joke));

        }
    }

}
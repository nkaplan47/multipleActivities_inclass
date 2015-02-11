package edu.css.cis3334.multipleactivities_inclass;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ResultsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
    }

    public void onClick(View v) {
        // declare an intent for our new activity
        Intent i = new Intent(this, ResultsActivity.class);
        // display new activity
        finish();
    }
}

package com.example.sam.e_clinic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        final RatingBar simpleRatingBar = (RatingBar) findViewById (R.id.ratingBar);

        Button submitButton = (Button) findViewById ( R.id.button13 );

        submitButton.setOnClickListener (new View. OnClickListener () {
            @Override
            public void onClick (View v) {

                String totalStars = "Total Stars:: " + simpleRatingBar . getNumStars ();
                String rating = "Rating :: " + simpleRatingBar . getRating ();
                Toast. makeText ( getApplicationContext (), totalStars + "\n" + rating ,
                        Toast . LENGTH_LONG ). show ();
            }
        });
    }
    }

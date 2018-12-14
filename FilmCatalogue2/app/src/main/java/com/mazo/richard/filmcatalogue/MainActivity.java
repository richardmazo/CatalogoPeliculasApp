
package com.mazo.richard.filmcatalogue;

import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView movieImageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieImageView = (ImageView) findViewById(R.id.movie_image);

        Button btnGravity = (Button) findViewById(R.id.gravity_button);
        Button btnJumanji = (Button) findViewById(R.id.jumanji_button);
        Button btnLion = (Button) findViewById(R.id.the_lion_king_button);
        Button btnStarWars = (Button) findViewById(R.id.star_wars_button);
        Button btnOrigin = (Button) findViewById(R.id.the_origin_button);
        Button btnToyStory = (Button) findViewById(R.id.toy_story_button);

        btnGravity.setOnClickListener(this);
        btnJumanji.setOnClickListener(this);
        btnLion.setOnClickListener(this);
        btnStarWars.setOnClickListener(this);
        btnOrigin.setOnClickListener(this);
        btnToyStory.setOnClickListener(this);

    }

    @Override
    public void onClick(View buttonView) {

        int buttonId = buttonView.getId();
        int ImageId;

        switch (buttonId){
            case R.id.gravity_button:
                ImageId = R.drawable.gravity;
                break;
            case R.id.jumanji_button:
                ImageId = R.drawable.jumanji;
                break;
            case R.id.the_lion_king_button:
                ImageId = R.drawable.the_king_lion;
                break;
            case R.id.star_wars_button:
                ImageId = R.drawable.star_wars;
                break;
            case R.id.the_origin_button:
                ImageId = R.drawable.the_origin;
                break;
            case R.id.toy_story_button:
                ImageId = R.drawable.toy_story;
                break;
            default:
                ImageId=0;
        }

        if (ImageId!=0){
            movieImageView.setImageDrawable(ContextCompat.getDrawable(this,ImageId));
        }

    }
}

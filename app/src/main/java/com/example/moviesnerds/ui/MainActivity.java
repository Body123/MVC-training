package com.example.moviesnerds.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.moviesnerds.R;
import com.example.moviesnerds.pojo.movieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView movietxtview;
    Button getMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movietxtview = findViewById(R.id.txtMovieName);
        getMovie=findViewById(R.id.getMovies);
        getMovie.setOnClickListener(this);
        
    }
    public movieModel getMoveFromDataBase() {
        return new movieModel(1,"religious","20-10-2010","okey");
    }

    public void getMovie() {
        movietxtview.setText(getMoveFromDataBase().getName());
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.getMovies){
            getMovie();
        }
    }
}

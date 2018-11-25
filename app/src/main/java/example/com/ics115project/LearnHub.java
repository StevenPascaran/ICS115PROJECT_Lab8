package example.com.ics115project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnHub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_hub);

        Button earthquake, tsunami, flashflood, typhoon, landslide;

        earthquake = (Button) findViewById(R.id.earthquake);
        tsunami = (Button) findViewById(R.id.tsunami);
        flashflood = (Button) findViewById(R.id.flashfloods);
        typhoon = (Button) findViewById(R.id.typhoon);
        landslide = (Button) findViewById(R.id.landslides);

        earthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LearnEarth .class);
                startActivity(i);
            }
        });

        typhoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LearnTyphoon .class);
                startActivity(i);
            }
        });

        flashflood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LearnFlashFlood .class);
                startActivity(i);
            }
        });

        landslide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LearnLandslide .class);
                startActivity(i);
            }
        });

        tsunami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LearnTsunami .class);
                startActivity(i);
            }
        });
    }
}

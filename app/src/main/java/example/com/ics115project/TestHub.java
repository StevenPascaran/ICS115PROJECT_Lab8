package example.com.ics115project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestHub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_hub);

        Button earthquake, tsunami, typhoon, landslides, flashfloods;

        earthquake=(Button)findViewById(R.id.earthquake);
        tsunami=(Button)findViewById(R.id.tsunami);
        typhoon=(Button)findViewById(R.id.typhoon);
        landslides=(Button)findViewById(R.id.landslides);
        flashfloods=(Button)findViewById(R.id.flashfloods);

        earthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TestEarthQ1.class);
                startActivity(i);
            }
        });

        landslides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TestLandQ1.class);
                startActivity(i);
            }
        });

        typhoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TestTyphoonQ1.class);
                startActivity(i);
            }
        });

        tsunami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TestTsunamiQ1.class);
                startActivity(i);
            }
        });

        flashfloods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TestFlashQ1.class);
                startActivity(i);
            }
        });


    }
}

package example.com.ics115project;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;

public class TestTyphoonQ2 extends AppCompatActivity {
    Button A1,A2,A3,A4,Next;
    TextView AnsFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_typhoon_q2);


        Next=(Button)findViewById(R.id.Next);
        A1=(Button)findViewById(R.id.A1);
        A2=(Button)findViewById(R.id.A2);
        A3=(Button)findViewById(R.id.A3);
        A4=(Button)findViewById(R.id.A4);
        AnsFinal=(TextView)findViewById(R.id.AnsFinal);

        A1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AnsFinal.setText("You should always listen to the news because it is one of the many places you can gain information about typhoons");
                A1.setBackgroundColor(GREEN);
                A2.setBackgroundColor(RED);
                A3.setBackgroundColor(RED);
                A4.setBackgroundColor(RED);
                Next.setVisibility(View.VISIBLE);
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AnsFinal.setText("You should always listen to the news because it is one of the many places you can gain information about typhoons");
                A1.setBackgroundColor(GREEN);
                A2.setBackgroundColor(RED);
                A3.setBackgroundColor(RED);
                A4.setBackgroundColor(RED);
                Next.setVisibility(View.VISIBLE);
            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AnsFinal.setText("You should always listen to the news because it is one of the many places you can gain information about typhoons");
                A1.setBackgroundColor(GREEN);
                A2.setBackgroundColor(RED);
                A3.setBackgroundColor(RED);
                A4.setBackgroundColor(RED);
                Next.setVisibility(View.VISIBLE);
            }
        });
        A4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AnsFinal.setText("You should always listen to the news because it is one of the many places you can gain information about typhoons");
                A1.setBackgroundColor(GREEN);
                A2.setBackgroundColor(RED);
                A3.setBackgroundColor(RED);
                A4.setBackgroundColor(RED);
                Next.setVisibility(View.VISIBLE);
            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TestTyphoonQ3.class);
                startActivity(i);
            }
        });


    }
}

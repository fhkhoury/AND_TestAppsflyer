package fiftyfive.and_samplefirebasegabq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button goToListe = (Button) findViewById(R.id.goToListe);
        goToListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, Liste.class);
                startActivity(i);
            }
        });

        Button infos = (Button) findViewById(R.id.informations);
        goToListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, Informations.class);
                startActivity(i);
            }
        });
    }
}

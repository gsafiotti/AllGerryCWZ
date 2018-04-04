package gerry.allgerry;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class PersonaggiActivity extends AppCompatActivity {
    ImageView pg0;
    ImageView pg1;
    ImageView pg2;
    ImageView pg3;
    Button g1_button;
    Button g2_button;
    ImageView bigg1;
    ImageView bigg2;
    Boolean g1_selected;
    Boolean g2_selected;
    Boolean g1_confirmed;
    Boolean g2_confirmed;
    int g1_id;
    int g2_id;
    Intent i;
    MediaPlayer mp0;
    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personaggi);
        Bitmap omero_mini = BitmapFactory.decodeResource(getResources(), R.drawable.omero_mini);
        Bitmap gerry_mini = BitmapFactory.decodeResource(getResources(), R.drawable.gerry_mini);
        Bitmap dario_mini = BitmapFactory.decodeResource(getResources(), R.drawable.dario_mini);
        Bitmap rush_mini = BitmapFactory.decodeResource(getResources(), R.drawable.rush_mini);
        final Bitmap rush_big = BitmapFactory.decodeResource(getResources(), R.drawable.rush_big);
        final Bitmap omero_big = BitmapFactory.decodeResource(getResources(), R.drawable.omero_big);
        final Bitmap gerry_big = BitmapFactory.decodeResource(getResources(), R.drawable.gerry_big);
        final Bitmap dario_big = BitmapFactory.decodeResource(getResources(), R.drawable.dario_big);
        g1_confirmed=false;
        g1_selected=false;
        g2_confirmed=false;
        g2_confirmed=false;
        pg0= (ImageView) findViewById(R.id.IV_pg0);
        pg1= (ImageView) findViewById(R.id.IV_pg1);
        pg2= (ImageView) findViewById(R.id.IV_pg2);
        pg3= (ImageView) findViewById(R.id.IV_pg3);
        g1_button= (Button) findViewById(R.id.B_g1);
        g2_button= (Button) findViewById(R.id.B_g2);
        g2_button.setVisibility(View.INVISIBLE);
        i=new Intent(this,TrisActivity.class);
        bigg1= (ImageView) findViewById(R.id.IV_g1);
        bigg2= (ImageView) findViewById(R.id.IV_g2);
        mp0 = MediaPlayer.create(PersonaggiActivity.this, R.raw.dario_sound);
        mp1 = MediaPlayer.create(PersonaggiActivity.this, R.raw.gerry_sound);
        mp2 = MediaPlayer.create(PersonaggiActivity.this, R.raw.omero_sound);
        mp3 = MediaPlayer.create(PersonaggiActivity.this, R.raw.rush_sound);

        pg0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g1_confirmed==false){
                    bigg1.setImageBitmap(dario_big);
                    g1_id=0;
                    g1_button.setText("Conferma Player 1");
                    g1_selected=true;
                    mp0.start();
                }
                else{
                    bigg2.setImageBitmap(dario_big);
                    g2_id=0;
                    g2_button.setText("Conferma Player 2");
                    g2_selected=true;
                    mp0.start();
                }
            }
        });
        pg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g1_confirmed==false){
                    bigg1.setImageBitmap(gerry_big);
                    g1_id=1;
                    g1_button.setText("Conferma Player 1");
                    g1_selected=true;
                    mp1.start();
                }
                else{
                    bigg2.setImageBitmap(gerry_big);
                    g2_id=1;
                    g2_button.setText("Conferma Player 2");
                    g2_selected=true;
                    mp1.start();
                }
            }
        });
        pg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g1_confirmed==false){
                    bigg1.setImageBitmap(omero_big);
                    g1_id=2;
                    g1_button.setText("Conferma Player 1");
                    g1_selected=true;
                    mp2.start();
                }
                else{
                    bigg2.setImageBitmap(omero_big);
                    g2_id=2;
                    g2_button.setText("Conferma Player 2");
                    g2_selected=true;
                    mp2.start();
                }
            }
        });
        pg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g1_confirmed==false){
                    bigg1.setImageBitmap(rush_big);
                    g1_id=3;
                    g1_button.setText("Conferma Player 1");
                    g1_selected=true;
                    mp3.start();

                }
                else{
                    bigg2.setImageBitmap(rush_big);
                    g2_id=3;
                    g2_button.setText("Conferma Player 2");
                    g2_selected=true;
                    mp3.start();
                }
            }
        });
        g1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g1_selected==true){
                    g1_confirmed=true;
                    g2_button.setVisibility(View.VISIBLE);
                }
                else{
                    Toast.makeText(PersonaggiActivity.this, "Seleziona un personaggio", Toast.LENGTH_SHORT).show();
                }
            }
        });
        g2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g2_selected==true&&g1_id!=g2_id){
                    g2_confirmed=true;
                    i.putExtra("g1_id",g1_id);
                    i.putExtra("g2_id",g2_id);
                    startActivity(i);

                }
                else{
                    Toast.makeText(PersonaggiActivity.this, "Seleziona un personaggio. Non si possono usare 2 personaggi uguali!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

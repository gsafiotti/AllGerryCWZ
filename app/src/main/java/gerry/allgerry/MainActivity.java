package gerry.allgerry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView titolo;
    Button tris_button;
    Button rubrica_button;
    Button cwz_button;
    //Intent tris_i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tris_button= (Button) findViewById(R.id.Btris);
        rubrica_button= (Button) findViewById(R.id.Brubrica);
        cwz_button= (Button) findViewById(R.id.Bcwz);


        tris_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tris_i.putExtra("username", editText.getText().toString());
                Intent tris_i = new Intent(MainActivity.this,PersonaggiActivity.class);
                startActivity(tris_i);
            }
        });
        rubrica_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tris_i.putExtra("username", editText.getText().toString());
                Intent rubrica_i = new Intent(MainActivity.this,RubricaActivity.class);
                startActivity(rubrica_i);
            }
        });

        cwz_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tris_i.putExtra("username", editText.getText().toString());
                Intent cwz_i = new Intent(MainActivity.this,BattleCWZActivity.class);
                startActivity(cwz_i);
            }
        });
    }

}

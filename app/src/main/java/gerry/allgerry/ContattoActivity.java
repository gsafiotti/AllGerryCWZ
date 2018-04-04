package gerry.allgerry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContattoActivity extends AppCompatActivity {
    TextView nome,numero;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatto);
        Bundle pacchetto = getIntent().getExtras();
        nome= (TextView) findViewById(R.id.TV_nome);
        nome.setText(pacchetto.getString("nome"));
        numero= (TextView) findViewById(R.id.TV_numero);
        numero.setText(pacchetto.getString("numero"));
        img= (ImageView) findViewById(R.id.IM_img);
        img.setImageResource(pacchetto.getInt("foto"));
    }
}

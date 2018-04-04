package gerry.allgerry;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RubricaActivity extends AppCompatActivity {
    List<Contatto>contatti;
    ListView lista;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubrica);
        Log.d("prima di lista", "onCreate: ");
        lista = (ListView) findViewById(R.id.list);
        Log.d("primageneracontatti", "onCreate: ");
        //contatti = new ArrayList<>();
        //contatti.add(new Contatto("Mauro",R.drawable.dario_mini,"32428449282"));
        generaContatti();
        Log.d("dopogeneracontatti", "onCreate: ");
        ContattoAdapter adapter = new ContattoAdapter(this, R.layout.row,contatti);
        Log.d("dopocontattoadapter", "onCreate: ");
        lista.setAdapter(adapter);
        Log.d("doposetadapter", "onCreate: ");
        i = new Intent(this,ContattoActivity.class);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle pacchetto = new Bundle();
                pacchetto.putInt("foto",contatti.get(position).getImg());
                pacchetto.putString("nome",contatti.get(position).getNome());
                pacchetto.putString("numero",contatti.get(position).getNumero());
                i.putExtras(pacchetto);
                startActivity(i);


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("log", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("log", "onResume: ");
    }

    private void generaContatti(){
        contatti=new ArrayList<>();
        contatti.add(new Contatto("Dario Amalfitano",(R.drawable.dario_mini),"3985734567"));
        contatti.add(new Contatto("Omero Vitali",(R.drawable.omero_mini),"3345123890"));
        contatti.add(new Contatto("Francesco Ruscelli",(R.drawable.rush_mini),"3478965432"));
        contatti.add(new Contatto("Gerardo Safiotti",(R.drawable.gerry_mini),"3478956093"));
        contatti.add(new Contatto("Paolo de Dominics",(R.drawable.null_mini),"34879605948"));
        contatti.add(new Contatto("Tommaso Sorrentino",(R.drawable.null_mini),"3245657342"));
        contatti.add(new Contatto("Giulia Polidori",(R.drawable.null_mini),"325467345"));
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.d("log", "onPause: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("log", "onDestroy: ");
    }

}

package gerry.allgerry;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TrisActivity extends AppCompatActivity {
    ImageView top1;
    ImageView top2;
    ImageView top3;
    ImageView down1;
    ImageView down3;
    ImageView down2;
    ImageView center1;
    ImageView center2;
    ImageView center3;
    ImageView pg_sin;
    ImageView pg_des;
    TextView nome_sin;
    TextView nome_des;
    ImageView vs;
    List<Giocatore> giocatori;
    List<Bitmap> caselle;
    Giocatore g1;
    Giocatore g2;
    boolean simbolo;
    Intent i;
    int g1_id;
    int g2_id;
    int contatore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tris);
        Bitmap simbolo_f = BitmapFactory.decodeResource(getResources(), R.drawable.simbolo_f);
        Bitmap simbolo_t = BitmapFactory.decodeResource(getResources(), R.drawable.simbolo_t);
        Bitmap dario_mini = BitmapFactory.decodeResource(getResources(), R.drawable.dario_mini);
        Bitmap dario_medio_sin = BitmapFactory.decodeResource(getResources(), R.drawable.dario_medio_sin);
        Bitmap dario_medio_des = BitmapFactory.decodeResource(getResources(), R.drawable.dario_medio_des);
        Bitmap dario_big = BitmapFactory.decodeResource(getResources(), R.drawable.dario_big);
        Bitmap gerry_mini = BitmapFactory.decodeResource(getResources(), R.drawable.gerry_mini);
        Bitmap gerry_medio_sin = BitmapFactory.decodeResource(getResources(), R.drawable.gerry_medio_sin);
        Bitmap gerry_medio_des = BitmapFactory.decodeResource(getResources(), R.drawable.gerry_medio_des);
        Bitmap omero_mini = BitmapFactory.decodeResource(getResources(), R.drawable.omero_mini);
        Bitmap omero_medio_sin = BitmapFactory.decodeResource(getResources(), R.drawable.omero_medio_sin);
        Bitmap omero_medio_des = BitmapFactory.decodeResource(getResources(), R.drawable.omero_medio_des);
        Bitmap rush_mini = BitmapFactory.decodeResource(getResources(), R.drawable.rush_mini);
        Bitmap rush_medio_sin = BitmapFactory.decodeResource(getResources(), R.drawable.rush_medio_sin);
        Bitmap rush_medio_des = BitmapFactory.decodeResource(getResources(), R.drawable.rush_medio_des);
        simbolo = false;
        binding();
        i=getIntent();
        g1_id=i.getIntExtra("g1_id",g1_id);
        g2_id=i.getIntExtra("g2_id",g2_id);


        giocatori = new ArrayList<>();
        giocatori.add(new Giocatore("Dario", dario_mini, dario_medio_sin, dario_medio_des, dario_big, simbolo_f, simbolo_t));
        giocatori.add(new Giocatore("Gerry", gerry_mini, gerry_medio_sin, gerry_medio_des, dario_big, simbolo_f, simbolo_t));
        giocatori.add(new Giocatore("Homer", omero_mini, omero_medio_sin, omero_medio_des, dario_big, simbolo_f, simbolo_t));
        giocatori.add(new Giocatore("Rush", rush_mini, rush_medio_sin, rush_medio_des, dario_big, simbolo_f, simbolo_t));
        g1 = giocatori.get(g1_id);
        g2 = giocatori.get(g2_id);
        giocatore1(g1);//servono per visualizzare le caratteristiche dei giocatori nella partita, tipo immaginie simboli speciali
        giocatore2(g2);


        //caselle = new ArrayList<>();
        //caselle.add(0, null);
        //caselle.add(1, g1.getSimboloF());
        //caselle.add(2, g1.getSimboloF());
        //caselle.add(3, g1.getSimboloF());
        //caselle.add(4, g1.getSimboloF());
        ///caselle.add(5, g1.getSimboloF());
        //caselle.add(6, g1.getSimboloF());
        //caselle.add(7, g1.getSimboloF());
        //caselle.add(8, g1.getSimboloF());
        //caselle.add(9, g1.getSimboloF());

        //qui comincia l'infinità di listener------------------------------------------------------------------------------------

        top1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++;
                    if (simbolo == false) {
                        top1.setEnabled(false);
                        top1.setImageBitmap(g1.getSimboloF());
                        simbolo = true;
                        g1.posizioni.add(1);
                        if(g1.verifica()) win(g1.getNome());
                        Log.d("Pos. 00", "onClick: ");
                    } else {
                        top1.setEnabled(false);
                        top1.setImageBitmap(g2.getSimboloT());
                        simbolo = false;
                        g2.posizioni.add(1);
                        if(g2.verifica()) win(g2.getNome());
                        Log.d("Pos. 00", "onClick: ");
                    }

            }

        });
        top2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++;
                if (simbolo == false) {
                    top2.setEnabled(false);
                    top2.setImageBitmap(g1.getSimboloF());
                    simbolo = true;
                    g1.posizioni.add(2);
                    if(g1.verifica()) win(g1.getNome());
                    Log.d("Pos. 00", "onClick: ");
                } else {
                    top2.setEnabled(false);
                    top2.setImageBitmap(g2.getSimboloT());
                    simbolo = false;
                    g2.posizioni.add(2);
                    if(g2.verifica()) win(g2.getNome());
                    Log.d("Pos. 00", "onClick: ");
                }

            }

        });
        top3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++;
                if (simbolo == false) {
                    top3.setEnabled(false);
                    top3.setImageBitmap(g1.getSimboloF());
                    simbolo = true;
                    g1.posizioni.add(3);
                    if(g1.verifica()) win(g1.getNome());
                    Log.d("Pos. 00", "onClick: ");
                } else {
                    top3.setEnabled(false);
                    top3.setImageBitmap(g2.getSimboloT());
                    simbolo = false;
                    g2.posizioni.add(3);
                    if(g2.verifica()) win(g2.getNome());
                    Log.d("Pos. 00", "onClick: ");
                }

            }

        });
        center1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++;
                if (simbolo == false) {
                    center1.setEnabled(false);
                    center1.setImageBitmap(g1.getSimboloF());
                    simbolo = true;
                    g1.posizioni.add(4);
                    if(g1.verifica()) win(g1.getNome());
                    Log.d("Pos. 00", "onClick: ");
                } else {
                    center1.setEnabled(false);
                    center1.setImageBitmap(g2.getSimboloT());
                    simbolo = false;
                    g2.posizioni.add(4);
                    if(g2.verifica()) win(g2.getNome());
                    Log.d("Pos. 00", "onClick: ");
                }

            }

        });
        center2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++;
                if (simbolo == false) {
                    center2.setEnabled(false);
                    center2.setImageBitmap(g1.getSimboloF());
                    simbolo = true;
                    g1.posizioni.add(5);
                    if(g1.verifica()) win(g1.getNome());
                    Log.d("Pos. 00", "onClick: ");
                } else {
                    center2.setEnabled(false);
                    center2.setImageBitmap(g2.getSimboloT());
                    simbolo = false;
                    g2.posizioni.add(5);
                    if(g2.verifica()) win(g2.getNome());
                    Log.d("Pos. 00", "onClick: ");
                }

            }

        });
        center3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++;
                if (simbolo == false) {
                    center3.setEnabled(false);
                    center3.setImageBitmap(g1.getSimboloF());
                    simbolo = true;
                    g1.posizioni.add(6);
                    if(g1.verifica()) win(g1.getNome());
                    Log.d("Pos. 00", "onClick: ");
                } else {
                    center3.setEnabled(false);
                    center3.setImageBitmap(g2.getSimboloT());
                    simbolo = false;
                    g2.posizioni.add(6);
                    if(g2.verifica()) win(g2.getNome());
                    Log.d("Pos. 00", "onClick: ");
                }

            }

        });
        down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++;
                if (simbolo == false) {
                    down1.setEnabled(false);
                    down1.setImageBitmap(g1.getSimboloF());
                    simbolo = true;
                    g1.posizioni.add(7);
                    if(g1.verifica()) win(g1.getNome());
                    Log.d("Pos. 00", "onClick: ");
                } else {
                    down1.setEnabled(false);
                    down1.setImageBitmap(g2.getSimboloT());
                    simbolo = false;
                    g2.posizioni.add(7);
                    if(g2.verifica()) win(g2.getNome());
                    Log.d("Pos. 00", "onClick: ");
                }

            }

        });
        down2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++;
                if (simbolo == false) {
                    down2.setEnabled(false);
                    down2.setImageBitmap(g1.getSimboloF());
                    simbolo = true;
                    g1.posizioni.add(8);
                    if(g1.verifica()) win(g1.getNome());
                    Log.d("Pos. 00", "onClick: ");
                } else {
                    down2.setEnabled(false);
                    down2.setImageBitmap(g2.getSimboloT());
                    simbolo = false;
                    g2.posizioni.add(8);
                    if(g2.verifica()) win(g2.getNome());
                    Log.d("Pos. 00", "onClick: ");
                }

            }

        });
        down3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++;
                if (simbolo == false) {
                    down3.setEnabled(false);
                    down3.setImageBitmap(g1.getSimboloF());
                    simbolo = true;
                    g1.posizioni.add(9);
                    if(g1.verifica()) win(g1.getNome());
                    Log.d("Pos. 00", "onClick: ");
                } else {
                    down3.setEnabled(false);
                    down3.setImageBitmap(g2.getSimboloT());
                    simbolo = false;
                    g2.posizioni.add(9);
                    if(g2.verifica()) win(g2.getNome());
                    Log.d("Pos. 00", "onClick: ");
                }

            }

        });
        //qui finisce l'infità di listener -----------------------------------------------------------------------------------------
    }

    public void giocatore1(Giocatore g) {
        pg_sin.setImageBitmap(g1.getImg_media_sin());
        nome_sin.setText(g1.getNome());
    }

    ;

    public void giocatore2(Giocatore g) {
        pg_des.setImageBitmap(g2.getImg_media_des());
        nome_des.setText(g2.getNome());
    }

    ;

    public void binding() {
        pg_sin = (ImageView) findViewById(R.id.IV_pg_sin);
        pg_des = (ImageView) findViewById(R.id.IV_pg_des);
        nome_sin = (TextView) findViewById(R.id.TV_nome_sin);
        nome_des = (TextView) findViewById(R.id.TV_nome_des);
        vs = (ImageView) findViewById(R.id.IV_vs);
        top1 = (ImageView) findViewById(R.id.IV_top1);
        top2 = (ImageView) findViewById(R.id.IV_top2);
        top3 = (ImageView) findViewById(R.id.IV_top3);
        down1 = (ImageView) findViewById(R.id.IV_down1);
        down2 = (ImageView) findViewById(R.id.IV_down2);
        down3 = (ImageView) findViewById(R.id.IV_down3);
        center1 = (ImageView) findViewById(R.id.IV_center1);
        center2 = (ImageView) findViewById(R.id.IV_center2);
        center3 = (ImageView) findViewById(R.id.IV_center3);
    }

    public void win (String s){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Ha vinto "+ s);

        builder.setPositiveButton("Rivincita", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Log.d("Rigioca", "onClick: ");
                reload();
            }
        });
        builder.setNegativeButton("Esci", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
                System.exit(0);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void reload() {
        Intent intent = getIntent();
        overridePendingTransition(0, 0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0, 0);
        startActivity(intent);
    }
    public void draw (String s){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("La partita è finita pari. ");

        builder.setPositiveButton("Rivincita", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Log.d("Rigioca", "onClick: ");
                reload();
            }
        });
        builder.setNegativeButton("Esci", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
                System.exit(0);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }


}

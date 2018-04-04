package gerry.allgerry;

import android.graphics.Bitmap;

import java.sql.Ref;

/**
 * Created by Gerry on 20/02/2017.
 */

public class Contatto {
    private String nome;
     private int img;
     private String numero;

    public Contatto(String nome, int img, String numero) {
        this.nome = nome;
        this.img = img;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

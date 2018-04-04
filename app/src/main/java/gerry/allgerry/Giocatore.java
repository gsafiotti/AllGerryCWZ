package gerry.allgerry;

import android.graphics.Bitmap;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gerry on 18/02/2017.
 */

public class Giocatore {
    String nome;
    Bitmap img_mini;
    Bitmap img_media_sin;
    Bitmap img_media_des;
    Bitmap img_big;
    Bitmap simboloF;
    Bitmap simboloT;
    List<Integer> posizioni;

    public Giocatore(String nome, Bitmap img_mini, Bitmap img_media_sin, Bitmap img_media_des, Bitmap img_big, Bitmap simboloF, Bitmap simboloT) {
        this.nome = nome;
        this.img_mini = img_mini;
        this.img_media_sin = img_media_sin;
        this.img_media_des = img_media_des;
        this.img_big = img_big;
        this.simboloF = simboloF;
        this.simboloT = simboloT;
        posizioni=new ArrayList<Integer>();
    }
    public boolean verifica() {
        if (posizioni.size()>=3){
            if (posizioni.contains(1)&&posizioni.contains(2)&&posizioni.contains(3)){
                return true;
            };
            if (posizioni.contains(4)&&posizioni.contains(5)&&posizioni.contains(6)){
                return true;
            };
            if (posizioni.contains(7)&&posizioni.contains(8)&&posizioni.contains(9)){
                return true;
            };
            if (posizioni.contains(1)&&posizioni.contains(4)&&posizioni.contains(7)){
                return true;
            };
            if (posizioni.contains(2)&&posizioni.contains(5)&&posizioni.contains(8)){
                return true;
            };
            if (posizioni.contains(3)&&posizioni.contains(6)&&posizioni.contains(9)){
                return true;
            };
            if (posizioni.contains(1)&&posizioni.contains(5)&&posizioni.contains(9)){
                return true;
            };
            if (posizioni.contains(3)&&posizioni.contains(5)&&posizioni.contains(7)){
                return true;
            };

        }

        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bitmap getImg_mini() {
        return img_mini;
    }

    public void setImg_mini(Bitmap img_mini) {
        this.img_mini = img_mini;
    }

    public Bitmap getImg_big() {
        return img_big;
    }

    public void setImg_big(Bitmap img_big) {
        this.img_big = img_big;
    }

    public Bitmap getSimboloF() {
        return simboloF;
    }

    public void setSimboloF(Bitmap simboloF) {
        this.simboloF = simboloF;
    }

    public Bitmap getSimboloT() {
        return simboloT;
    }

    public void setSimboloT(Bitmap simboloT) {
        this.simboloT = simboloT;
    }

    public Bitmap getImg_media_sin() {
        return img_media_sin;
    }

    public void setImg_media_sin(Bitmap img_media_sin) {
        this.img_media_sin = img_media_sin;
    }

    public Bitmap getImg_media_des() {
        return img_media_des;
    }

    public void setImg_media_des(Bitmap getImg_media_des) {
        this.img_media_des = getImg_media_des;
    }

}

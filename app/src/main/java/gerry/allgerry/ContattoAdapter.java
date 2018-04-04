package gerry.allgerry;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gerry on 20/02/2017.
 */

public class ContattoAdapter extends ArrayAdapter<Contatto> {


    public ContattoAdapter(Context context, int resource, List<Contatto> objects) {
        super(context, resource, objects);
        System.out.println("sono in contatto adapter");
    }

    @Override
    public View getView(int position, View v, ViewGroup vg)
    {
        System.out.println("Sono entrato in getvieew");
        Log.d("prima dell'inflater", "getView: ");
            LayoutInflater inflater = (LayoutInflater)  getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inflater.inflate(R.layout.row,null);

        Log.d("sono entrato nelgetview", "getView: ");
        Contatto ai=(Contatto) getItem(position);
        TextView txt=(TextView) v.findViewById(R.id.textView3);
        txt.setText(ai.getNome());
        txt=(TextView) v.findViewById(R.id.textView4);
        txt.setText(ai.getNumero());
        ImageView img=(ImageView) v.findViewById(R.id.imageView);
        img.setImageResource(ai.getImg());
        return v;

    }

}


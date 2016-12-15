package com.example.jairo.certamenrecuperativo_2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jairo on 14-12-2016.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.RegistroViewMolder>{

    List<Registro> lista_registro;

    public Adaptador(List<Registro> lista_registro) {
        this.lista_registro = lista_registro;
    }

    @Override
    public RegistroViewMolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        RegistroViewMolder holder = new  RegistroViewMolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(RegistroViewMolder holder, int position) {

        holder.id_registro.setText(lista_registro.get(position).getID());
        holder.joke_registro.setText(lista_registro.get(position).getJOKE());

    }

    @Override
    public int getItemCount() {
        return lista_registro.size();
    }

    public  static class RegistroViewMolder extends RecyclerView.ViewHolder {

        TextView id_registro;
        TextView joke_registro;

        public RegistroViewMolder(View itemView) {
            super(itemView);

            id_registro = (TextView) itemView.findViewById(R.id.id_text);
            joke_registro = (TextView) itemView.findViewById(R.id.joke_text);
        }
    }


}

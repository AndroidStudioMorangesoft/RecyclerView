package com.example.recyclercarddemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdaptador  extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView cantante,nacionalidad,edad,estado,fecha;
        ImageView fotoCantante;

        public ViewHolder(View itemView) {
            super(itemView);
            cantante = (TextView)itemView.findViewById(R.id.tvCantante);
            nacionalidad = (TextView)itemView.findViewById(R.id.tvNacionalidad);
            fotoCantante =(ImageView)itemView.findViewById(R.id.imgCantante);
            edad =(TextView)itemView.findViewById(R.id.tvedad);
            estado =(TextView)itemView.findViewById(R.id.tvestado);
            fecha =(TextView)itemView.findViewById(R.id.tvfecha);

        }
    }

public List<CantanteModelo> cantanteLista;

    public RecyclerViewAdaptador(List<CantanteModelo> cantanteLista) {
        this.cantanteLista = cantanteLista;
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cantante,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);


        return viewHolder;

    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        holder.cantante.setText(cantanteLista.get(position).getCantante());
        holder.nacionalidad.setText(cantanteLista.get(position).getNacionalidad());
        holder.fotoCantante.setImageResource(cantanteLista.get(position).getImgCantante());
        holder.edad.setText(cantanteLista.get(position).getEdad());
        holder.estado.setText(cantanteLista.get(position).getEstado());
        holder.fecha.setText(cantanteLista.get(position).getFecha());

    }

    @Override
    public int getItemCount() {
        return cantanteLista.size();
    }
}





























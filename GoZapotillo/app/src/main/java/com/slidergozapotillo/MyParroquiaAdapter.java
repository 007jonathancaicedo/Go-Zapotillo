package com.slidergozapotillo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.login.gozapotillo.R;


public class MyParroquiaAdapter extends RecyclerView.Adapter<MyParroquiaAdapter.ViewHolder> {

    MyParroquiasdata[] myParroquiasdata;
    Context context;

    public MyParroquiaAdapter(MyParroquiasdata[] myParroquiasdata,MainActivitySlider activity) {
        this.myParroquiasdata = myParroquiasdata;
        this.context = activity;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.parroquias_lista,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyParroquiasdata myParroquiasListas = myParroquiasdata[position];
        holder.textViewParr.setText(myParroquiasListas.getParrNombre());
        holder.textViewCoord.setText(myParroquiasListas.getCoorDato());
        holder.imaImagenParr.setImageResource(myParroquiasListas.getImaImagenParr());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myParroquiasListas.getParrNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {return myParroquiasdata.length; }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imaImagenParr;
        TextView textViewParr;
        TextView textViewCoord;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imaImagenParr = itemView.findViewById(R.id.imageview);
            textViewParr = itemView.findViewById(R.id.tNomParr);
            textViewCoord = itemView.findViewById(R.id.tCoorPar);

        }
    }
}

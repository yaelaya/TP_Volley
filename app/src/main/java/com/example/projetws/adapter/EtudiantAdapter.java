package com.example.projetws.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import com.bumptech.glide.Glide;
import com.example.projetws.R;
import com.example.projetws.beans.Etudiant;

public class EtudiantAdapter extends ArrayAdapter<Etudiant> {
    private List<Etudiant> etudiantList;
    private Context context;

    public EtudiantAdapter(Context context, List<Etudiant> etudiantList) {
        super(context, 0, etudiantList);
        this.etudiantList = etudiantList;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Etudiant etudiant = etudiantList.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        }

        TextView nom_prenom = convertView.findViewById(R.id.nom_prenom);
        TextView ville = convertView.findViewById(R.id.ville);
        TextView sexe = convertView.findViewById(R.id.sexe);
        ImageView photoImageView = convertView.findViewById(R.id.photo);

        nom_prenom.setText(etudiant.getNom() + " " + etudiant.getPrenom());
        ville.setText("City: " + etudiant.getVille());
        sexe.setText("Gender: " + etudiant.getSexe());


        Glide.with(context)
                .load(etudiant.getPhoto())
                .placeholder(R.mipmap.user)
                .into(photoImageView);

        return convertView;
    }
}

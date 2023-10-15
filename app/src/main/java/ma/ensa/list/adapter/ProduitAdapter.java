package ma.ensa.list.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ma.ensa.list.R;
import ma.ensa.list.beans.Produit;

public  class ProduitAdapter extends BaseAdapter {
    private List<Produit> Produits;
    private LayoutInflater inflater;
    public ProduitAdapter(List<Produit> Produits, Activity activity) {
        this.Produits = Produits;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return Produits.size();
    }

    @Override
    public Object getItem(int position) {
        return Produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item, null);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView duree = convertView.findViewById(R.id.duree);
        ImageView image = convertView.findViewById(R.id.image);
        TextView id = convertView.findViewById(R.id.id);
        nom.setText(Produits.get(position).getNom());
        duree.setText(Produits.get(position).getDuree()+"");
        image.setImageResource(Produits.get(position).getImage());
        id.setText(Produits.get(position).getId()+"");
        return convertView;
    }
}

package ma.ensa.list;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

import ma.ensa.list.beans.Produit;
import ma.ensa.list.service.ProduitService;

public class ProductDetails extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        Bundle extras = getIntent().getExtras();

        String nom = (String) extras.get("nom");
        int image = (int) extras.get("image");
        String detaisIngred = (String) extras.get("detaisIngred");
        String description = (String) extras.get("description");
        String preparation = (String) extras.get("preparation");




        TextView nomdetail = findViewById(R.id.nomdetail);
        ImageView imagedetail = findViewById(R.id.imagedetail);
        TextView detaisIngreddetail = findViewById(R.id.detaisIngreddetail);
        TextView descriptiondetail = findViewById(R.id.decriptiondetail);
        TextView preparationdetail = findViewById(R.id.preparations);

        nomdetail.setText(nom);
        detaisIngreddetail.setText(detaisIngred);
        descriptiondetail.setText(description);
        imagedetail.setImageResource((int)image);
        preparationdetail.setText(preparation);
    }
}
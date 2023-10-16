package ma.ensa.list;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        TextView preparations = findViewById(R.id.preparation);

        nomdetail.setText(nom);
        detaisIngreddetail.setText(detaisIngred);
        descriptiondetail.setText(description);
        imagedetail.setImageResource((int)image);
        preparations.setText(preparation);
    }
    public void shareOnWhatsApp(View view) {
        TextView nomdetail = findViewById(R.id.nomdetail);
        TextView descriptiondetail = findViewById(R.id.decriptiondetail);
        String nom = nomdetail.getText().toString();
        String description = descriptiondetail.getText().toString();

        // Texte que vous souhaitez partager
        String textToShare = "Check out this delicious pizza recipe: " + nom + "\nDescription: " + description;

        // Créez un intent pour partager sur WhatsApp
        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
        whatsappIntent.setType("text/plain");
        whatsappIntent.setPackage("com.whatsapp"); // Nom du package WhatsApp

        // Ajoutez le texte à partager à l'intent
        whatsappIntent.putExtra(Intent.EXTRA_TEXT, textToShare);

        try {
            startActivity(whatsappIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            // Gérer l'erreur si WhatsApp n'est pas installé
            // Vous pouvez utiliser une autre méthode de partage ici
        }
    }
}
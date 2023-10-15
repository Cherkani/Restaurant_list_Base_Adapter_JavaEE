package ma.ensa.list.beans;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;

    private int Image;
    private String duree;
    private String detaisingred;
    private String description;
    private String preparation;
    private static int  comp;

    public Produit(String nom, int nbrIngredients,int Image,String duree,String detaisingred,String description,String preparation){
        this.id = ++comp;
        this.nom=nom;
        this.nbrIngredients=nbrIngredients;
        this.Image=Image;

        this.duree=duree;
        this.detaisingred=detaisingred;
        this.description= description;
        this.preparation=preparation;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public String getDuree() {
        return duree;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDetaisingred() {
        return detaisingred;
    }

    public void setDetaisingred(String detaisingred) {
        this.detaisingred = detaisingred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public static int getComp() {
        return comp;
    }

    public static void setComp(int comp) {
        Produit.comp = comp;
    }
}

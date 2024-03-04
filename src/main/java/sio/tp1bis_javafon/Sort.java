package sio.tp1bis_javafon;

public class Sort {
    private String nom;
    private boolean estPhysique; // Physique, Spéciale
    private String element; // feu, eau, plante, normal
    private boolean estAttaque; // true = attaque, false = soin
    private int puissance; // Pourcentage
    private int precision; // Pourcentage aussi

    public Sort(String nom, boolean estPhysique, String element, boolean estAttaque, int puissance, int precision) {
        this.nom = nom;
        this.estPhysique = estPhysique;
        this.element = element;
        this.estAttaque = estAttaque;
        this.puissance = puissance;
        this.precision = precision;
    }

    public String getNom() {
        return nom;
    }

    public boolean isEstPhysique() {
        return estPhysique;
    }

    public String getElement() {
        return element;
    }

    public boolean isEstAttaque() {
        return estAttaque;
    }

    public int getPuissance() {
        return puissance;
    }

    public int getPrecision() {
        return precision;
    }
}

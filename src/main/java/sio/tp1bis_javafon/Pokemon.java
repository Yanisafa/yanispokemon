package sio.tp1bis_javafon;

public class Pokemon {
    private String nom;
    private int attaque;
    private int defense;
    private int vitesse;
    private int attaqueSpeciale;
    private int defenseSpeciale;
    private int pvMax;
    private int pvActuel;
    private String imgStats;
    private String imgFace;
    private String imgDos;
    private String imgNom;
    private Sort s1;
    private Sort s2;
    private Sort s3;
    private Sort s4;

    public Pokemon(String nom, int attaque, int defense, int vitesse, int attaqueSpeciale, int defenseSpeciale, int pvMax, int pvActuel, String imgStats, String imgFace, String imgDos, String imgNom, Sort s1, Sort s2, Sort s3, Sort s4) {
        this.nom = nom;
        this.attaque = attaque;
        this.defense = defense;
        this.vitesse = vitesse;
        this.attaqueSpeciale = attaqueSpeciale;
        this.defenseSpeciale = defenseSpeciale;
        this.pvMax = pvMax;
        this.pvActuel = pvActuel;
        this.imgStats = imgStats;
        this.imgFace = imgFace;
        this.imgDos = imgDos;
        this.imgNom = imgNom;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public int degatsTotaux (Sort s)
    {
        int facteur;
        if(s.isEstPhysique()){
            facteur =  attaque;

        }
        else{
            facteur = attaqueSpeciale;
        }
        /*  MOYENNE /1
            Cette fonction, qui prend un sort en paramètre un Sort s, va retourner un entier correspondant aux dégâts totaux.
            degatsTotaux = puissance du sort * facteur
            Facteur est une variable qui devra prendre en compte l'attribut "estPhysique" du sort :
                Si le sort est un sort physique (estPhysique == true), alors nous devrons prendre en compte l'attribut attaque
                Si le sort est un sort spécial (estPhysique == false), alors nous devrons prendre en compte l'attribut attaqueSpeciale
            EXEMPLE :
            Mewtwo a 90 d'attaque et 120 d'attaqueSpeciale et on appelle cette fonction avec un sort physique.
            Le calcul des dégâts totaux sera donc : degatTotaux = 90 * puissance du sort.
        */
        return 0;
    }
    public int attaquePokemon(Sort s)
    {
        /*  MOYENNE-MALIN / 1,5
            Cette fonction, qui prend un sort en paramètre un Sort s, devra retourner les dégâts totaux.
            Attention, à la différence de la fonction précédente, dont vous pourrez vous servir, il faudra prendre en
            compte l'attribut "vitesse" du Pokemon ainsi que l'attribut "precision" du sort.
            Exemple :
            Mewtwo a 90 de vitesse et son sort à une précision de 110, il faudra multiplier les deux puis diviser le tout
            par 100, ainsi on a (90*110)/100 = 99
            Mewtwo aura alors 99% de chance de toucher sa cible et donc d'infliger les dégâts totaux.
            Dans le cas contraire, la cible ne prend pas de dégât et la fonction devra retourner 0.
            Vous pouvez vous aider de la fonction alea() qui retourne un nombre aléatoire compris entre 0 et 100.
        */
        if(s.)
        return 0;
    }
    public void degatsSubis (int degat, boolean phy)
    {
        int facteur;
        if(phy == true){
            facteur = this.defense;
            facteur -= degat;
        }
        else{
            facteur = this.defenseSpeciale;
            facteur -= degat;

        }
        if(defense <= 0){
            this.pvActuel -= degat;
        }
        /*  MOYENNE /1
            Cette fonction, qui prend en paramètre un entier degat et un boolean phy.
            Le Pokemon devra perdre des pvActuel par rapport à degatSubi comme suit : degatSubi = degat - facteur.
            Facteur est une variable qui devra prendre en compte la variable phy :
                si phy == true, alors nous devrons prendre en compte l'attribut defense
                sinon si phy == false, alors nous devrons prendre en compte l'attribut defenseSpeciale
            /!\ Vous ne pouvez pas faire subir de degatSubi négatif.
        */
    }
    public void fullPV()
    {
        /*  FACILE /0,5
            Cette fonction affectera à l'attribut pvActuel la valeur de pvMax.
        */
        this.pvActuel = this.pvMax;
    }
    public boolean testMort()
    {
        /* FACILE /0,5
            Cette fonction va tester si le Pokemon est mort (pvActuel <= 0)
            S'il est mort, retourner true, sinon retourner false.
         */
        if(pvActuel<=0){
            return true;
        }
        else{
            return false;
        }

    }
    public void seSoigne()
    {
        /* FACILE /0,5
            Cette fonction devra augmenter les pvActuel de 25.
            Attention, si les pvActuel dépassent les pvMax, il faudra réaffecter à pvActuel la valeur de pvMax.
         */
        this.pvActuel += 25;
        if(pvActuel > pvMax){
            this.pvActuel = this.pvMax;
        }


    }
    public String getImgStats() {
        return imgStats;
    }

    public String getImgFace() {
        return imgFace;
    }

    public String getImgDos() {
        return imgDos;
    }

    public String getImgNom() {
        return imgNom;
    }

    public Sort getS1() {
        return s1;
    }

    public Sort getS2() {
        return s2;
    }

    public Sort getS3() {
        return s3;
    }

    public Sort getS4() {
        return s4;
    }

    public String getNom() {
        return nom;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getAttaqueSpeciale() {
        return attaqueSpeciale;
    }

    public int getDefenseSpeciale() {
        return defenseSpeciale;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getPvActuel() {
        return pvActuel;
    }
    public int alea() { return (int)(Math.random() * 101 ); } // 0 to 100
}

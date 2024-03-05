package sio.tp1bis_javafon;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private AnchorPane apChoix;
    @FXML
    private ImageView imgAllie;
    @FXML
    private AnchorPane apDebut;
    @FXML
    private AnchorPane apCombat;
    @FXML
    private AnchorPane apPokedex;
    @FXML
    private ImageView imgAdversaire;
    @FXML
    private ImageView imgPokedexAllieFace;
    @FXML
    private ImageView imgPokedexAllieNom;
    @FXML
    private ImageView imgPokedexCroix;
    @FXML
    private ImageView imgPokedexAllieStat;

    @FXML
    private Label lblPuissanceSort1;
    @FXML
    private Label lblPuissanceSort2;
    @FXML
    private Label lblPuissanceSort3;
    @FXML
    private Label lblPuissanceSort4;
    @FXML
    private Label lblPrecisionSort4;
    @FXML
    private Label lblPrecisionSort3;
    @FXML
    private Label lblPrecisionSort2;
    @FXML
    private Label lblPrecisionSort1;
    @FXML
    private Label lblNomSort1;
    @FXML
    private Label lblNomSort2;
    @FXML
    private Label lblNomSort3;
    @FXML
    private ImageView imgFondSort2;
    @FXML
    private ImageView imgFondSort3;
    @FXML
    private ImageView imgFondSort1;
    @FXML
    private Label lblNomSort4;
    @FXML
    private ImageView imgFondSort4;
    @FXML
    private ImageView imgTypeSort2;
    @FXML
    private ImageView imgTypeSort1;
    @FXML
    private ImageView imgTypeSort4;
    @FXML
    private ImageView imgTypeSort3;
    @FXML
    private Label lblAdversairePvAct;
    @FXML
    private Label lblAdversaireNom;
    @FXML
    private Label lblAdversairePvMax;
    @FXML
    private Label lblAllieNom;
    @FXML
    private Label lblAlliePvAct;
    @FXML
    private Label lblAlliePvMax;
    private Sort sortSoin = new Sort("Soin", false, "Normal", false, 100, 100);
    private Sort sortCharge = new Sort("Charge", true, "Normal", true, 100, 100);

    private Sort sortPlanteFort = new Sort("Lance Soleil", false, "Plante", true, 150, 70);
    private Sort sortPlanteFaible = new Sort("Fouet-liane", true, "Plante", true, 120, 100);

    private Sort sortEauFort = new Sort("Vibraqua", true, "Eau", true, 150, 70);
    private Sort sortEauFaible = new Sort("Bulle d'eau", false, "Eau", true, 120, 100);

    private Sort sortFeuFort = new Sort("Surchauffe", true, "Feu", true, 150, 70);
    private Sort sortFeuFaible = new Sort("Flammèche", false, "Feu", true, 120, 100);
    Pokemon arcanin = new Pokemon("Arcanin", 110, 80, 95, 100, 80, 90,90,
            "Interface/arcStats.png", "Adversaire/feuAdversaire.gif", null,
            "Interface/arcNom.png", sortSoin, sortCharge, sortFeuFort, sortFeuFaible);

    Pokemon empiflor = new Pokemon("Empiflor", 105, 65, 70, 100, 70, 80,80,
            "Interface/planteStat.png", "Adversaire/planteAdversaire.gif", null,
            "Interface/planteNom.png", sortPlanteFort, sortCharge, sortSoin, sortPlanteFaible);

    Pokemon staros = new Pokemon("Staros", 75, 85, 115, 100, 85, 60,60,
            "Interface/eauStat.png", "Adversaire/eauAdversaire.gif", null,
            "Interface/eauNom.png", sortCharge, sortEauFaible, sortEauFort, sortSoin);

    Pokemon allie;
    Pokemon adversaire;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        changeAP(apDebut);
    }

    @FXML
    public void chooseFeu(Event event) {
        goToChoix(null);
        createPokemon(new Pokemon("Dracaufeu",
                84,
                78,
                100,
                109,
                85,
                78,
                78,
                "Interface/feuStat.png",
                "Allie/Face/feuAllie.gif",
                "Allie/Dos/feuAllieBis.png",//gif",
                "Interface/feuNom.png",
                sortSoin,
                sortFeuFaible,
                sortFeuFort,
                sortCharge));
    }

    @FXML
    public void chooseEau(Event event) {
        goToChoix(null);
        createPokemon(new Pokemon("Tortank",
                83,
                100,
                78,
                85,
                105,
                79,
                79,
                "Interface/eauStat.png",
                "Allie/Face/eauAllie.gif",
                "Allie/Dos/eauAllieBis.png",//gif",
                "Interface/eauNom.png",
                sortCharge,
                sortEauFaible,
                sortEauFort,
                sortSoin));
    }

    @FXML
    public void choosePlante(Event event) {
        goToChoix(null);
        createPokemon(new Pokemon("Florizarre",
                82,
                83,
                80,
                100,
                100,
                80,
                80,
                "Interface/planteStat.png",
                "Allie/Face/planteAllie.gif",
                "Allie/Dos/planteAllieBis.png",//gif",
                "Interface/planteNom.png",
                sortPlanteFort,
                sortCharge,
                sortSoin,
                sortPlanteFaible
                ));
    }

    public void createPokemon(Pokemon p)
    {
        allie = p;
    }

    @FXML
    public void goToCombat(Event event) {
        changeAP(apCombat);
        loadSort(lblNomSort1, lblPuissanceSort1, lblPrecisionSort1, imgTypeSort1, imgFondSort1, allie.getS1());
        loadSort(lblNomSort2, lblPuissanceSort2, lblPrecisionSort2, imgTypeSort2, imgFondSort2, allie.getS2());
        loadSort(lblNomSort3, lblPuissanceSort3, lblPrecisionSort3, imgTypeSort3, imgFondSort3, allie.getS3());
        loadSort(lblNomSort4, lblPuissanceSort4, lblPrecisionSort4, imgTypeSort4, imgFondSort4, allie.getS4());
        changeImageViewImg(imgAllie, allie.getImgDos());
        int alea = alea();
        if(alea < 30)
            adversaire = arcanin;
        else if (alea < 60)
            adversaire = empiflor;
        else
            adversaire = staros;
        adversaire.fullPV();
        changeImageViewImg(imgAdversaire, adversaire.getImgFace());
        lblAdversaireNom.setText(adversaire.getNom());
        lblAllieNom.setText(allie.getNom());
        majVita();
    }
    public void majVita()
    {
        /* FACILE /0,5
        Cette fonction devra mettre à jour les label lblAlliePvAct, lblAlliePvMax, lblAdversairePvAct, lblAdversairePvMax
        vis-à-vis des Pokemon allie et adversaire.
         */
        lblAlliePvAct.setText(String.valueOf(allie.getPvActuel()));
        lblAdversairePvAct.setText(String.valueOf(adversaire.getPvActuel()));
        if(allie.getPvActuel() <= 0) {
            System.out.println("mort");
            clearAll();
            changeAP(apDebut);
        }
    }
    public void loadSort(Label nom, Label puissance, Label precision, ImageView type, ImageView fond, Sort sort)
    {
        writeRapideInt(puissance, sort.getPuissance());
        writeRapideInt(precision, sort.getPrecision());
        nom.setText(sort.getNom());

        if(sort.isEstPhysique())
            changeImageViewImg(type, "Interface/physiqueLogo.png" );
        else
            changeImageViewImg(type, "Interface/specialeLogo.png");
        if(!sort.isEstAttaque())
            changeImageViewImg(type, "Interface/soinLogo.png");

        if(sort.getElement() == "Feu")
            changeImageViewImg(fond, "Interface/feuFond.png");
        else if (sort.getElement() == "Eau")
            changeImageViewImg(fond, "Interface/eauFond.png");
        else if (sort.getElement() == "Plante")
            changeImageViewImg(fond, "Interface/planteFond.png");
        else
            changeImageViewImg(fond, "Interface/normalFond.png");

    }

    @FXML
    public void goToChoix(Event event) {
        /* FACILE /0,5
        Cette fonction devra mettre en avant l'anchorPane apChoix (prendre exemple sur la fonction goToDebut.
         */
        clearAll();
        changeAP(apChoix);
    }

    @FXML
    public void goToPokedex(Event event) {
        changeImageViewImg(imgPokedexAllieFace, allie.getImgFace());
        changeImageViewImg(imgPokedexAllieNom, allie.getImgNom());
        changeImageViewImg(imgPokedexAllieStat, allie.getImgStats());
        changeAP(apPokedex);
    }

    @FXML
    public void goToDebut(Event event)
    {
        changeAP(apDebut);
    }

    @FXML
    public void lanceSort4(Event event) {
        lanceSortGeneral(allie.getS4());

    }

    @FXML
    public void lanceSort3(Event event) {
        lanceSortGeneral(allie.getS3());
    }

    @FXML
    public void lanceSort2(Event event) {
        lanceSortGeneral(allie.getS2());
    }

    @FXML
    public void lanceSort1(Event event) {
        lanceSortGeneral(allie.getS1());
    }
    public void lanceSortGeneral(Sort s)
    {
        lanceSort(allie, s, adversaire);
        mortAdversaire(adversaire.testMort());
        lanceSort(adversaire, sortAdversaireAleatoire(), allie);
        mortAllie(allie.testMort());
    }
    public void lanceSort(Pokemon pokemonLancant, Sort s, Pokemon pokemonRecevant)
    {
        /* Moyenne /1,5
        Cette fonction, qui prend deux Pokemons en paramètre (un pokemonLancant et un pokemonRecevant) ainsi qu'un sort s
        devra faire subir une attaquePokemon du pokemonLancant au pokemonRecevant. (utilisation de attaquePokemon(Sort s
        et de degatsSubis(Pokemon p, Sort s)).
        Si le Sort s est un soin (isEstAttaque == false), le pokemonLancant sera soigné en utilisant la fonction seSoigne()
        Enfin, la fonction devra mettre à jour l'affichage des points de vie (indice, vous pouvez utiliser majVita())
         */

    }
    public Sort sortAdversaireAleatoire()
    {
        /* MOYENNE /1
            Cette fonction devra retourner un sort aléatoire de l'objet adversaire.
            Chacun des sorts a 25% de chance d'être lancé.
         */
        return null;

    }
    public void mortAllie(boolean b)
    {
        if(b == true){
            System.out.println("Votre " allie.getNom()" succombé à ses blessures face à "adversaire.getNom());
            goToDebut();
        /* FACILE /0,5
        Cette fonction, prenant un boolean b en paramètre, devra afficher une alert avec un message indiquant le nom du Pokemon allie et le
        nom du Pokemon adversaire si le b est true.
        Par ailleurs, il faudra ensuite appeler la fonction goToDebut() si b est true.
        EXEMPLE DE PRESENTATION : " Votre Tortank a succombé à ses blessures face à Arcanin"
        */
    }
    public void mortAdversaire(boolean b)
    {
        if(b == true){
            System.out.println(adversaire.getNom() " a succombé à ses blessures face à votre "allie.getNom());
            goToDebut();
        }
        /* FACILE /0,5
        Cette fonction, prenant un boolean b en paramètre, devra afficher une alert avec un message indiquant le nom du Pokemon allie et le
        nom du Pokemon adversaire si le b est true.
        Par ailleurs, il faudra ensuite appeler la fonction goToDebut() si b est true.
        EXEMPLE DE PRESENTATION : " Arcanin a succombé à ses blessures face à votre Tortank."
         */
    }

    // -------------------------------------------------------------------------------------------------------------- //
    // -------------------------------------------------------------------------------------------------------------- //
    // ------------------------- Ci-gisent mes fonctions que vous pourrez utiliser à votre guise -------------------- //
    // -------------------------------------------------------------------------------------------------------------- //
    // -------------------------------------------------------------------------------------------------------------- //

    // Genere un nombre aleatoire entre 0 et 100. ------------------------------------------------------------------- //
    public int alea() { return (int)(Math.random() * 101 ); } // 0 to 100

    // Prend un entier qui ira remplir le label. -------------------------------------------------------------------- //
    public void writeRapideInt(Label lblTexte, int intTexte)
    {
        lblTexte.setText(Integer.toString(intTexte));
        return;
    }

    // Prend une image qui ira remplacer l'image view --------------------------------------------------------------- //
    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(
                new Image(
                        getClass().getResource(
                                "/images/"+linkImage
                        ).toExternalForm()
                )
        );
    }

    // Rend visible/invisible une AnchorPane ------------------------------------------------------------------------ //
    public void invisible(AnchorPane apCourante){apCourante.setVisible(false);return;}
    public void visible(AnchorPane apCourante){apCourante.setVisible(true);return;}

    // Cache toutes les AnchorPanes --------------------------------------------------------------------------------- //
    public void clearAll()
    {
        invisible(apChoix);
        invisible(apCombat);
        invisible(apDebut);
        invisible(apPokedex);
    }

    // Donne un entier compris entre a et b ------------------------------------------------------------------------- //
    public int intervalleInt(int a, int b)
    {
        Random random = new Random();
        return random.nextInt((b - a) + 1) + a;
    }

    // Change d'AnchorPane ------------------------------------------------------------------------------------------ //
    public void changeAP (AnchorPane choice){
        clearAll();
        visible(choice);
    }


    // -------------------------------------------------------------------------------------------------------------- //
    // -------------------------------------------------------------------------------------------------------------- //

}
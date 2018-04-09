/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_openclassroom_semaine2;

/**
 * Classe permettant d'instancier des Moteur de type MoteurDiesel, heritant de Moteur
 * @author romua
 */
public class MoteurDiesel extends Moteur {
    /**
     * Constructeur de MoteurDiesel, envoie les information au constructeur parent Moteur
     * @param cylindre Texte sur la cylindre
     * @param prix Prix du moteur
     */
    public MoteurDiesel(String cylindre, Double prix){
        super(TypeMoteur.DIESEL,cylindre, prix);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_openclassroom_semaine2;

/**
 * Classe permettant d'instancier des Moteur de type MoteurEssence, heritant de Moteur
 * @author romua
 */
public class MoteurEssence extends Moteur {
    /**
     * Constructeur de MoteurEssence, envoie les information au constructeur parent Moteur
     * @param cylindre Texte sur la cylindre
     * @param prix Prix du moteur
     */
    public MoteurEssence(String cylindre, Double prix){
        super(TypeMoteur.ESSENCE,cylindre, prix);
    }
}
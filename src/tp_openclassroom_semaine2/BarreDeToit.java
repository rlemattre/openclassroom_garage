/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_openclassroom_semaine2;

import java.io.Serializable;

/**
 * Classe permettant d'instancier des Option de type BarreDeToit, implementant Option
 * @author pierre
 */
public class BarreDeToit implements Option, Serializable {
    /**
     * Permet de retourner le prix de l'option barre de toit
     * @return prix de l'option barre de toit
     */
    @Override
    public Double getPrix(){
        return 150.00;
    }

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option (barre de toit) et de son prix
     */
    @Override
    public String toString(){
        return "Barre de toit (" + getPrix() + "€)";
    }
}
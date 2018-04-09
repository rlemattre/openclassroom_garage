/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_openclassroom_semaine2;

import java.io.Serializable;

/**
 * Classe permettant d'instancier des Option de type Climatisation, implementant Option
 * @author romua
 */
public class Climatisation implements Option, Serializable {
    /**
     * Permet de retourner le prix de l'option climatisation
     * @return prix de l'option climatisation
     */
    @Override
    public Double getPrix(){
        return 250.00;
    }

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option (climatisation) et de son prix
     */
    @Override
    public String toString(){
        return "Climatisation (" + getPrix() + "€)";
    }
}
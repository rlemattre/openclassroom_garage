/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_openclassroom_semaine2;

import java.io.Serializable;

/**
 * Classe permettant d'instancier des Option de type SiegeChauffant, implementant Option
 * @author romua
 */
public class SiegeChauffant implements Option, Serializable {
    /**
     * Permet de retourner le prix de l'option Siege Chauffant
     * @return prix de l'option Siege Chauffant
     */
    @Override
    public Double getPrix(){
        return 200.00;
    }

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option (Siege chauffant) et de son prix
     */
    @Override
    public String toString(){
        return "Siège chauffant (" + getPrix() + "€)";
    }
}
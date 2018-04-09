package tp_openclassroom_semaine2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Interface Option, supertype pour les options de Vehicule
 * @author romua
 */
public interface Option {
    /**
     * Permet de retourner le prix de l'option
     * @return prix de l'option
     */
    Double getPrix();

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option et de son prix
     */
    @Override
    String toString();
}
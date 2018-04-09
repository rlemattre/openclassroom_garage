/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_openclassroom_semaine2;

/**
 * Classe herite de Vehicule qui permet d'instancier des vehicules A330B
 * @author romua
 */
public class A300B extends Vehicule{
    /**
     * Constructeur declarant le nom de modele du vehicule ainsi que la marque venant d'une enumeration en envoyant ces information au constructeur parent "Vehicule"
     */
    public A300B(){
        super("A300B",Marque.PIGEOT);
    }
}
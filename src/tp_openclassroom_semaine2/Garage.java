/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_openclassroom_semaine2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * classe déclarant un garage contenant des Vehicule
 * @author romua
 */
public class Garage implements Serializable{
    /**
     * Liste des objet Vehicule dans le garage
     */
    private List<Vehicule> voitures = new ArrayList<>();

    /**
     * Constructeur
     */
    public Garage(){
        try(
                FileInputStream fis = new FileInputStream("garage.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            voitures = (List<Vehicule>)ois.readObject();
        }catch(IOException e){
            System.out.println("Aucune voiture sauvegardée !");
        }catch(NullPointerException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    /**
     * Permet d'ajouter un Vehicule a la liste des voitures et d'enregistré la liste de voiture dans le fichier
     * @param voit un objet Vehicule
     */
    public void addVoiture(Vehicule voit){
        voitures.add(voit);
        try(
                FileOutputStream fos = new FileOutputStream("garage.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos)
        ){
            oos.writeObject(voitures);
            oos.close();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * String permettant d'affiché le contenu du garage
     * @return texte affichant toute la liste des vehicules contenu dans le garage
     */
    @Override
    public String toString(){
        String  listeVoiture =  "*************************\n" +
                                "* Garage OpenClassRooms *\n" +
                                "*************************\n";
        ListIterator iteratorVoitures = voitures.listIterator();
        while (iteratorVoitures.hasNext()){
            listeVoiture += iteratorVoitures.next();
        }
        return listeVoiture;
    }
}
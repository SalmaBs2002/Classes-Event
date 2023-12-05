/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pers;
import Finance.Revenus;

/**
 *
 * @author LENOVO
 */
public class Sponsors extends Personne {

    private String typeSponsoring;
     private String nom_entreprise;
    private int montantSponsoring;

    public Sponsors(int id, String nom, String prenom, int tel, String adresse,String nom_entreprise, String typeSponsoring, int montantSponsoring) {
        super(id, nom, prenom, tel, adresse);
        this.typeSponsoring = typeSponsoring;
        this.montantSponsoring = montantSponsoring;
        this.nom_entreprise = nom_entreprise;
    }
 public String getnom_entreprise() {
        return nom_entreprise;
    }

    public void setnom_Entreprise(String nom_entreprise) {
        this.nom_entreprise = nom_entreprise;
    }
    public String getTypeSponsoring() {
        return typeSponsoring;
    }

    public void setTypeSponsoring(String typeSponsoring) {
        this.typeSponsoring = typeSponsoring;
    }

    public int getmontantSponsoring() {
        return montantSponsoring;
    }

    public void setmontantSponsoring(int valeur) {
        this.montantSponsoring = valeur;
    }
}

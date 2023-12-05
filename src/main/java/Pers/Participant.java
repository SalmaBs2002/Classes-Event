/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Participant extends Personne {

    private String email;
    private String typeEtablissement; 
    private boolean aPayeFrais;
    private List<String> formationsEtAteliers; 

    public Participant(int id, String nom, String prenom, int tel, String adresse, String email, String typeEtablissement) {
        super(id, nom, prenom, tel, adresse);
        this.email = email;
        this.typeEtablissement = typeEtablissement;
        this.aPayeFrais = false;
        this.formationsEtAteliers = new ArrayList<>(); 
       
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String gettypeEtablissement() {
        return typeEtablissement;
    }

    public void settypeEtablissement(String typeEtablissement) {
        this.typeEtablissement = typeEtablissement;
    }
     public boolean aPayeFrais() {
        return aPayeFrais;
    }

    public void PayerFrais() {
        aPayeFrais = true;
    }

    public void afficherStatutPaiement() {
        if (aPayeFrais) {
            System.out.println("Le participant a payé la cotisation.");
        } else {
            System.out.println("Le participant n'a pas encore payé la cotisation.");
        }
    }
    public List<String> getFormationsEtAteliers() {
        return formationsEtAteliers;
    }

    public void ajouterFormationOuAtelier(String formationOuAtelier) {
        formationsEtAteliers.add(formationOuAtelier);
    }

}
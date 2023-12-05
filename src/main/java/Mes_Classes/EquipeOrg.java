/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mes_Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class EquipeOrg {

    private String nomEquipe;
    private String domaine;
    private int nombreMembres;
    private String responsable;
    private List<String> membres;
  

    public EquipeOrg(String nomEquipe, String domaine, int nombreMembres, String responsable) {
        this.nomEquipe = nomEquipe;
        this.domaine = domaine;
        this.nombreMembres = nombreMembres;
        this.responsable = responsable;
        this.membres = new ArrayList<>();
     
    }

   
    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    
    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }


    public int getNombreMembres() {
        return nombreMembres;
    }

    public void setNombreMembres(int nombreMembres) {
        this.nombreMembres = nombreMembres;
    }

 
    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    public void ajouterMembre(String membre) {
        membres.add(membre);
    }

    public void modifierMembre(String ancienMembre, String nouveauMembre) {
        int index = membres.indexOf(ancienMembre);
        if (index != -1) {
            membres.set(index, nouveauMembre);
        }
    }

    public void supprimerMembre(String membre) {
        membres.remove(membre);
    }

    public List<String> getMembres() {
        return membres;
    }

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}

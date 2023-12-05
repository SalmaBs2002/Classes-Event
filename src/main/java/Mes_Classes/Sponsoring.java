/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mes_Classes;

import Pers.Sponsors;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Sponsoring extends EquipeOrg {

    private String typeSponsoring;
    private int Budget;
    private List<Sponsors> listeSponsors;

    public Sponsoring(String nomEquipe, String domaine, int nombreMembres, String responsable, String typeSponsoring, int Budget) {
        super(nomEquipe, domaine, nombreMembres, responsable);
        this.typeSponsoring = typeSponsoring;
        this.Budget = Budget;
        this.listeSponsors = new ArrayList<>();
    }

    public String getTypeSponsoring() {
        return typeSponsoring;
    }

    public void setTypeSponsoring(String typeSponsoring) {
        this.typeSponsoring = typeSponsoring;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int Budget) {
        this.Budget = Budget;
    }
    
     public List<Sponsors> getListeSponsors() {
        return listeSponsors;
    }

    public void ajouterSponsor(Sponsors sponsor) {
        listeSponsors.add(sponsor);
    }

    public void modifierSponsor(int id, Sponsors nouveauSponsor) {
        for (int i = 0; i < listeSponsors.size(); i++) {
            if (listeSponsors.get(i).getId() == id) {
                listeSponsors.set(i, nouveauSponsor);
                break;
            }
        }
    }

    public void supprimerSponsor(int id) {
        for (int i = 0; i < listeSponsors.size(); i++) {
            if (listeSponsors.get(i).getId() == id) {
                listeSponsors.remove(i);
                break;
            }
        }
    }
    public String getRole() {
    return "Membre du Sponsoring";
}
}

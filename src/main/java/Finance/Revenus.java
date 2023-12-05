/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finance;

import Pers.Sponsors;

/**
 *
 * @author LENOVO
 */
public class Revenus{
    private String description;
    private double montantrevenus;

    public Revenus(String description, double montantrevenus) {
        this.description = description;
        this.montantrevenus = montantrevenus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMontantrevenus() {
        return montantrevenus;
    }

    public void setMontantevenus(double montantrevenus) {
        this.montantrevenus = montantrevenus;
    }
  
    /**
     *
     * @param montantSponsors
     */
    public void ajouterMontantSponsors(double montantSponsors) {
        montantrevenus += montantSponsors;
    }
}

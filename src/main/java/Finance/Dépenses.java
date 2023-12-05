/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finance;

/**
 *
 * @author LENOVO
 */
public class Dépenses {
     private String description;
    private double montant;
    private double tauxTVA;

    public Dépenses(String description, double montant, double tauxTVA) {
        this.description = description;
        this.montant = montant;
        this.tauxTVA = tauxTVA;
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
     public double getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(double tauxTVA) {
        this.tauxTVA = tauxTVA;
    } 
     public double calculerTVA() {
        return montant * tauxTVA;
    }
     

    void remove(Dépenses depense) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

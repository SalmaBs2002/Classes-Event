/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finance;
import Mes_Classes.Evenement;
import Pers.Sponsors;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
class Caisse {
    List<Dépenses> depenses;
    List<Revenus> revenus;
    private int sommeTotale;

    public Caisse() {
        depenses = new ArrayList<>();
        revenus = new ArrayList<>();
        sommeTotale = 0;
    }
     public List<Dépenses> getDepense() {
        return depenses;
    }
   
    public void ajouterDepense(Dépenses depense) {
        depenses.add(depense);
    }
     public void supprimerDepense(Dépenses depense) {
        depense.remove(depense);
    }

        public List<Revenus> getRevenus() {
        return revenus;
    }
   
    public void ajouterRevenu(Revenus revenu) {
        revenus.add(revenu);
    }
    

    public void supprimerRevenu(Revenus revenu) {
        revenus.remove(revenu);
    }

  public void calculerSommeTotale(Evenement evenement) {
        sommeTotale = 0;
         for (Revenus revenu : revenus) {
            sommeTotale += revenu.getMontantrevenus();
        }
          sommeTotale += evenement.getSommeCotisationsPayees();
    }
  public double getSommeTotale() {
        return sommeTotale;
    }
  public String verifierRentabiliteEvenement() {
        double totalDepenses = 0.0;

        for (Dépenses depense : depenses) {
            totalDepenses += depense.getMontant();
        }

        if (totalDepenses < sommeTotale) {
            return "The event is profitable. Profit made.";
        } else if (totalDepenses > sommeTotale) {
            return "The event caused a financial loss.";
        } else {
            return "The event is balanced, expenses are equal to income.";
        }
    }
}

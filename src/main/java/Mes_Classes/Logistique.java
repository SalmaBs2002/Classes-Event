/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mes_Classes;

/**
 *
 * @author LENOVO
 */
public class Logistique extends EquipeOrg {

    private String domaineLogistique;
    private int nombreMateriels;

    public Logistique(String nomEquipe, String domaine, int nombreMembres, String responsable, String domaineLogistique, int nombreMateriels) {
        super(nomEquipe, domaine, nombreMembres, responsable);
        this.domaineLogistique = domaineLogistique;
        this.nombreMateriels = nombreMateriels;
    }

    public String getDomaineLogistique() {
        return domaineLogistique;
    }

    public void setDomaineLogistique(String domaineLogistique) {
        this.domaineLogistique = domaineLogistique;
    }

    public int getNombreMateriels() {
        return nombreMateriels;
    }

    public void setNombreMateriels(int nombreMateriels) {
        this.nombreMateriels = nombreMateriels;
    }
public String getRole() {
    return "Membre de la Logistique";
}
}

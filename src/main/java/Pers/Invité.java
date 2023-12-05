/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pers;

/**
 *
 * @author LENOVO
 */
public class Invité extends Personne {

    private String spécialisation;
    private String typeInvité;
    private boolean aConfirmePresence;

    public Invité(int id, String nom, String prenom, int tel, String adresse,String spécialisation, String typeInvité, boolean aConfirmePresence) {
        super(id, nom, prenom, tel, adresse);
        this.spécialisation = spécialisation;
        this.typeInvité = typeInvité;
        this.aConfirmePresence = aConfirmePresence;
    }
    public String getSpécialisation() {
        return spécialisation;
    }

    public void setSpécialisation(String spécialisation) {
        this.spécialisation = spécialisation;
    }

    public String gettypeInvité() {
        return typeInvité;
    }

    public void settypeInvité(String typeInvité) {
        this.typeInvité= typeInvité;
    }

    public boolean isaConfirmePresence() {
        return aConfirmePresence;
    }

    public void setaConfirmePresence(boolean aConfirmePresence) {
        this.aConfirmePresence = aConfirmePresence;
    }
}

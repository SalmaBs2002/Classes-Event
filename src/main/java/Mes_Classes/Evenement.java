/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mes_Classes;


/**
 *
 * @author LENOVO
 */
import Pers.Participant;
import Pers.Invité;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evenement {
    private int idEven;
    private String nomEven;
    private Date date;
    private String lieu;
    private int cotisation;
    private int capaciteMaximale;
    private List<Participant> participants;
    private List<Invité> invites;
    private List<EquipeOrg> organisateurs;
    private int sommeCotisationsPayees; 

    public Evenement(int idEven, String nomEven, Date date, String lieu, int cotisation, int capaciteMaximale) {
        this.idEven = idEven;
        this.nomEven = nomEven;
        this.date = date;
        this.lieu = lieu;
        this.cotisation = cotisation;
        this.capaciteMaximale = capaciteMaximale;
        this.participants = new ArrayList<>();
        this.invites = new ArrayList<>();
        this.organisateurs = new ArrayList<>();
    }

    public int getIdEven() {
        return idEven;
    }

    public void setIdEven(int idEven) {
        this.idEven = idEven;
    }

    public String getNomEven() {
        return nomEven;
    }

    public void setNomEven(String nomEven) {
        this.nomEven = nomEven;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getCotisation() {
        return cotisation;
    }

    public void setCotisation(int cotisation) {
        this.cotisation = cotisation;
    }

    public int getCapaciteMaximale() {
        return capaciteMaximale;
    }

    public void setCapaciteMaximale(int capaciteMaximale) {
        this.capaciteMaximale = capaciteMaximale;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public List<Invité> getInvites() {
        return invites;
    }

    public void setInvites(List<Invité> invites) {
        this.invites = invites;
    }

    public List<EquipeOrg> getOrganisateurs() {
        return organisateurs;
    }

    public void setOrganisateurs(List<EquipeOrg> organisateurs) {
        this.organisateurs = organisateurs;
    }

    public void ajouterEq(EquipeOrg equipe) {
        organisateurs.add(equipe);
    }

    public void supprimerEq(int idEq) {
        organisateurs.removeIf(equipe -> equipe.getId() == idEq);
    }

    public boolean estComplet() {
        return participants.size() >= capaciteMaximale;
    }

    public int nombreParticipants() {
        return participants.size();
    }
  public void calculerSommeCotisationsPayees() {
        sommeCotisationsPayees = 0; // Réinitialise la somme des cotisations
        for (Participant participant : participants) {
            if (participant.aPayeFrais()) {
                sommeCotisationsPayees += cotisation;
            }
        }
    }
  public int getSommeCotisationsPayees() {
        return sommeCotisationsPayees;
    }
    public void afficherInformationsEvenement() {
        System.out.println("Informations de l'événement :");
        System.out.println("Nom de l'événement : " + nomEven);
        System.out.println("Date : " + date);
        System.out.println("Lieu : " + lieu);
        System.out.println("Cotisation : " + cotisation);
        System.out.println("Nombre de participants: " + nombreParticipants());
        System.out.println("La somme des Cotisations Payées : " + sommeCotisationsPayees);
    }
} 



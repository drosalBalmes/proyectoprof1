package com.example.proyectovisual.objects;

public class HorizontalRvs {
    String nom;
    int child;

    public HorizontalRvs(String nom) {
        this.nom = nom;
    }

    public HorizontalRvs(String nom, int child) {
        this.nom = nom;
        this.child = child;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

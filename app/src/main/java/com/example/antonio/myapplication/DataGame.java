package com.example.antonio.myapplication;

/**
 * Created by antonio on 13/6/18.
 */

public class DataGame {

    String nombrep1, nombrep2;
    int sexp1, sexp2; //1 hombre 2 mujer
    int puntos1, puntos2;
    int nivel1, nivel2;


    public DataGame(String nombrep1, String nombrep2, int sexp1, int sexp2 ) {
        this.nombrep1 = nombrep1;
        this.nombrep2 = nombrep2;
        this.sexp1 = sexp1;
        this.sexp2 = sexp2;
        this.puntos1 = 0;
        this.puntos2 = 0;
        this.nivel1 = 0;
        this.nivel2 = 0;
    }

    public int getPuntos1() {
        return puntos1;
    }

    public void setPuntos1(int puntos1) {
        this.puntos1 = puntos1;
    }

    public int getPuntos2() {
        return puntos2;
    }

    public void setPuntos2(int puntos2) {
        this.puntos2 = puntos2;
    }

    public int getNivel1() {
        return nivel1;
    }

    public void setNivel1(int nivel1) {
        this.nivel1 = nivel1;
    }

    public int getNivel2() {
        return nivel2;
    }

    public void setNivel2(int nivel2) {
        this.nivel2 = nivel2;
    }


    public String getNombrep1() {
        return nombrep1;
    }

    public void setNombrep1(String nombrep1) {
        this.nombrep1 = nombrep1;
    }


    public String getNombrep2() {
        return nombrep2;
    }

    public void setNombrep2(String nombrep2) {
        this.nombrep2 = nombrep2;
    }

    public int getSexp1() {
        return sexp1;
    }

    public void setSexp1(int sexp1) {
        this.sexp1 = sexp1;
    }

    public int getSexp2() {
        return sexp2;
    }

    public void setSexp2(int sexp2) {
        this.sexp2 = sexp2;
    }
}

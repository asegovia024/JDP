package com.example.antonio.myapplication;

/**
 * Created by antonio on 13/6/18.
 */

public class DataGame {

    String nombrep1, nombrep2;
    int sexp1, sexp2; //1 hombre 2 mujer


    DataGame(String n1, String n2, int s1, int s2){
        nombrep1=n1;
        nombrep2=n2;
        sexp1=s1;
        sexp2=s2;
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

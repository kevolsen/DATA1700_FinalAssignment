package com.example.demoo;

public class Billett {
    private int id;
    private String navn;
    private int antall;
    private String fornavn;
    private String etternavn;
    private String tlfnr;
    private String email;

    public Billett() {
    }



    public Billett(int id, String navn, int antall, String fornavn, String etternavn, String tlfnr, String email) {
        this.id = id;
        this.navn = navn;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn=etternavn;
        this.tlfnr=tlfnr;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package fr.nexa.tp.paiment.with.design.pattern.strategy;

import java.util.Date;

public class CarteCredit {

    private Integer id;
    private String propritaire;
    private String numeroCarte;
    private String cryptogramme;
    private Date dateExpiration;

    public CarteCredit(String propritaire, String numeroCarte, String cryptogramme, Date dateExpiration) {
        this.propritaire = propritaire;
        this.numeroCarte = numeroCarte;
        this.cryptogramme = cryptogramme;
        this.dateExpiration = dateExpiration;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getCryptogramme() {
        return cryptogramme;
    }

    public void setCryptogramme(String cryptogramme) {
        this.cryptogramme = cryptogramme;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getPropritaire() {
        return propritaire;
    }

    public void setPropritaire(String propritaire) {
        this.propritaire = propritaire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

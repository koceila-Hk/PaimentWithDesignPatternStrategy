package fr.nexa.tp.paiment.with.design.pattern.strategy;

import java.util.Date;

public final class CarteDeCreditStrategy implements IPaimentStrategy{

    private CarteCredit carteCredit;

    public CarteDeCreditStrategy(CarteCredit carteCredit) {
        this.carteCredit = carteCredit;
    }

    @Override
    public void payer(float montant) {
        System.out.println(montant + " $ payé par carte bancaire");
        System.out.println("Numéro de carte :" + carteCredit.getNumeroCarte());
    }
}

package fr.nexa.tp.paiment.with.design.pattern.strategy;

public final class PaypalStrategy implements IPaimentStrategy {

    private String identifiant;
    private String password;

    public PaypalStrategy(String identifiant, String password) {
        this.identifiant = identifiant;
        this.password = password;
    }

    @Override
    public void payer(float montant) {
        System.out.println(montant + " $ payé par Paypal");
    }
}

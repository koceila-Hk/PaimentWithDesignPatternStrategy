import fr.nexa.tp.paiment.with.design.pattern.strategy.*;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PanierService panier = new PanierService();

        Article livre = new Article("lala", 25.50f);
        panier.getArticles().put(livre, 4);

        Article livre2 = new Article("OCP", 45.80f);
        panier.getArticles().put(livre2, 2);

        // paiment par carte crédit
        CarteCredit carteCredit = new CarteCredit("AB", "123456543", "323", new Date());
        panier.payer(new CarteDeCreditStrategy(carteCredit));

        // Paiment par Paypal
        panier.payer(new PaypalStrategy("kouss", "xxxxxxx"));
    }
}
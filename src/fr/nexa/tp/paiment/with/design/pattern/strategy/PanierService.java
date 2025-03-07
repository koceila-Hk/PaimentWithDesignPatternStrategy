package fr.nexa.tp.paiment.with.design.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public final class PanierService {

    private Map<Article, Integer> articles = new HashMap<>();

    public Map<Article, Integer> getArticles() {
        return articles;
    }

    public void payer(IPaimentStrategy type) {
//        float montant = 0;
//        for (Map.Entry<Article, Integer> entry : articles.entrySet()) {
//            Article article = entry.getKey();
//            Integer quantitie = entry.getValue();
//            montant += article.getPrix() * quantitie;
//        }
//        type.payer(montant);
//    }
        float montant = (float) articles.entrySet().stream().mapToDouble(
                entry -> (entry.getKey().getPrix() * entry.getValue())).sum();
        type.payer(montant);
    }
}

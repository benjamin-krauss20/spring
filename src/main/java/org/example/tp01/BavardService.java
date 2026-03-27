package org.example.tp01;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service // Dit à Spring de créer et gérer cet objet (le Bean) [cite: 101]
public class BavardService {

    private String nom = "Benjamin"; // Champ privé avec valeur par défaut

    // Méthode modifiée pour retourner un String (Etape 4 du TP)
    public String parler() {
        // Retourne le nom et le nom de la classe
        return "Nom : " + nom + " | Classe : " + this.getClass().getSimpleName();
    }

    // Getter pour le champ nom
    public String getNom() {
        return nom;
    }

    // Setter pour le champ nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    @PostConstruct // S'exécute automatiquement après la création du bean
    private void postConstruct() {
        // Message de démonstration dans la console au démarrage
        System.out.println(">>> Le bean BavardService vient d'être créé par Spring !");
    }
}
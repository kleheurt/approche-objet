# Enoncé du TP :
Créer une application console qui permette d’exploiter les données du fichier
« recensement.csv » pour afficher le menu suivant :
- 1. Population d’une ville donnée
- 2. Population d’un département donné
- 3. Population d’une région donnée
- 4. Afficher les 10 régions les plus peuplées
- 5. Afficher les 10 départements les plus peuplés
- 6. Afficher les 10 villes les plus peuplées d’un département
- 7. Afficher les 10 villes les plus peuplées d’une région
- 8. Afficher les 10 villes les plus peuplées de France
- 9. Sortir

# Contenu du package recensement :
Une interface TraitementRecensement correspondant aux fonctionnalités à implémenter pour répondre au TP.

Deux package modeleObjet et modeleTreeSet implémentant chacune de manière différente TraitementRecensement.

Une classe exécutable AppliRecensement.

Une classe exécutable ComparaisonModeles.

## Le modèle "Objet"
Ce modèle implémente une hiérarchie de collectivités locales (Pays, Région, Département et Ville). Chacune contient un ArrayList de collectivités filles, excepté les villes.

## Le modèle "TreeSet"
Ce modèle rassemble toutes les collections dans une classe TraitementVille. Celle-ci contient trois TreeSet de Villes, Régions et Départements.

# Comparaison des modèles
ComparaisonModeles.java mesure pour chaque modèle le temps d'exécution d'une sélection d'opérations. On constate un avantage au modèle "Objet" pour toutes les opérations testées, y compris l'affichage des 10 plus grandes villes du pays.

# A faire
- Commenter.
- Faire relire/évaluer/corriger le code.
- Approfondir la comparaison des modèles pour comprendre la différence de performance.
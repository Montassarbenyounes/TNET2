#Author: Montassar

Feature: Tunisianet recherche produit

  Scenario: Effectue recherche produit
    Given acceder a la page daceeuil
    When ecrire sur la bare de recherche "film de protection nano glass 9h pour samsung a12" et cliquer sur rechercher
    Then verifier le resultat de recherche "film de protection nano glass 9h pour samsung a12"

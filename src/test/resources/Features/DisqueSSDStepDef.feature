#Author: Montassar
Feature: Disque SSD TunisiaNET
Scenario: Commander un produit et vérifier la commande
Given utilisateur est sur la page de disque SSD
When utilisateur clique sur le produit "Disque Dur Interne HIKSEMI E1000 / 256 GO SSD M.2 NVMe"
Then utilisateur vérifie la commande "Disque Dur Interne HIKSEMI E1000"
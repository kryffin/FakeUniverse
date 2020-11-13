# FakeUniverse

TP3 pour l'UE Spring présentée par Madame Brigitte Wrobel-Dautcourt  
Master 2 Ingénierie Logicielle 2020-2021

## But du projet

Apprendre à utiliser Spring Boot.
- Ajouter des trucs
- Modifier des trucs
- Afficher des trucs
- Supprimer des trucs

Le tout statiquement dans le projet (une fausse base de données).  
Projet codé en anglais parce que la question ne se pose même pas.

## Paramètres Spring initializr

- Maven Project
- Java language
- Spring Boot v2.4.0
- Jar Packaging
- Java11
- Spring Web (dependency)
- Port du serveur : 8080

## Habillage du projet

Les "trucs" seront des planètes, d'où le nom FakeUniverse.  
Une planète contient son nom, son rayon, sa distance du Soleil et sa gravité.  
La liste statique des planètes est une HashMap<String, Planet> identifiant les planètes par leurs noms, car chaque planète possède un nom unique.

## Progrès

### 13/11/2020

Suivi du cours pour la mise en place du projet sans grands soucis.  

Premiers tests via Postman :
- Ajout d'une planète : ok
- Affichage d'une planète récupérée par son nom : ok
- Affichage de toute les planètes : ok  

Travail restant :
- Ajouter la suppression d'une planète
- Mettre en place des tests ?

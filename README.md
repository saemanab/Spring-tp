# 🛍️ Application Web JEE - Gestion des Produits

## 🎯 Objectif

Développer une application Web complète en utilisant l'écosystème Spring pour gérer une liste de produits. Ce projet met en œuvre les technologies modernes de Java EE, telles que **Spring Boot**, **Spring Data JPA**, **Hibernate**, **Thymeleaf** et **Spring Security**.

👉 Tutoriel suivi : [YouTube - Spring Boot Spring Security Thymeleaf CRUD](https://www.youtube.com/watch?v=FHy7raIldgg)

---

## 🧰 Technologies utilisées

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Spring Security
- Spring Validation
- Thymeleaf
- Thymeleaf Layout Dialect
- Lombok
- H2 Database (dev)
- MySQL (prod/test)
- Bootstrap 5

---

## 📦 Fonctionnalités développées

### Étapes principales du projet :

1. Création d'un projet Spring Boot avec les dépendances :
   - Spring Web
   - Spring Data JPA
   - Spring Security
   - Thymeleaf
   - Lombok
   - H2 + MySQL
   - Spring Validation

2. Création de l'entité `Product` avec JPA

3. Création de l'interface `ProductRepository` basée sur Spring Data

4. Tests de la couche DAO

5. Désactivation temporaire de la sécurité Spring Security pour le développement

6. Implémentation de la couche Web :
   - Contrôleur Spring MVC
   - Templates Thymeleaf
   - Bootstrap layout responsive

7. Fonctions utilisateur :
   - 🧾 Affichage de la liste des produits
   - ➕ Ajout de produit (avec validation du formulaire)
   - ❌ Suppression d’un produit
   - 🔍 Recherche de produits
   - ✏️ Édition et mise à jour d’un produit

8. Sécurisation de l’application :
   - Authentification des utilisateurs avec Spring Security
   - Gestion des rôles et autorisations

9. 🧪 (Optionnel) Ajout d'autres fonctionnalités au choix :
   - Pagination
   - Tri
   - Export PDF / Excel, etc.

---

## ▶️ Démarrage rapide

### 1. Cloner le projet

```bash
git clone https://github.com/saemanab/spring-tp.git
cd nom-du-repo


## author
Mohamed Abiaba

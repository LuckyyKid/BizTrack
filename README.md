# 📱 BizTrack – Application Android de gestion de produits et ventes

**BizTrack** est une application Android développée en Kotlin qui permet de :
- Gérer des produits (nom, prix, catégorie)
- Enregistrer des ventes de produits
- Visualiser les ventes et le chiffre d'affaires total
- Appliquer le design pattern **MVVM** avec Room, LiveData, ViewModel et RecyclerView

---

## 🔧 Stack technique

- **Langage** : Kotlin
- **Architecture** : MVVM (Model – ViewModel – View)
- **Base de données** : Room (SQLite)
- **UI** : RecyclerView, Navigation entre activités
- **Outils Android** :
  - LiveData
  - ViewModel
  - ViewBinding
  - Kotlin Coroutines

---

## 📂 Structure des dossiers


---

## ✅ Fonctionnalités

### 📦 Produits
- Ajouter un produit avec nom, prix, catégorie
- Afficher tous les produits dans une RecyclerView
- Supprimer un produit
- (Optionnel) Modifier un produit

### 💸 Ventes
- Ajouter une vente liée à un produit
- Quantité, date, calcul automatique du total
- Afficher la liste des ventes
- Calculer le chiffre d’affaires total

---

## 🚀 Fonctionnalités à venir
- Rechercher un produit par nom ou catégorie
- Trier les ventes par date ou produit
- Statistiques par produit (meilleur vendeur, total par catégorie)

---

## 🧪 Bonnes pratiques suivies
- Architecture **MVVM claire et modulaire**
- Code **séparé proprement** par couche (Model, Repository, ViewModel, View)
- Utilisation de `LiveData` pour observer la base de données
- `Room` configuré avec DAO et Database singleton

---

## 📅 Progression

| Semaine | Objectif |
|--------|----------|
| 1      | CRUD Produits (Room + RecyclerView) |
| 2      | UI propre + ajout/modif produit |
| 3      | CRUD Ventes + lien avec Produit |
| 4      | Chiffre d’affaires, stats et améliorations |

---

## 👨‍💻 Auteur

Bafing Keita  
Développeur Kotlin | Étudiant en informatique  
Projet été 2025


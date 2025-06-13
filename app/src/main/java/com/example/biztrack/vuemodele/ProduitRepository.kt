package com.example.biztrack.vuemodele

import androidx.lifecycle.LiveData
import com.example.biztrack.model.produitDao
import com.example.biztrack.modele.produit


class ProduitRepository(private val produitDao: produitDao) {

        val allProduits: LiveData<List<produit.Produit>> = produitDao.getAllProduits()

        suspend fun insert(produit: produit.Produit) {
            produitDao.insertProduit(produit)
        }

        suspend fun update(produit: produit.Produit) {
            produitDao.updateProduit(produit)
        }

        suspend fun delete(produit: produit.Produit) {
            produitDao.deleteProduit(produit)
        }

    fun findProduit(id: Int): LiveData<produit.Produit> {
        return produitDao.getProduitById(id)
    }

    }


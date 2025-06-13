package com.example.biztrack.vuemodele

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.biztrack.model.produitDao
import com.example.biztrack.modele.produit
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class produitViewModel(private val produitRepository: ProduitRepository) : ViewModel() {

    val allProduits: LiveData<List<produit.Produit>> = produitRepository.allProduits

    fun insert(produit: produit.Produit) = viewModelScope.launch {
        produitRepository.insert(produit)
    }

    fun update(produit: produit.Produit) = viewModelScope.launch {
        produitRepository.update(produit)
    }

    fun delete(produit: produit.Produit) = viewModelScope.launch {
        produitRepository.delete(produit)
    }

    suspend fun AfficherProduit(id:Int) : LiveData<produit.Produit>{
           return produitRepository.findProduit(id)
        }
}

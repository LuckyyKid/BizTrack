package com.example.biztrack.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.biztrack.modele.produit

@Dao
interface produitDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduit(produit: produit.Produit)

    @Update()
    suspend fun updateProduit(produit: produit.Produit)

    @Delete()
    suspend fun deleteProduit(produit: produit.Produit)

    @Query("SELECT * FROM produit ORDER BY id ASC")
    fun getAllProduits(): LiveData<List<produit.Produit>>

    @Query("SELECT * FROM produit WHERE id = :id")
    fun getProduitById(id: Int): LiveData<produit.Produit>
}
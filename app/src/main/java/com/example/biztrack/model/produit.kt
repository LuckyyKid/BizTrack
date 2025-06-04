package com.example.biztrack.modele

import androidx.room.Entity
import androidx.room.PrimaryKey

class produit{


@Entity(tableName = "produit")
data class Produit(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nom: String,
    val prix: Double,
    val categorie: String
)
}


package com.example.biztrack.vuemodele

import com.example.biztrack.model.produitDao



    class produitViewModel(private val produitRepository: ProduitRepository) {

        suspend fun AfficherProduit(id:Int){
            produitRepository.findProduit(id)
        }
}

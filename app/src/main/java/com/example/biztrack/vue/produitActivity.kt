package com.example.biztrack.vue

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.biztrack.databinding.ItemProduitBinding
import com.example.biztrack.modele.produit


class ProduitAdapter(
    private var produits: List<produit>,
    private val onDeleteClick: (produit) -> Unit
) : RecyclerView.Adapter<produitAdapter.ProduitViewHolder>() {

    inner class ProduitViewHolder(val binding: ItemProduitBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProduitViewHolder {
        val binding = ItemProduitBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProduitViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProduitViewHolder, position: Int) {
        val produit = produits[position]
        holder.binding.nomTextView.text = produit.nom
        holder.binding.prixTextView.text = "${produit.prix} $"
        holder.binding.btnSupprimer.setOnClickListener {
            onDeleteClick(produit)
        }
    }

    override fun getItemCount(): Int = produits.size

    fun updateList(newList: List<produit.Produit>) {
        produits = newList
        notifyDataSetChanged()
    }
}

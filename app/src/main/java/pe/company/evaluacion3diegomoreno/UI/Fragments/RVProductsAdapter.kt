package pe.company.evaluacion3diegomoreno.UI.Fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.company.evaluacion3diegomoreno.Model.Product
import pe.company.evaluacion3diegomoreno.databinding.ItemProductBinding

class RVProductsAdapter(private val products: List<Product>): RecyclerView.Adapter<RVProductsAdapter.ProductVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductVH {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductVH(binding)
    }

    override fun onBindViewHolder(holder: ProductVH, position: Int) {
        holder.bind(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class ProductVH(private val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product) {
            binding.txtCharacterName.text = product.fullName
        }
    }
}
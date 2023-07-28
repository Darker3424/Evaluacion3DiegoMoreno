package pe.company.evaluacion3diegomoreno.UI.Fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import pe.company.evaluacion3diegomoreno.Model.Product
import pe.company.evaluacion3diegomoreno.R
import pe.company.evaluacion3diegomoreno.databinding.ItemProductBinding

class RVProductFavorite( var products: List<Product>): RecyclerView.Adapter<ProductFavorite>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductFavorite {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductFavorite(binding)
    }

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: ProductFavorite, position: Int) {
        holder.fav(products[position])
    }
}



class ProductFavorite(private val binding: ItemProductBinding): RecyclerView.ViewHolder(binding.root) {
    fun fav(product: Product) {
        binding.txtInfoName.text = product.title

        if (product.imgUrl.isNotEmpty()) {
            binding.imgProduct.load(product.imgUrl)
        } else {
            binding.imgProduct.setImageResource(R.drawable.bandera)
        }

        if (product.isFavorite) {
            binding.btnFavorite.setImageResource(R.drawable.favorite_fill)
        } else {
            binding.btnFavorite.setImageResource(R.drawable.favorite_fill)
        }

    }
}
package pe.company.evaluacion3diegomoreno.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.company.evaluacion3diegomoreno.R
import pe.company.evaluacion3diegomoreno.databinding.FragmentElementsBinding
import pe.company.evaluacion3diegomoreno.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {
    private lateinit var binding: FragmentFavoriteBinding
    private lateinit var viewModel: ElementViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(ElementViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = RVProductFavorite(listOf())
        binding.rvProducts.adapter = adapter
        binding.rvProducts.layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)

        // Resto del código aquí...
        viewModel.products.observe(viewLifecycleOwner) { products ->
            adapter.products = products
            adapter.notifyDataSetChanged()
        }
        viewModel.getProducts()
    }

}
package pe.company.evaluacion3diegomoreno.UI.Fragments

import android.icu.lang.UCharacter.VerticalOrientation
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.company.evaluacion3diegomoreno.Model.getData
import pe.company.evaluacion3diegomoreno.R
import pe.company.evaluacion3diegomoreno.databinding.FragmentElementsBinding

class ElementsFragment : Fragment() {
    private lateinit var binding: FragmentElementsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentElementsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvProducts.adapter = RVProductsAdapter(getData())
        binding.rvProducts.layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)
    }

}
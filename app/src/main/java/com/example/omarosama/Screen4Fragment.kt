package com.example.omarosama

import android.os.Bundle
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.example.omarosama.databinding.FragmentScreen4Binding
import com.example.omarosama.models.Shoe
import kotlinx.coroutines.yield
import java.util.zip.Inflater

class Screen4Fragment : Fragment() {
    private lateinit var binding: FragmentScreen4Binding
    private lateinit var viewModel: viewmodel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel=ViewModelProvider(requireActivity())[viewmodel::class.java]
        binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_screen4, container, false)!!
        binding.bb.setOnClickListener {
            var ttt = Screen4FragmentDirections.actionScreen4FragmentToLastFragment()
            findNavController().navigate(ttt)
        }


        for (i in viewModel.shoeList.value?.indices!!){
            val v:View=layoutInflater.inflate(R.layout.shoes_list_layout,null)

            val name :TextView=v.findViewById(R.id.shoenameview) as TextView
            name.text=viewModel.shoeList.value?.get(i)?.name

            val size :TextView=v.findViewById(R.id.shoesizeview) as TextView
            size.text = viewModel.shoeList.value?.get(i)?.size

            val company :TextView=v.findViewById(R.id.shoeCompanyview) as TextView
            company.text = viewModel.shoeList.value?.get(i)?.company

            val description : TextView=v.findViewById(R.id.Shoedecriptionview) as TextView
            description.text = viewModel.shoeList.value?.get(i)?.description

            val img : ImageView=v.findViewById(R.id.shoeimg) as ImageView
            img.setImageResource(R.drawable.shoeimg)


            binding.containerOfShoes.addView(v)
        }
        setHasOptionsMenu(true)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {

                }

            })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        when (item.itemId) {
            R.id.firstFragment -> {
                val action = Screen4FragmentDirections.actionScreen4FragmentToFirstFragment()
                findNavController().navigate(action)
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }


}

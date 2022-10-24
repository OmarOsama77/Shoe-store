package com.example.omarosama

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController

import com.example.omarosama.databinding.FragmentScreen3Binding

class Screen3Fragment : Fragment() {
 private lateinit var binding : FragmentScreen3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=DataBindingUtil.inflate(layoutInflater,R.layout.fragment_screen3, container, false)!!
        binding.button6.setOnClickListener {
            var cc = Screen3FragmentDirections.actionScreen3FragmentToScreen4Fragment()
            findNavController().navigate(cc)
        }
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {

            }

        })
    }

}
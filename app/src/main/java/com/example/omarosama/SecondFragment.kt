package com.example.omarosama

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.omarosama.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

private lateinit var binding : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
 binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_second, container, false)
        binding.button2.setOnClickListener {
            var actionnnn=SecondFragmentDirections.actionSecondFragmentToScreen3Fragment()
            findNavController().navigate(actionnnn)
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
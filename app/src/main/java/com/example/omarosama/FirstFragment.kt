package com.example.omarosama

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI

import com.example.omarosama.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*




class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_first, container, false)




      binding.button.setOnClickListener {
          if (binding.editTextTextEmailAddress.text.isEmpty()||binding.editTextTextPassword.text.isEmpty()){
              Toast.makeText(activity?.applicationContext,"Please enter valid email and password",Toast.LENGTH_SHORT).show()
          }else{
              val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
              findNavController().navigate(action)
          }



  }







        return binding.root


    }

}
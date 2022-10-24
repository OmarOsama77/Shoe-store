package com.example.omarosama

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.omarosama.models.Shoe

class viewmodel:ViewModel(){
 private var _shoeList=MutableLiveData<ArrayList<Shoe>>()
 val shoeList :LiveData<ArrayList<Shoe>>
 get() = _shoeList
 init {
     _shoeList.value=ArrayList()
 }

}
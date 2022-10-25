package com.example.omarosama

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.omarosama.models.Shoe

class ShoeViewModel : ViewModel(){
    private var _shoeList= MutableLiveData<ArrayList<Shoe>>()
    val shoeList : LiveData<ArrayList<Shoe>>
        get() = _shoeList
    init {
        _shoeList.value=ArrayList()
    }

    var new = Shoe()

    fun showw(shoe: Shoe){
        _shoeList.value?.add(shoe)
    }
}
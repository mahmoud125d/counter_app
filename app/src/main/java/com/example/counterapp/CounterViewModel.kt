package com.example.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private var _repository = CurrentRepository()
    private val _count  = mutableIntStateOf(_repository.getCounter().count)
    val count:MutableState<Int> = _count
    fun increment(){
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }
    fun decrement(){
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }

}
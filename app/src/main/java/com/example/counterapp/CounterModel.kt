package com.example.counterapp

data class CounterModel (var count:Int)

class CurrentRepository(){
    private var counter =CounterModel(0)

    fun getCounter() = counter
    fun incrementCounter(){
        counter.count++
    }
    fun decrementCounter(){
        counter.count--
    }
}
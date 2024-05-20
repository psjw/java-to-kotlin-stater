package com.lannstark.lec10

fun main(){
    Derived(300)
}


open class Base(
    open val number: Int  = 100
) {
    init {
        println("Base Class")
        println(number) //상위
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}
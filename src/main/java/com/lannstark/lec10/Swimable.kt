package com.lannstark.lec10

interface Swimable {

    val swimAbility: Int
        get() =  3 //기본값을 가질수도 있음

    fun act() {
        println("어푸 어푸")
    }
}
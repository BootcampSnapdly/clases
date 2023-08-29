package com.example.spring

import org.springframework.stereotype.Component

@Component
class DiscountRepository {

    companion object{
       private val personasConDescuento = mutableListOf<String>()
    }

    fun hasDiscount(name: String) = personasConDescuento.contains(name)

    fun addToDB(name: String) = personasConDescuento.add(name)


}
package com.example.spring

import org.springframework.stereotype.Component


@Component
class DiscountService(private val discountRepository: DiscountRepository) {

    fun makeDiscount(persona: Persona): Double{
        if ( discountRepository.hasDiscount(persona.name)) return 0.0

        return if (persona.purchases>10){
            discountRepository.addToDB(persona.name)
            0.1
        }else{
            discountRepository.addToDB(persona.name)
            0.01
        }
    }




}
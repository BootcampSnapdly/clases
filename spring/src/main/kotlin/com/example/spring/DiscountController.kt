package com.example.spring

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DiscountController(private val discountService: DiscountService) {

    @PostMapping("/descuento")
    fun makeDiscount(@RequestBody persona: Persona): Double {
        return discountService.makeDiscount(persona)
    }

}
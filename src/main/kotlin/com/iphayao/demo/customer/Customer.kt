package com.iphayao.demo.customer

import org.jetbrains.annotations.NotNull
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Size
import kotlin.math.min

@Entity
data class Customer(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        @Size(min = 2, max = 50, message = "Please provide first size between 2 - 100")
        val firstName: String,
        val lastName: String,
        val age: Int,
        val email: String
)
package com.example.hng_stage_two.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Pattern


@Entity
data class Person(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int,
    var firstName: String? = "",
    var lastName: String? = "",
    @field:Pattern(regexp = "^\\d+\$", message = "Age must only contain numbers")
    var age: String? = "",
    var track: String? = ""
)
package com.example.hng_stage_two.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Person(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int,
    var firstName: String? = null,
    var lastName: String? = null,
    var age: String? = null,
    var track: String? = null
)

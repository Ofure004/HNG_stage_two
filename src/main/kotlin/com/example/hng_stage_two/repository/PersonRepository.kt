package com.example.hng_stage_two.repository


import com.example.hng_stage_two.model.entity.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository: CrudRepository<Person, Int>

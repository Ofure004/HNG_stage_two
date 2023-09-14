package com.example.hng_stage_two.controller

import com.example.hng_stage_two.model.entity.Person
import com.example.hng_stage_two.service.PersonService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping
class PersonController(val service: PersonService) {
    @PostMapping("/api")
    fun create(@RequestBody person: Person) = service.create(person)

    @GetMapping("/api")
    fun readAll() = service.read()

    @GetMapping("/api/{user_id}")
    fun readbyId(@PathVariable("user_id") id: Int) = service.readbyId(id)

    @PatchMapping("/api/{user_id}")
    fun update(@PathVariable("user_id") id: Int, @RequestBody person: Person) : Person {
        person.id = id
        return service.update(id, person)
    }

    @DeleteMapping("/api/{user_id}")
    fun delete(@PathVariable("user_id") id: Int) = service.delete(id)
}

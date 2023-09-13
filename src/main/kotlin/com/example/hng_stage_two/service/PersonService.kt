package com.example.hng_stage_two.service

import com.example.hng_stage_two.model.entity.Person
import com.example.hng_stage_two.repository.PersonRepository
import org.springframework.stereotype.Service
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.server.ResponseStatusException

@Service
class PersonService( val repository: PersonRepository){
    fun create(person: Person): String {
        repository.save(person);
        return "${person.lastName} + ${person.firstName} has been added to the db successfully and your id is ${person.id}"
    }
    fun read() = repository.findAll()

    fun readbyId(id: Int): Person = repository.findByIdOrNull(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
    fun update( person: Person): Person {
    return if( repository.existsById(person.id)){
        repository.save(person)
        } else throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
    }

    fun delete(id: Int): String {
      if (repository.existsById(id)) {
            repository.deleteById(id);
          return "User deleted successfully"
        } else throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
    }



}
package com.example.hng_stage_two.service

import com.example.hng_stage_two.model.entity.Person
import com.example.hng_stage_two.repository.PersonRepository
import org.springframework.stereotype.Service
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

@Service
class PersonService( val repository: PersonRepository){
    fun create(person: Person): String {
        repository.save(person)
        return "${person.lastName} ${person.firstName} has been added to the db successfully and your id is ${person.id}"
    }
    fun read() = repository.findAll()

    fun readbyId(id: Int): Person = repository.findByIdOrNull(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
    fun update( id : Int , person: Person): Person {
    if( repository.existsById(person.id) && person.id == id){
        var existingUser = repository.findById(person.id).get()
        if(person.firstName != null){
            existingUser.firstName = person.firstName
        }
        if(person.lastName != null){
            existingUser.lastName = person.lastName
        }
        if(person.age != null){
            existingUser.age = person.age
        }
        if(person.track != null){
            existingUser.track = person.track
        }
        return repository.save(existingUser)
        } else throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
    }

    fun delete(id: Int): String {
      if (repository.existsById(id)) {
            repository.deleteById(id)
          return "User deleted successfully"
        } else throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
    }



}
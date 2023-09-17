package com.example.hng_stage_two.controller

import com.example.hng_stage_two.model.entity.Person
import com.example.hng_stage_two.service.PersonService
import jakarta.validation.Valid
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.*
import java.util.stream.Collectors


@RestController
@RequestMapping
class PersonController(val service: PersonService) {
    @PostMapping("/api")
    fun create(@Valid @RequestBody person: Person) = service.create(person)

    @GetMapping("/api")
    fun readAll() = service.read()

    @GetMapping("/api/{user_id}")
    fun readbyId(@PathVariable("user_id") id: Int) = service.readbyId(id)

    @PatchMapping("/api/{user_id}")
    fun update(@PathVariable("user_id") id: Int, @Valid @RequestBody person: Person) : Person {
        person.id = id
        return service.update(id, person)
    }

    @DeleteMapping("/api/{user_id}")
    fun delete(@PathVariable("user_id") id: Int) = service.delete(id)
}

@RestControllerAdvice
class globalExceptionHandler{

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationErrors(ex: MethodArgumentNotValidException): ResponseEntity<MutableMap<String, List<String?>>> {
        val errors = ex.bindingResult.fieldErrors
            .stream()
            .map { fieldError: FieldError -> fieldError.defaultMessage }
            .collect(Collectors.toList())
        return ResponseEntity(getErrorsMap(errors), HttpHeaders(), HttpStatus.BAD_REQUEST)
    }

    private fun getErrorsMap(errors: MutableList<String?>): MutableMap<String, List<String?>> {
        val errorResponse: MutableMap<String, List<String?>> = HashMap()
        errorResponse["errors"] = errors
        return errorResponse
    }
}

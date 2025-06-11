package com.hkjc.alleyoop.demo.controllers;

import com.hkjc.alleyoop.demo.models.DemoRequest
import com.hkjc.alleyoop.demo.models.DemoResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("")
class DemoController(@Value("\${demo.myVar}") private val myVar: String) {

    @PostMapping("/", "/index")
    fun sayHello(@RequestBody request: DemoRequest): DemoResponse {
        val message = "Hello ${request.name}, you are ${request.age} years old"
        return DemoResponse(msg = message, myVar = myVar)
    }
}
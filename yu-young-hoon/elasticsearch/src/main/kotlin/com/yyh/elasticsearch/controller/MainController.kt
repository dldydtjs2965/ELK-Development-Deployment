package com.yyh.elasticsearch.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
    @GetMapping("/")
    fun main(): String {
        return "main"
    }
}
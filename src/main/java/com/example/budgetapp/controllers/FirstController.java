package com.example.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
@GetMapping
    public String helloWorld () {
        return "Приложение запущено!";
    }

    @GetMapping("/info")
    public String page (@RequestParam String info) {

    return "Имя ученицы - Ольга\n" +
            " проект создан 04.01.2022\n" +
            "название проекта BugetApp"+ info;
    }

}

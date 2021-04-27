package com.zrtech.appdemo.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @ApiOperation(value = "Método de demosntração de recurso de API - Hello World")
    @ApiResponses(value = {
            @ApiResponse( code = 200, message = "Método retornou com sucesso!")

    })
    @GetMapping
    private String hello(){
    return "Hello World - Book Manager";

 }
}
package com.gtech.Controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "/hello" })
@Tag(name = "hello controller", description = "its a hello world controller")
public class HelloController {

    @Operation(summary = "get hello ", description = "get hello world message")
    @RequestMapping(value = { "/v1/hi" }, method = RequestMethod.GET)
    public ResponseEntity<String> getHello(HttpServletResponse servletResponse,  HttpServletRequest servletRequest) {

        return ResponseEntity.status(HttpStatus.ACCEPTED.value()).body("hello gtech ini java service");
    }
}

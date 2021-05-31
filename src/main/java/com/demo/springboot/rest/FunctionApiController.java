package com.demo.springboot.rest;

import com.demo.springboot.dto.ResultDto;
import com.demo.springboot.service.QuadraticFunctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Klasa mająca na celu pobranie informacji wpisanych przez klienta i przesłanie ich dalej
 */
@RestController
public class FunctionApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FunctionApiController.class);

    private final QuadraticFunctionService quadraticFunctionService;

    public FunctionApiController(QuadraticFunctionService quadraticFunctionService) {
        this.quadraticFunctionService = quadraticFunctionService;
    }
    /**
     * Funkcja mająca na celu pobranie informacji wpisanych przez klienta (a, b, c)
     */
    @CrossOrigin
    @GetMapping("/square-function")
    public ResponseEntity<ResultDto> calculateFunction(@RequestParam("a") Double a,
                                                       @RequestParam("b") Double b,
                                                       @RequestParam("c") Double c) {
        LOGGER.info("--- a = {}", a);
        LOGGER.info("--- b = {}", b);
        LOGGER.info("--- c = {}", c);

        final ResultDto resultDto = quadraticFunctionService.calculateFunction(a, b, c);

        return ResponseEntity.ok(resultDto);
    }
}

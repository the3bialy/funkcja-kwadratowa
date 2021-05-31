package com.demo.springboot.service;

import com.demo.springboot.dto.ResultDto;
import org.springframework.stereotype.Service;

/**
 * Klasa mająca na celu przetworzenie danych otrzymanch z FunctionApiController
 */
@Service
public class QuadraticFunctionServiceImpl implements QuadraticFunctionService {
    /**
     * Funkcja mająca na celu obliczyć delte, pierwiastki oraz wierzchołek paraboli.
     * wwszystko na podztawie parametrów podanych przez klienta (a, b, c)
     */
    @Override
    public ResultDto calculateFunction(Double a, Double b, Double c) {

        double delta = b * b - 4 * a * c;
        double wx = -b / (2 * a);
        double wy = -delta / (4 * a);

        if(delta > 0.0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);

            return new ResultDto(x1, x2, delta, wx, wy);
        } else if(delta == 0.0) {
            double x = -b / (2 * a);
            return new ResultDto(x, null,delta, wx, wy);
        }else {
            return new ResultDto(null, null, delta, wx, wy);
        }
    }
}

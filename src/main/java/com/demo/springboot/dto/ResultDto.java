package com.demo.springboot.dto;

/**
 * Klasa mająca na celu odesłanie wyników do klienta
 */
public class ResultDto {
    private final Double x1;
    private final Double x2;
    private final Double delta;
    private final Double wx;
    private final Double wy;
    /**
     * Funkcja tworząca zmienne
     */
    public ResultDto() {
        x1 = null;
        x2 = null;
        delta = null;
        wx = null;
        wy = null;
    }
    /**
     * Funkcja pobierająca zmienne
     */
    public ResultDto(Double x1, Double x2,Double delta, Double wx, Double wy) {
        this.x1 = x1;
        this.x2 = x2;
        this.delta = delta;
        this.wx = wx;
        this.wy = wy;
    }
    /**
     * Funkcje wysyłające zmienne z powrotem do klijęta
     */
    public Double getX1() {
        return x1;
    }
    public Double getX2() {
        return x2;
    }
    public Double getdelta() {
        return delta;
    }
    public Double getwx() {
        return wx;
    }
    public Double getwy() {
        return wy;
    }
}

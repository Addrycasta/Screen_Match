package com.alura.screenmatch.excepcion;

public class ErrorConversionException extends RuntimeException {
    private String mensaje;


    public ErrorConversionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}

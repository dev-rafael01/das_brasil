package io.dev_rafael01.das_brasil_11_26.infraestrutura.exceptions;

public class ConflictException extends  RuntimeException {

    public ConflictException(String mensagem){
        super(mensagem);
    }

    public ConflictException(String mensagem, Throwable throwable){
        super(mensagem);
    }
}

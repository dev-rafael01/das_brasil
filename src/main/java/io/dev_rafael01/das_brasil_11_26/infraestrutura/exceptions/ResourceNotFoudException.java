package io.dev_rafael01.das_brasil_11_26.infraestrutura.exceptions;

public class ResourceNotFoudException  extends RuntimeException{

    public ResourceNotFoudException(String mensagem){
        super(mensagem);
    }

    public ResourceNotFoudException(String email, Throwable throwable){
        super(email, throwable);
    }
}

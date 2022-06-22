package br.com.contmatic.prova.util.validacao;

import java.math.BigDecimal;

public final class ValidacaoUtil {

    private ValidacaoUtil() {        
    }   
    
    public static void validarNulo(Object obj, String msg) {       
        if (obj == null) {
            throw new IllegalArgumentException(msg);
        }        
    }
    
    public static void validarVazioOuApenasEspacos(String campo, String msg) {
        if (campo.trim().isEmpty()) {
            throw new IllegalStateException(msg);
        }        
    }
    
    public static void validarQuantidadeCaracteresMinMax(String campo, int min, int max, String msg) {
        if (campo.length() < min || campo.length() > max) {
            throw new IllegalStateException(msg);
        }
    }
    
    public static void validarValorMinMaxPermitidaDeNumero(Integer campo, int min, int max, String msg) {
        if (campo < min || campo > max) {
            throw new IllegalStateException(msg);
        }
    }
    
    //public static void validarValorMinMaxPermitidaDeNumeroFloat(BigDecimal campo, BigDecimal min, BigDecimal max, String msg) {
        //if (campo.length() < min || campo.length() > max) {
            //throw new IllegalStateException(msg);
        //}
    //}
    
    public static void validarTamanho(String campo, int min, int max, String msg) {
        if (campo.length() < min || campo.length() > max) {
            throw new IllegalStateException(msg);
        }
    }   
    
    
    public static void validarQuantidadeCaracteres(String campo, int tamanhoFixo, String msg) {
        if (campo.length() != tamanhoFixo) {
            throw new IllegalStateException(msg);
        }
    }
    
    public static void validarSePossuiApenasNumeros(String campo, int tamanhoFixo, String msg) {
        if (!campo.matches("[0-9]{2," + tamanhoFixo + "}")) {
            throw new IllegalStateException(msg);
        }
    }
    
    public static void validarSePossuiApenasLetrasComuns(String campo, String msg) {
        if (!campo.matches("[a-zA-Z]")) {
            throw new IllegalStateException(msg);
        }
    }       
    
    public static void validarPorRegex(String campo, String regex, String msg) {
        if (!campo.matches(regex)) {
            throw new IllegalStateException(msg);
        }
    }
}

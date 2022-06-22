package br.com.contmatic.validacnpjcpf;

import java.util.InputMismatchException;

public class ValidarCpf {
    
    private ValidarCpf() {        
    }
    
    public static void validarCpf(String cpf, String msg) {
        if(!isCpfValido(cpf)) {
            throw new IllegalStateException(msg);
        }
    }

    public static boolean isCpfValido(String cpf) {
        if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999") || (cpf.length() != 11))
            return (false);
        
        int soma = 0;
        char dig1;
        char dig2;        
        int i;  //mudar
        int r;  //mudar
        int num; //mudar
        
        try {
            // primeiro dígito
            
            int peso = 10;
            for (i =0; i < 9; i ++) {
                num = (int)(cpf.charAt(i) - 48);
                soma = soma + (num * peso);
                peso = peso - 1;
            }
            
            r = 11 - (soma % 11);
            if ((r == 10) || (r == 11))
                dig1 = '0';
            else dig1 = (char)(r + 48);
            
         // segundo dígito
            
            peso = 11;
            for(i = 0; i < 10; i ++) {
                num = (int)(cpf.charAt(i) - 48);
                soma = soma + (num * peso );
                peso = peso - 1;
            }
            
            r = 11 - (soma % 11);
            if((r == 10) || (r == 11))
                dig2 = '0';
            else dig2 = (char)(r + 48);
            
            if ((dig1 == cpf.charAt(9)) && (dig2 == cpf.charAt(10)))
                return(true);
            else return(false);
           
        }catch (InputMismatchException erro) {
            return(false);
        }        
    }    

} 
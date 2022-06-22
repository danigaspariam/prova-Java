package br.com.contmatic.validacnpjcpf;

import java.util.InputMismatchException;

public class ValidaCnpj {
    
    // TODO refatorar código
    
    private ValidaCnpj() {        
    }
    
    public static void validarCnpj(String cnpj, String msg) {
        if (!isCnpjValido(cnpj)) {
            throw new IllegalStateException(msg);
        }
    }

    public static boolean isCnpjValido(String cnpj) {
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") || cnpj.equals("22222222222222") || cnpj.equals("33333333333333") || cnpj.equals("44444444444444") ||
            cnpj.equals("55555555555555") || cnpj.equals("66666666666666") || cnpj.equals("77777777777777") || cnpj.equals("88888888888888") || cnpj.equals("99999999999999") || (cnpj.length() != 14))
            return(false);
        char dig1;
        char dig2 = 0;
        

        try {            
            int num = 0;
            int soma = 0;
            int peso = 2;
            for (int i = 11 ; i >= 0 ; i--) {
                // arrumar isso, talvez fiz confusão 
                // modificar fazer ao contrario
                num =(cnpj.charAt(i) - 48);
                soma = soma + (num * peso);
                if (peso == 10)
                    peso = 2;
            }
            // transformar o método 

            int r = soma % 11;
            if ((r == 0) || (r == 1))
                dig1 = '0';
            else
                dig1 = (char) ((11 - r) + 48);

            if ((dig1 == cnpj.charAt(12)) && (dig2 == cnpj.charAt(13)))            
                return (true);
            else return(false);
                        
        } catch (InputMismatchException erro) {
            return (false);
        }
    }  
    
}

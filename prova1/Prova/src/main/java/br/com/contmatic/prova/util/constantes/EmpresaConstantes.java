package br.com.contmatic.prova.util.constantes;

public final class EmpresaConstantes {
    
    // numéricas 
    
    public static final int RAZAO_SOCIAL_TAMANHO_MINIMO = 5;
    public static final int NOME_FANTASIA_TAMANHO_MINIMO = 5;
    public static final int RAZAO_SOCIAL_TAMANHO_MAXIMO = 100;
    public static final int NOME_FANTASIA_TAMANHO_MAXIMO = 100;
    public static final int CNPJ_TAMANHO_FIXO = 14;
    public static final Float CAPITAL_SOCIAL_TAMANHO_MINIMO = 999.99f;
    public static final Float CAPITAL_SOCIAL_TAMANHO_MAXIMO = 100000001.00f;
    
    // mensagens
    
    public static final String RAZAO_SOCIAL_MSG_NULO = "A RAZÃO SOCIAL não pode estar vazia!";
    public static final String RAZAO_SOCIAL_MSG_ESPACO_VAZIO = "A RAZÃO SOCIAL não pode conter apenas espaços ou estar em branco";
    public static final String RAZAO_SOCIAL_MSG_MIN_MAX =  "A RAZÃO SOCIAL não deve ser menor que 5 caracteres ou maior que 100 caracteres!";
    public static final String NOME_FANTASIA_NULO = "O NOME FANTASIA não pode estar nulo!";
    public static final String NOME_FANTASIA_APENAS_ESPACOS = "O NOME FANTASIA não pode conter apenas espaços ou estar em branco";
    public static final String NOME_FANTASIA_MSG_MIN_MAX =  "O NOME FANTASIA não deve ser menor que 5 caracteres ou maior que 100 caracteres!";
    public static final String CAPITAL_SOCIAL_MSG_NULO = "A CAPITAL SOCIAL não pode estar nula!";
    public static final String CAPITAL_SOCIAL_MSG_MIN_MAX = "A CAPITAL SOCIAL deve ser entre 1000 e 100.000.000 reais!";
    public static final String CAPITAL_SOCIAL_VAZIA = "A CAPITAL SOCIAL não pode estar vazia!";
    public static final String CAPITAL_SOCIAL_APENAS_ESPACOS = "A CAPITAL SOCIAL não pode conter apenas espaços ou estar em branco";
    public static final String DATA_ABERTURA_NULO_MSG = "A DATA DE ABERTURA não pode estar vazia!";
    public static final String DATA_ABERTURA_VAZIO_APENAS_ESPACOS = "A DATA DE ABERTURA não pode conter apenas espaços ou estar em branco";
    public static final String CNPJ_VAZIO = "O CNPJ não pode conter apenas espaços ou estar em branco";
    public static final String CNPJ_EM_BRANCO = "O CNPJ não pode estar em branco ou vazio!";
    public static final String CNPJ_NULO = "O CNPJ não pode ser nulo ou inválido!";
    public static final String CNPJ_MSG_MIN_MAX = "O CNPJ deve conter 14 caracteres, não podendo ser mais ou menos!";
    public static final String CNPJ_MSG_INVALIDO = "O CNPJ inserido não é válido, insira um CNPJ válido!";
    public static final String EMAIL_NULO_VAZIO = "O EMAIL não pode ser nulo ou estar vazio!";
    public static final String EMAIL_APENAS_ESPACOS = "O EMAIL não pode conter apenas espaços ou estar em branco";
    
   private EmpresaConstantes() {       
   }   
   
}

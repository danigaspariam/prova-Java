package br.com.contmatic.prova.util.constantes;

public final class RegexConstantes {
    
    public static final String LETRAS_MAIUSCULAS_MINUSCULAS = "[a-zA-Z]";
    public static final String APENAS_ALFA_NUMERICO = "[A-Za-z0-9]";
    public static final String APENAS_NUMEROS = "[0-9]";
    public static final String ALGUNS_CARACTERES_ESPECIAIS_ALFA_NUMERICO = "[^A-Za-z0-9@#&%-`´^~:]";
    public static final String CARACTERES_LETRAS_CARACTERES_ESPECIAIS = "[^A-Za-z&-`´^~]";
    public static final String ALGUNS_CARACTERES_ESPECIAIS_ALFA_NUMERICO_PARA_NOME = "[^A-Za-z`´^~]";
    public static final String REGEX_EMAIL = "[^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$]";
    public static final String VERIFICA_NOMES_VALIDOS_PARA_ENDERECO = "[^[A-ZÀ-Ÿ][A-zÀ-ÿ']+\\s([A-zÀ-ÿ']\\s?)*[A-ZÀ-Ÿ][A-zÀ-ÿ']+$]";
    // criar mais REGEX NÃO ESQUECERRRRR 
    
    // MENSAGEM
    
    public static final String CARACTERES_RAZAO_SOCIAL_MSG = "Os caracteres inseridos são inválidos para o campo RAZÃO SOCIAL!";
    public static final String CARACTERES_NOME_FANTASIA_MSG = "Os caracteres inseridos são inválidos para o campo NOME FANTASIA!";
    public static final String CARACTERES_CNPJ_MSG = "Os caracteres inseridos são inválidos para o campo CNPJ!";
    private RegexConstantes() {}

}

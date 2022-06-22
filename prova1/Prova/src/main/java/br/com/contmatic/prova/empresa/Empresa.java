package br.com.contmatic.prova.empresa;

import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.CAPITAL_SOCIAL_VAZIA;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.CNPJ_MSG_INVALIDO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.CNPJ_MSG_MIN_MAX;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.CNPJ_NULO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.CNPJ_TAMANHO_FIXO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.CNPJ_VAZIO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.DATA_ABERTURA_NULO_MSG;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.EMAIL_APENAS_ESPACOS;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.EMAIL_NULO_VAZIO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.NOME_FANTASIA_APENAS_ESPACOS;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.NOME_FANTASIA_MSG_MIN_MAX;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.NOME_FANTASIA_NULO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.NOME_FANTASIA_TAMANHO_MAXIMO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.NOME_FANTASIA_TAMANHO_MINIMO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.RAZAO_SOCIAL_MSG_ESPACO_VAZIO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.RAZAO_SOCIAL_MSG_MIN_MAX;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.RAZAO_SOCIAL_MSG_NULO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.RAZAO_SOCIAL_TAMANHO_MAXIMO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.RAZAO_SOCIAL_TAMANHO_MINIMO;
import static br.com.contmatic.prova.util.constantes.RegexConstantes.ALGUNS_CARACTERES_ESPECIAIS_ALFA_NUMERICO;
import static br.com.contmatic.prova.util.constantes.RegexConstantes.CARACTERES_CNPJ_MSG;
import static br.com.contmatic.prova.util.constantes.RegexConstantes.CARACTERES_NOME_FANTASIA_MSG;
import static br.com.contmatic.prova.util.constantes.RegexConstantes.CARACTERES_RAZAO_SOCIAL_MSG;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarNulo;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarPorRegex;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarQuantidadeCaracteres;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarSePossuiApenasNumeros;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarTamanho;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarVazioOuApenasEspacos;
import static br.com.contmatic.validacnpjcpf.ValidaCnpj.validarCnpj;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import br.com.contmatic.prova.endereco.Endereco;



public class Empresa {
    
    private String razaoSocial;
    
    private String nomeFantasia;
    
    private String cnpj;
    
    private String email;   
    
    private BigDecimal capitalSocial = new BigDecimal("");
    
    private LocalDate dataAbertura;
    
    private List<Endereco> enderecos;
    
    private List<Funcionario> funcionarios; 
    
        public Empresa(String cnpj) {
        this.setCnpj(cnpj);
    }
    
    public Empresa(String cnpj, String razaoSocial) {
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
    }
    
    public Empresa(String cnpj, String razaoSocial, String nomeFantasia) {
       this.setCnpj(cnpj);
       this.setRazaoSocial(razaoSocial);
       this.setNomeFantasia(nomeFantasia);
    }
    
    public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String email) {
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
        this.setNomeFantasia(nomeFantasia);
        this.setEmail(email);        
    }
    
    public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String email, BigDecimal capitalSocial) {
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
        this.setNomeFantasia(nomeFantasia);
        this.setEmail(email);
        this.setCapitalSocial(capitalSocial);
    }
    
    public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String email, BigDecimal capitalSocial, LocalDate dataAbertura) {
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
        this.setNomeFantasia(nomeFantasia);
        this.setEmail(email);
        this.setCapitalSocial(capitalSocial);
        this.setDataAbertura(dataAbertura);
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {        
        validarNulo(razaoSocial, RAZAO_SOCIAL_MSG_NULO);        
        validarVazioOuApenasEspacos(razaoSocial, RAZAO_SOCIAL_MSG_ESPACO_VAZIO);
        validarPorRegex(razaoSocial, ALGUNS_CARACTERES_ESPECIAIS_ALFA_NUMERICO, CARACTERES_RAZAO_SOCIAL_MSG);
        validarTamanho(razaoSocial, RAZAO_SOCIAL_TAMANHO_MINIMO, RAZAO_SOCIAL_TAMANHO_MAXIMO, RAZAO_SOCIAL_MSG_MIN_MAX);
        this.razaoSocial = razaoSocial;        
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {        
        validarNulo(nomeFantasia, NOME_FANTASIA_NULO);        
        validarVazioOuApenasEspacos(nomeFantasia, NOME_FANTASIA_APENAS_ESPACOS);
        validarTamanho(nomeFantasia, NOME_FANTASIA_TAMANHO_MINIMO, NOME_FANTASIA_TAMANHO_MAXIMO, NOME_FANTASIA_MSG_MIN_MAX);
        validarPorRegex(nomeFantasia, ALGUNS_CARACTERES_ESPECIAIS_ALFA_NUMERICO , CARACTERES_NOME_FANTASIA_MSG);
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {        
        validarNulo(cnpj, CNPJ_NULO);        
        validarVazioOuApenasEspacos(cnpj, CNPJ_VAZIO);
        validarQuantidadeCaracteres(cnpj, CNPJ_TAMANHO_FIXO, CNPJ_MSG_MIN_MAX);
        validarSePossuiApenasNumeros(cnpj, CNPJ_TAMANHO_FIXO, CARACTERES_CNPJ_MSG);
        validarCnpj(cnpj, CNPJ_MSG_INVALIDO);
        this.cnpj = cnpj;
    }

    public String getEmail() {        
        return email;
    }

    public void setEmail(String email) {        
        validarNulo(email, EMAIL_NULO_VAZIO);        
        validarVazioOuApenasEspacos(email, EMAIL_APENAS_ESPACOS);
        this.email = email;
    }

    public BigDecimal getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(BigDecimal capitalSocial) {
        
        validarNulo(capitalSocial, CAPITAL_SOCIAL_VAZIA);        
        
        this.capitalSocial = capitalSocial;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        
        validarNulo(dataAbertura, DATA_ABERTURA_NULO_MSG);        
        this.dataAbertura = dataAbertura;
    } 
    

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empresa other = (Empresa) obj;
        return Objects.equals(cnpj, other.cnpj);
    }

    @Override
    public String toString() {
        return "Empresa [razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + ", email=" + email + ", capitalSocial=" + capitalSocial + ", enderecos=" + enderecos +
            ", funcionarios=" + funcionarios + ", dataAbertura=" + dataAbertura + "]";
    }
    
    
}

package br.com.contmatic.prova.endereco;

import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarNulo;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarSePossuiApenasNumeros;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarVazioOuApenasEspacos;

import java.util.Objects;

public class Endereco {

    private String rua;
    
    private String cep;
    
    private String bairro;
    
    private Integer numero;
    
    private String cidade;
    
    private String pais;
    
    public Endereco(String cep) {
        this.setCep(cep);
    }
    
    public Endereco(String cep, String rua) {
        this.setCep(cep);
        this.setRua(rua);
    }
    
    public Endereco(String cep, String rua, String bairro) {
        this.setCep(cep);
        this.setRua(rua);
        this.setBairro(bairro);
    }
    
    public Endereco(String cep, String rua, String bairro, Integer numero) {
        this.setCep(cep);
        this.setRua(rua);
        this.setBairro(bairro);
        this.setNumero(numero);
    }
    
    public Endereco(String cep, String rua, String bairro, Integer numero, String cidade) {
        this.setCep(cep);
        this.setRua(rua);
        this.setBairro(bairro);
        this.setNumero(numero);
        this.setCidade(cidade);
    }
    
    public Endereco(String cep, String rua, String bairro, Integer numero, String cidade, String pais) {
        this.setCep(cep);
        this.setRua(rua);
        this.setBairro(bairro);
        this.setNumero(numero);
        this.setCidade(cidade);
        this.setPais(pais);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        validarNulo(rua, "A RUA não pode ficar em branco");
        validarVazioOuApenasEspacos(rua, "A RUA não pode ficar vazio ou inserir apenas espaços!");
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        validarNulo(cep, "O CEP não pode ficar em branco");
        validarVazioOuApenasEspacos(cep, "O CEP não pode ficar vazio ou inserir apenas espaços!");
        validarSePossuiApenasNumeros(cep, 8, "O CEP não deve conter letras ou caracteres especiais e deve conter apenas 8 caracteres.");
        
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        validarNulo(bairro, "O BAIRRO não pode ficar em branco");
        validarVazioOuApenasEspacos(bairro, "O BAIRRO não pode ficar vazio ou inserir apenas espaços!");
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        validarNulo(numero, "O NÚMERO não pode ficar em branco");
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {        
        return pais;
    }

    public void setPais(String pais) {
        validarNulo(pais, "O PAÍS não pode ficar em branco");
        validarVazioOuApenasEspacos(pais, "O PAÍS não pode ficar vazio ou inserir apenas espaços!");
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Endereco other = (Endereco) obj;
        return Objects.equals(cep, other.cep);
    }

    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", cep=" + cep + ", bairro=" + bairro + ", numero=" + numero + ", cidade=" + cidade + ", pais=" + pais + "]";
    }
       
}

package br.com.contmatic.prova.empresa;

import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarNulo;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarSePossuiApenasNumeros;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarVazioOuApenasEspacos;

import java.math.BigDecimal;
import java.util.Objects;

import br.com.contmatic.prova.endereco.Endereco;

public class Funcionario {

    private String nome;

    private Integer idade;

    private String cargo;    

    private String rg;

    private String cpf;

    private String telefone;

    private Boolean temFilhos;

    private BigDecimal salario;

    private Integer cargaHoraria;

    private Boolean fazHoraExtra;
    
    private Endereco endereco;

    public Funcionario(String cpf) {
        this.setCpf(cpf);
    }
    
    public Funcionario(String cpf, Integer idade) {
        this.setCpf(cpf);
        this.setIdade(idade);
    }
    
    public Funcionario(String cpf, Integer idade, String nome) {
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setNome(nome);
    }
    
    public Funcionario(String cpf, Integer idade, String nome, String cargo) {
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setNome(nome);
        this.setCargo(cargo);
    }
    
    public Funcionario(String cpf, Integer idade, String nome, String cargo, Endereco endereco) {
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setNome(nome);
        this.setCargo(cargo);
        this.setEndereco(endereco);
    }
    
    public Funcionario(String cpf, Integer idade, String nome, String cargo, Endereco endereco, String rg) {
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setNome(nome);
        this.setCargo(cargo);
        this.setEndereco(endereco);
        this.setRg(rg);
    }
    
    public Funcionario(String cpf, Integer idade, String nome, String cargo, Endereco endereco, String rg, String telefone) {
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setNome(nome);
        this.setCargo(cargo);
        this.setEndereco(endereco);
        this.setRg(rg);
        this.setTelefone(telefone);
    }
    
    public Funcionario(String cpf, Integer idade, String nome, String cargo, Endereco endereco, String rg, String telefone, Boolean temFilhos) {
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setNome(nome);
        this.setCargo(cargo);
        this.setEndereco(endereco);
        this.setRg(rg);
        this.setTelefone(telefone);
        this.setTemFilhos(temFilhos);
    }
    public Funcionario(String cpf, Integer idade, String nome, String cargo, Endereco endereco, String rg, String telefone, Boolean temFilhos, BigDecimal salario) {
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setNome(nome);
        this.setCargo(cargo);
        this.setEndereco(endereco);
        this.setRg(rg);
        this.setTelefone(telefone);
        this.setTemFilhos(temFilhos);
        this.setSalario(salario);
    }
    
    public Funcionario(String cpf, Integer idade, String nome, String cargo, Endereco endereco, String rg, String telefone, Boolean temFilhos, BigDecimal salario, Integer cargaHoraria) {
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setNome(nome);
        this.setCargo(cargo);
        this.setEndereco(endereco);
        this.setRg(rg);
        this.setTelefone(telefone);
        this.setTemFilhos(temFilhos);
        this.setSalario(salario);
        this.setCargaHoraria(cargaHoraria);
    }
    
    public Funcionario(String cpf, Integer idade, String nome, String cargo, Endereco endereco, String rg, String telefone, Boolean temFilhos, BigDecimal salario, Integer cargaHoraria, Boolean fazHoraExtra) {
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setNome(nome);
        this.setCargo(cargo);
        this.setEndereco(endereco);
        this.setRg(rg);
        this.setTelefone(telefone);
        this.setTemFilhos(temFilhos);
        this.setSalario(salario);
        this.setCargaHoraria(cargaHoraria);
        this.setFazHoraExtra(fazHoraExtra);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validarNulo(nome, "O NOME n??o pode estar vazio!");
        validarVazioOuApenasEspacos(nome, "O NOME n??o pode estar vazio ou inserido apenas espa??os!");
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        validarNulo(idade, "A IDADE n??o pode estar vazio!");
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        validarNulo(cargo, "O CARGO n??o pode estar vazio!");
        validarVazioOuApenasEspacos(cargo, "O CARGO n??o pode estar vazio ou inserido apenas espa??os!");
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco enderecos) {
        this.endereco = enderecos;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        validarNulo(rg, "O RG n??o pode estar vazio!");
        validarVazioOuApenasEspacos(rg, "O RG n??o pode estar vazio ou inserido apenas espa??os!");
        validarSePossuiApenasNumeros(rg, 8, "O RG n??o deve conter letras ou caracteres especiais!");
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        validarNulo(cpf, "O CPF n??o pode estar vazio!");
        validarVazioOuApenasEspacos(cpf, "O CPF n??o pode estar vazio ou inserido apenas espa??os!");
        validarSePossuiApenasNumeros(cpf, 11, "O CPF n??o deve conter letras ou caracteres especiais!");
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        validarNulo(telefone, "O TELEFONE n??o pode estar vazio!");
        validarVazioOuApenasEspacos(telefone, "O TELEFONE n??o pode estar vazio ou inserido apenas espa??os!");
        validarSePossuiApenasNumeros(telefone, 8, "O TELEFONE n??o deve conter letras ou caracteres especiais!");
        this.telefone = telefone;
    }

    public Boolean getTemFilhos() {
        return temFilhos;
    }

    public void setTemFilhos(Boolean temFilhos) {
        validarNulo(temFilhos, "A op????o TEM FILHOS n??o pode estar vazio!");
        this.temFilhos = temFilhos;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        validarNulo(salario, "O SAL??RIO n??o pode estar vazio!");
        this.salario = salario;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        validarNulo(cargaHoraria, "A CARGA HOR??RIA n??o pode estar vazio!");
        this.cargaHoraria = cargaHoraria;
    }

    public Boolean getFazHoraExtra() {
        return fazHoraExtra;
    }

    public void setFazHoraExtra(Boolean fazHoraExtra) {
        this.fazHoraExtra = fazHoraExtra;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        return Objects.equals(cpf, other.cpf);
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", idade=" + idade + ", cargo=" + cargo + ", endereco=" + endereco + ", rg=" + rg + ", cpf=" + cpf + ", telefone=" + telefone + ", temFilhos=" +
            temFilhos + ", salario=" + salario + ", cargaHoraria=" + cargaHoraria + ", fazHoraExtra=" + fazHoraExtra + "]";
    }
}

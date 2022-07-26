package br.com.contmatic.prova.testes.empresa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.contmatic.prova.empresa.Funcionario;

public class FuncionarioTest {

    Funcionario funcionario;

    @Before
    public void setUp() {
        funcionario = new Funcionario("41932233881");

    }

    @BeforeClass
    public static void setUpAll() {

    }

    @After
    public void tearDown() {
        funcionario = null;

    }

    @AfterClass
    public static void tearDownAll() {

    }

    @Test
    public void deve_criar_objeto_funcionario_com_cpf() {
        String cpf = "41932233881";
        Funcionario funcionario = new Funcionario(cpf);
        assertNotNull(funcionario);
        assertEquals(cpf, funcionario.getCpf());
    }   
    
    // Getters e Setters

    @Test
    public void deve_atribuir_cpf() {
        String cpf = "41932233881";
        funcionario.setCpf(cpf);
        assertEquals(cpf, funcionario.getCpf());
    }
    
    @Test
    public void deve_aceitar_cpf_valido() {
        String cpf = "41932233881";
        funcionario.setCpf(cpf);
        assertEquals(cpf, funcionario.getCpf());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_nulo() {
        funcionario.setCpf(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cpf_vazio() {
        funcionario.setCpf("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cpf_com_espaco() {
        funcionario.setCpf("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cpf_invalido() {
        funcionario.setCpf("99999999999");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cpf_com_caracteres_especiais() {
        funcionario.setCpf("123$#%¨&*");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cpf_com_mais_de_11_numeros() {
        funcionario.setCpf("12345678987456123");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cpf_com_menos_de_11_numeros() {
        funcionario.setCpf("123456789");
        
    }

    @Test
    public void deve_atribuir_idade() {
        Integer idade = 29;
        funcionario.setIdade(idade);
        assertEquals(idade, funcionario.getIdade());
        assertNotNull(funcionario.getCpf());
        assertNull(funcionario.getNome());
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_idade_maior_que_79_anos() {
        funcionario.setIdade(80);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_idade_menor_que_17_anos() {
        funcionario.setIdade(16);
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_idade_nulo() {
        funcionario.setIdade(null);
        
    }   
    

    @Test
    public void deve_atribuir_nome() {
        String nome = "Jhully Handerson";
        funcionario.setNome(nome);
        assertEquals(nome, funcionario.getNome());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_nome_nulo() {
        funcionario.setNome(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_nome_vazio() {
        funcionario.setNome("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_nome_apenas_com_espaco() {
        funcionario.setNome("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_nome_com_numeros() {
        funcionario.setNome("9854459988");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_nome_com_caracteres_especiais() {
        funcionario.setNome(")(*¨&¨¨%%$#@_");
        
    }

    @Test
    public void deve_atribuir_cargo() {
        String cargo = "Designer";
        funcionario.setCargo(cargo);
        assertEquals(cargo, funcionario.getCargo());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cargo_nulo() {        
        funcionario.setCargo(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cargo_vazio() {
        funcionario.setCargo("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cargo_apenas_com_espaco() {
        funcionario.setCargo("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cargo_com_numero() {
        funcionario.setCargo("abcdefgh123");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cargo_com_caracteres_especiais() {
        funcionario.setCargo("123$#%¨&*");
        
    }

    @Test
    public void deve_atribuir_rg() {
        String rg = "001639830";
        funcionario.setRg(rg);
        assertEquals(rg, funcionario.getRg());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_rg_nulo() {
        funcionario.setRg(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_rg_vazio() {
        funcionario.setRg("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_rg_com_espaco() {
        funcionario.setRg("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_rg_invalido() {
        funcionario.setRg("999999999");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_rg_com_caracteres_especiais() {
        funcionario.setRg("3$#%¨&*");
        
    }

    @Test
    public void deve_atribuir_telefone() {
        String telefone = "33600561";        
        funcionario.setTelefone(telefone);
        assertEquals(telefone, funcionario.getTelefone());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_telefone_nulo() {
        funcionario.setTelefone(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_telefone_vazio() {
        funcionario.setTelefone("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_telefone_com_espaco() {
        funcionario.setTelefone("  ");
        
    }   
        
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_telefone_com_caracteres_especiais() {
        funcionario.setTelefone("123$#%¨&*");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_telefone_com_mais_de_8_numeros() {
        funcionario.setTelefone("12345678987456123");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_telefone_com_menos_de_8_numeros() {
        funcionario.setTelefone("123456");
        
    }

    @Test
    public void deve_atribuir_tem_filhos() {
        Boolean temFilhos = true;
        funcionario.setTemFilhos(temFilhos);
        assertEquals(temFilhos, funcionario.getTemFilhos());
    }

    @Test
    public void deve_atribuir_salario() {
        BigDecimal salario = BigDecimal.valueOf(4000);
        funcionario.setSalario(salario);
        assertEquals(salario, funcionario.getSalario());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_salario_nulo() {        
        funcionario.setSalario(null);        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_salario_menor_que_salario_minimo() {
        funcionario.setIdade(1211);
        
    }

    @Test
    public void deve_atribuir_carga_horaria() {
        Integer cargaHoraria = 40;
        funcionario.setCargaHoraria(cargaHoraria);
        assertEquals(cargaHoraria, funcionario.getCargaHoraria());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_carga_horaria_nulo() {        
        funcionario.setCargaHoraria(null);        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_carga_horaria_maior_que_44() {
        funcionario.setCargaHoraria(45);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_carga_horaria_menor_que_30() {
        funcionario.setCargaHoraria(29);
        
    }

    @Test
    public void deve_atribuir_se_faz_hora_extra() {
        Boolean fazHoraExtra = true;
        funcionario.setFazHoraExtra(fazHoraExtra);
        assertEquals(fazHoraExtra, funcionario.getFazHoraExtra());
    }
}

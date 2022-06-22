package br.com.contmatic.prova.testes.endereco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.contmatic.prova.endereco.Endereco;

public class EnderecoTest {
    
    Endereco endereco;
    
    @Before
    public void setUp() {
        endereco = new Endereco("02013080");

    }

    @BeforeClass
    public static void setUpAll() {

    }

    @After
    public void tearDown() {
        endereco = null;

    }

    @AfterClass
    public static void tearDownAll() {

    }

    @Test
    public void deve_criar_objeto_cep_do_endereco() {
        String cep = "02013080";
        Endereco endereco = new Endereco(cep);
        assertNotNull(endereco);
        assertEquals(cep, endereco.getCep());
    }
    
    // Getters e Setters
    
    @Test
    public void deve_atribuir_cep() {
        String cep = "02013080";
        endereco.setCep(cep);
        assertEquals(cep, endereco.getCep());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cep_nulo() {
        endereco.setCep(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cep_vazio() {
        endereco.setCep("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cep_com_espaco() {
        endereco.setCep("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cep_com_caracteres_especiais() {
        endereco.setCep("123$#%¨&*");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cep_com_mais_de_8_numeros() {
        endereco.setCep("12345678987456123");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cep_com_menos_de_8_numeros() {
        endereco.setCep("1234567");
        
    }
    
    @Test
    public void deve_atribuir_rua() {
        String rua = "Alameda Afonso Shimidt";
        endereco.setRua(rua);
        assertEquals(rua, endereco.getRua());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_rua_nulo() {
        endereco.setRua(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_rua_vazio() {
        endereco.setRua("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_rua_com_espaco() {
        endereco.setRua("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_rua_com_caracteres_especiais() {
        endereco.setRua("123$#%¨&*");
        
    }
    
    @Test
    public void deve_atribuir_bairro() {
        String bairro = "Santa Terezinha";
        endereco.setBairro(bairro);
        assertEquals(bairro, endereco.getBairro());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_bairro_nulo() {
        endereco.setBairro(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_bairro_vazio() {
        endereco.setBairro("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_bairro_com_espaco() {
        endereco.setBairro("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_bairro_com_caracteres_especiais() {
        endereco.setBairro("123$#%¨&*");
        
    }
    
    @Test
    public void deve_atribuir_numero() {
        Integer numero = 291;
        endereco.setNumero(numero);
        assertEquals(numero, endereco.getNumero());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_numero_nulo() {
        endereco.setNumero(null);
        
    }
    
    @Test
    public void deve_atribuir_cidade() {
        String cidade = "São Paulo";
        endereco.setCidade(cidade);
        assertEquals(cidade, endereco.getCidade());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cidade_nulo() {
        endereco.setCidade(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cidade_vazio() {
        endereco.setCidade("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cidade_com_espaco() {
        endereco.setCidade("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cidade_com_caracteres_especiais() {
        endereco.setCidade("123$#%¨&*");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cidade_com_numero() {
        endereco.setCidade("123456789");
        
    }
    
    @Test
    public void deve_atribuir_pais() {
        String pais = "Brasil";
        endereco.setPais(pais);
        assertEquals(pais, endereco.getPais());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_pais_nulo() {
        endereco.setPais(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_pais_vazio() {
        endereco.setPais("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_pais_com_espaco() {
        endereco.setPais("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_pais_com_caracteres_especiais() {
        endereco.setPais("123$#%¨&*");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_pais_com_numero() {
        endereco.setPais("123456789");
        
    }
    
}

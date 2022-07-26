package br.com.contmatic.prova.testes.empresa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.contmatic.prova.empresa.Empresa;

public class EmpresaTest {

    Empresa empresa;

    @Before
    public void setUp() {
        empresa = new Empresa("51480959000102");
        
    }
    
    @BeforeClass
    public static void setUpAll() {
       
    }

    @After
    public void tearDown() {
        empresa = null;
        
    }
    
    @AfterClass
    public static void tearDownAll() {
        
    }

    // Testes reais:

    @Test
    public void deve_criar_objeto_empresa_com_cnpj() {
        String cnpj = "51480959000102";
        Empresa empresa = new Empresa(cnpj);
        assertNotNull(empresa);
        assertEquals(cnpj, empresa.getCnpj());
    }

    // Getters e Setters
    
    @Test
    public void deve_atribuir_cnpj() {
        String cnpj = "987654321000";
        empresa.setCnpj(cnpj);
        assertEquals(cnpj, empresa.getCnpj());

    }
    
    @Test
    public void deve_aceitar_cnpj_valido() {
        String cnpj = "89999397000180";
        empresa.setCnpj(cnpj);
        assertEquals(cnpj, empresa.getCnpj());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cnpj_nulo() {        
        empresa.setCnpj(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cnpj_invalido() {
        empresa.setCnpj("99999999999999");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cnpj_vazio() {
        empresa.setCnpj("");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cnpj_apenas_com_espaco() {
        empresa.setCnpj("  ");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cnpj_com_letra() {
        empresa.setCnpj("abcdefgh123");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cnpj_com_caracteres_especiais() {
        empresa.setCnpj("123$#%¨&*");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cnpj_com_mais_de_14_numeros() {
        empresa.setCnpj("12345678987456123");
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_cnpj_com_menos_de_14_numeros() {
        empresa.setCnpj("123456789");
        
    }
    
    @Test
    public void deve_atribuir_razao_social() {
        String razaoSocial = "Arcos Dourados";
        empresa.setRazaoSocial(razaoSocial);
        assertEquals(razaoSocial, empresa.getRazaoSocial());
        assertNotNull(empresa.getCnpj());
        assertNull(empresa.getNomeFantasia());
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_razao_social_com_caracteres_especiais() {
        empresa.setRazaoSocial(")(*¨&¨¨%%$#@_");
        
    }    
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_razao_social_nulo() {        
        empresa.setRazaoSocial(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_razao_social_apenas_com_espaco() {
        empresa.setRazaoSocial("  ");
        
    }    

    @Test
    public void deve_atribuir_nome_fantasia() {
        String nomeFantasia = "Mc Donalds";
        empresa.setNomeFantasia(nomeFantasia);
        assertEquals(nomeFantasia, empresa.getNomeFantasia());

    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_nome_fantasia_nulo() {        
        empresa.setNomeFantasia(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_nome_fantasia_apenas_com_espaco() {
        empresa.setNomeFantasia("  ");
        
    } 

    @Test
    public void deve_atribuir_email() {
        String email = "mcdonalds@mc.com.br";
        empresa.setEmail(email);
        assertEquals(email, empresa.getEmail());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_email_nulo() {        
        empresa.setEmail(null);
        
    }
    
    @Test(expected = IllegalStateException.class)
    public void nao_deve_aceitar_email_apenas_com_espaco() {
        empresa.setEmail("  ");
        
    } 

    @Test
    public void deve_atribuir_capital_social() {
        BigDecimal capitalSocial = BigDecimal.valueOf(10000000.00);
        empresa.setCapitalSocial(capitalSocial);
        assertEquals(capitalSocial, empresa.getCapitalSocial());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_capital_social_nulo() {        
        empresa.setCapitalSocial(null);
        
    }   
   
    @Test
    public void deve_atribuir_data_abertura() {
        LocalDate dataAbertura = LocalDate.of(2010, 05, 21);
        empresa.setDataAbertura(dataAbertura);
        assertEquals(dataAbertura, empresa.getDataAbertura());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_data_de_abertura_nulo() {        
        empresa.setDataAbertura(null);
        
    }
}

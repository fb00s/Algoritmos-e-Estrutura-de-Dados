package com.aula.models.mapadispersao;

import com.aula.models.Aluno;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucas
 */
public class MapaDispersaoTest {
    
    @Test
    public void testInsercaoERecuperacaoDeElementoNoMapaDeDispersao() {
        var aluno = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        var mapaDispersao = new MapaDispersao<Aluno>(53);
        
        mapaDispersao.inserir(aluno.getMatricula(), aluno);
        var busca = mapaDispersao.buscar(aluno.getMatricula());
        assertEquals(busca, aluno);
    }
    
    @Test
    public void testInsercaoEMultiplaRecuperacaoDeObjetosNoMapaDeDispersao() {
        var aluno1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        var aluno2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
        var aluno3 = new Aluno(12500, "Marta", LocalDate.of(2001, 2, 18));
        var aluno4 = new Aluno(13000, "Lucas", LocalDate.of(1998, 11, 25));
        
        var mapaDispersao = new MapaDispersao<Aluno>(53);
        
        mapaDispersao.inserir(aluno1.getMatricula(), aluno1);
        mapaDispersao.inserir(aluno2.getMatricula(), aluno2);
        mapaDispersao.inserir(aluno3.getMatricula(), aluno3);
        mapaDispersao.inserir(aluno4.getMatricula(), aluno4);
        
        var busca1 = mapaDispersao.buscar(aluno1.getMatricula());
        var busca2 = mapaDispersao.buscar(aluno2.getMatricula());
        var busca3 = mapaDispersao.buscar(aluno3.getMatricula());
        var busca4 = mapaDispersao.buscar(aluno4.getMatricula());
        
        assertEquals(busca1, aluno1);
        assertEquals(busca2, aluno2);
        assertEquals(busca3, aluno3);
        assertEquals(busca4, aluno4);
    }
    
    @Test
    public void testInsercaoEBuscaComColisoesNoMapaDeDispersao() {
        var aluno1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        var aluno2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
        var aluno3 = new Aluno(14226, "Marta", LocalDate.of(2001, 2, 18));
        var aluno4 = new Aluno(17180, "Lucas", LocalDate.of(1998, 11, 25));
        
        var mapaDispersao = new MapaDispersao<Aluno>(53);
        
        mapaDispersao.inserir(aluno1.getMatricula(), aluno1);
        mapaDispersao.inserir(aluno2.getMatricula(), aluno2);
        mapaDispersao.inserir(aluno3.getMatricula(), aluno3);
        mapaDispersao.inserir(aluno4.getMatricula(), aluno4);
        
        var busca1 = mapaDispersao.buscar(aluno1.getMatricula());
        var busca2 = mapaDispersao.buscar(aluno2.getMatricula());
        var busca3 = mapaDispersao.buscar(aluno3.getMatricula());
        var busca4 = mapaDispersao.buscar(aluno4.getMatricula());
        
        assertEquals(busca1, aluno1);
        assertEquals(busca2, aluno2);
        assertEquals(busca3, aluno3);
        assertEquals(busca4, aluno4);
    }

    /**
     * Test of remover method, of class MapaDispersao.
     */
    @Test
    public void testRemover() {
        System.out.println("remover");
        int chave = 0;
        MapaDispersao instance = null;
        instance.remover(chave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class MapaDispersao.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int chave = 0;
        MapaDispersao instance = null;
        Object expResult = null;
        Object result = instance.buscar(chave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularFatorCarga method, of class MapaDispersao.
     */
    @Test
    public void testCalcularFatorCarga() {
        System.out.println("calcularFatorCarga");
        MapaDispersao instance = null;
        double expResult = 0.0;
        double result = instance.calcularFatorCarga();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

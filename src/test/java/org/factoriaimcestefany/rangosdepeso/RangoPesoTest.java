package org.factoriaimcestefany.rangosdepeso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RangoPesoTest {

    @Test
    public void testDelgadezSevera() {
    
        PesoTotal pesoTotal = new PesoTotal(45, 170);

    
        String categoria = pesoTotal.getCategoria();

    
        assertEquals("Delgadez Severa", categoria);
    }

    @Test
    public void testDelgadezModerada() {
    
        PesoTotal pesoTotal = new PesoTotal(48, 170);

        
        String categoria = pesoTotal.getCategoria();

    
        assertEquals("Delgadez Moderada", categoria);
    }

    @Test
    public void testDelgadezLeve() {

        PesoTotal pesoTotal = new PesoTotal(52, 170);

    
        String categoria = pesoTotal.getCategoria();

        
        assertEquals("Delgadez Leve", categoria);
    }

    @Test
    public void testPesoNormal() {
    
        PesoTotal pesoTotal = new PesoTotal(65, 170);

    
        String categoria = pesoTotal.getCategoria();

        
        assertEquals("Peso Normal", categoria);
    }

    @Test
    public void testPesoNormalLimiteSuperior() {

    PesoTotal pesoTotal = new PesoTotal(75, 180);

    String categoria = pesoTotal.getCategoria();

    assertEquals("Peso Normal", categoria);
}


    @Test
    public void testSobrepeso() {
    
        PesoTotal pesoTotal = new PesoTotal(80, 170);

        String categoria = pesoTotal.getCategoria();

    
        assertEquals("Sobrepeso", categoria);
    }

    @Test
    public void testObesidadModerada() {
    
        PesoTotal pesoTotal = new PesoTotal(95, 170);

        
        String categoria = pesoTotal.getCategoria();


        assertEquals("Obesidad Moderada", categoria);
    }

    @Test
    public void testObesidadSevera() {
    
        PesoTotal pesoTotal = new PesoTotal(110, 170);

    
        String categoria = pesoTotal.getCategoria();

    
        assertEquals("Obesidad Severa", categoria);
    }

    @Test
        public void testObesidadMorbida() {
            
            PesoTotal pesoTotal = new PesoTotal(130, 170);
    
            
            String categoria = pesoTotal.getCategoria();
    
        
            assertEquals("Obesidad Mórbida", categoria);
        }
    
        @Test
        public void testObesidadMorbidaLimiteInferior() {
        
            PesoTotal pesoTotal = new PesoTotal(120, 173);
        
            String categoria = pesoTotal.getCategoria();
            
            assertEquals("Obesidad Mórbida", categoria);
        }
        
        @Test
        public void testObesidadMorbidaValorIntermedio() {
            
            PesoTotal pesoTotal = new PesoTotal(130, 165);
        
            String categoria = pesoTotal.getCategoria();
            
            assertEquals("Obesidad Mórbida", categoria);
        }
            
    }



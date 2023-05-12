/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cadenainvertida;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CadenaInvertidaTest {
    
    public CadenaInvertidaTest() {
    }

    @Test (expected = NullPointerException.class)
    public void testInvertirCadena() {
        assertEquals("", CadenaInvertida.invertirCadena(""));
        assertEquals("a", CadenaInvertida.invertirCadena("a"));
        assertEquals("ba", CadenaInvertida.invertirCadena("ab"));
        assertEquals("abc", CadenaInvertida.invertirCadena("cba"));
        assertEquals("abc def", CadenaInvertida.invertirCadena("fed cba"));
        assertEquals("erthdthhsrthrtt", CadenaInvertida.invertirCadena("ttrhtrshhtdhtre"));
        System.out.println("Referencia. Cadena nula");
        String original = null;
        CadenaInvertida.invertirCadena(original);
    }
    
}

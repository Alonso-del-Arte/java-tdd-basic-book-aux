/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alonso del Arte
 */
public class HelloWorldTest {
    
    /**
     * Test of greeting method, of class HelloWorld.
     */
    @Test
    public void testGreeting() {
        System.out.println("greeting");
        String expected = "Hello, world!";
        String actual = HelloWorld.greeting();
        assertEquals(expected, actual);
    }
    
}

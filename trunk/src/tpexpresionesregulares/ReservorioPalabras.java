/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package tpexpresionesregulares;

import java.util.LinkedHashMap;

/**
 *
 * @author Agus
 */

public class ReservorioPalabras {
    LinkedHashMap lhm = new LinkedHashMap();
    
    public ReservorioPalabras(){
        lhm.put('=', "Igual");
        lhm.put('[', "Corchete Que Abre");
        lhm.put(']', "Corchete Que Cierra");
        lhm.put('{', "Llave Que Abre");
        lhm.put('}', "Llave Que Cierra");
        lhm.put('.', "Punto");
        lhm.put('*', "Asterisco");
        lhm.put('+', "Mas");
        lhm.put('?', "Signo De Pregunta");
        lhm.put('\\', "Barra Invertida");
        lhm.put('-', "Menos");
        lhm.put('(', "Parentesis Que Abre");
        lhm.put(')', "Parentesis Que Cierra");
        lhm.put('^', "Elevar");
        lhm.put('|', "Pipe");
        lhm.put('$', "Pesos");
        //lhm.put("\\d", "Cadena De Digito");
        //lhm.put("\\w", "Cadena De Caracteres");
        lhm.put('<', "Menor");
        lhm.put('>', "Mayor");
        lhm.put('&', "Andpersant");
        
    }
    public boolean esReservada(char caracter)
    {
        return lhm.containsKey(caracter);
    }

    public String significado(char caracter)
    {
        return lhm.get(caracter).toString();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpexpresionesregulares;

import java.util.StringTokenizer;

/**
 *
 * @author Agus
 */
public class AnalizadorLexico {

    private TablaSimbolos table = new TablaSimbolos();

    private ObjetoAnalizado oAnalizado = new ObjetoAnalizado();

    private ReservorioPalabras reservada=new ReservorioPalabras();

    public void analizeString(String input){
        StringTokenizer tokens = new StringTokenizer(input);
        String token = "";
        char caracter = '0';
        int cont = 0;
        while (tokens.hasMoreTokens()){
            token = tokens.nextToken();
            cont = token.length();
            table.initCharString(cont);
            oAnalizado.initArrays(cont);
            for(int i=0;i<cont;i++){
                caracter = token.charAt(i);
                System.out.println(reservada.esReservada(caracter));
                if(reservada.esReservada(caracter)){
                    table.setCharacter(caracter, reservada.significado(caracter));
                }else{
                //Guardar en tabla de simbolos
                    table.setCharacter(caracter,"Caracter");
                }
            }
            System.out.print(table.getAllSymbols());
        }
        
    }

}

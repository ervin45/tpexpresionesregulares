/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpexpresionesregulares;

/**
 *
 * @author Agus
 */
public class TablaSimbolos {
    private char[] ids;
    private String[] significado;
    private int counter = 0;

    public void initCharString(int cant){
        ids = new char[cant];
        significado = new String[cant];
    }

    public void setCharacter(char caracter,String signif){
        ids[counter] = caracter;
        significado[counter] = signif;
        incrementarCounter();
    }

    public String getAllSymbols(){
        String cadena="";
        int cont = ids.length;
        for(int i=0;i<cont;i++){
            cadena = cadena + "<" + ids[i] + ";" + significado[i] + ">\n";
        }
        return cadena;
    }

    private void incrementarCounter(){
        this.counter = this.counter + 1;
    }
}

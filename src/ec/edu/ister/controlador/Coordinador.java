/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Operaciones;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB2-PC
 */
public class Coordinador {
    Scanner entrada=new Scanner(System.in);
    Operaciones objOperaciones=new Operaciones();
    
    public String opcionesMenu(){
        String ob= JOptionPane.showInputDialog("Ingresa una opcion:\n"
            + "1.- Suma\n"
            + "2.- Resta\n"
            + "3.- Muliplicacion\n"
            + "4.- División\n"
            + "5.- Salir\n");
        return ob;
    }
    
    
    public void menuScanner(){
        String op="";
        do{
            op=opcionesMenu();
            switch(op){
                case "1":
                    objOperaciones.suma();
                    break;
                case "2":
                    objOperaciones.resta();
                    break;
                case "3":
                    objOperaciones.multiplicacion();
                    break;
                 case "4":
                    objOperaciones.division();
                    break;
            }
            
        }while(!op.equals("5"));
    }
    
}

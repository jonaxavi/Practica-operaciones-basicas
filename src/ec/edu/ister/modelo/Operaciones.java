/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB2-PC
 */
public class Operaciones {
    double n1, n2, r;     

    public Operaciones() {
    }

    public Operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public Double suma(){  
      n1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));         	
      n2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
      r= n1+n2;
      JOptionPane.showInputDialog("La Suma Es: "+ String.valueOf(r));               
        return r;
    }
    
    public Double resta(){     
      n1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));         	
      n2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
      r= n1-n2;
      JOptionPane.showInputDialog("La Resta Es: "+ String.valueOf(r));               
      return r;   
    }
        
     public Double multiplicacion(){
      n1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));         	
      n2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
      r= n1*n2;
      JOptionPane.showInputDialog("La Resta Es: "+ String.valueOf(r));               
      return r;   
    }
        
     public Double division(){
      n1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));         	
      n2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
      r= n1/n2;
      JOptionPane.showInputDialog("La Division Es: "+ String.valueOf(r));               
      return r;   
    }
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebruh;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author DELL
 */
public class Testclass {
    private String[] test = {"","",""};
    private ArrayList<String> ola = new ArrayList<>();
    
    public String[] ObtenerNotas(){
        return test;
    }
    
    public void esencial(String[] x){
        this.test = x;
    }
    public void agregar(String a){
        ola.add(a);
    }
    
    public ArrayList<String> getLista(){
        return ola;
    }
    public void agregarNotas(String n){
        for(int i=0; i<3; i++){
            if(test[i].equals("")){
                System.out.println("bruh");
                test[i] = n;
                return;
            }
        }
    }
    
    public void print(){
        for(int i= 0; i<3; i++){
            System.out.println(test[i]);
        }
    }
    public String tiempo(JComboBox cb){
        String tiempo = "Error";
        
        int x = Integer.parseInt(cb.getItemAt(cb.getSelectedIndex()).toString());
        
        System.out.println(x);
        
        return tiempo;
    }
}

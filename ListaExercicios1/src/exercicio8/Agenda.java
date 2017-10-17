/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.util.ArrayList;

/**
 *
 * @author mauricio
 */
public class Agenda {
    ArrayList<RegistroAgenda> lista;
    
    public Agenda(){
        lista = new ArrayList();
    }
    
    public void adicionar(RegistroAgenda reg){
        lista.add(reg);          
    }
    
    public void remover (RegistroAgenda reg){
        lista.remove(reg);
    }
    
    public void listar(){
        for (RegistroAgenda reg : lista){
            System.out.println(reg);
        }
    }
    
}

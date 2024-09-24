/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class RegistroDAO {
    private static ArrayList<RegistroDTO> lista; 
//Se coloca estatico para que los datos no dependan de sus instancias, le pertenece a la clase no al objeto    
    public RegistroDAO(){
        if(RegistroDAO.lista == null){
            RegistroDAO.lista = new ArrayList<>();
        }
    }
    
    
    public void insertar(RegistroDTO nuevo){
        if(nuevo != null){
            RegistroDAO.lista.add(nuevo);
        }
    }
    
    public ArrayList<RegistroDTO> leer(){
        return RegistroDAO.lista;
    }
}

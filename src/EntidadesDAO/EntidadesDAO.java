/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesDAO;

import Entidades.Visitante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author piero
 */
public class EntidadesDAO {
    private List<Visitante> usuarios;

    public EntidadesDAO() {
        usuarios = new ArrayList<>();
    }
    
    public int buscar(String userid) {
        int n=-1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUserid().equals(userid)){
                n=i;
                break;
            }
        }
        return n;
    }
    
    public boolean insertar(Visitante userid){
         if (buscar (userid.getUserid())==-1) {
            usuarios.add(userid);
            return true;
        }else{
            return false;         
         }
    }
    
    public boolean modificar(Visitante userid){
       if (buscar (userid.getUserid())!=-1) {
            Visitante useridaux = obtener(userid.getUserid());
            
            useridaux.setContraseña(userid.getContraseña());
            useridaux.setEmail(userid.getEmail());
            useridaux.setNombre(userid.getNombre());
            useridaux.setApellido(userid.getApellido());
            useridaux.setDni(userid.getDni());
            return true;
        }else{
            return false;         
         }
    }
    
    public boolean eliminar(String userid){
   if (buscar (userid) !=-1) {
           
            usuarios.remove(buscar(userid));
            return true;
            
        }else{
            return false;         
         }
    }
    
    public Visitante obtener(String userid){
         if (buscar(userid)!=-1){
              return usuarios.get(buscar(userid));        
         }else{
            return null;       
         }
    }
}

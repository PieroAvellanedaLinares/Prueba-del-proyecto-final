/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesLogic;

import Entidades.Visitante;
import EntidadesDAO.EntidadesDAO;

/**
 *
 * @author piero
 */
public class EntidadesLogic {
    private static EntidadesDAO entidadesDAO = new EntidadesDAO();
    
    public static boolean autentificar(String userid, String contraseña){
        if(obtener(userid)!=null){
             Visitante visitanteconsulta = obtener(userid);
            if (visitanteconsulta.getUserid().equals(userid)&&
                visitanteconsulta.getContraseña().equals(contraseña)){
                 return true;           
            }else{
                 return false;           
            }
        }else{
             return false;
        }
    }
    
    public static boolean insertar(Visitante userid){
        return entidadesDAO.insertar(userid);
    }
    
    public static boolean modificar(Visitante userid){
        return entidadesDAO.modificar(userid);
    }
    
    public static boolean eliminar(String userid){
       return entidadesDAO.eliminar(userid);
    }
    
    public static Visitante obtener (String userid){
       return entidadesDAO.obtener(userid);
    }
    
    
    
    
}

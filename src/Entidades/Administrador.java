package Entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author piero
 */
public class Administrador extends Usuario {
    private String adminnombre;

    public Administrador(String adminnombre, String userid, 
            String contraseña, String email) {
        super(userid, contraseña, email);
        this.adminnombre = adminnombre;
    }

    
   

    public String getAdminnombre() {
        return adminnombre;
    }

    public void setAdminnombre(String adminnombre) {
        this.adminnombre = adminnombre;
    }

 
}

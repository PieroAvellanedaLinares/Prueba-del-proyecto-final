package Entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author piero
 */
public class Visitante extends Usuario {
    private String nombre;
    private String apellido;
    private String dni;

    public Visitante(String nombre, 
            String numero, 
            String dni, 
            String userid, String contraseña, String email) {
        super(userid, contraseña, email);
        this.nombre = nombre;
        this.apellido = numero;
        this.dni = dni;
    }

   

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
  

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}

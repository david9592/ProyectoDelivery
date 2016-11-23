package com.deliverys.modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

@Entity
@Table/*(name= "usuario")*/
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int id;
    private Calendar fecha;
    private String nombre;
    private String apellido;
    private String password;
    private int tarjeta;

    public Usuario() {
    }

    public Usuario(Calendar fecha, String nombre, String apellido, String password, int tarjeta) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.tarjeta = tarjeta;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }
}
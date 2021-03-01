/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Tipo.TipoUsuario;

/**
 *
 * @author Usuario
 */
public class Cliente extends Usuario {

    private long identificacion;
    private String nombre, sNombre, apellido, sApellido, correo;
    private int telefono;

    public Cliente(long id, String nombre, String sNombre, String apellido, String sApellido, String correo, int telefono,String clave,boolean estado,TipoUsuario tipo) {
        super(id, clave, estado, tipo);
        this.identificacion = id;
        this.nombre = nombre;
        this.sNombre = sNombre;
        this.apellido = apellido;
        this.sApellido = sApellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
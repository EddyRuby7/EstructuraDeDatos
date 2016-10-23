/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicativoFundacion;

/**
 *
 * @author USUARIO
 */
public class RegistroFamilia {
    //Declaracion de atributos
    private int codigo;
    private String nombre_familia;
    private String sector;
    private String direccion;
    private int telefono;

    //Constructores
    public RegistroFamilia() {
    }

    public RegistroFamilia(int codigo, String nombre_familia, String sector, String direccion, int telefono) {
        this.codigo = codigo;
        this.nombre_familia = nombre_familia;
        this.sector = sector;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    

    //Getter and Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_familia() {
        return nombre_familia;
    }

    public void setNombre_familia(String nombre_familia) {
        this.nombre_familia = nombre_familia;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Registro de Familia{" + " codigo=" + codigo +  ", Familia=" + nombre_familia + ", sector=" + sector 
                + ", direccion=" + direccion + ", telefono= "+ telefono +'}';
    }
    
    
}

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
public class RegistroDatos {
    //Declaracion de atributos
    private String nombre;
    private String apellido;
    private int cedula;
    private int dia_Nacimiento;
    private int mes_Nacimiento;
    private int anio_Nacimiento;

    //Constructores
    public RegistroDatos() {
    }

    public RegistroDatos(String nombre, String apellido, int cedula, int dia_Nacimiento, int mes_Nacimiento, int anio_Nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.dia_Nacimiento = dia_Nacimiento;
        this.mes_Nacimiento = mes_Nacimiento;
        this.anio_Nacimiento = anio_Nacimiento;
    }
    
    //Getter and Setter
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getDia_Nacimiento() {
        return dia_Nacimiento;
    }

    public void setDia_Nacimiento(int dia_Nacimiento) {
        this.dia_Nacimiento = dia_Nacimiento;
    }

    public int getMes_Nacimiento() {
        return mes_Nacimiento;
    }

    public void setMes_Nacimiento(int mes_Nacimiento) {
        this.mes_Nacimiento = mes_Nacimiento;
    }

    public int getAnio_Nacimiento() {
        return anio_Nacimiento;
    }

    public void setAnio_Nacimiento(int anio_Nacimiento) {
        this.anio_Nacimiento = anio_Nacimiento;
    }
    
    @Override
    public String toString() {
        return "Datos{" + ", nombre:" + nombre + ", apellido: " + apellido 
                + ", N° de Cedula: " + cedula + "\nFecha de Nacimiento: "+ dia_Nacimiento+"/"+mes_Nacimiento+"/"+
                anio_Nacimiento+'}';
    }
    
}

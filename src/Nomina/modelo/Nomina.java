package Nomina.modelo;

import java.util.Date;

public class Nomina {
	
	private String codigo;
	private String cedula;
	private String nombre;
	private String nacimiento;
	private String ingreso;
	private String retiro;
	
	

	
	public Nomina(String codigo, String cedula, String nombre, String nacimiento, String ingreso, String retiro) {
		super();
		this.codigo = codigo;
		this.cedula = cedula;
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.ingreso = ingreso;
		this.retiro = retiro;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getIngreso() {
		return ingreso;
	}
	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}
	public String getRetiro() {
		return retiro;
	}
	public void setRetiro(String retiro) {
		this.retiro = retiro;
	}
	

	

}

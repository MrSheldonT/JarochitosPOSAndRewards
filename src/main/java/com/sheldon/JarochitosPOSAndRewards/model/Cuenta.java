package com.sheldon.JarochitosPOSAndRewards.model;
public class Cuenta{

	private String nombre ;
	private String correoElectronico ;
	private String contrasenia ;

	Cuenta(String nombre, String correoElectronico, String contrasenia){
		this.nombre = nombre ;
		this.correoElectronico = correoElectronico ;
		this.contrasenia = contrasenia ;
	}
	public void actualizarPerfil(Cuenta cuenta){
		this. nombre = cuenta.nombre ;
		this.correoElectronico = cuenta.correoElectronico ;
		this. contrasenia = cuenta.contrasenia ;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean verificarCredenciales(String correoElectronico, String contrasenia){
		return this.contrasenia.equals(contrasenia) && this.correoElectronico.equals(correoElectronico);
	}

}

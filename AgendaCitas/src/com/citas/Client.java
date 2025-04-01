package com.citas;

public class Client 
{
	private String DNI;
	private String Nombre;
	private String Apellido;
	private String Telefono;
	
	public Client(String DNI, String nombre, String apellido, String telefono) 
	{
		this.DNI = DNI;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Telefono = telefono;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
}

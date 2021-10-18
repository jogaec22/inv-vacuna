package com.inv.reto.vo;

public class PacienteVo {

	private Long id;
	private String cedula;
	private String nombres;
	private String apellidos;
	private String correo;

	private String fecha_nacimineto;
	private String direccion;
	private String telefono;
	private String estado;
	private String tipoVacuna;

	public Long getId() {
		return id;
	}

	public String getFecha_nacimineto() {
		return fecha_nacimineto;
	}

	public void setFecha_nacimineto(String fecha_nacimineto) {
		this.fecha_nacimineto = fecha_nacimineto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoVacuna() {
		return tipoVacuna;
	}

	public void setTipoVacuna(String tipoVacuna) {
		this.tipoVacuna = tipoVacuna;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}

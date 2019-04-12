package com.sophos.clases;

import org.openqa.selenium.WebDriver;

public class SearchModel {
	private WebDriver driver;
	private String tipo;
	private String categoria;
	private String transaccion;
	private String ubicacion;
	private String departamento;
	private String ciudad;
	private String sector;
	
	public SearchModel(String tipo, String categoria, String transaccion, String ubicacion) {
		super();
		this.tipo = tipo;
		this.categoria = categoria;
		this.transaccion = transaccion;
		this.ubicacion = ubicacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public SearchModel() {
		super();
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTransaccion() {
		return transaccion;
	}
	public void setTransaccion(String transaccion) {
		this.transaccion = transaccion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
}

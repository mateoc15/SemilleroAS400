package co.com.fincaraiz.qa.screenplayfincaraiz.models;


public class SearchModel {
	private String tipo;
	private String categoria;
	private String transaccion;
	private String ubicacion;

	
	public SearchModel(String tipo, String categoria, String transaccion, String ubicacion) {
		super();
		this.tipo = tipo;
		this.categoria = categoria;
		this.transaccion = transaccion;
		this.ubicacion = ubicacion;
	}
	
	
	public SearchModel() {
		super();
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
	
}

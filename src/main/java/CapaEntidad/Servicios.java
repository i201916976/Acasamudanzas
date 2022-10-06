package CapaEntidad;

public class Servicios {

	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	
	
	public Servicios() {
		}


	public Servicios(String cliente, String fecha, String moneda, double monto, String servicio) {
		
		this.cliente = cliente;
		this.fecha = fecha;
		this.moneda = moneda;
		this.monto = monto;
		this.servicio = servicio;
	}


	private String cliente;
	private String fecha;
	private String moneda;
	private double monto;
	private String servicio;
	
}

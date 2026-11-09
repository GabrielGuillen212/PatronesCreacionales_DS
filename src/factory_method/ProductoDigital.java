package factory_method;

import singleton.ConexionBD;

public class ProductoDigital implements Producto {
	private double TamanoMB;
	private String formato;

	public ProductoDigital(double tammanoMB, String formato) { }

	@Override 
	public void mostrarDetalles() { }

	@Override 
	public void guardarEnBaseDatos(ConexionBD bd) { } 
}

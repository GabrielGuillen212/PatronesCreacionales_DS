package factory_method;

import singleton.ConexionBD;

public class ProductoFisico implements Producto {
	private double peso;
private String dimensiones;

public ProductoFisico(double peso, String dimensiones) { }
	
@Override
public void mostrarDetalles() { }

@Override
public void guardarEnBaseDatos (ConexionBD bd) { }
}


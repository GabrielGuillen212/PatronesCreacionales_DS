package factory_method;

import singleton.ConexionBD;

public interface Producto{
	public void mostrarDetalles();
	public void guardarEnBaseDatos(ConexionBD bd);
}


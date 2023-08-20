package test;

public class asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		if (color =="rojo"||color =="verde"||color =="amarillo"||color =="negro"||color =="blanco") {
			this.color=color;
		}
	}
}

package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	int cantidadAsientos() {
		int numeroAsientos = 0;
		
		for (int x = 0 ; x < asientos.length; x ++) {
			if (asientos[x] != null) {
				numeroAsientos ++;
			}
		}
		return numeroAsientos;
	}
	
	String verificarIntegridad() {
		if (this.registro == this.motor.registro) {
			for (int x = 0; x< asientos.length; x ++) {
				if (asientos[x]!= null){
					if(asientos[x].registro != this.registro) {
						return "Las piezas no son originales";
					}else {
							return "Auto original";
					}
				}
			} 	
		}
		return "las piezas no son originales";
		}
	}


package logica;

public class TMB {
	// Método para calcular la Tasa Metabólica Basasl (TMB)
	public static double calcularTMB(Persona persona) throws Exception {
		// Guardar los atributos de la persona que usaremos para el cálculo en variables locales
        String genero = persona.getGenero().toLowerCase();
        double peso = persona.getPeso();
        double altura = persona.getAltura();
        int edad = persona.getEdad();
        // Variable para guardar el resultado del cálculo
        double tmb = 0;
        // Cálculo de la TMB para hombres según el genero en los rangos establecidos
        if (genero.equals("masculino") || genero.equals("hombre")) {
            if (peso >= 60 && peso <= 110) {
            	if (altura >= 160 && altura <= 195) {
            		if (edad > 15) {
            			tmb = 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
                        return tmb;
            		} else {
            			throw new Exception("La edad ingresada está fuera del rango para calcular TMB en hombres");
            		}
            	} else {
            		throw new Exception("La altura ingresada está fuera del rango para calcular TMB en hombres");
            	}
                
            } else {
                throw new Exception("El peso ingresado está fuera del rango para calcular TMB en hombres");
            }
        // Cálculo de la TMB para mujeres según el genero en los rangos establecidos
        } else if (genero.equals("femenino") || genero.equals("mujer")) {
            if (peso >= 40 && peso <= 80) {
            	if (altura >= 140 && altura <= 180) {
            		if (edad > 15) {
            			tmb = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.330 * edad);
						return tmb;
					} else {
						throw new Exception("La edad ingresada está fuera del rango para calcular TMB en mujeres"); 
            		}
            	} else {
            		throw new Exception("La altura ingresada está fuera del rango para calcular TMB en mujeres");
            	}
            } else {
                throw new Exception("El peso ingresado está fuera del rango para calcular TMB en mujeres");
            }
        } else {
            throw new Exception("Género ingresado \"" + genero + "\" no reconocido");
        }
    }
}
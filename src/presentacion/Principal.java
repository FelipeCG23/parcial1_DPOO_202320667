package presentacion;

import logica.Persona;
import logica.TMB;

public class Principal {
    public static void main(String[] args) {
        // Prueba con un hombre válido
        Persona hombre = new Persona("Carlos", "masculino", 80, 180, 30);
        // Prueba con una mujer válida
        Persona mujer = new Persona("Ana", "femenino", 60, 165, 25);
        // Pruebas con datos fuera de rango
        Persona fueraRango = new Persona("Luis", "masculino", 59, 180, 16); // Peso fuera de rango
        Persona fueraRango2 = new Persona("Marta", "femenino", 45, 135, 40); // Altura fuera de rango
        Persona fueraRango3 = new Persona("Pedro", "masculino", 62, 175, 14); // Edad fuera de rango
        Persona fueraRango4 = new Persona("Lucia", "femnino", 55, 160, 20); // Género no reconocido

        try {
            double tmbHombre = TMB.calcularTMB(hombre);
            System.out.println("TMB de " + hombre.getNombre() + ": " + tmbHombre);
        } catch (Exception e) {
            System.out.println("Error calculando el TMB de " + hombre.getNombre() + ": " + e.getMessage());
            e.printStackTrace();
        }

        try {
            double tmbMujer = TMB.calcularTMB(mujer);
            System.out.println("TMB de " + mujer.getNombre() + ": " + tmbMujer);
        } catch (Exception e) {
            System.out.println("Error calculando el TMB de " + mujer.getNombre() + ": " + e.getMessage());
            e.printStackTrace();
        }

        try {
            double tmbFueraRango = TMB.calcularTMB(fueraRango);
            System.out.println("TMB de " + fueraRango.getNombre() + ": " + tmbFueraRango);
        } catch (Exception e) {
            System.out.println("Error calculando el TMB de " + fueraRango.getNombre() + ": " + e.getMessage());
            e.printStackTrace();
        }
        
        try {
            double tmbfueraRango2 = TMB.calcularTMB(fueraRango2);
            System.out.println("TMB de " + fueraRango2.getNombre() + ": " + tmbfueraRango2);
        } catch (Exception e) {
            System.out.println("Error calculando el TMB de " + fueraRango2.getNombre() + ": " + e.getMessage());
            e.printStackTrace();
        }
        
        try {
            double tmbfueraRango3 = TMB.calcularTMB(fueraRango3);
            System.out.println("TMB de " + fueraRango3.getNombre() + ": " + tmbfueraRango3);
        } catch (Exception e) {
            System.out.println("Error calculando el TMB de " + fueraRango3.getNombre() + ": " + e.getMessage());
            e.printStackTrace();
        }
        
        try {
            double tmbfueraRango4 = TMB.calcularTMB(fueraRango4);
            System.out.println("TMB de " + fueraRango4.getNombre() + ": " + tmbfueraRango4);
        } catch (Exception e) {
            System.out.println("Error calculando el TMB de " + fueraRango4.getNombre() + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
package edu.cuc.calculadorapotencia;

public class CalculadoraPotencia implements CalculadoraPotenciaImpl {

    public CalculadoraPotencia() {
    }

    @Override
    public double potenciaVoltajeCorriente(double voltaje, double corriente) {
        double potencia = voltaje * corriente;

        return potencia;
    }

    @Override
    public double potenciaResistenciaCorriente(double resistencia, double corriente) {
        double corrienteCuadrada = corriente * corriente;
        double potencia = resistencia * corrienteCuadrada;

        return potencia;
    }

    @Override
    public double potenciaVoltajeResistencia(double voltaje, double resistencia) {
        double voltajeCuadrado = voltaje * voltaje;
        double potencia = voltajeCuadrado / resistencia;

        return potencia;
    }

    @Override
    public double voltajeResistenciaCorriente(double resistencia, double corriente) {
        double voltaje = resistencia * corriente;

        return voltaje;
    }

    @Override
    public double voltajePotenciaCorriente(double potencia, double corriente) {
        double voltaje = potencia / corriente;

        return voltaje;
    }

    @Override
    public double voltajePotenciaResistencia(double potencia, double resistencia) {
        double multiplicacion = potencia * resistencia;
        double voltaje = Math.sqrt(multiplicacion);

        return voltaje;
    }

    @Override
    public double resistenciaVoltajeCorriente(double voltaje, double corriente) {
        double resistencia = voltaje / corriente;

        return resistencia;
    }

    @Override
    public double resistenciaVoltajePotencia(double voltaje, double potencia) {
        double voltajeCuadrado = voltaje * voltaje;
        double resistencia = voltajeCuadrado / potencia;

        return resistencia;
    }

    @Override
    public double resistenciaPotenciaCorriente(double potencia, double corriente) {
        double corrienteCuadrada = corriente * corriente;
        double resistencia = potencia / corrienteCuadrada;

        return resistencia;
    }

    @Override
    public double corrienteVoltajeResistencia(double voltaje, double resistencia) {
        double corriente = voltaje / resistencia;

        return corriente;
    }

    @Override
    public double corrientePotenciaVoltaje(double potencia, double voltaje) {
        double corriente = potencia / voltaje;

        return corriente;
    }

    @Override
    public double corrientePotenciaResistencia(double potencia, double resistencia) {
        double division = potencia / resistencia;
        double corriente = Math.sqrt(division);

        return corriente;
    }

    public String procesaTexto(String texto) {
        String resultado = new String("0");
        if (!texto.equals("")) {
            char capturaArray[] = texto.toCharArray();

            for (int i = 0; i < capturaArray.length; i++) {
                if (capturaArray[i] == ',') {
                    capturaArray[i] = '.';
                    break;
                }
            }

            resultado = new String(capturaArray);
        }
        return resultado;
    }
}

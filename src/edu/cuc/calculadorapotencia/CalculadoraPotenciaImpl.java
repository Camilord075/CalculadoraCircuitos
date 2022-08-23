package edu.cuc.calculadorapotencia;

public interface CalculadoraPotenciaImpl {
    //Calculo de potencia.
    public double potenciaVoltajeCorriente (double voltaje, double corriente);
    public double potenciaResistenciaCorriente (double resistencia, double corriente);
    public double potenciaVoltajeResistencia (double voltaje, double resistencia);
    
    //Calculo de voltaje.
    public double voltajeResistenciaCorriente (double resistencia, double corriente);
    public double voltajePotenciaCorriente (double potencia, double corriente);
    public double voltajePotenciaResistencia (double potencia, double resistencia);
    
    //Calculo de resistencia.
    public double resistenciaVoltajeCorriente (double voltaje, double corriente);
    public double resistenciaVoltajePotencia (double voltaje, double potencia);
    public double resistenciaPotenciaCorriente (double potencia, double corriente);
    
    //Calculo corriente.
    public double corrienteVoltajeResistencia (double voltaje, double resistencia);
    public double corrientePotenciaVoltaje (double potencia, double voltaje);
    public double corrientePotenciaResistencia (double potencia, double resistencia);   
}

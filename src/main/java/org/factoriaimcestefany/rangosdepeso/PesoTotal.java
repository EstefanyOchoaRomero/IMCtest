package org.factoriaimcestefany.rangosdepeso;

public class PesoTotal {

    @SuppressWarnings("FieldMayBeFinal")
    private int kilos;
    @SuppressWarnings("FieldMayBeFinal")
    private int altura;

    
    public PesoTotal(int kilos, int altura) {
        this.kilos = kilos;
        this.altura = altura;
    }

    
    public double calcularImc() {
        return kilos / Math.pow((altura / 100.0), 2);
    }

    public double getImc() {
        return calcularImc();
    }


    public String getCategoria() {
        double imc = getImc();
        return determinarCategoria(imc);
    }

    private String determinarCategoria(double imc) {
        if (imc < 16) {
            return "Delgadez Severa";
        } 
        if (imc < 17) {
            return "Delgadez Moderada";
        } 
        if (imc < 18.5) {
            return "Delgadez Leve";
        } 
        if (imc < 25) {
            return "Peso Normal";
        } 
        if (imc < 30) {
            return "Sobrepeso";
        } 
        if (imc < 35) {
            return "Obesidad Moderada";
        } 
        if (imc < 40) {
            return "Obesidad Severa";
        }       return "Obesidad Mórbida";
    }
}

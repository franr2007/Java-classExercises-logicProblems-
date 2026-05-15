package cide.entornos.es;

public class CuentaBancaria {
    //atributos 
    private Double saldo;

    // Constructor
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    
    //metodos
    public void ingressar(double quantitat) {
        if (quantitat <= 0) {
            throw new IllegalArgumentException("La quantitat ha de ser positiva");
        }
        saldo += quantitat;
    }
    
    public void retirar(double quantitat) {
        if (quantitat <= 0) {
            throw new IllegalArgumentException("La quantitat ha de ser positiva");
        }
        if (quantitat > saldo) {
            throw new IllegalArgumentException("Saldo insuficient");
        }
        saldo -= quantitat;
    }
    
    public double consultarSaldo() {
        return saldo;
    }
}

import org.junit.jupiter.api.Test;

import cide.entornos.es.CuentaBancaria;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {
     // Test 1: Verificar que un ingreso modifica correctamente el saldo
    @Test
    public void testIngresar() {
        CuentaBancaria cuenta = new CuentaBancaria(100.0);
        cuenta.ingressar(50.0);
        assertEquals(150.0, cuenta.consultarSaldo(), 0.01);
    }
    
    @Test
    public void testRetirarDism() {
        CuentaBancaria cuenta = new CuentaBancaria(100.0);
        cuenta.retirar(30.0);
        assertEquals(70.0, cuenta.consultarSaldo(), 0.01);
    }
    
    @Test
    public void testRetirarExc() {
        CuentaBancaria cuenta = new CuentaBancaria(50.0);
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(100.0);
        });
    }
    
    @Test
    public void testConsultarSaldoRetornaValorCorrecte() {
        CuentaBancaria cuenta = new CuentaBancaria(200.0);
        assertEquals(200.0, cuenta.consultarSaldo(), 0.01);
        
        cuenta.ingressar(50.0);
        assertEquals(250.0, cuenta.consultarSaldo(), 0.01);
    }
}

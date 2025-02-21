package encapsulamiento;

public class EncapsulamientoMain {
    public static void main(String[] args) {
        CuentaBancaria nuevacuentaBancaria = new CuentaBancaria("123456789",1000);
        System.out.println("Se creo la cuenta con saldo de: "+ nuevacuentaBancaria.getSaldo());
        nuevacuentaBancaria.depositar(500);
        nuevacuentaBancaria.retirar(2000);

    }
    
}

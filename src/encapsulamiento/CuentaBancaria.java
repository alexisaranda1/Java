package encapsulamiento;

public class CuentaBancaria {
    private String numeroCuenta ;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    private  void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public  void depositar(double  saldo){
        setSaldo(getSaldo()+saldo);
        System.out.println("Exito: deposito con exito, Saldo Actual: "+ getSaldo());
    }
    public void retirar (double salidaDinero){
        if (salidaDinero<= getSaldo()){
            setSaldo(getSaldo()- salidaDinero);
            System.out.println("Exito: retiro: "+ salidaDinero);
        }else{
            System.out.println("Error: saldo insuficiente, no podes retitrar " + salidaDinero);
        }
    }

}

public class Conta {
    private static final double TARIFA = 1.0;

    private double saldo;
    protected String numero;
    public Cliente titular;

    private void descontarTarifa(){
        if( this.saldo - TARIFA >= 0 ){
            this.saldo -= TARIFA;
        }
    }
    public void depositar(double valor){
        if( this.saldo + valor - TARIFA >= 0 ){
            this.saldo += valor;
            descontarTarifa();
        }
    }

    public void sacar(double valor){
        if( this.saldo - valor - TARIFA >= 0 ){
            this.saldo -= valor;
            descontarTarifa();
        }
    }

}

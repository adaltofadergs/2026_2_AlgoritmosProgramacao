public class Poupanca extends Conta{

    @Override
    public void depositar(double valor) {
        super.depositar(valor + TARIFA );
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + (TARIFA/2) );
    }
}

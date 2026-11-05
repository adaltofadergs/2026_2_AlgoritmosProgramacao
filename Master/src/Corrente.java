public class Corrente extends Conta{

    @Override
    public void depositar(double valor) {
        super.depositar(valor + (TARIFA/2) );
    }

    @Override
    public void sacar(double valor) {
        super.sacar( valor );
    }
}

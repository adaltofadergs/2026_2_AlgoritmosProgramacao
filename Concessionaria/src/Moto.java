import java.util.Scanner;
public class Moto extends Veiculo{
    public int cilindradas;

    @Override
    public void cadastrar() {
        System.out.println("Cadastre sua Moto: ");
        super.cadastrar();
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe as cilintradas: ");
        this.cilindradas = ler.nextInt();

    }

    @Override
    public void imprimir() {
        System.out.println("Moto: ");
        super.imprimir();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}

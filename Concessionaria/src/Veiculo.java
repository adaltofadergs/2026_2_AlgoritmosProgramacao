import java.util.Scanner;

public class Veiculo {
    String modelo;
    int ano;
    String placa;

    public Veiculo(){

    }

    public Veiculo(String _modelo, int _ano, String _placa){
        this.modelo = _modelo;
        this.ano = _ano;
        this.placa = _placa;
    }

    public void imprimir(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
    }

    public void cadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o modelo: ");
        this.modelo = ler.next();
        System.out.print("Digite o ano: ");
        this.ano = ler.nextInt();
        System.out.print("Digite a placa: ");
        this.placa = ler.next();
    }
}

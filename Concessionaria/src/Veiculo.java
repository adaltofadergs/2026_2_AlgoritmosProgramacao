import java.util.Scanner;

public class Veiculo {
    String modelo;
    int ano;
    String placa;
    Categoria categoria;

    public Veiculo(){

    }

    public Veiculo(String _modelo, int _ano, String _placa, Categoria cat){
        this.modelo = _modelo;
        this.ano = _ano;
        this.placa = _placa;
        this.categoria = cat;
    }

    public void imprimir(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        if( this.categoria != null ) {
            System.out.println("Categoria: " + categoria.nome);
        }
    }

    /**
     * Método para cadastrar novo Veículo
    */
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

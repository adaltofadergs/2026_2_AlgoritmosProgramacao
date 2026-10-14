import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Veiculo v = new Veiculo();
        v.cadastrar();
        v.modelo = "Fiat " + v.modelo;
        v.ano += 1;
        v.imprimir();

    }
}
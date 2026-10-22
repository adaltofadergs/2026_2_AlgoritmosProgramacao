import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
        Veiculo v = new Veiculo();
        v.cadastrar();
        v.modelo = "Fiat " + v.modelo;
        v.ano += 1;
        v.categoria = new Categoria("SUV");
        v.imprimir();
 */


//        Carro c1 = new Carro();
//        c1.cadastrar();
//    //    c1.categoria = new Categoria("SUV");
//        c1.imprimir();

        Categoria cat01 = new Categoria("Esportiva");
        Moto m1 = new Moto();
        Moto m2 = new Moto();
        m1.categoria = cat01;
        m2.categoria = cat01;
        m1.cadastrar();
        m1.imprimir();

    }
}
import java.util.Scanner;

// construa um algoritmo que pergunta ao usuário, quantos valores ele
// deleja informar
// Então crie um vetor com este tamanho e então peça ao usuário
// para digitar números inteiros positivos
// Guarde cada número um uma posição do vetor
// se o usuário digitar ZERO para algum dos valores, então pare de perguntar
// Ao final, imprima na tela quantos números foram digitados, a soma e a média
// somente dos números digitados
//

public class Main {


    public static void main(String[] args) {
        int soma = 0, cont = 0;
        double media;
        Scanner ler = new Scanner(System.in);
        System.out.println("Aula sobre Array - Vetor");
        System.out.println("------------------------");

        System.out.print("Informe o tamanho do vetor: ");
        int tam = ler.nextInt();

        int vetNumeros[] = new int[tam];

        for (int i = 0; i < tam ; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            int valorDigitado = ler.nextInt();
            if( valorDigitado == 0 ){
                break;
            }else {
                vetNumeros[i] = valorDigitado;
                soma = soma + valorDigitado;
                cont ++;
            }
        }
        for (int i = 0; i < cont ; i++) {
            System.out.println( "Valor " + (i+1) +": " + vetNumeros[i]  );
        }
        media = Double.valueOf( soma ) / Double.valueOf(cont);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Valores digitados: " + cont);
    }

}

/*
    int vetNumeros[] = new int[3];
        for (int i = 0; i < 3 ; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vetNumeros[i] = ler.nextInt();
        }
        for (int i = 0; i < 3 ; i++) {
            System.out.println( "O dobro de " + vetNumeros[i] + " é: " + (vetNumeros[i] * 2) );
        }


        String nomes[] = new String[3];
        for (int i = 0; i < 3 ; i++) {
            System.out.print("Digite o " + (i+1) + "º nome: ");
            nomes[i] = ler.next();
        }
        System.out.println("Lista de convidados: ");
        for (int i = 0; i < 3 ; i++) {
            System.out.println( nomes[i] );
        }







 int tam = 5;
        int soma = 0, min = 0, max = 0;
        double media;

        int vetNumeros[] = new int[tam];
        for (int i = 0; i < tam ; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vetNumeros[i] = ler.nextInt();
            soma += vetNumeros[i];
            if( i == 0 ){
                min = max = vetNumeros[i] ;
            }else {
                if( vetNumeros[i] < min )
                    min = vetNumeros[i];
                if( vetNumeros[i] > max )
                    max = vetNumeros[i];
            }
        }
        media = Double.valueOf( soma ) / Double.valueOf(tam);
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
 */
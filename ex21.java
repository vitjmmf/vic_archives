import java.util.Scanner;

public class ex21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int quantidadeNumeros = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número (ou 30000 para sair): ");
            int numero = scanner.nextInt();

            if (numero == 30000) {
                break;
            }

            soma += numero;
            quantidadeNumeros++;
            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        double media = (double) soma / quantidadeNumeros;
        double mediaPares = (double) soma / quantidadePares;
        double percentagemImpares = (double) (quantidadeImpares * 100) / quantidadeNumeros;

        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Quantidade de números digitados: " + quantidadeNumeros);
        System.out.println("Média dos números digitados: " + media);
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
        System.out.println("Média dos números pares: " + mediaPares);
        System.out.println("Percentagem dos números ímpares: " + percentagemImpares + "%");

        scanner.close();
    }
}

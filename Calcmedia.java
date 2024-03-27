import java.util.Scanner;


public class Calcmedia{
    public static void main(String[] args) {      
        System.out.println("informe o numero de alunos");
        Scanner meuScanner = new Scanner(System.in);

        int n = meuScanner.nextInt();
        int contador = 0;

        while (contador < n){
            System.out.println("informe o numero de alunos");
            double n1 = meuScanner.nextDouble();
    
            System.out.println("informe o numero de alunos");
            double n2 = meuScanner.nextDouble();
    
            double media = (n1+n2)/2.;
    
            if(media  <= 3.0 && media >= 0.0){
                System.out.println("reprovado");
            }    
            else if (media > 7 ){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("exame pra você");
            }
            contador++;

        }

       
    meuScanner.close();
    }
}


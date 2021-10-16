import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;

        System.out.println("Informe um numero inteiro : ");
        n1 = entrada.nextInt();

        for(int i = 0 ; i < n1 ; i++){

            int conta = i%n1; 

            if(conta % 2 == 1){
                System.out.println("os numeros impares  de 1 até " + n1 + " são : " + i );
            }


        }
    
}
}

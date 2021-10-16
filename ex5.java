import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        int mult=0;
        int contadador=10;
        int tabuada=0;
        boolean informação = false;


        while (!informação) {

                System.out.println("Digite um valor: ");
                i = entrada.nextInt();
                
                if (i>=2 && i <=1000) { 
                    informação = true;
                }else 
                {System.out.println(" Digite um i entre 2 e 1000");
                break;
            }
            
                do {
                    System.out.println("A tabuada é " + mult+ " x "+ i+ " = "+ tabuada);
                    mult++;
                    tabuada = i*mult;
                }

                while(mult<contadador);

                }
            }

    
        
    }

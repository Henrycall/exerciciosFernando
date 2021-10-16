import java.util.Scanner;
public class ex1 {
 public static void main(String args[]){ 
    int i = 1 ;
    
    while(i <= 100){
        int conta = i%2;

        if(conta%2 == 0){
            System.out.println("Numero par : " + i);
        }
        i++;

    }
}
}


package calculator;
import java.util.Scanner;

public class Calculator {

        public static double calculate(double angka1, double angka2, char operator){
            double hasil = 0;
            
            switch (operator){
                case '+':
                    hasil= angka1 + angka2;
                    break;
                
                case '-':
                    hasil= angka1 - angka2;
                    break;
                
                case '*':
                    hasil = angka1 * angka2;
                    break;
                    
                case '/':
                    hasil = angka1 / angka2;
                    break;
            }
            return hasil;
        }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double hasil = 0;
        char operator = ' ';
        
        
        System.out.print("Masukkan Angka = ");
        double angka1 = input.nextDouble();
        System.out.println("Masukkan operator (+, -, *, /) = ");
        operator = input.next().charAt(0);
        System.out.print("Masukkan Angka  = ");
        double angka2 = input.nextDouble();
        
        hasil = calculate(angka1,angka2,operator);
        
        while (true){
            System.out.println("ingin lagi y/n = ");
            char jawab = input.next().charAt(0);
                    
            if (jawab == 'n'){
                break;
            }
            
            System.out.println("Masukkan operator (+, -, *, /) = ");
            operator = input.next().charAt(0);
            System.out.print("Masukkan Angka selanjutnya = ");
            double angka = input.nextDouble();
            
            hasil = calculate(hasil, angka, operator);
        }
        System.out.println("hasil\t = "+hasil);
    } 
        
}

package Nivel1;

import java.util.Scanner;

public class SomaImparesConsecutivos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Casos teste
        
        for(int i = 0; i < n; i++){
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            int inicio = Math.min(x, y);
            int fim = Math.max(x, y);
            int soma = 0;

            for (int num = inicio + 1; num < fim; num++) {
                if (num % 2 != 0) {
                    soma += num;
                }
            }

            System.out.println(soma);
        }
        sc.close();
    }
}
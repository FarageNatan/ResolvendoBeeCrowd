package Nivel1;

import java.util.Scanner;

public class Experiencias {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int contadorTotal = 0;
        int contadorS = 0, contadorR = 0, contadorC = 0;

        for(int i = 0; i < n; i++){
            int cobaias = sc.nextInt();
            char tipo = sc.next().charAt(0);
            contadorTotal += cobaias;
            if(tipo == 'C'){
                contadorC += cobaias;
            }else if(tipo == 'R'){
                contadorR += cobaias;
            }else if(tipo == 'S'){
                contadorS += cobaias;
            }else{
                System.out.println("Tipo indeterminado");
            }
        }

        double percCoelhos = (double)(contadorC * 100.00) / contadorTotal;
        double percRatos = (double)(contadorR * 100.00 ) / contadorTotal;
        double percSapos = (double)(contadorS * 100.00) / contadorTotal;

        System.out.println("Total: " + contadorTotal + " cobaias");
        System.out.println("Total de coelhos: " + contadorC);
        System.out.println("Total de ratos: " + contadorR);
        System.out.println("Total de sapos: " + contadorS);

        System.out.printf("Percentual de coelhos: %.2f %%\n", percCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percSapos);


        sc.close();
    }

}

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

        double percCoelhos = (double)(contadorC / contadorTotal) * 100;
        double percRatos = (double)(contadorR / contadorTotal) * 100;
        double percSapos = (double)(contadorS / contadorTotal) * 100;

        System.out.println("Total: " + contadorTotal + " cobaias\n" + "Total de coelhos: " + contadorC + "\nTotal de ratos: " + contadorR + "\nTotal de sapos: " + contadorS + "\nPercentual de coelhos: " + percCoelhos + "\nPercentual de ratos: " + percRatos + "\nPercentual de sapos: " + percSapos);

        sc.close();
    }

}

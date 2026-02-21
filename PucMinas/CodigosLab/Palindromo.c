#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>


int tamanhoPalavra(char* palavra){
	int tamanho = 0;
	while(palavra[tamanho] != '\0'){
	   tamanho++;
	}			
	return tamanho;
}


bool conferePalindromo(char* palavra, int tamanho){
	bool ehPalindromo = true;
	int i = 0;
	for(int j = tamanho - 1; j > tamanho / 2; j--){
	   if(palavra[i] != palavra[j]){
		ehPalindromo = false;
		j = tamanho;
	   }
	 i++;
	}
	return ehPalindromo;
}

void removerQuebraLinha(char *str) {
    int i = 0;
    while (str[i] != '\0') {
        if (str[i] == '\n') {
            str[i] = '\0';
        }
        i++;
    }
}

int main(){
	char palavra[1000];
	fgets(palavra, sizeof(palavra), stdin);
	removerQuebraLinha(palavra);
	int tamanho = tamanhoPalavra(palavra);
	while(tamanho != 3 && palavra[0] != 'F' && palavra[1] != 'I' && palavra[2] != 'M'){
		tamanho = tamanhoPalavra(palavra);
		bool resultado = conferePalindromo(palavra, tamanho);
		if(resultado){
			printf("SIM\n");
		}else{
			printf("NAO\n");
		}
		fgets(palavra, sizeof(palavra), stdin);
		tamanho = tamanhoPalavra(palavra);
	}
	return 0;
}
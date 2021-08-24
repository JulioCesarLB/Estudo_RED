import java.util.Arrays;

import javax.swing.*;
public class FirstReverse {
	public static void main(String Args[]){
	String a = JOptionPane.showInputDialog(null,"Digite a frase:");
	int vetor[]= {1,2,3,4,5,6,7,8,9,10};
	
	JOptionPane.showMessageDialog(null,"INVERTIDA:"+invert(a)+""
			+ "\n ALFABETICA:"+alphabetic(a)
			+ "\n MAIUSCULA:"+maiusc(a)
			+ "\n SOMA:"+soma(vetor));
	
}
	
public static String invert(String str){
	String palavra_contr="";
	int num = str.length()-1;
	 for(int i=num; i>=0; i--){
		  char letra = str.charAt(i);
		 palavra_contr = palavra_contr + String.valueOf(letra);
		 }
	 return palavra_contr;
	
}

public static String alphabetic(String str){
	int num = str.length()-1;
	String Palabra_alfabetica="",vet[]= new String[str.length()];
	
	 for(int i=0; i<=num; i++){
		 char letra = str.charAt(i);
		 vet[i]=String.valueOf(letra);
	}
	 
	 Arrays.sort(vet);
	 
	for(int i=0; i<=num; i++){
			 Palabra_alfabetica=Palabra_alfabetica+String.valueOf(vet[i]);
		}
	 
	return Palabra_alfabetica;
	
}

public static String maiusc(String str) {
	int num = str.length()-1;
	String palavra_maiusc="";
	
	for(int i=0; i<=num;i++){
		char letra = str.charAt(i);
		String Letra =String.valueOf(letra);
		
		if(i==0){
			palavra_maiusc = Letra.toUpperCase();
		}
		else if(Letra.equals(" ")){
			palavra_maiusc += Letra;
			i+=1;
			letra = str.charAt(i);
			Letra =String.valueOf(letra);
			palavra_maiusc += Letra.toUpperCase();
		}
		else {
			palavra_maiusc += Letra.toLowerCase();
		}
	}
	
return palavra_maiusc;	
}

public static int soma(int vet[]){
	int soma=0, num=0, indice=0;
	if(vet.length<=4){
		for(int i=0; i<vet.length;i++){
			soma+=vet[i];
		}		
	}
	else {
		for(int i=0;i<4;i++){
			for(int j=0;j<vet.length;j++){
				if(num<vet[j]) {
					num=vet[j];
					indice=j;
				}else{
					
				}
			} 
			vet[indice]=0;
			soma=soma+num;
			num=0;
			}
		}
	return soma;
}			
}

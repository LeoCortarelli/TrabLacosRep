package Trab1;
import java.util.Scanner;
public class Trab_lacos {

	public static void main(String[] args) {
		String nome;
		char sexo;
		int idade;
		int cont;
		double media_todos;
		double soma_idades = 0;
		double soma_masc = 0;
		double soma_fem = 0;
		double media_fem;
		double media_masc;
		int cont_f=0;
		int cont_m=0;
		
		int TotalSexoMasculino =0;
		int TotalSexoFeminino =0;
		Scanner ler = new Scanner(System.in);
		
	for(cont = 1; cont <= 3; cont++){	
		System.out.println("Informe o nome: ");
		nome = ler.nextLine();
		
		
		System.out.println("Informe a idade: ");
		idade = ler.nextInt();
		
		ler.nextLine();
		
		System.out.println("Informe o sexo (F)Feminino (M)Masculino: ");
		sexo = ler.nextLine().charAt(0);
		
		soma_idades = soma_idades + idade;
		
		if(sexo == 'f') {
			soma_fem = soma_fem + idade;
			cont_f++;
			if(idade >= 21){
				TotalSexoFeminino++;
			}
		}
		else {
			soma_masc = soma_masc + idade;
			cont_m++;
			if(idade >= 18){
				TotalSexoMasculino++;
			}
		}
		
	}
	
	
	media_fem = soma_fem / cont_f;
	media_masc = soma_masc / cont_m;
	
	System.out.println("O total de pessoas do sexo FEM maior de 21 anos " + TotalSexoFeminino);
	System.out.println("O total de pessoas do sexo MAS maior de 18 anos " + TotalSexoMasculino);
	System.out.println("A media das idades do sexo feminino sao " + media_fem);
	System.out.println("A media das idades do sexo masculino sao " + media_masc);
	
	}

}
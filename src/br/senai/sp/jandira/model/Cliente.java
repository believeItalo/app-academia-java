package br.senai.sp.jandira.model;

import java.time.LocalDate;

//class are like "recipe" to make objects

public class Cliente {

	// here we have "everything" that is important to our project, based on each
	// necessities/characteristics
	public String nome;
	public LocalDate dataDeNascimento;
	public String genero[] = { "Feminino", "Masculino", "Outros" };
	public double peso;
	public double altura;

//methods/function = behavior
//tip: use library called Math
	public double getimc() {
		return peso / Math.pow(altura, 2);

	}

	public String getStatus() {

		if (getimc() <= 18.5) {
			return "Abaixo Do Peso";
		} else if (getimc() >= 18.50 && getimc() < 25.00) {
			return "Peso Ideal !";

		} else if (getimc() > 25.00 && getimc() < 30.00) {
			return "Levemente acima do peso";

		} else if (getimc() > 30.00 && getimc() < 35.00) {
			return "Obesiade grau 1 ";
		} else if (getimc() > 35 && getimc() < 40.00) {
			return "Obesidade grau 2";
		} else {
			return "Obesidade Mórbida";
		}

//	if (getimc() < 18.50) { System.out.print(" Você está abaixo do peso");	
//	}
//	if (getimc() >= 18.50 && getimc() < 25.00 ) { System.out.print("Você está no peso ideal");
//	}
//	if (getimc() > 25.00 && getimc() < 30.00 ) { System.out.print("Você está levemente acima do peso");
//	}
//	if (getimc() > 30.00 && getimc()< 35.00) { System.out.print("Você está com Obesidade grau 1");
//	}
//	if (getimc() > 35.00 && getimc() < 40.00) { System.out.print("Você está com Obesidade grau 2 (severa)");
//	}
//	if (getimc() >= 40.00) { System.out.print("Você está com Obesidade 3 (mórbida)");
//	}

	}

}

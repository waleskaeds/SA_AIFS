import java.util.Scanner;

public class SA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeProf, turma, disciplina, nomeAluno = "", situacao;
		int i = 0, notaProva, qtdAlunos, somaNotas = 0, qtdProva, media;

		// perguntas iniciais
		System.out.print("Professor, insira seu nome: ");
		nomeProf = sc.next();

		System.out.print("Turma: ");
		turma = sc.next();

		System.out.print("Disciplina: ");
		disciplina = sc.next();

		System.out.print("Quantidade de alunos: ");
		qtdAlunos = sc.nextInt();

		System.out.print("Quantidade de avaliações aplicadas: ");
		qtdProva = sc.nextInt();

		// aluno
		for (int iA = 1; iA <= qtdAlunos; iA++) {
			System.out.print("\nNome do Aluno " + iA + ": ");
			nomeAluno = sc.next();
		


			for (i = 1; i <= qtdProva; i++) {
				System.out.print("Nota da " + i + "° prova: ");
				notaProva = sc.nextInt();
				somaNotas += notaProva;

			}
			
			media = (somaNotas) / qtdProva;

			System.out.println("Média = " + media);
			if (media <5) {
				situacao = "Reprovado.";
			} else if (media <7) {
				situacao = "Em exame.";
			} else {
				situacao = "Aprovado";
			}
			
		 // relatório após o nome do aluno
			System.out.println("---------------------");
			System.out.println("Dados coletados do aluno " + nomeAluno + ".");
			System.out.println("Turma: " + turma);
			System.out.println("Professor: " + nomeProf);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Média do aluno: " + media);
			System.out.println("Situação: " + situacao);
		}

	}
}
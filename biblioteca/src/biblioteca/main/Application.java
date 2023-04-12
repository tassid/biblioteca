package biblioteca.main;

import java.util.ArrayList;

import biblioteca.beans.Devolucao;
import biblioteca.beans.Emprestimo;
import biblioteca.beans.Exemplar;
import biblioteca.beans.Livro;
import biblioteca.beans.Revista;
import biblioteca.beans.pagamento.CartaoDebito;
import biblioteca.beans.pagamento.Dinheiro;

public class Application {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro(0, "Percy Jackson e o Ladrão de Raios", new ArrayList<Exemplar>(), "89090");
		
		Livro livro2 = new Livro(1, "Percy Jackson e o Mar de Montros", new ArrayList<Exemplar>(), "89091");
		
		Revista revista1 = new Revista(2, "Vogue", new ArrayList<Exemplar>(), "2023-03");
		
		Revista revista2 = new Revista(3, "Eletrônica Descomplicada", new ArrayList<Exemplar>(), "2020-09");
		
		
		ArrayList<Exemplar> exemplares1 = new ArrayList<Exemplar>();
		
		Exemplar exPR1 = new Exemplar(123, livro1);
		exemplares1.add(exPR1);
		
		Exemplar exPR2 = new Exemplar(124, livro1);
		exemplares1.add(exPR2);
		
		Exemplar exPR3 = new Exemplar(125, livro1);
		exemplares1.add(exPR3);
		
		Exemplar exPR4 = new Exemplar(126, livro1);
		exemplares1.add(exPR4);
		
		Exemplar exPR5 = new Exemplar(127, livro1);
		exemplares1.add(exPR5);
		
		livro1.addExemplares(exemplares1);
		
		ArrayList<Exemplar> exemplares2 = new ArrayList<Exemplar>();
		
		Exemplar exPM1 = new Exemplar(128, livro2);
		exemplares2.add(exPM1);
		
		Exemplar exPM2 = new Exemplar(129, livro2);
		exemplares2.add(exPM2);
		
		Exemplar exPM3 = new Exemplar(130, livro2);
		exemplares2.add(exPM3);
		
		Exemplar exPM4 = new Exemplar(131, livro2);
		exemplares2.add(exPM4);
		
		livro2.addExemplares(exemplares2);
		
		ArrayList<Exemplar> exemplares3 = new ArrayList<Exemplar>();
		
		Exemplar exRV1 = new Exemplar(132, revista1);
		exemplares3.add(exRV1);
		
		Exemplar exRV2 = new Exemplar(133, revista1);
		exemplares3.add(exRV2);
		
		Exemplar exRV3 = new Exemplar(134, revista1);
		exemplares3.add(exRV3);
		
		revista1.addExemplares(exemplares3);
		
		ArrayList<Exemplar> exemplares4 = new ArrayList<Exemplar>();
		
		Exemplar exRD1 = new Exemplar(135, revista2);
		exemplares4.add(exRD1);
		
		Exemplar exRD2 = new Exemplar(136, revista2);
		exemplares4.add(exRD2);
		
		Exemplar exRD3 = new Exemplar(137, revista2);
		exemplares4.add(exRD3);
		
		revista2.addExemplares(exemplares4);
		
		System.out.println(livro1.toString());
		System.out.println(livro2.toString());
	
		System.out.println(revista1.toString());
		System.out.println(revista2.toString());
		
		Emprestimo emprestimo1 = new Emprestimo();
		
		emprestimo1.emprestar();
		
		Devolucao devolucao1 = new Devolucao();
		
		devolucao1.devolver();
		
		devolucao1.setPagamento(new CartaoDebito());
		
		devolucao1.pagar();
	}
}

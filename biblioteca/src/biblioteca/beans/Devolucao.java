package biblioteca.beans;

import biblioteca.beans.pagamento.Pagamento;

public class Devolucao {

	public void devolver() {
		System.out.println("Devolucao realizada");
		
	}
	
	private Pagamento pagamento;

	public void pagar() {
		pagamento.pagar();
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
}

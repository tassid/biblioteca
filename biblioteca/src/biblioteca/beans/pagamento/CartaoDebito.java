package biblioteca.beans.pagamento;

public class CartaoDebito implements Pagamento {

	@Override
	public void pagar() {
		System.out.println("Pagamento por Cartao de Debito.");

	}
	


}

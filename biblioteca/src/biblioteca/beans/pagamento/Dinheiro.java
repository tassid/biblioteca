package biblioteca.beans.pagamento;

public class Dinheiro implements Pagamento {

	@Override
	public void pagar() {
		System.out.println("Pagamento com Dinheiro");

	}

}

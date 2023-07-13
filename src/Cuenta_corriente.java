
public class Cuenta_corriente extends Cuenta {

	public Cuenta_corriente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public boolean retirar(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;

			return true;
		} else {

			return false;
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo = valor += saldo;

	}

	@Override
	public boolean transferir(double valor, Cuenta cuenta) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			cuenta.saldo += valor;
			return true;
		} else {

			return false;
		}
	}
}

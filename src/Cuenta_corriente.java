
public class Cuenta_corriente extends Cuenta {

	public Cuenta_corriente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void retirar(double valor) throws SaldoinsuficienteEx {
		double comision = 0.2;
		super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = valor += saldo;

	}

	@Override
	public void transferir(double valor, Cuenta cuenta) throws SaldoinsuficienteEx {
		double comision = 0.5;
		super.transferir(valor + comision, cuenta);

	}
}

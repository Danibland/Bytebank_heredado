
public class Cuenta_ahorros extends Cuenta {

	public Cuenta_ahorros(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void retirar(double valor) {
		double comision = 0.2;
		try {
			super.retirar(valor + comision);
		} catch (SaldoinsuficienteEx e) {

			e.printStackTrace();
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo = valor += saldo;

	}

	@Override
	public void transferir(double valor, Cuenta cuenta) {
		double comision = 0.5;
		try {
			super.transferir(valor + comision, cuenta);
		} catch (SaldoinsuficienteEx e) {

			e.printStackTrace();
		}

	}

}

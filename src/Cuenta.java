
public abstract class Cuenta {

	protected double saldo;
	private int agencia;
	private int numero;

	private Cliente titular = new Cliente();

	private static int total = 0;

	public static int getTotal() {
		return Cuenta.total;
	}

	public static void setTotal(int total) {
		Cuenta.total = total;
	}

	public Cuenta(int agencia, int numero) {

		if (agencia <= 0) {
			System.out.println("nos se puede el 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;

	}

	public abstract void depositar(double valor) throws SaldoinsuficienteEx;

	public void retirar(double valor) throws SaldoinsuficienteEx {
		if (this.saldo < valor) {
			throw new SaldoinsuficienteEx("No tienes saldo suficiente");
		}

		this.saldo -= valor;
	}

	public void transferir(double valor, Cuenta cuenta) throws SaldoinsuficienteEx {

		if (this.saldo < valor) {
			throw new SaldoinsuficienteEx("No tienes saldo suficiente para la transaccion");
		}
		this.saldo -= valor;
		cuenta.saldo += valor;

	}

	public double Getsaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;

	}

	public int getNumero() {
		return numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

}


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
		System.out.println("el total de cuentas creadas es: " + total);
		;

	}

	public abstract void depositar(double valor);

	public abstract boolean retirar(double valor);

	public abstract boolean transferir(double valor, Cuenta cuenta);

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

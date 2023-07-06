
public class Cuenta {

	private double saldo;
	private int agencia;
	private int numero;

	

	private Cliente titular = new Cliente();
	
	private static int total=0;

	public static int getTotal() {
		return Cuenta.total;
	}
	public static void setTotal(int total) {
		Cuenta.total = total;
	}
	public Cuenta(int agencia,int numero) {

		
		if (agencia <= 0) {
			System.out.println("nos se puede el 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("el total de cuentas creadas es: "+total);;

	}

	public void depositar(double valor) {
		this.saldo = valor += saldo;
	}

	public void retirar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("no te alcanza");
		}
	}

	public void transferir(double valor, Cuenta cuenta) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			cuenta.saldo += valor;
		} else {
			System.out.println("no te alcanza");
		}
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

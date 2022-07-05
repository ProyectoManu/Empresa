package clases;

public class Comercial extends Empleado {
	protected int numero_ventas;
	protected static double importe = 45.9;

	public Comercial() {
		numero_ventas = 0;
	}

	public Comercial(String nombre, String apellido, int edad, Double salario, int antiguedad_en_años,
			int numero_ventas) {
		super(nombre, apellido, edad, salario, antiguedad_en_años);
		this.numero_ventas = numero_ventas;
	}

	@Override
	public String toString() {
		return "Comercial [numero_ventas=" + numero_ventas + "]";
	}

	public void contabiliza_Ventas(int i) {
		 if(i>=7) {
			 i=7;
		 }
		 
		this.numero_ventas=this.numero_ventas+i;
		 
		 if (this.numero_ventas>25) {
			this.numero_ventas=25;
		 }
	}
		public void resetea_contador_ventas() {
			numero_ventas=0;
		}

		@Override
		public double importesalario() {
		
			return super.importesalario()+numero_ventas*importe;
		}

}

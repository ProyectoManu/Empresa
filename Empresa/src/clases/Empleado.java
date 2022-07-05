package clases;

public class Empleado {
	
	protected String nombre;
	protected String apellido;;
	protected int edad;
	protected Double salario;
	protected int antiguedad_en_años;
	
	public Empleado() {
	}

	public Empleado(String nombre, String apellido, int edad, Double salario, int antiguedad_en_años) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad_en_años = antiguedad_en_años;
	}

	public Empleado(Empleado p) {
		this.nombre = p.nombre;
		this.apellido = p.apellido;
		this.edad = p.edad;
		this.salario = p.salario;
		this.antiguedad_en_años = p.antiguedad_en_años;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public int getAntiguedad_en_años() {
		return antiguedad_en_años;
	}

	public void setAntiguedad_en_años(int antiguedad_en_años) {
		this.antiguedad_en_años = antiguedad_en_años;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad_en_años=" + antiguedad_en_años + "]";
	}
	
	public double importeTrienios() {
		
		int trienios= this.antiguedad_en_años/3;
		double importeTrienios=0;
		double sal= this.salario;
		
		for(int i=1; i<=trienios; i++) {
			sal=salario+importeTrienios;
			if(i<=5) {
				importeTrienios=importeTrienios+sal*0.05;
			}else {
				importeTrienios=importeTrienios+sal*0.08;
			}
		}
			return importeTrienios;
		
						
			}
	public double importesalario() {
		return this.salario+this.importeTrienios();
	}
			
		}
		
	
		
		
	




public class Funcionario {

	private int id;
	private String name;
	private double salary;
	
	public Funcionario(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void convert(double percentage) {
		salary += salary * percentage / 100.0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString( ) {
		return "Id: " + getId() + ", " + "Nome: " + getName() + ", " + "Sal�rio: " + getSalary();
	}
	
}

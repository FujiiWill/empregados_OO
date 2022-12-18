package entities;

import java.util.ArrayList;
import java.util.List;

public class Department<Other> {

	private String name;
	private int payDay;
	
	private Address address;
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployee() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public double payroll() {
		double totalPayment = 0.0;
		for(Employee emp : employees) {
			totalPayment += emp.getSalary();
		}
		return totalPayment;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FOLHA DE PAGAMENTO:");
		sb.append("Departamento " + name + " = R$ ");
		sb.append(payroll() + "\n");
		sb.append("Pagamento realizado no dia ");
		sb.append(payDay + "\n");
		sb.append("Funcionários:\n");
		for(Employee emp : employees) {
			sb.append(emp.getName() + "\n");
		}
		sb.append(address);
		return sb.toString();
	}
}

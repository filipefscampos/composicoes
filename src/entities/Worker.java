package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Department depatment;
	//Como um trabalhador pode possuir vários contratos (um para muitos)
	//Os contratos precisam ser representados por uma lista do tipo Contratos
	//A lista por padrão precisa ser instanciada
	private List<HourContract> contracts = new ArrayList<HourContract>();
	
	public Worker() {
		
	}
	
	//O construtor precisa ser gerado sem a lista (HourContract)
	public Worker(String name, WorkerLevel level, double baseSalary, Department depatment) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.depatment = depatment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepatment() {
		return depatment;
	}

	public void setDepatment(Department depatment) {
		this.depatment = depatment;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}
	
	
	
	
}

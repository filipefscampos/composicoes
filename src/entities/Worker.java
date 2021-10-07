package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Department depatment;
	//Como um trabalhador pode possuir v�rios contratos (um para muitos)
	//Os contratos precisam ser representados por uma lista do tipo Contratos
	//A lista por padr�o precisa ser instanciada
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
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income (int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.YEAR;
			int c_month = 1+cal.MONDAY;
			if(year == c_year && month == c_month) {
				sum+=c.totalValue();
			}
		}
		return sum;
	}
	
	
}

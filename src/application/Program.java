package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nameDepart = sc.nextLine();
		
		System.out.println();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.println();
		
		System.out.print("Nome do trabalhador: ");
		String workerName = sc.nextLine();
		
		System.out.print("Nível: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Salario: ");
		Double workerSalary = sc.nextDouble();
		
		System.out.println();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),
						workerSalary, new Department(nameDepart));
		
		System.out.print("Quantos contratos o trabalhador possui?");
		int n = sc.nextInt();
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.println("Entre com o contrato #"+i);
			System.out.print("Data (dd/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor da Hora");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duraçã do contrato (Em Horas)");
			Integer hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
		}
		
		
		
		
		sc.close();

	}

}

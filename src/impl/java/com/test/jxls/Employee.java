package com.test.jxls;

public class Employee {

	private String name;
    private int age;
    private Double payment;
    private Double bonus;
    
	public Employee(String name, int age, Double payment, Double bonus) {
		super();
		this.name = name;
		this.age = age;
		this.payment = payment;
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
    
	

}

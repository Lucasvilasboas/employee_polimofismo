package entities;

public class Employee {

	 private String name;
	 private Integer hours;
	 private Double valuePerHour;
	 
	 public Employee() {
		 
	 }
	 
	public Employee(String name, Integer hours, Double valueHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valueHour;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getValueHour() {
		return valuePerHour;
	}
	public void setValueHour(Double valueHour) {
		this.valuePerHour = valueHour;
	}
	 
	public double payment() {
		return hours * valuePerHour;
	}
	 
}

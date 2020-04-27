package liujianyongweek2_0427.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TPS {
	private BigInteger id;
	
	private String name;
	
	private Integer age;
	
	private  BigDecimal salary;
	
	private Date date;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer  getAge() {
		return age;
	}

	public void setAge(Integer  age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TPS(BigInteger id, String name, Integer  age, BigDecimal salary, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.date = date;
	}

	public TPS() {
		super();
	}

	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", date=" + date + "]";
	}
	
	
	
	
}

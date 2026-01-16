package src;

public abstract class Employee {

	protected int ssNo;
	protected String name;
	protected String email;
	protected static int counter;

	public Employee(int ssNo, String name, String emal) {
		this.ssNo = ssNo;
		this.name = name;
		this.email = emal;
		counter++;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public int getSsNo() {
		return this.ssNo;
	}

	/**
	 * 
	 * @param ssNo
	 */
	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}

	public int getCounter() {
		return this.counter;
	}

	/**
	 * 
	 * @param counter
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

}
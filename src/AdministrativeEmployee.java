package src;

public class AdministrativeEmployee extends Employee {

	protected String job;

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 * @param job
	 */
	public AdministrativeEmployee(int ssNo, String name, String email, String job) {
		super(ssNo, name, email);
		this.job = job;
	}

	public String getJob() {
		return this.job;
	}

	/**
	 * 
	 * @param job
	 */
	public void setJob(String job) {
		this.job = job;
	}

}
package src;

public class Faculty {

	private String name;
	private Institute[] institutes;

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

	/**
	 * 
	 * @param name
	 */
	public Faculty(String name) {
		this.name = name;
		this.institutes = new Institute[10];
	}

	public Institute[] getInstitutes() {
		return this.institutes;
	}

	/**
	 * 
	 * @param institutes
	 */
	public void setInstitutes(Institute[] institutes) {
		this.institutes = institutes;
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		for (int i = 0; i < institutes.length; i++) {
			if (institutes[i] == null) {
				institutes[i] = institute;
				return;
			}
		}
		Institute[] newInstitutes = new Institute[institutes.length + 10];
		System.arraycopy(institutes, 0, newInstitutes, 0, institutes.length);
		newInstitutes[institutes.length] = institute;
		institutes = newInstitutes;
	}

	/**
	 * 
	 * @param institute
	 */
	public void removeInstitute(Institute institute) {
		for (int i = 0; i < institutes.length; i++) {
			if (institutes[i] == institute) {
				institutes[i] = null;
				break;
			}
		}
	}

}
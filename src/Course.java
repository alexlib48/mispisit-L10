package src;

public class Course {

	private String name;
	private int id;
	private float hours;
	private Lecturer[] lecturers;

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

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public float getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(float hours) {
		this.hours = hours;
	}

	/**
	 * 
	 * @param name
	 * @param id
	 * @param hours
	 */
	public Course(String name, int id, int hours) {
		this.name = name;
		this.id = id;
		this.hours = hours;
		this.lecturers = new Lecturer[10];
	}

	public Lecturer[] getLecturers() {
		return this.lecturers;
	}

	/**
	 * 
	 * @param lecturers
	 */
	public void setLecturers(Lecturer[] lecturers) {
		this.lecturers = lecturers;
	}

	/**
	 * 
	 * @param lecturer
	 */
	public void addLecturer(Lecturer lecturer) {
		for (int i = 0; i < lecturers.length; i++) {
			if (lecturers[i] == null) {
				lecturers[i] = lecturer;
				return;
			}
		}
		Lecturer[] newLecturers = new Lecturer[lecturers.length + 10];
		System.arraycopy(lecturers, 0, newLecturers, 0, lecturers.length);
		newLecturers[lecturers.length] = lecturer;
		lecturers = newLecturers;
	}

	/**
	 * 
	 * @param lecturer
	 */
	public void removeLecturer(Lecturer lecturer) {
		for (int i = 0; i < lecturers.length; i++) {
			if (lecturers[i] == lecturer) {
				lecturers[i] = null;
				return;
			}
		}
	}

}
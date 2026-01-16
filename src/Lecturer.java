package src;

public class Lecturer extends ResearchAssociate {

	private Course[] courses;

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 */
	public Lecturer(int ssNo, String name, String email, String fieldOfStudy) {
		super(ssNo, name, email, fieldOfStudy);
		this.courses = new Course[10];
	}

	public Course[] getCourses() {
		return this.courses;
	}

	/**
	 * 
	 * @param courses
	 */
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] == null) {
				courses[i] = course;
				return;
			}
		}
		Course[] newCourses = new Course[courses.length + 10];
		System.arraycopy(courses, 0, newCourses, 0, courses.length);
		newCourses[courses.length] = course;
		courses = newCourses;
	}

	/**
	 * 
	 * @param course
	 */
	public void removeCourse(Course course) {
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] == course) {
				courses[i] = null;
				return;
			}
		}
	}

}
package src;

public class Participation {

	private int hours;
	private Project project;
	private ResearchAssociate researcher;

	public int getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public Participation(int hours, Project project, ResearchAssociate researcher) {
		this.hours = hours;
		this.project = project;
		this.researcher = researcher;
	}

	public Project getProject() {
		return this.project;
	}

	/**
	 * 
	 * @param project
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	public ResearchAssociate getResearcher() {
		return this.researcher;
	}

	/**
	 * 
	 * @param researcher
	 */
	public void setResearcher(ResearchAssociate researcher) {
		this.researcher = researcher;
	}

}
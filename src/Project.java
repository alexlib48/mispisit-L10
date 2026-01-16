package src;

import java.util.Date;

public class Project {

	private String name;
	private Date start;
	private Date end;
	private Participation[] participations;

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

	public Date getStart() {
		return this.start;
	}

	/**
	 * 
	 * @param start
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	/**
	 * 
	 * @param end
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * 
	 * @param name
	 * @param start
	 * @param end
	 */
	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.participations = new Participation[10];
	}

	public Participation[] getParticipations() {
		return this.participations;
	}

	/**
	 * 
	 * @param participations
	 */
	public void setParticipations(Participation[] participations) {
		this.participations = participations;
	}

	/**
	 * 
	 * @param participation
	 */
	public void addParticipation(Participation participation) {
		for (int i = 0; i < participations.length; i++) {
			if (participations[i] == null) {
				participations[i] = participation;
				return;
			}
		}
		Participation[] newParticipations = new Participation[participations.length + 10];
        System.arraycopy(participations, 0, newParticipations, 0, participations.length);
		newParticipations[participations.length] = participation;
		participations = newParticipations;
	}

}
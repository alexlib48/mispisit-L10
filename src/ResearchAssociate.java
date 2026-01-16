package src;

public class ResearchAssociate extends Employee {

	protected String fieldOfStudy;
	protected Participation[] participations;

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	/**
	 * 
	 * @param fieldOfStudy
	 */
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 * @param fieldOfStudy
	 */
	public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
		super(ssNo, name, email);
		this.fieldOfStudy = fieldOfStudy;
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
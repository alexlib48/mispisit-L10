package src;

public class Institute {

	private String name;
	private String address;
	private ResearchAssociate[] researchAssociates;

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

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
		this.researchAssociates = new ResearchAssociate[10];
	}

	public ResearchAssociate[] getResearchAssociates() {
		return this.researchAssociates;
	}

	/**
	 * 
	 * @param researchAssociates
	 */
	public void setResearchAssociates(ResearchAssociate[] researchAssociates) {
		this.researchAssociates = researchAssociates;
	}

	/**
	 * 
	 * @param researchAssociate
	 */
	public void addResearchAssociate(ResearchAssociate researchAssociate) {
		for (int i = 0; i < researchAssociates.length; i++) {
			if (researchAssociates[i] == null) {
				researchAssociates[i] = researchAssociate;
				return;
			}
		}
		ResearchAssociate[] newResearchAssociates = new ResearchAssociate[researchAssociates.length + 10];
		System.arraycopy(researchAssociates, 0, newResearchAssociates, 0, researchAssociates.length);
		newResearchAssociates[researchAssociates.length] = researchAssociate;
		researchAssociates = newResearchAssociates;
	}

	/**
	 * 
	 * @param researchAssociate
	 */
	public void removeResearchAssociate(ResearchAssociate researchAssociate) {
		for (int i = 0; i < researchAssociates.length; i++) {
			if (researchAssociates[i] == researchAssociate) {
				researchAssociates[i] = null;
				return;
			}
		}
	}

}



public class PatientEMR extends BaseModel {
	
	public Integer UHID = 0;
	public Character[] PMH = new Character[20];
	public Character[] medications = new Character[20];
	public Character[] allergies = new Character[100];
	public Integer familyHistory = 0;
	public Integer socialHistory = 0;
	public Integer primaryPhysician = 0;
	public Character[] remarks = new Character[94];
	
	@Override
	public String toString() {
		String value = "UHID - "+ UHID +"\nPMH - ";
		for (Character ch : PMH) {
			value+= ch;
		}
		value += "\nmedications - ";
		for (Character ch : medications) {
			value+= ch;
		}
		value += "\nallergies - ";
		for (Character ch : allergies) {
			value+= ch;
		}
		value += "\nfamilyHistory - "+ familyHistory +
				"\nsocialHistory - "+ socialHistory +
				"\nprimaryPhysician - "+ primaryPhysician +
				"\nremarks - ";
		for (Character ch : remarks) {
			value+= ch;
		}
		
		return value;

	}
	
	public String[] getAllergies() {
		String[] allergy = new String[5];

		allergy[0] = "Penicillin";
		allergy[1] = "";
		allergy[2] = "";
		allergy[3] = "";
		allergy[4] = "";
		
		return allergy;
	}
	
	public String[] getPMH() {
		String[] pmh = new String[5];

		String medicalHistory = "";
		int i = 0;
		for( ; i < 4; i++) {
			medicalHistory += this.PMH[i];
		}
		pmh[0] = EMRUtility.getPMH(medicalHistory);
		medicalHistory = "";
		for( ; i < 8; i++) {
			medicalHistory += this.PMH[i];
		}
		pmh[1] = EMRUtility.getPMH(medicalHistory);
		medicalHistory = "";
		for( ; i < 12; i++) {
			medicalHistory += this.PMH[i];
		}
		pmh[2] = EMRUtility.getPMH(medicalHistory);
		medicalHistory = "";
		for( ; i < 16; i++) {
			medicalHistory += this.PMH[i];
		}
		pmh[3] = EMRUtility.getPMH(medicalHistory);
		medicalHistory = "";
		for( ; i < 20; i++) {
			medicalHistory += this.PMH[i];
		}
		pmh[4] = EMRUtility.getPMH(medicalHistory);
		
		return pmh;
		
	}
	
	public String[] getMedications() {
		String[] med = new String[5];

		String medicalHistory = "";
		int i = 0;
		for( ; i < 4; i++) {
			medicalHistory += this.medications[i];
		}
		med[0] = EMRUtility.getMedication(medicalHistory);
		medicalHistory = "";
		for( ; i < 8; i++) {
			medicalHistory += this.medications[i];
		}
		med[1] = EMRUtility.getMedication(medicalHistory);
		medicalHistory = "";
		for( ; i < 12; i++) {
			medicalHistory += this.medications[i];
		}
		med[2] = EMRUtility.getMedication(medicalHistory);
		medicalHistory = "";
		for( ; i < 16; i++) {
			medicalHistory += this.medications[i];
		}
		med[3] = EMRUtility.getMedication(medicalHistory);
		medicalHistory = "";
		for( ; i < 20; i++) {
			medicalHistory += this.medications[i];
		}
		med[4] = EMRUtility.getMedication(medicalHistory);
		
		return med;
		
	}
	
	public String getFamilyHistory() {
		return EMRUtility.getFamilyHistory(this.familyHistory.toString());
	}
	
	public String getSocialHistory() {
		return EMRUtility.getSocialHistory(this.socialHistory.toString());
	}
	
	public String getPhysician() {
		return EMRUtility.getPhysician(this.primaryPhysician.toString());
	}

	public String getPatientName() {
		return EMRUtility.getPatientName(this.UHID.toString());
	}
}

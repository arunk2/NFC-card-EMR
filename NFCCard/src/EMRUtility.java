
public class EMRUtility {
	public static String getPatientName(String UHID) {
		if (UHID.equals("1")) 
			return "Manikandan";
		else 
			return "Devendran";
	}
	
	public static String getMedication(String medication) {
		if (medication.equals("AAAA")) 
			return "Crocin 1-1-1";
		else if (medication.equals("BBBB"))
			return "Amaryl 1-0-1";
		else 
			return "";
	}
	
	public static String getPMH(String pmh) {
		if (pmh.equals("AAAA")) 
			return "Diabetes";
		else if (pmh.equals("BBBB")) 
			return "Hypertension";
		else if (pmh.equals("CCCC"))
			return "Low Blood Pressure";
		else 
			return "";
	}
	
	public static String getPhysician(String physician) {
		if (physician.equals("1")) 
			return "Dr.R.Rabindran MBBS,FRCS";
		else
			return "Dr.S.Karynanithi MBBS";
	}
	
	public static String getFamilyHistory(String fh) {
		if (fh.equals("1")) 
			return "Diabetes";
		else if (fh.equals("2")) 
			return "Hypertension";
		else if (fh.equals("3"))
			return "Alcoholic";
		else 
			return "";
	}
	
	public static String getSocialHistory(String sh) {
		if (sh.equals("1")) 
			return "Occasional Drinker";
		else if (sh.equals("2")) 
			return "Tobacco User";
		else if (sh.equals("3"))
			return "Short sight";
		else 
			return "";
	}
	
}

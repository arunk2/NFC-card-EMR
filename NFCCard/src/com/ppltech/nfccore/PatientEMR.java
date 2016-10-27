package com.ppltech.nfccore;



public class PatientEMR extends BaseModel {
	
	public Integer UHID = 0;
	public Character[] PMH = new Character[20];
	public Character[] medications = new Character[20];
	public Character[] allergies = new Character[100];
	public Integer familyHistory = 0;
	public Integer socialHistory = 0;
	public Integer primaryPhysician = 0;
	public Character[] remarks = new Character[94];
	
}

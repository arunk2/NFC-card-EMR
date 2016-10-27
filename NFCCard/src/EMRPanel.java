import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import info.clearthought.layout.*;

public class EMRPanel extends JPanel {
	
	public EMRPanel() {
		initComponents();
	}
	
	public void populatePatient(PatientEMR patient) {
		this.txtlblPatientUHID.setText(patient.UHID.toString());
		String[] pmh = patient.getPMH();
		this.txtPMH1.setText(pmh[0]);
		this.txtPMH2.setText(pmh[1]);
		this.txtPMH3.setText(pmh[2]);
		this.txtPMH4.setText(pmh[3]);
		this.txtPMH5.setText(pmh[4]);
		
		String[] medications = patient.getMedications();
		this.txtMedication1.setText(medications[0]);
		this.txtMedication2.setText(medications[1]);
		this.txtMedication3.setText(medications[2]);
		this.txtMedication4.setText(medications[3]);
		this.txtMedication5.setText(medications[4]);
		
		String[] allergy = patient.getAllergies();
		
		this.txtAllergy1.setText(allergy[0]);
		this.txtAllergy2.setText(allergy[1]);
		this.txtAllergy3.setText(allergy[2]);
		
		this.txtFamilyHistory.setText(patient.getFamilyHistory());
		this.txtSocialHistory.setText(patient.getSocialHistory());
		String rem = "";
		for (Character ch : patient.remarks) {
			rem+= ch;
		}
		
		this.txtRemarks.setLineWrap(true);
		this.txtRemarks.setColumns(10);
		this.txtRemarks.setAutoscrolls(true);
		this.txtRemarks.setText(rem);
		
		this.txtPrimaryPhysician.setText(patient.getPhysician());
		this.txtPatientName.setText(patient.getPatientName());
	}

	private void initComponents() {

		pnlPatient = new JPanel();
		txtRemarks = new JTextArea();
		txtPrimaryPhysician = new JTextField();
		txtPatientName = new JTextField();
		txtlblPatientUHID = new JTextField();
		lblPatientUHID = new JLabel();
		lblPatientName = new JLabel();
		lblPrimayPhysician = new JLabel();
		lblRemarks = new JLabel();
		pnlPMH = new JPanel();
		txtPMH3 = new JTextField();
		txtPMH2 = new JTextField();
		txtPMH1 = new JTextField();
		lblPMH = new JLabel();
		txtPMH4 = new JTextField();
		txtPMH5 = new JTextField();
		pnlMedication = new JPanel();
		txtMedication3 = new JTextField();
		txtMedication2 = new JTextField();
		txtMedication1 = new JTextField();
		lblMedication = new JLabel();
		txtMedication4 = new JTextField();
		txtMedication5 = new JTextField();
		pnlAllergies = new JPanel();
		lblAllergies = new JLabel();
		txtAllergy1 = new JTextField();
		txtAllergy2 = new JTextField();
		txtAllergy3 = new JTextField();
		pnlSocialHistory = new JPanel();
		txtSocialHistory = new JTextArea();
		lblAllergies4 = new JLabel();
		pnlFamilyHistory = new JPanel();
		txtFamilyHistory = new JTextArea();
		lblAllergies5 = new JLabel();
		pnlEncounters = new JPanel();
		scrollPane1 = new JScrollPane();
		panel10 = new JPanel();
		pnlEncounter1 = new JPanel();
		panel14 = new JPanel();
		lblEncounter1Heading = new JLabel();
		panel12 = new JPanel();
		label2 = new JLabel();
		txtEncounterDate1 = new JTextField();
		label3 = new JLabel();
		txtEncounterDoctor1 = new JTextField();
		panel13 = new JPanel();
		label4 = new JLabel();
		txtEncounterDiagnosis1 = new JTextField();
		label5 = new JLabel();
		txtEncounterProcedure1 = new JTextField();
		pnlVitals = new JPanel();
		label6 = new JLabel();
		vitalsheight1 = new JTextField();
		label7 = new JLabel();
		vitalsweight1 = new JTextField();
		label8 = new JLabel();
		vitalstemp1 = new JTextField();
		label9 = new JLabel();
		vitalspulse1 = new JTextField();
		label10 = new JLabel();
		vitalsheartrates1 = new JTextField();
		vitalsheartrated1 = new JTextField();
		pnlEncounter2 = new JPanel();
		panel15 = new JPanel();
		lblEncounter1Heading2 = new JLabel();
		panel16 = new JPanel();
		label11 = new JLabel();
		txtEncounterDate2 = new JTextField();
		label12 = new JLabel();
		txtEncounterDoctor2 = new JTextField();
		panel17 = new JPanel();
		label13 = new JLabel();
		txtEncounterDiagnosis2 = new JTextField();
		label14 = new JLabel();
		txtEncounterProcedure2 = new JTextField();
		pnlVitals2 = new JPanel();
		label15 = new JLabel();
		vitalsheight2 = new JTextField();
		label16 = new JLabel();
		vitalsweight2 = new JTextField();
		label17 = new JLabel();
		vitalstemp2 = new JTextField();
		label18 = new JLabel();
		vitalspulse2 = new JTextField();
		label19 = new JLabel();
		vitalsheartrates2 = new JTextField();
		vitalsheartrated2 = new JTextField();
		pnlEncounter3 = new JPanel();
		panel18 = new JPanel();
		lblEncounter1Heading3 = new JLabel();
		panel19 = new JPanel();
		label20 = new JLabel();
		txtEncounterDate3 = new JTextField();
		label21 = new JLabel();
		txtEncounterDoctor3 = new JTextField();
		panel20 = new JPanel();
		label22 = new JLabel();
		txtEncounterDiagnosis3 = new JTextField();
		label23 = new JLabel();
		txtEncounterProcedure3 = new JTextField();
		pnlVitals3 = new JPanel();
		label24 = new JLabel();
		vitalsheight3 = new JTextField();
		label25 = new JLabel();
		vitalsweight3 = new JTextField();
		label26 = new JLabel();
		vitalstemp3 = new JTextField();
		label27 = new JLabel();
		vitalspulse3 = new JTextField();
		label28 = new JLabel();
		vitalsheartrates3 = new JTextField();
		vitalsheartrated3 = new JTextField();

		//======== pnlPatient ========
		{

			//---- lblPatientUHID ----
			lblPatientUHID.setText("Patient UHID");

			//---- lblPatientName ----
			lblPatientName.setText("Patient Name");

			//---- lblPrimayPhysician ----
			lblPrimayPhysician.setText("Primary Physician");

			//---- lblRemarks ----
			lblRemarks.setText("Remarks");

			GroupLayout pnlPatientLayout = new GroupLayout(pnlPatient);
			pnlPatient.setLayout(pnlPatientLayout);
			pnlPatientLayout.setHorizontalGroup(
				pnlPatientLayout.createParallelGroup()
					.addGroup(pnlPatientLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(pnlPatientLayout.createParallelGroup()
							.addComponent(lblPatientName, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPrimayPhysician, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
							.addComponent(lblRemarks, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPatientUHID, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnlPatientLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
							.addComponent(txtlblPatientUHID, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
							.addComponent(txtPatientName)
							.addComponent(txtPrimaryPhysician)
							.addComponent(txtRemarks))
						.addContainerGap())
			);
			pnlPatientLayout.setVerticalGroup(
				pnlPatientLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, pnlPatientLayout.createSequentialGroup()
						.addContainerGap(32, Short.MAX_VALUE)
						.addGroup(pnlPatientLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(txtlblPatientUHID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPatientUHID))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnlPatientLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(txtPatientName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPatientName))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnlPatientLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(txtPrimaryPhysician, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPrimayPhysician))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnlPatientLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(txtRemarks, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblRemarks, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
		}
		add(pnlPatient, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

		//======== pnlPMH ========
		{

			//---- lblPMH ----
			lblPMH.setText("Past Medical History");

			GroupLayout pnlPMHLayout = new GroupLayout(pnlPMH);
			pnlPMH.setLayout(pnlPMHLayout);
			pnlPMHLayout.setHorizontalGroup(
				pnlPMHLayout.createParallelGroup()
					.addGroup(pnlPMHLayout.createSequentialGroup()
						.addGap(19, 19, 19)
						.addGroup(pnlPMHLayout.createParallelGroup()
							.addComponent(lblPMH)
							.addGroup(pnlPMHLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addComponent(txtPMH1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlPMHLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addComponent(txtPMH2, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlPMHLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addGroup(pnlPMHLayout.createParallelGroup()
									.addComponent(txtPMH4, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtPMH3, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtPMH5, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			pnlPMHLayout.setVerticalGroup(
				pnlPMHLayout.createParallelGroup()
					.addGroup(pnlPMHLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblPMH)
						.addGap(6, 6, 6)
						.addComponent(txtPMH1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(6, 6, 6)
						.addComponent(txtPMH2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(6, 6, 6)
						.addComponent(txtPMH3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtPMH4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtPMH5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
		}
		add(pnlPMH, new TableLayoutConstraints(1, 0, 1, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

		//======== pnlMedication ========
		{

			//---- lblMedication ----
			lblMedication.setText("Medication");

			GroupLayout pnlMedicationLayout = new GroupLayout(pnlMedication);
			pnlMedication.setLayout(pnlMedicationLayout);
			pnlMedicationLayout.setHorizontalGroup(
				pnlMedicationLayout.createParallelGroup()
					.addGroup(pnlMedicationLayout.createSequentialGroup()
						.addGap(19, 19, 19)
						.addGroup(pnlMedicationLayout.createParallelGroup()
							.addComponent(lblMedication)
							.addGroup(pnlMedicationLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addComponent(txtMedication1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlMedicationLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addComponent(txtMedication2, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
							.addGroup(pnlMedicationLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addGroup(pnlMedicationLayout.createParallelGroup()
									.addComponent(txtMedication4, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtMedication3, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtMedication5, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(31, Short.MAX_VALUE))
			);
			pnlMedicationLayout.setVerticalGroup(
				pnlMedicationLayout.createParallelGroup()
					.addGroup(pnlMedicationLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblMedication)
						.addGap(6, 6, 6)
						.addComponent(txtMedication1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(6, 6, 6)
						.addComponent(txtMedication2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(6, 6, 6)
						.addComponent(txtMedication3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtMedication4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtMedication5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
		}
		add(pnlMedication, new TableLayoutConstraints(2, 0, 2, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

		//======== pnlAllergies ========
		{

			//---- lblAllergies ----
			lblAllergies.setText("Allergies");

			GroupLayout pnlAllergiesLayout = new GroupLayout(pnlAllergies);
			pnlAllergies.setLayout(pnlAllergiesLayout);
			pnlAllergiesLayout.setHorizontalGroup(
				pnlAllergiesLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, pnlAllergiesLayout.createSequentialGroup()
						.addGap(20, 20, 20)
						.addGroup(pnlAllergiesLayout.createParallelGroup()
							.addComponent(lblAllergies)
							.addGroup(pnlAllergiesLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addGroup(pnlAllergiesLayout.createParallelGroup()
									.addComponent(txtAllergy2, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
									.addComponent(txtAllergy1, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
							.addGroup(pnlAllergiesLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addComponent(txtAllergy3, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
			);
			pnlAllergiesLayout.setVerticalGroup(
				pnlAllergiesLayout.createParallelGroup()
					.addGroup(pnlAllergiesLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblAllergies)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtAllergy1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtAllergy2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtAllergy3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
		}
		add(pnlAllergies, new TableLayoutConstraints(0, 1, 0, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

		//======== pnlSocialHistory ========
		{

			//---- lblAllergies4 ----
			lblAllergies4.setText("Social History");

			GroupLayout pnlSocialHistoryLayout = new GroupLayout(pnlSocialHistory);
			pnlSocialHistory.setLayout(pnlSocialHistoryLayout);
			pnlSocialHistoryLayout.setHorizontalGroup(
				pnlSocialHistoryLayout.createParallelGroup()
					.addGroup(pnlSocialHistoryLayout.createSequentialGroup()
						.addGap(19, 19, 19)
						.addGroup(pnlSocialHistoryLayout.createParallelGroup()
							.addGroup(pnlSocialHistoryLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addComponent(txtSocialHistory, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
							.addComponent(lblAllergies4))
						.addContainerGap(1, Short.MAX_VALUE))
			);
			pnlSocialHistoryLayout.setVerticalGroup(
				pnlSocialHistoryLayout.createParallelGroup()
					.addGroup(pnlSocialHistoryLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblAllergies4)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtSocialHistory, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(29, Short.MAX_VALUE))
			);
		}
		add(pnlSocialHistory, new TableLayoutConstraints(1, 1, 1, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

		//======== pnlFamilyHistory ========
		{

			//---- lblAllergies5 ----
			lblAllergies5.setText("Family History");

			GroupLayout pnlFamilyHistoryLayout = new GroupLayout(pnlFamilyHistory);
			pnlFamilyHistory.setLayout(pnlFamilyHistoryLayout);
			pnlFamilyHistoryLayout.setHorizontalGroup(
				pnlFamilyHistoryLayout.createParallelGroup()
					.addGroup(pnlFamilyHistoryLayout.createSequentialGroup()
						.addGap(19, 19, 19)
						.addGroup(pnlFamilyHistoryLayout.createParallelGroup()
							.addGroup(pnlFamilyHistoryLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addComponent(txtFamilyHistory, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
							.addComponent(lblAllergies5))
						.addContainerGap(31, Short.MAX_VALUE))
			);
			pnlFamilyHistoryLayout.setVerticalGroup(
				pnlFamilyHistoryLayout.createParallelGroup()
					.addGroup(pnlFamilyHistoryLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblAllergies5)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtFamilyHistory, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(29, Short.MAX_VALUE))
			);
		}
		add(pnlFamilyHistory, new TableLayoutConstraints(2, 1, 2, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

		//======== pnlEncounters ========
		{

			//======== scrollPane1 ========
			{

				//======== panel10 ========
				{
					panel10.setLayout(new TableLayout(new double[][] {
						{788},
						{TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED}}));
					((TableLayout)panel10.getLayout()).setHGap(5);
					((TableLayout)panel10.getLayout()).setVGap(5);

					//======== pnlEncounter1 ========
					{
						pnlEncounter1.setLayout(new TableLayout(new double[][] {
							{173, 267, 330},
							{28, 69}}));
						((TableLayout)pnlEncounter1.getLayout()).setHGap(5);
						((TableLayout)pnlEncounter1.getLayout()).setVGap(5);

						//======== panel14 ========
						{

							//---- lblEncounter1Heading ----
							lblEncounter1Heading.setText("Visit - Date / Doctor");

							GroupLayout panel14Layout = new GroupLayout(panel14);
							panel14.setLayout(panel14Layout);
							panel14Layout.setHorizontalGroup(
								panel14Layout.createParallelGroup()
									.addGroup(GroupLayout.Alignment.TRAILING, panel14Layout.createSequentialGroup()
										.addContainerGap(16, Short.MAX_VALUE)
										.addComponent(lblEncounter1Heading, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
										.addGap(43, 43, 43))
							);
							panel14Layout.setVerticalGroup(
								panel14Layout.createParallelGroup()
									.addGroup(panel14Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblEncounter1Heading)
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
						}
						pnlEncounter1.add(panel14, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

						//======== panel12 ========
						{

							//---- label2 ----
							label2.setText("Date");

							//---- label3 ----
							label3.setText("Doctor");

							GroupLayout panel12Layout = new GroupLayout(panel12);
							panel12.setLayout(panel12Layout);
							panel12Layout.setHorizontalGroup(
								panel12Layout.createParallelGroup()
									.addGroup(panel12Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
											.addGroup(panel12Layout.createSequentialGroup()
												.addComponent(label2)
												.addGap(18, 18, 18)
												.addComponent(txtEncounterDate1, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
											.addGroup(panel12Layout.createSequentialGroup()
												.addComponent(label3)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(txtEncounterDoctor1)))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							panel12Layout.setVerticalGroup(
								panel12Layout.createParallelGroup()
									.addGroup(panel12Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label2)
											.addComponent(txtEncounterDate1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(panel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label3)
											.addComponent(txtEncounterDoctor1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(12, Short.MAX_VALUE))
							);
						}
						pnlEncounter1.add(panel12, new TableLayoutConstraints(0, 1, 0, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

						//======== panel13 ========
						{

							//---- label4 ----
							label4.setText("Diagnosis");

							//---- label5 ----
							label5.setText("Procedure");

							GroupLayout panel13Layout = new GroupLayout(panel13);
							panel13.setLayout(panel13Layout);
							panel13Layout.setHorizontalGroup(
								panel13Layout.createParallelGroup()
									.addGroup(panel13Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel13Layout.createParallelGroup()
											.addGroup(panel13Layout.createSequentialGroup()
												.addComponent(label4)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(txtEncounterDiagnosis1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
											.addGroup(panel13Layout.createSequentialGroup()
												.addComponent(label5)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
												.addComponent(txtEncounterProcedure1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							panel13Layout.setVerticalGroup(
								panel13Layout.createParallelGroup()
									.addGroup(panel13Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label4)
											.addComponent(txtEncounterDiagnosis1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(panel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label5)
											.addComponent(txtEncounterProcedure1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(12, Short.MAX_VALUE))
							);
						}
						pnlEncounter1.add(panel13, new TableLayoutConstraints(1, 1, 1, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

						//======== pnlVitals ========
						{

							//---- label6 ----
							label6.setText("Height");

							//---- label7 ----
							label7.setText("Weight");

							//---- label8 ----
							label8.setText("Temperature");

							//---- label9 ----
							label9.setText("Pulse");

							//---- label10 ----
							label10.setText("Heart Rate");

							GroupLayout pnlVitalsLayout = new GroupLayout(pnlVitals);
							pnlVitals.setLayout(pnlVitalsLayout);
							pnlVitalsLayout.setHorizontalGroup(
								pnlVitalsLayout.createParallelGroup()
									.addGroup(pnlVitalsLayout.createSequentialGroup()
										.addContainerGap()
										.addGroup(pnlVitalsLayout.createParallelGroup()
											.addComponent(label6)
											.addComponent(label7))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pnlVitalsLayout.createParallelGroup()
											.addComponent(vitalsweight1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addComponent(vitalsheight1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(pnlVitalsLayout.createParallelGroup()
											.addComponent(label8)
											.addComponent(label9))
										.addGap(7, 7, 7)
										.addGroup(pnlVitalsLayout.createParallelGroup()
											.addComponent(vitalspulse1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addComponent(vitalstemp1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addComponent(label10)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pnlVitalsLayout.createParallelGroup()
											.addComponent(vitalsheartrates1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addComponent(vitalsheartrated1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							pnlVitalsLayout.setVerticalGroup(
								pnlVitalsLayout.createParallelGroup()
									.addGroup(pnlVitalsLayout.createSequentialGroup()
										.addContainerGap()
										.addGroup(pnlVitalsLayout.createParallelGroup()
											.addGroup(pnlVitalsLayout.createSequentialGroup()
												.addGroup(pnlVitalsLayout.createParallelGroup()
													.addGroup(pnlVitalsLayout.createSequentialGroup()
														.addGap(3, 3, 3)
														.addComponent(label8))
													.addComponent(vitalstemp1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(pnlVitalsLayout.createParallelGroup()
													.addGroup(pnlVitalsLayout.createSequentialGroup()
														.addGap(9, 9, 9)
														.addComponent(label9))
													.addGroup(pnlVitalsLayout.createSequentialGroup()
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(vitalspulse1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
											.addGroup(pnlVitalsLayout.createSequentialGroup()
												.addGroup(pnlVitalsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(label6)
													.addComponent(vitalsheight1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pnlVitalsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(label7)
													.addComponent(vitalsweight1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(12, Short.MAX_VALUE))
									.addGroup(GroupLayout.Alignment.TRAILING, pnlVitalsLayout.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(pnlVitalsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label10)
											.addComponent(vitalsheartrates1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(vitalsheartrated1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(22, 22, 22))
							);
						}
						pnlEncounter1.add(pnlVitals, new TableLayoutConstraints(2, 1, 2, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
					}
					panel10.add(pnlEncounter1, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

					//======== pnlEncounter2 ========
					{
						pnlEncounter2.setLayout(new TableLayout(new double[][] {
							{173, 267, 330},
							{28, 69}}));
						((TableLayout)pnlEncounter2.getLayout()).setHGap(5);
						((TableLayout)pnlEncounter2.getLayout()).setVGap(5);

						//======== panel15 ========
						{

							//---- lblEncounter1Heading2 ----
							lblEncounter1Heading2.setText("Visit - Date / Doctor");

							GroupLayout panel15Layout = new GroupLayout(panel15);
							panel15.setLayout(panel15Layout);
							panel15Layout.setHorizontalGroup(
								panel15Layout.createParallelGroup()
									.addGroup(GroupLayout.Alignment.TRAILING, panel15Layout.createSequentialGroup()
										.addContainerGap(16, Short.MAX_VALUE)
										.addComponent(lblEncounter1Heading2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
										.addGap(43, 43, 43))
							);
							panel15Layout.setVerticalGroup(
								panel15Layout.createParallelGroup()
									.addGroup(panel15Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblEncounter1Heading2)
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
						}
						pnlEncounter2.add(panel15, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

						//======== panel16 ========
						{

							//---- label11 ----
							label11.setText("Date");

							//---- label12 ----
							label12.setText("Doctor");

							GroupLayout panel16Layout = new GroupLayout(panel16);
							panel16.setLayout(panel16Layout);
							panel16Layout.setHorizontalGroup(
								panel16Layout.createParallelGroup()
									.addGroup(panel16Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
											.addGroup(panel16Layout.createSequentialGroup()
												.addComponent(label11)
												.addGap(18, 18, 18)
												.addComponent(txtEncounterDate2, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
											.addGroup(panel16Layout.createSequentialGroup()
												.addComponent(label12)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(txtEncounterDoctor2)))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							panel16Layout.setVerticalGroup(
								panel16Layout.createParallelGroup()
									.addGroup(panel16Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label11)
											.addComponent(txtEncounterDate2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(panel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label12)
											.addComponent(txtEncounterDoctor2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(12, Short.MAX_VALUE))
							);
						}
						pnlEncounter2.add(panel16, new TableLayoutConstraints(0, 1, 0, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

						//======== panel17 ========
						{

							//---- label13 ----
							label13.setText("Diagnosis");

							//---- label14 ----
							label14.setText("Procedure");

							GroupLayout panel17Layout = new GroupLayout(panel17);
							panel17.setLayout(panel17Layout);
							panel17Layout.setHorizontalGroup(
								panel17Layout.createParallelGroup()
									.addGroup(panel17Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel17Layout.createParallelGroup()
											.addGroup(panel17Layout.createSequentialGroup()
												.addComponent(label13)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(txtEncounterDiagnosis2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
											.addGroup(panel17Layout.createSequentialGroup()
												.addComponent(label14)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
												.addComponent(txtEncounterProcedure2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							panel17Layout.setVerticalGroup(
								panel17Layout.createParallelGroup()
									.addGroup(panel17Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label13)
											.addComponent(txtEncounterDiagnosis2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label14)
											.addComponent(txtEncounterProcedure2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(12, Short.MAX_VALUE))
							);
						}
						pnlEncounter2.add(panel17, new TableLayoutConstraints(1, 1, 1, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

						//======== pnlVitals2 ========
						{

							//---- label15 ----
							label15.setText("Height");

							//---- label16 ----
							label16.setText("Weight");

							//---- label17 ----
							label17.setText("Temperature");

							//---- label18 ----
							label18.setText("Pulse");

							//---- label19 ----
							label19.setText("Heart Rate");

							GroupLayout pnlVitals2Layout = new GroupLayout(pnlVitals2);
							pnlVitals2.setLayout(pnlVitals2Layout);
							pnlVitals2Layout.setHorizontalGroup(
								pnlVitals2Layout.createParallelGroup()
									.addGroup(pnlVitals2Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(pnlVitals2Layout.createParallelGroup()
											.addComponent(label15)
											.addComponent(label16))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pnlVitals2Layout.createParallelGroup()
											.addComponent(vitalsweight2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addComponent(vitalsheight2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(pnlVitals2Layout.createParallelGroup()
											.addComponent(label17)
											.addComponent(label18))
										.addGap(7, 7, 7)
										.addGroup(pnlVitals2Layout.createParallelGroup()
											.addComponent(vitalspulse2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addComponent(vitalstemp2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addComponent(label19)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pnlVitals2Layout.createParallelGroup()
											.addComponent(vitalsheartrates2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addComponent(vitalsheartrated2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							pnlVitals2Layout.setVerticalGroup(
								pnlVitals2Layout.createParallelGroup()
									.addGroup(pnlVitals2Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(pnlVitals2Layout.createParallelGroup()
											.addGroup(pnlVitals2Layout.createSequentialGroup()
												.addGroup(pnlVitals2Layout.createParallelGroup()
													.addGroup(pnlVitals2Layout.createSequentialGroup()
														.addGap(3, 3, 3)
														.addComponent(label17))
													.addComponent(vitalstemp2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(pnlVitals2Layout.createParallelGroup()
													.addGroup(pnlVitals2Layout.createSequentialGroup()
														.addGap(9, 9, 9)
														.addComponent(label18))
													.addGroup(pnlVitals2Layout.createSequentialGroup()
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(vitalspulse2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
											.addGroup(pnlVitals2Layout.createSequentialGroup()
												.addGroup(pnlVitals2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(label15)
													.addComponent(vitalsheight2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pnlVitals2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(label16)
													.addComponent(vitalsweight2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(12, Short.MAX_VALUE))
									.addGroup(GroupLayout.Alignment.TRAILING, pnlVitals2Layout.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(pnlVitals2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label19)
											.addComponent(vitalsheartrates2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(vitalsheartrated2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(22, 22, 22))
							);
						}
						pnlEncounter2.add(pnlVitals2, new TableLayoutConstraints(2, 1, 2, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
					}
					panel10.add(pnlEncounter2, new TableLayoutConstraints(0, 1, 0, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

					//======== pnlEncounter3 ========
					{
						pnlEncounter3.setLayout(new TableLayout(new double[][] {
							{173, 267, 330},
							{28, 69}}));
						((TableLayout)pnlEncounter3.getLayout()).setHGap(5);
						((TableLayout)pnlEncounter3.getLayout()).setVGap(5);

						//======== panel18 ========
						{

							//---- lblEncounter1Heading3 ----
							lblEncounter1Heading3.setText("Visit - Date / Doctor");

							GroupLayout panel18Layout = new GroupLayout(panel18);
							panel18.setLayout(panel18Layout);
							panel18Layout.setHorizontalGroup(
								panel18Layout.createParallelGroup()
									.addGroup(GroupLayout.Alignment.TRAILING, panel18Layout.createSequentialGroup()
										.addContainerGap(16, Short.MAX_VALUE)
										.addComponent(lblEncounter1Heading3, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
										.addGap(43, 43, 43))
							);
							panel18Layout.setVerticalGroup(
								panel18Layout.createParallelGroup()
									.addGroup(panel18Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblEncounter1Heading3)
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
						}
						pnlEncounter3.add(panel18, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

						//======== panel19 ========
						{

							//---- label20 ----
							label20.setText("Date");

							//---- label21 ----
							label21.setText("Doctor");

							GroupLayout panel19Layout = new GroupLayout(panel19);
							panel19.setLayout(panel19Layout);
							panel19Layout.setHorizontalGroup(
								panel19Layout.createParallelGroup()
									.addGroup(panel19Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
											.addGroup(panel19Layout.createSequentialGroup()
												.addComponent(label20)
												.addGap(18, 18, 18)
												.addComponent(txtEncounterDate3, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
											.addGroup(panel19Layout.createSequentialGroup()
												.addComponent(label21)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(txtEncounterDoctor3)))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							panel19Layout.setVerticalGroup(
								panel19Layout.createParallelGroup()
									.addGroup(panel19Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label20)
											.addComponent(txtEncounterDate3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(panel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label21)
											.addComponent(txtEncounterDoctor3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(12, Short.MAX_VALUE))
							);
						}
						pnlEncounter3.add(panel19, new TableLayoutConstraints(0, 1, 0, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

						//======== panel20 ========
						{

							//---- label22 ----
							label22.setText("Diagnosis");

							//---- label23 ----
							label23.setText("Procedure");

							GroupLayout panel20Layout = new GroupLayout(panel20);
							panel20.setLayout(panel20Layout);
							panel20Layout.setHorizontalGroup(
								panel20Layout.createParallelGroup()
									.addGroup(panel20Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel20Layout.createParallelGroup()
											.addGroup(panel20Layout.createSequentialGroup()
												.addComponent(label22)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(txtEncounterDiagnosis3, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
											.addGroup(panel20Layout.createSequentialGroup()
												.addComponent(label23)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
												.addComponent(txtEncounterProcedure3, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							panel20Layout.setVerticalGroup(
								panel20Layout.createParallelGroup()
									.addGroup(panel20Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(panel20Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label22)
											.addComponent(txtEncounterDiagnosis3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(panel20Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label23)
											.addComponent(txtEncounterProcedure3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(12, Short.MAX_VALUE))
							);
						}
						pnlEncounter3.add(panel20, new TableLayoutConstraints(1, 1, 1, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

						//======== pnlVitals3 ========
						{

							//---- label24 ----
							label24.setText("Height");

							//---- label25 ----
							label25.setText("Weight");

							//---- label26 ----
							label26.setText("Temperature");

							//---- label27 ----
							label27.setText("Pulse");

							//---- label28 ----
							label28.setText("Heart Rate");

							GroupLayout pnlVitals3Layout = new GroupLayout(pnlVitals3);
							pnlVitals3.setLayout(pnlVitals3Layout);
							pnlVitals3Layout.setHorizontalGroup(
								pnlVitals3Layout.createParallelGroup()
									.addGroup(pnlVitals3Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(pnlVitals3Layout.createParallelGroup()
											.addComponent(label24)
											.addComponent(label25))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pnlVitals3Layout.createParallelGroup()
											.addComponent(vitalsweight3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addComponent(vitalsheight3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(pnlVitals3Layout.createParallelGroup()
											.addComponent(label26)
											.addComponent(label27))
										.addGap(7, 7, 7)
										.addGroup(pnlVitals3Layout.createParallelGroup()
											.addComponent(vitalspulse3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addComponent(vitalstemp3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addComponent(label28)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pnlVitals3Layout.createParallelGroup()
											.addComponent(vitalsheartrates3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addComponent(vitalsheartrated3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							pnlVitals3Layout.setVerticalGroup(
								pnlVitals3Layout.createParallelGroup()
									.addGroup(pnlVitals3Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(pnlVitals3Layout.createParallelGroup()
											.addGroup(pnlVitals3Layout.createSequentialGroup()
												.addGroup(pnlVitals3Layout.createParallelGroup()
													.addGroup(pnlVitals3Layout.createSequentialGroup()
														.addGap(3, 3, 3)
														.addComponent(label26))
													.addComponent(vitalstemp3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(pnlVitals3Layout.createParallelGroup()
													.addGroup(pnlVitals3Layout.createSequentialGroup()
														.addGap(9, 9, 9)
														.addComponent(label27))
													.addGroup(pnlVitals3Layout.createSequentialGroup()
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(vitalspulse3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
											.addGroup(pnlVitals3Layout.createSequentialGroup()
												.addGroup(pnlVitals3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(label24)
													.addComponent(vitalsheight3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pnlVitals3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(label25)
													.addComponent(vitalsweight3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(12, Short.MAX_VALUE))
									.addGroup(GroupLayout.Alignment.TRAILING, pnlVitals3Layout.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(pnlVitals3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(label28)
											.addComponent(vitalsheartrates3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(vitalsheartrated3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(22, 22, 22))
							);
						}
						pnlEncounter3.add(pnlVitals3, new TableLayoutConstraints(2, 1, 2, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
					}
					panel10.add(pnlEncounter3, new TableLayoutConstraints(0, 2, 0, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
				}
				scrollPane1.setViewportView(panel10);
			}

			GroupLayout pnlEncountersLayout = new GroupLayout(pnlEncounters);
			pnlEncounters.setLayout(pnlEncountersLayout);
			pnlEncountersLayout.setHorizontalGroup(
				pnlEncountersLayout.createParallelGroup()
					.addGroup(pnlEncountersLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE))
			);
			pnlEncountersLayout.setVerticalGroup(
				pnlEncountersLayout.createParallelGroup()
					.addGroup(pnlEncountersLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
						.addContainerGap())
			);
		}
		add(pnlEncounters, new TableLayoutConstraints(0, 2, 2, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

	}

	private JPanel pnlPatient;
	private JTextArea txtRemarks;
	private JTextField txtPrimaryPhysician;
	private JTextField txtPatientName;
	private JTextField txtlblPatientUHID;
	private JLabel lblPatientUHID;
	private JLabel lblPatientName;
	private JLabel lblPrimayPhysician;
	private JLabel lblRemarks;
	private JPanel pnlPMH;
	private JTextField txtPMH3;
	private JTextField txtPMH2;
	private JTextField txtPMH1;
	private JLabel lblPMH;
	private JTextField txtPMH4;
	private JTextField txtPMH5;
	private JPanel pnlMedication;
	private JTextField txtMedication3;
	private JTextField txtMedication2;
	private JTextField txtMedication1;
	private JLabel lblMedication;
	private JTextField txtMedication4;
	private JTextField txtMedication5;
	private JPanel pnlAllergies;
	private JLabel lblAllergies;
	private JTextField txtAllergy1;
	private JTextField txtAllergy2;
	private JTextField txtAllergy3;
	private JPanel pnlSocialHistory;
	private JTextArea txtSocialHistory;
	private JLabel lblAllergies4;
	private JPanel pnlFamilyHistory;
	private JTextArea txtFamilyHistory;
	private JLabel lblAllergies5;
	private JPanel pnlEncounters;
	private JScrollPane scrollPane1;
	private JPanel panel10;
	private JPanel pnlEncounter1;
	private JPanel panel14;
	private JLabel lblEncounter1Heading;
	private JPanel panel12;
	private JLabel label2;
	private JTextField txtEncounterDate1;
	private JLabel label3;
	private JTextField txtEncounterDoctor1;
	private JPanel panel13;
	private JLabel label4;
	private JTextField txtEncounterDiagnosis1;
	private JLabel label5;
	private JTextField txtEncounterProcedure1;
	private JPanel pnlVitals;
	private JLabel label6;
	private JTextField vitalsheight1;
	private JLabel label7;
	private JTextField vitalsweight1;
	private JLabel label8;
	private JTextField vitalstemp1;
	private JLabel label9;
	private JTextField vitalspulse1;
	private JLabel label10;
	private JTextField vitalsheartrates1;
	private JTextField vitalsheartrated1;
	private JPanel pnlEncounter2;
	private JPanel panel15;
	private JLabel lblEncounter1Heading2;
	private JPanel panel16;
	private JLabel label11;
	private JTextField txtEncounterDate2;
	private JLabel label12;
	private JTextField txtEncounterDoctor2;
	private JPanel panel17;
	private JLabel label13;
	private JTextField txtEncounterDiagnosis2;
	private JLabel label14;
	private JTextField txtEncounterProcedure2;
	private JPanel pnlVitals2;
	private JLabel label15;
	private JTextField vitalsheight2;
	private JLabel label16;
	private JTextField vitalsweight2;
	private JLabel label17;
	private JTextField vitalstemp2;
	private JLabel label18;
	private JTextField vitalspulse2;
	private JLabel label19;
	private JTextField vitalsheartrates2;
	private JTextField vitalsheartrated2;
	private JPanel pnlEncounter3;
	private JPanel panel18;
	private JLabel lblEncounter1Heading3;
	private JPanel panel19;
	private JLabel label20;
	private JTextField txtEncounterDate3;
	private JLabel label21;
	private JTextField txtEncounterDoctor3;
	private JPanel panel20;
	private JLabel label22;
	private JTextField txtEncounterDiagnosis3;
	private JLabel label23;
	private JTextField txtEncounterProcedure3;
	private JPanel pnlVitals3;
	private JLabel label24;
	private JTextField vitalsheight3;
	private JLabel label25;
	private JTextField vitalsweight3;
	private JLabel label26;
	private JTextField vitalstemp3;
	private JLabel label27;
	private JTextField vitalspulse3;
	private JLabel label28;
	private JTextField vitalsheartrates3;
	private JTextField vitalsheartrated3;

}

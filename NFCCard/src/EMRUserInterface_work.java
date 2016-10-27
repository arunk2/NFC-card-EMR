/*
  Copyright(C):      Advanced Card Systems Ltd

  File:              mifareProg.java

  Description:       This sample program outlines the steps on how to
                     transact with MiFare cards using ACR122

  Author:            M.J.E.C. Castillo

  Date:              July 28, 2008

  Revision Trail:   (Date/Author/Description)

======================================================================*/

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EMRUserInterface extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// GUI Variables
	private JButton bRead, bWrite, bQuit;
	private JPanel readerPanel;
	private EMRPanel emrPanel;

	public EMRUserInterface() {

		this.setTitle("NFC in Healthcare - EMR system");
		initComponents();
	}


	private void initComponents() {

		setSize(900, 700);
		emrPanel = new EMRPanel();
		readerPanel = new JPanel();
		bRead = new JButton();
		bWrite = new JButton();
		bQuit = new JButton();

		bRead.setText("Read");
		bWrite.setText("Write");
		bQuit.setText("Quit");

		javax.swing.GroupLayout readerPanel6Layout = new javax.swing.GroupLayout(
				readerPanel);
		readerPanel.setLayout(readerPanel6Layout);
		readerPanel6Layout
				.setHorizontalGroup(readerPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								readerPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												readerPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																bRead,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																110,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																bWrite,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																110,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																bQuit,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																110,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																emrPanel,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																900,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		readerPanel6Layout
				.setVerticalGroup(readerPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								readerPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(bRead)
										.addComponent(bWrite)
										.addComponent(bQuit)
										.addComponent(emrPanel)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)));


		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		readerPanel,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(28, 28,
																		28)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		readerPanel,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(8, 8, 8)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
								.addContainerGap(42, Short.MAX_VALUE)));

		bRead.addActionListener(this);
		bWrite.addActionListener(this);
		bQuit.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		if (bRead == e.getSource()) {

			// /////////////
			Mifare1KCard card = new Mifare1KCard();
			byte[] bytes = card.read(250);

			PatientEMR pat = new PatientEMR();
			pat = (PatientEMR) pat.toObject(bytes);

//			mMsg.setText("PATIENT INFO Reading - \n");
//			mMsg.append(pat.toString());
			System.out.println("PATIENT INFO Reading - \n");
			System.out.println(pat.toString());
			
			emrPanel.populatePatient(pat);

			// ////////////

		}
		
		if (bWrite == e.getSource()) {

			// /////////////
			PatientEMR patient = getPatient();

//			mMsg.setText("PATIENT INFO Reading - \n");
//			mMsg.append(patient.toString());

			byte[] patientBytes = patient.toByteArray();

			Mifare1KCard card = new Mifare1KCard();
			boolean ret = card.write(patientBytes);

//			if (ret)
//				mMsg.append("\nSuccessfully written!");
//			else
//				mMsg.append("\nError in writing to card!");

			// ////////////

		}

		if (bQuit == e.getSource()) {

			this.dispose();

		}
	}

	public PatientEMR getPatient() {
		PatientEMR patient = new PatientEMR();
		patient.UHID = new Integer(2);

		for (int i = 0; i < 20; i++) {
			patient.PMH[i] = 'X';
		}
		patient.PMH[0] = 'C';
		patient.PMH[1] = 'C';
		patient.PMH[2] = 'C';
		patient.PMH[3] = 'C';
		patient.PMH[4] = 'A';
		patient.PMH[5] = 'A';
		patient.PMH[6] = 'A';
		patient.PMH[7] = 'A';

		for (int i = 0; i < 20; i++) {
			patient.medications[i] = 'X';
		}
		patient.medications[0] = 'B';
		patient.medications[1] = 'B';
		patient.medications[2] = 'B';
		patient.medications[3] = 'B';
//		patient.medications[4] = 'D';
//		patient.medications[5] = 'D';
//		patient.medications[6] = 'D';
//		patient.medications[7] = 'D';

		for (int i = 0; i < 100; i++) {
			patient.allergies[i] = 'X';
		}
		patient.allergies[0] = 'A';
		patient.allergies[1] = 'A';
		patient.allergies[2] = 'A';
		patient.allergies[3] = 'A';
		patient.allergies[4] = 'B';
		patient.allergies[5] = 'B';
		patient.allergies[6] = 'B';
		patient.allergies[7] = 'B';

		patient.familyHistory = 2;
		patient.socialHistory = 2;

		patient.primaryPhysician =2;
		for (int i = 0; i < 94; i++) {
			patient.remarks[i] = ' ';
		}
//		patient.remarks[0] = 't';
//		patient.remarks[1] = 'a';
//		patient.remarks[2] = 'k';
//		patient.remarks[3] = 'i';
//		patient.remarks[4] = 'n';
//		patient.remarks[5] = 'g';
//		patient.remarks[6] = ' ';
//		patient.remarks[7] = 'i';
//		patient.remarks[8] = 'n';
//		patient.remarks[9] = 's';
//		patient.remarks[10] = 'u';
//		patient.remarks[11] = 'l';
//		patient.remarks[12] = 'i';
//		patient.remarks[13] = 'n';

		return patient;

	}

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EMRUserInterface().setVisible(true);
			}
		});
	}

}

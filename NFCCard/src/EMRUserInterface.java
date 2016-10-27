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

			emrPanel.populatePatient(pat);

		}
		
		if (bWrite == e.getSource()) {

			PatientEMR patient = getPatient();
			byte[] patientBytes = patient.toByteArray();

			Mifare1KCard card = new Mifare1KCard();
			boolean ret = card.write(patientBytes);

		}

		if (bQuit == e.getSource()) {

			this.dispose();

		}
	}

	public PatientEMR getPatient() {
		PatientEMR patient = new PatientEMR();
		//Load Patient details from hosoital/clinic EMR system
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

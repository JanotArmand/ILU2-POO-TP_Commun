/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import java.net.URL;

import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;

import dialog.DialogReservation;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

	private DialogReservation dialog;

	public FrameReservation() {
	}

	public void initFrame() {
		initComponents();
	}

	public void setDialog(DialogReservation dialog) {
		this.dialog = dialog;
	}

	// /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
	// ce code est auto généré et ne doit PAS être modifié
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		dateTimePanel = new javax.swing.JPanel();
		datePicker = new com.github.lgooddatepicker.components.DatePicker();
		datePicker.addDateChangeListener(new DateChangeListener() {
			@Override
			public void dateChanged(DateChangeEvent dateEvent) {
				datePickerDateChanged(dateEvent);
			}
		});
		ChoisirHeure_ComboBox = new javax.swing.JComboBox<>();
		DateTexte_jLabel = new javax.swing.JLabel();
		HeureTexte_jLabel = new javax.swing.JLabel();
		nbPersonsPanel = new javax.swing.JPanel();
		ChoisirNbPersonnes_ComboBox = new javax.swing.JComboBox<>();
		NbPersonnesTexte_jLabel = new javax.swing.JLabel();
		pickTablePanel = new javax.swing.JPanel();
		TableImage_jLabel = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		Tables_jList = new javax.swing.JList<>();
		Table_jLabel = new javax.swing.JLabel();
		Valider_jButton = new javax.swing.JButton();
		Annuler_jButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		ChoisirHeure_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "...", "11h", "11h30", "12h", "12h30", "13h", "13h30" }));
		ChoisirHeure_ComboBox.setEnabled(false);
		ChoisirHeure_ComboBox.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ChoisirHeure_ComboBoxActionPerformed(evt);
			}
		});

		DateTexte_jLabel.setText("1. Choisissez la date");
		DateTexte_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

		HeureTexte_jLabel.setText("2. Choisissez l'heure");
		HeureTexte_jLabel.setEnabled(false);
		HeureTexte_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

		javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
		dateTimePanel.setLayout(dateTimePanelLayout);
		dateTimePanelLayout
				.setHorizontalGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(dateTimePanelLayout.createSequentialGroup().addGap(19, 19, 19)
								.addGroup(dateTimePanelLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(DateTexte_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(dateTimePanelLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(HeureTexte_jLabel).addComponent(ChoisirHeure_ComboBox,
												javax.swing.GroupLayout.PREFERRED_SIZE, 213,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(16, 16, 16)));
		dateTimePanelLayout.setVerticalGroup(dateTimePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(dateTimePanelLayout.createSequentialGroup().addGap(7, 7, 7)
						.addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(DateTexte_jLabel).addComponent(HeureTexte_jLabel))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ChoisirHeure_ComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 34,
										Short.MAX_VALUE))
						.addContainerGap(47, Short.MAX_VALUE)));

		datePicker.getAccessibleContext().setAccessibleName("");
		datePicker.getAccessibleContext().setAccessibleDescription("");

		nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		ChoisirNbPersonnes_ComboBox.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3", "4", "5", "6", "7", "8" }));
		ChoisirNbPersonnes_ComboBox.setEnabled(false);
		ChoisirNbPersonnes_ComboBox.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ChoisirNbPersonnes_ComboBoxActionPerformed(evt);
			}
		});

		NbPersonnesTexte_jLabel.setText("3. Indiquez le nombre de personnes");
		NbPersonnesTexte_jLabel.setEnabled(false);
		NbPersonnesTexte_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

		javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
		nbPersonsPanel.setLayout(nbPersonsPanelLayout);
		nbPersonsPanelLayout.setHorizontalGroup(nbPersonsPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(nbPersonsPanelLayout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(NbPersonnesTexte_jLabel).addComponent(ChoisirNbPersonnes_ComboBox,
										javax.swing.GroupLayout.PREFERRED_SIZE, 112,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		nbPersonsPanelLayout
				.setVerticalGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(nbPersonsPanelLayout.createSequentialGroup().addGap(12, 12, 12)
								.addComponent(NbPersonnesTexte_jLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(ChoisirNbPersonnes_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(32, Short.MAX_VALUE)));

		pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		URL location = getClass().getResource("/Plan_tables.JPG");
		if (location != null) {
			TableImage_jLabel.setIcon(new javax.swing.ImageIcon(location)); // NOI18N
		}
		TableImage_jLabel.setEnabled(false);

		Tables_jList.setEnabled(false);
		Tables_jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
			@Override
			public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
				Tables_jListValueChanged(evt);
			}
		});
		jScrollPane1.setViewportView(Tables_jList);

		Table_jLabel.setText("4. Choisissez la table");
		Table_jLabel.setEnabled(false);
		Table_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

		javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
		pickTablePanel.setLayout(pickTablePanelLayout);
		pickTablePanelLayout
				.setHorizontalGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pickTablePanelLayout.createSequentialGroup().addContainerGap()
								.addComponent(TableImage_jLabel).addGap(28, 28, 28)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(34, Short.MAX_VALUE))
						.addGroup(pickTablePanelLayout.createSequentialGroup().addComponent(Table_jLabel).addGap(0, 0,
								Short.MAX_VALUE)));
		pickTablePanelLayout.setVerticalGroup(pickTablePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pickTablePanelLayout.createSequentialGroup()
						.addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pickTablePanelLayout.createSequentialGroup().addComponent(Table_jLabel)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(TableImage_jLabel))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										pickTablePanelLayout.createSequentialGroup()
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(59, 59, 59)))
						.addGap(285, 285, 285)));

		Valider_jButton.setText("Valider");
		Valider_jButton.setEnabled(false);
		Valider_jButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Valider_jButtonActionPerformed(evt);
			}
		});

		Annuler_jButton.setText("Annuler");
		Annuler_jButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Annuler_jButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Valider_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(Annuler_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(15, 15, 15)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(16, 16, 16)
						.addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 298,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Valider_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39,
										Short.MAX_VALUE)
								.addComponent(Annuler_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39,
										Short.MAX_VALUE))
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void ChoisirNbPersonnes_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ChoisirNbPersonnes_ComboBoxActionPerformed
		String nbPersonnes = ChoisirNbPersonnes_ComboBox.getSelectedItem().toString();
		if (!"...".equals(nbPersonnes)) {
			dialog.handleNumOfPersonsSelectedEvent(Integer.parseInt(nbPersonnes));
		} else {
			disableTables();
		}
	}// GEN-LAST:event_ChoisirNbPersonnes_ComboBoxActionPerformed

	private void Valider_jButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Valider_jButtonActionPerformed
		dialog.handleValidationEvent();
	}// GEN-LAST:event_Valider_jButtonActionPerformed

	private void Annuler_jButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Annuler_jButtonActionPerformed
		dialog.handleCancelEvent();
	}// GEN-LAST:event_Annuler_jButtonActionPerformed

	private void ChoisirHeure_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ChoisirHeure_ComboBoxActionPerformed
		dialog.handleTimeSelectedEvent(ChoisirHeure_ComboBox.getSelectedItem().toString());

	}// GEN-LAST:event_ChoisirHeure_ComboBoxActionPerformed

	private void Tables_jListValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_Tables_jListValueChanged
		int nbTable = Tables_jList.getSelectedIndex();
		dialog.handleTableSelectedEvent(nbTable);
		enableValider();
	}// GEN-LAST:event_Tables_jListValueChanged

	public void datePickerDateChanged(DateChangeEvent dateEvent) {
		dialog.handleDateSelectedEvent(dateEvent.getNewDate());
	}

	public void disableDate() {
		datePicker.clear();
		disableHeure();
	}

	public void enableHeure() {
		HeureTexte_jLabel.setEnabled(true);
		ChoisirHeure_ComboBox.setEnabled(true);
	}

	public void disableHeure() {
		ChoisirHeure_ComboBox.setSelectedIndex(0);
		ChoisirHeure_ComboBox.setEnabled(false);
		HeureTexte_jLabel.setEnabled(false);
		disableNbPersonnes();
	}

	public void enableNbPersonnes() {
		NbPersonnesTexte_jLabel.setEnabled(true);
		ChoisirNbPersonnes_ComboBox.setEnabled(true);
	}

	public void disableNbPersonnes() {
		NbPersonnesTexte_jLabel.setEnabled(false);
		ChoisirNbPersonnes_ComboBox.setEnabled(false);
		ChoisirNbPersonnes_ComboBox.setSelectedIndex(0);
		disableTables();
	}

	public void enableTables() {
		Table_jLabel.setEnabled(true);
		TableImage_jLabel.setEnabled(true);
		Tables_jList.setEnabled(true);
	}

	public void disableTables() {
		Table_jLabel.setEnabled(false);
		TableImage_jLabel.setEnabled(false);
		initTablesVide();
		Tables_jList.setEnabled(false);
		disableValider();
	}

	public void initTables(String[] tablesDispo) {
		Tables_jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListModel DLM = new DefaultListModel();
		int j = 0;
		for (int i = 0; i < tablesDispo.length; i++) {
			DLM.add(j, tablesDispo[i]);
			j += 1;
		}
		Tables_jList.setModel(DLM);
	}

	public void initTablesVide() {
		DefaultListModel DLM = new DefaultListModel();
		Tables_jList.setModel(DLM);
	}

	public void enableValider() {
		Valider_jButton.setEnabled(true);
	}

	public void disableValider() {
		Valider_jButton.setEnabled(false);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Annuler_jButton;
	private javax.swing.JComboBox<String> ChoisirHeure_ComboBox;
	private javax.swing.JComboBox<String> ChoisirNbPersonnes_ComboBox;
	private javax.swing.JLabel DateTexte_jLabel;
	private javax.swing.JLabel HeureTexte_jLabel;
	private javax.swing.JLabel NbPersonnesTexte_jLabel;
	private javax.swing.JLabel TableImage_jLabel;
	private javax.swing.JLabel Table_jLabel;
	private javax.swing.JList<String> Tables_jList;
	private javax.swing.JButton Valider_jButton;
	private com.github.lgooddatepicker.components.DatePicker datePicker;
	private javax.swing.JPanel dateTimePanel;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JPanel nbPersonsPanel;
	private javax.swing.JPanel pickTablePanel;
	// End of variables declaration//GEN-END:variables

}

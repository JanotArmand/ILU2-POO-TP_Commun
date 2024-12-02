/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentation;

import java.net.URL;

import dialog.DialogReservation;

/**
 *
 * @author punai
 */
public class FrameConfirmation extends javax.swing.JDialog {

	/**
	 * Creates new form FrameConfirmation
	 */

	private DialogReservation dialog;

	public FrameConfirmation() {
	}

	public void initFrame() {
		initComponents();
	}

	public void setDialog(DialogReservation dialog) {
		this.dialog = dialog;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		TexteConfirmation_jLabel = new javax.swing.JLabel();
		Icon_jLabel = new javax.swing.JLabel();
		OK_jButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		URL location_logo = getClass().getResource("/logo.png");
		if (location_logo != null) {
			Icon_jLabel.setIcon(new javax.swing.ImageIcon(location_logo)); // NOI18N
		}

		OK_jButton.setText("OK");
		OK_jButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OK_jButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(15, 15, 15)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(OK_jButton)
								.addGroup(layout.createSequentialGroup().addComponent(Icon_jLabel).addGap(18, 18, 18)
										.addComponent(TexteConfirmation_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
												221, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(15, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap(21, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(Icon_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
								.addComponent(TexteConfirmation_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
						.addComponent(OK_jButton).addGap(15, 15, 15)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void OK_jButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OK_jButtonActionPerformed
		dialog.handleConfirmationReservationEvent();
	}// GEN-LAST:event_OK_jButtonActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FrameConfirmation.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameConfirmation.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameConfirmation.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameConfirmation.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				FrameConfirmation dialog = new FrameConfirmation();
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	public void InitTexte(String texte) {
		TexteConfirmation_jLabel.setText(texte);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel Icon_jLabel;
	private javax.swing.JButton OK_jButton;
	private javax.swing.JLabel TexteConfirmation_jLabel;
	// End of variables declaration//GEN-END:variables
}

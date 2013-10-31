package backup;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import org.apache.tools.zip.ZipEntry;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipOutputStream;
import javax.swing.JPasswordField;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Home() {
		setTitle("Sauvegarde de la base de donnees");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/resources/121.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 523, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 11, 487, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Backup-utility", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 467, 176);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 34, 89, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(10, 66, 70, 14);
		panel_1.add(lblPassword);
		
		JLabel lblDatabase = new JLabel("Database");
		lblDatabase.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDatabase.setBounds(10, 91, 70, 14);
		panel_1.add(lblDatabase);
		
		JLabel lblBackupto = new JLabel("Backupto");
		lblBackupto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBackupto.setBounds(10, 128, 70, 14);
		panel_1.add(lblBackupto);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED));
		textField.setBounds(101, 31, 341, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		textField_2.setBounds(101, 94, 341, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED));
		textField_3.setEditable(false);
		textField_3.setForeground(new Color(0, 0, 255));
		textField_3.setBounds(101, 125, 341, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED));
		passwordField.setBounds(101, 63, 341, 20);
		panel_1.add(passwordField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 198, 467, 63);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnParcourir = new JButton("Parcourir");
		btnParcourir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			        // TODO add your handling code here:
				textField_3.setText(getBackUpPath());
			    //GEN-LAST:event_btnchooseActionPerformed
			}
		});
		btnParcourir.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnParcourir.setBounds(10, 29, 89, 23);
		panel_2.add(btnParcourir);
		
		JButton btnBackup = new JButton("Backup");
		btnBackup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   String backuppath=textField_3.getText();
				   String Database =textField_2.getText();
				   String Password =passwordField.getText();
				   String user=textField.getText();
				   Backup b = new Backup();
				   try
				  {
				       byte[] data = b.getData("localhost", "3306", user,   Password, Database).getBytes();
				       File filedst = new File(backuppath+"\\"+Database+".zip");
				       FileOutputStream dest = new FileOutputStream(filedst);
				       ZipOutputStream zip = new ZipOutputStream(
				       new BufferedOutputStream(dest));
				       zip.setMethod(ZipOutputStream.DEFLATED);
				       zip.setLevel(Deflater.BEST_COMPRESSION);
				       zip.putNextEntry(new ZipEntry("data.sql"));
				       zip.write(data);
				       zip.close();
				       dest.close();
				      JOptionPane.showMessageDialog(null, "Traitement reussi!!!\n La sauvegarde (ou backup) reussi avec succes "+"\t"+"pour la base de donnees: "+Database+"\t        "+" !!! ","GE-SHOP SOFTWARE_MESSAGE",JOptionPane.INFORMATION_MESSAGE);

				   }catch (Exception ex){
				    JOptionPane.showMessageDialog(null, "Erreur de traitement!!!\n La sauvegarde (ou backup) echoue "+"\t"+"pour la base de donnees: "+Database+"\t "+" !!! ","GE-SHOP SOFTWARE_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
				    ex.printStackTrace();
				    
				  }//catch(NullPointerException e){}
				   //vider les saisies
				   textField.setText("");
				   passwordField.setText("");
				   textField_2.setText("");
				   textField_3.setText("");
			}
		});
		btnBackup.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnBackup.setBounds(193, 29, 89, 23);
		panel_2.add(btnBackup);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setForeground(Color.BLUE);
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnQuitter.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnQuitter.setBounds(357, 29, 89, 23);
		panel_2.add(btnQuitter);
	}
	
	
	//differentes methodes
	
	 public static String getBackUpPath() {

         String backUpPath = "";
         JFileChooser fc = null;
         if (fc == null) {
                fc = new JFileChooser();
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                fc.setAcceptAllFileFilterUsed(false);
        }
        int returnVal = fc.showDialog(null, "Open");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            backUpPath = file.getAbsolutePath();
        }
       return backUpPath;
}
}

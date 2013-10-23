package memoire;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTable;

public class Creer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creer frame = new Creer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Creer() {
		setTitle("CREER PRODUIT\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(0, 0, 550, 384);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEnregistrementDuNouveau = new JLabel("Enregistrement du nouveau produit");
		lblEnregistrementDuNouveau.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 23));
		lblEnregistrementDuNouveau.setBounds(134, 11, 316, 30);
		panel.add(lblEnregistrementDuNouveau);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(54, 52, 428, 147);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCodeProduit = new JLabel("Code produit");
		lblCodeProduit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblCodeProduit.setBounds(10, 11, 88, 14);
		panel_1.add(lblCodeProduit);
		
		JLabel lblDsignation = new JLabel("D\u00E9signation");
		lblDsignation.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDsignation.setBounds(10, 36, 88, 14);
		panel_1.add(lblDsignation);
		
		JLabel lblUnit = new JLabel("Unit\u00E9 ");
		lblUnit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblUnit.setBounds(10, 64, 46, 14);
		panel_1.add(lblUnit);
		
		JLabel lblQuantitAlerte = new JLabel("Quantit\u00E9 alerte");
		lblQuantitAlerte.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblQuantitAlerte.setBounds(10, 86, 105, 14);
		panel_1.add(lblQuantitAlerte);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDate.setBounds(10, 122, 46, 14);
		panel_1.add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(137, 8, 124, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 33, 124, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 58, 124, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 85, 124, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(137, 116, 124, 20);
		panel_1.add(dateChooser);
		
		JButton btnCrer = new JButton("Cr\u00E9er");
		btnCrer.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnCrer.setBounds(329, 7, 89, 23);
		panel_1.add(btnCrer);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnModifier.setBounds(329, 36, 89, 23);
		panel_1.add(btnModifier);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(54, 210, 428, 163);
		panel.add(scrollBar);
		
		table = new JTable();
		table.setBounds(54, 210, 428, 163);
		panel.add(table);
	}
}

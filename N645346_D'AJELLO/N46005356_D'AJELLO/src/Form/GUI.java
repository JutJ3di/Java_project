package Form;



import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Control.Control;


public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CvPaziente;
	private JTextField CodiceMedico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CvPaziente = new JTextField();
		CvPaziente.setBounds(178, 52, 246, 20);
		contentPane.add(CvPaziente);
		CvPaziente.setColumns(16);
		
		CodiceMedico = new JTextField();
		CodiceMedico.setBounds(224, 94, 86, 20);
		contentPane.add(CodiceMedico);
		CodiceMedico.setColumns(10);
		
		JLabel RisultatoRicerca = new JLabel("Risultato Ricerca");
		RisultatoRicerca.setBounds(27, 180, 98, 34);
		contentPane.add(RisultatoRicerca);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(135, 185, 289, 65);
		contentPane.add(textArea);
		
		JButton RICERCA = new JButton("Controllo");
		RICERCA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cv = CvPaziente.getText();
				int codice_medico;
				codice_medico = Integer.parseInt(CodiceMedico.getText());
				
				String Result = Control.ControllaPaziente(cv, codice_medico);
								
				textArea.setText(Result);
				
			}
		});
		RICERCA.setBounds(37, 146, 89, 23);
		contentPane.add(RICERCA);
		
		JLabel InserireCodiceMedico = new JLabel("INSERIRE CODICE MEDICO");
		InserireCodiceMedico.setBounds(27, 97, 141, 14);
		contentPane.add(InserireCodiceMedico);
		
		JLabel lblNewLabel = new JLabel("INSERIRE CV PAZIENTE");
		lblNewLabel.setBounds(27, 55, 141, 14);
		contentPane.add(lblNewLabel);
	}
}

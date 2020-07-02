package calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Image;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;



public class InterfazGrafica extends javax.swing.JFrame {

	private JPanel contentPane;
	private Label etiqueta1; //CAJA DE TEXTO EN DONDE VA EL SEGUNDO NUMERO (LADO IZQUIERDO)
	private Label etiqueta2; //CAJA DE TEXTO EN DONDE VA EL SIGNO (CENTRO)
	private Label etiqueta3;//CAJA DE TEXTO EN DONDE VA EL PRIMER NUMERO (LADO DERECHO)
	private Label etiqueta4;
	
	public InterfazGrafica() {
		cerrar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiqueta1 = new Label("");
		etiqueta1.setAlignment(Label.CENTER);
		etiqueta1.setFont(new Font("Dialog", Font.BOLD, 19));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setBounds(33, 120, 91, 30);
		contentPane.add(etiqueta1);
		
		etiqueta2 = new Label("");
		etiqueta2.setAlignment(Label.CENTER);
		etiqueta2.setFont(new Font("Dialog", Font.BOLD, 19));
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setBounds(135, 120, 91, 30);
		contentPane.add(etiqueta2);
		
		etiqueta3 = new Label("");
		etiqueta3.setAlignment(Label.CENTER);
		etiqueta3.setFont(new Font("Dialog", Font.BOLD, 19));
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setBounds(237, 120, 91, 30);
		contentPane.add(etiqueta3);

		etiqueta4 = new Label("");
		etiqueta4.setForeground(Color.BLACK);
		etiqueta4.setFont(new Font("Dialog", Font.BOLD, 55));
		etiqueta4.setBackground(Color.WHITE);
		etiqueta4.setAlignment(Label.CENTER);
		etiqueta4.setBounds(33, 40, 295, 74);
		contentPane.add(etiqueta4);
		
		Label label = new Label("");
		label.setBackground(new Color(51, 204, 255));
		label.setBounds(10, 10, 344, 5);
		contentPane.add(label);
		
		Label label_1 = new Label("");
		label_1.setBackground(new Color(135, 206, 235));
		label_1.setBounds(10, 10, 5, 167);
		contentPane.add(label_1);
		
		Label label_2 = new Label("");
		label_2.setBackground(new Color(135, 206, 235));
		label_2.setBounds(10, 546, 344, 5);
		contentPane.add(label_2);
		
		Label label_3 = new Label("");
		label_3.setBackground(new Color(135, 206, 250));
		label_3.setBounds(10, 174, 5, 130);
		contentPane.add(label_3);
		
		Label label_4 = new Label("");
		label_4.setBackground(new Color(173, 216, 230));
		label_4.setBounds(10, 287, 5, 130);
		contentPane.add(label_4);
		
		Label label_5 = new Label("");
		label_5.setBackground(new Color(176, 224, 230));
		label_5.setBounds(10, 402, 5, 86);
		contentPane.add(label_5);
		
		Label label_6 = new Label("");
		label_6.setBackground(new Color(175, 238, 238));
		label_6.setBounds(10, 488, 5, 63);
		contentPane.add(label_6);
		
		Label label_7 = new Label("");
		label_7.setBackground(new Color(135, 206, 235));
		label_7.setBounds(349, 10, 5, 167);
		contentPane.add(label_7);
		
		Label label_8 = new Label("");
		label_8.setBackground(new Color(135, 206, 250));
		label_8.setBounds(349, 174, 5, 130);
		contentPane.add(label_8);
		
		Label label_9 = new Label("");
		label_9.setBackground(new Color(173, 216, 230));
		label_9.setBounds(349, 297, 5, 130);
		contentPane.add(label_9);
		
		Label label_10 = new Label("");
		label_10.setBackground(new Color(176, 224, 230));
		label_10.setBounds(349, 402, 5, 86);
		contentPane.add(label_10);
		
		Label label_11 = new Label("");
		label_11.setBackground(new Color(175, 238, 238));
		label_11.setBounds(349, 488, 5, 63);
		contentPane.add(label_11);
		
		Label areaResultado = new Label("");
		areaResultado.setAlignment(Label.CENTER);
		areaResultado.setFont(new Font("Dialog", Font.BOLD, 25));
		areaResultado.setBackground(new Color(255, 255, 255));
		areaResultado.setBounds(23, 30, 317, 123);
		contentPane.add(areaResultado);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "1";
				etiqueta3.setText(numero1);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn1.setBounds(23, 250, 65, 54);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "2";
				etiqueta3.setText(numero1);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn2.setBounds(106, 250, 65, 54);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "3";
				etiqueta3.setText(numero1);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn3.setBounds(190, 250, 65, 54);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "4";
				etiqueta3.setText(numero1);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn4.setBounds(23, 326, 65, 54);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "5";
				etiqueta3.setText(numero1);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn5.setBounds(106, 326, 65, 54);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "6";
				etiqueta3.setText(numero1);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn6.setBounds(190, 326, 65, 54);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "7";
				etiqueta3.setText(numero1);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn7.setBounds(23, 402, 65, 54);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "8";
				etiqueta3.setText(numero1);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn8.setBounds(106, 402, 65, 54);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "9";
				etiqueta3.setText(numero1);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn9.setBounds(190, 402, 65, 54);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += "0";
				etiqueta3.setText(numero1);
			}
		});
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn0.setBounds(106, 477, 67, 54);
		contentPane.add(btn0);
		
		JButton btnMULTIPLICACION = new JButton("*");
		btnMULTIPLICACION.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!etiqueta3.getText().equals("") || contador != 0) {
					/*etiqueta2.setText("x");
					etiqueta1.setText(numero1);
					etiqueta3.setText("");*/
					
					//if (etiqueta3.getText().equals("")) {
						//numero1 = "";
						operaciones();
						etiqueta2.setText("x");
					//}
				
					//etiqueta3.setText(numero2);
					
				}
			}
		});
		btnMULTIPLICACION.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMULTIPLICACION.setBounds(190, 174, 65, 54);
		contentPane.add(btnMULTIPLICACION);
		
		JButton btnRESTA = new JButton("-");
		btnRESTA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!etiqueta3.getText().equals("") || contador != 0) {
					operaciones();
					etiqueta2 .setText("-");
				}
			}
		});
		btnRESTA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRESTA.setBounds(275, 174, 65, 54);
		contentPane.add(btnRESTA);
		
		JButton btnSUMA = new JButton("+");
		btnSUMA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!etiqueta3.getText().equals("") || contador != 0) {
					operaciones();
					etiqueta2 .setText("+");
				}
			}
		});
		btnSUMA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSUMA.setBounds(275, 250, 65, 130);
		contentPane.add(btnSUMA);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!etiqueta3.getText().equals("") || contador != 0) {
					operaciones();
					etiqueta2.setText("");
					etiqueta1.setText("");
				}
			}
		});
		btnResultado.setBackground(new Color(255, 204, 153));
		btnResultado.setForeground(Color.BLACK);
		btnResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnResultado.setBounds(275, 402, 65, 129);
		contentPane.add(btnResultado);
		
		JButton btnDIVISION = new JButton("/");
		btnDIVISION.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!etiqueta3.getText().equals("") || contador != 0) {
					operaciones();
					etiqueta2 .setText("/");
				}
			}
		});
		btnDIVISION.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDIVISION.setBounds(106, 175, 65, 54);
		contentPane.add(btnDIVISION);
		
		JButton btnPUNTO = new JButton(".");
		btnPUNTO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 += ".";
				etiqueta3.setText(numero1);
			}
		});
		btnPUNTO.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPUNTO.setBounds(190, 477, 65, 54);
		contentPane.add(btnPUNTO);
		
		
		JButton btnLIMPIAR = new JButton("C");
		btnLIMPIAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = "";
				numero2 = "";
				etiqueta4.setText("");
				contador = 0;
				
				if (numero1 == "") {
					etiqueta1.setText("");
					etiqueta2.setText("");
				}
			}
		});
		btnLIMPIAR.setBackground(new Color(255, 204, 153));
		btnLIMPIAR.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLIMPIAR.setBounds(23, 174, 65, 54);
		contentPane.add(btnLIMPIAR);	
		
		JButton btnBORRAR = new JButton("\u2190");
		btnBORRAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta3.setText("");
				numero1 = "";
			}
		});
		btnBORRAR.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBORRAR.setBackground(new Color(255, 204, 153));
		btnBORRAR.setBounds(23, 477, 65, 54);
		contentPane.add(btnBORRAR);

	}
	
	
	
	void operaciones() {
		 double n1, n2;
		 
		 if (!etiqueta3.getText().equals("")) {
			 if (contador == 0) {
				 numero2 = numero1;
				 etiqueta1.setText(numero2);
			 }
			 
			 if (numero2.equals("")) {
				numero2 = "0";
			 }
			 n1 = Double.valueOf(numero2);
			 n2 = Double.valueOf(numero1);
			 
			 if (etiqueta2.getText().equals("-")) {
				 numero2 = String.valueOf(n1 - n2);
				 etiqueta4.setText(numero2);
				
			 }
			 
			 if (etiqueta2.getText().equals("+")) {
				 numero2 = String.valueOf(n1 + n2);
				 etiqueta4.setText(numero2);
			 }
			 
			 if (etiqueta2.getText().equals("x")) {
				 numero2 = String.valueOf(n1 * n2);
				 etiqueta4.setText(numero2);
			 }
			 
			 if (etiqueta2.getText().equals("/")) {
				 numero2 = String.valueOf(n1 / n2);
				 etiqueta4.setText(numero2);
			 }
			 
			 etiqueta3.setText("");
			 numero1 = "";
			 contador++;
			 etiqueta1.setText(numero2);
		 }
	}
	
	
	String numero1 = "";
	String numero2 = "";
	String resultado = "";
	int contador = 0;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica frame = new InterfazGrafica();
					frame.setVisible(true);
				
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void cerrar() {
		try {
			this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); /* setDefaultCloseOperation, 
																		SIRVE PARA DARLE UNA OPCION AL JFrame.
																		DO_NOTHING_ON_CLOSE sirve para que el JFrame
																		no se cierre al hacer clic 
																		en la cruz superior derecha. */
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					confirmarSalida();
				}
			});
			
			this.setVisible(true); // Este METODO sirve para hacer visible el formulario 
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/** CONFIRMAR SALIDA */
	public void confirmarSalida() {
		int valor = JOptionPane.showConfirmDialog(null, "Esta seguro de querer cerrar la aplicacion?", "Advertencia", JOptionPane.YES_NO_OPTION);
		if (valor == JOptionPane.YES_OPTION) {
			JOptionPane.showConfirmDialog(null, "Gracias por su visita. ¡Hasta pronto!", "", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
	}
}

package tictac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Velha extends JFrame {
	
	String name2 = JOptionPane.showInputDialog(null,"Insert Player Name 1: ","Menu",JOptionPane.INFORMATION_MESSAGE);
    String name1 = name2.replaceAll("\\s","");
    String first;
    boolean jaFoiCliclado = false;
    Object nomeJogador1;
    Object nomeJogador2;
    int VitoriaXcount1=0;
    int VitoriaOcount1=0;
    boolean primeiraJogada = true;
    StringBuilder build = new StringBuilder();
    int a1 = 10;
    int a2 = 10;
    int a3 = 10;
    int a4 = 10;
    int a5 = 10;
    int a6 = 10;
    int a7 = 10;
    int a8 = 10;
    int a9 = 10;
    int empate = 0;
    int continuar = 0;
	private static final long serialVersionUID = 1L;	
	private JPanel contentPane;
	private JButton t1;
	private JButton t2;
	private JButton t3;
	private JButton t4;
	private JButton t5;
	private JButton t6;
	private JButton t7;
	private JButton t8;
	private JButton t9;
	private JLabel VitoriaX;
	private JLabel VitoriaX_1;
	private JLabel VitoriaO;
	private JButton placar;
	private JRadioButton o;
	private JRadioButton x;
	Armazem armazem = new Armazem();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Velha frame = new Velha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public Velha() {
		setResizable(false);
		 while(name1 != null){
             System.out.println(name1);

             if(armazem.jogadores.contains(name1) || name1.isEmpty()){
                 JOptionPane.showMessageDialog(null,"Error! Invalid Name.","Error",JOptionPane.ERROR_MESSAGE);
             }
             else{
                 armazem.jogadores.add(name1);
             }
             name1 = JOptionPane.showInputDialog(null,"Insert Player Name 1","Menu",JOptionPane.INFORMATION_MESSAGE);
             
         }

			
	{
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox box1 = new JComboBox();
		box1.setBounds(66, 31, 74, 20);
		contentPane.add(box1);
	//	box1.addItem(velha.jogadores);
		for (int i= 0; i < armazem.jogadores.size(); i++) {
			box1.addItem(armazem.jogadores.get(i));
		}
		
		JComboBox box2 = new JComboBox();
		box2.setBounds(280, 31, 74, 20);
		contentPane.add(box2);
		for (int i= 0; i < armazem.jogadores.size(); i++) {
			box2.addItem(armazem.jogadores.get(i));
		}
		
		x = new JRadioButton("");
		x.setBounds(122, 58, 109, 23);
		contentPane.add(x);
		
		o = new JRadioButton("");
		o.setBounds(280, 58, 21, 23);
		contentPane.add(o);
		
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(111, 62, 18, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("O");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(303, 62, 18, 14);
		contentPane.add(lblNewLabel_1);
		
		
		//
		t1 = new JButton();
		t1.setEnabled(false);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("Tahoma", Font.BOLD, 36));
		t1.setBackground(Color.LIGHT_GRAY);
		t1.setBounds(77, 112, 63, 63);
		contentPane.add(t1);
		
		
		t2 = new JButton();
		t2.setEnabled(false);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("Tahoma", Font.BOLD, 36));
		t2.setBackground(Color.LIGHT_GRAY);
		t2.setBounds(180, 112, 63, 63);
		contentPane.add(t2);
		
		t3 = new JButton();
		t3.setEnabled(false);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setFont(new Font("Tahoma", Font.BOLD, 36));
		t3.setBackground(Color.LIGHT_GRAY);
		t3.setBounds(280, 112, 63, 63);
		contentPane.add(t3);
		
		t7 = new JButton();
		t7.setEnabled(false);
		t7.setHorizontalAlignment(SwingConstants.CENTER);
		t7.setFont(new Font("Tahoma", Font.BOLD, 36));
		t7.setBackground(Color.LIGHT_GRAY);
		t7.setBounds(77, 266, 63, 63);
		contentPane.add(t7);
		
		t8 = new JButton();
		t8.setEnabled(false);
		t8.setHorizontalAlignment(SwingConstants.CENTER);
		t8.setFont(new Font("Tahoma", Font.BOLD, 36));
		t8.setBackground(Color.LIGHT_GRAY);
		t8.setBounds(180, 266, 63, 63);
		contentPane.add(t8);
		
		t9 = new JButton();
		t9.setEnabled(false);
		t9.setHorizontalAlignment(SwingConstants.CENTER);
		t9.setFont(new Font("Tahoma", Font.BOLD, 36));
		t9.setBackground(Color.LIGHT_GRAY);
		t9.setBounds(280, 266, 63, 63);
		contentPane.add(t9);
		
		t4 = new JButton();
		t4.setEnabled(false);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setFont(new Font("Tahoma", Font.BOLD, 36));
		t4.setBackground(Color.LIGHT_GRAY);
		t4.setBounds(77, 186, 63, 63);
		contentPane.add(t4);
		
		t5 = new JButton();
		t5.setEnabled(false);
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setFont(new Font("Tahoma", Font.BOLD, 36));
		t5.setBackground(Color.LIGHT_GRAY);
		t5.setBounds(180, 186, 63, 63);
		contentPane.add(t5);
		
		t6 = new JButton();
		t6.setEnabled(false);
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setFont(new Font("Tahoma", Font.BOLD, 36));
		t6.setBackground(Color.LIGHT_GRAY);
		t6.setBounds(280, 186, 63, 63);
		contentPane.add(t6);
		
		
		JButton iniciar = new JButton("Iniciar");
		iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (box1.getSelectedItem() == box2.getSelectedItem()) {
					JOptionPane.showMessageDialog(null, "Jogadores Iguais");
				} else if (x.isSelected() && o.isSelected() || !x.isSelected() && !o.isSelected()) {
					JOptionPane.showMessageDialog(null, "Um dos devem ser selecionados");
				} else {
					if (jaFoiCliclado == false) {
						jaFoiCliclado = true;
						iniciar.setText("Reiniciar");
						Inicio();
						nomeJogador1 = box1.getSelectedItem();
						nomeJogador2 = box2.getSelectedItem();
						t1.setEnabled(true);
						t2.setEnabled(true);
						t3.setEnabled(true);
						t7.setEnabled(true);
						t8.setEnabled(true);
						t9.setEnabled(true);
						t4.setEnabled(true);
						t5.setEnabled(true);
						t6.setEnabled(true);
						box1.setEnabled(false);
						box2.setEnabled(false);
						x.setEnabled(false);
						o.setEnabled(false);
					} else {
						Restart();
					}
				}

			}
		});
		iniciar.setBounds(168, 340, 89, 23);
		contentPane.add(iniciar);
		
		
		
		placar = new JButton();
		placar.setText("Placar");
		placar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MostrarPlacar();
			}
		});
		placar.setBounds(265, 340, 89, 23);
		contentPane.add(placar);
		
		VitoriaX = new JLabel();
		VitoriaX.setText("0");
		VitoriaX.setBounds(153, 34, 46, 14);
		contentPane.add(VitoriaX);
		
		VitoriaX_1 = new JLabel();
		VitoriaX_1.setText("VS");
		VitoriaX_1.setBounds(204, 34, 46, 14);
		contentPane.add(VitoriaX_1);
		
		VitoriaO = new JLabel();
		VitoriaO.setText("0");
		VitoriaO.setBounds(260, 34, 46, 14);
		contentPane.add(VitoriaO);
		
	}
	}
	private void MostrarPlacar() {
		for(int a =0; a < armazem.atual.size();a++) {
			
			build.append(armazem.atual.get(a)+"\n");
		}
		JOptionPane.showMessageDialog(null, build.toString());
		build.setLength(0);
	}
	
	
	private void Inicio() {
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (t1.getText().isBlank()) {
					ActuallPlayer();
					primeiraJogada =false;
					t1.setText(first);
					if (first.equalsIgnoreCase("X")) {
						a1 = 1;
					} else {
						a1 = 0;
					}
					empate++;
				} else {
					JOptionPane.showMessageDialog(null, "Posição ocupada", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

				
				
				win();
			}

		});

		t2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (t2.getText().isBlank()) {
					ActuallPlayer();
					primeiraJogada =false;
					t2.setText(first);
					if (first.equalsIgnoreCase("X")) {
						a2 = 1;
					} else {
						a2 = 0;
					}
					empate++;
				} else {
					JOptionPane.showMessageDialog(null, "Posição ocupada", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				
				win();
			}

		});

		t3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (t3.getText().isBlank()) {
					ActuallPlayer();
					primeiraJogada = false;
					t3.setText(first);
					if (first.equalsIgnoreCase("X")) {
						a3 = 1;
					} else {
						a3 = 0;
					}
					empate++;
				} else {
					JOptionPane.showMessageDialog(null, "Posição ocupada", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				
				win();
			}

		});

		t7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (t7.getText().isBlank()) {
					ActuallPlayer();
					primeiraJogada =false;
					t7.setText(first);
					if (first.equalsIgnoreCase("X")) {
						a7 = 1;
					} else {
						a7 = 0;
					}
					empate++;
				} else {
					JOptionPane.showMessageDialog(null, "Posição ocupada", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				win();
			}

		});

		t8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (t8.getText().isBlank()) {
					ActuallPlayer();
					primeiraJogada =false;
					t8.setText(first);
					if (first.equalsIgnoreCase("X")) {
						a8 = 1;
					} else {
						a8 = 0;
					}
					empate++;
				} else {
					JOptionPane.showMessageDialog(null, "Posição ocupada", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				
				win();

			}

		});

		t9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (t9.getText().isBlank()) {
					ActuallPlayer();
					primeiraJogada =false;
					t9.setText(first);
					if (first.equalsIgnoreCase("X")) {
						a9 = 1;
					} else {
						a9 = 0;
					}
					empate++;
				} else {
					JOptionPane.showMessageDialog(null, "Posição ocupada", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				
				win();
			}

		});
		t4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (t4.getText().isBlank()) {
					ActuallPlayer();
					primeiraJogada =false;
					t4.setText(first);
					if (first.equalsIgnoreCase("X")) {
						a4 = 1;
					} else {
						a4 = 0;
					}
					empate++;
				} else {
					JOptionPane.showMessageDialog(null, "Posição ocupada", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				win();
			}

		});
		t5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (t5.getText().isBlank()) {
					ActuallPlayer();
					primeiraJogada =false;
					t5.setText(first);
					if (first.equalsIgnoreCase("X")) {
						a5 = 1;
					} else {
						a5 = 0;
					}
					empate++;
				} else {
					JOptionPane.showMessageDialog(null, "Posição ocupada", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				
				win();
			}

		});
		t6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (t6.getText().isBlank()) {
					ActuallPlayer();
					primeiraJogada = false;
					t6.setText(first);
					if (first.equalsIgnoreCase("X")) {
						a6 = 1;
					} else {
						a6 = 0;
					}
					empate++;
				} else {
					JOptionPane.showMessageDialog(null, "Posição ocupada", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				win();
			}

		});
		
	}
	private void AfterWinX() {
		continuar=JOptionPane.showConfirmDialog(null,"Deseja Jogar novamente? Jogador "+ nomeJogador1+" Ganhou","WIN", JOptionPane.YES_NO_OPTION);
		if (continuar == JOptionPane.YES_OPTION) {
			VitoriaXcount1++;
			VitoriaX.setText(String.valueOf(VitoriaXcount1));
		}else {
			VitoriaXcount1++;
			armazem.atual.add((String)nomeJogador1+"| "+VitoriaXcount1 +" VS "+VitoriaOcount1+" |"+(String)nomeJogador2);
			RestartValores();
		}
		Restart();
	}
	private void AfterWinO() {
		continuar=JOptionPane.showConfirmDialog(null,"Deseja Jogar novamente? Jogador "+ nomeJogador2+" Ganhou","WIN", JOptionPane.YES_NO_OPTION);
		if (continuar == JOptionPane.YES_OPTION) {
			VitoriaOcount1++;
			VitoriaO.setText(String.valueOf(VitoriaOcount1));
		}else {
			VitoriaOcount1++;
			armazem.atual.add((String)nomeJogador1+"| "+VitoriaXcount1 +" VS "+VitoriaOcount1+" |"+(String)nomeJogador2);
			RestartValores();
		}
		Restart();
	}
	private void Restart() {
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		t7.setText("");
		t8.setText("");
		t9.setText("");
		a9 = 10;
		a8 = 10;
		a7 = 10;
		a6 = 10;
		a5 = 10;
		a4 = 10;
		a3 = 10;
		a2 = 10;
		a1 = 10;
		empate = 0;
		continuar =0;
		primeiraJogada =true;
	}
	private void RestartValores() {
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		t7.setText("");
		t8.setText("");
		t9.setText("");
		a9 = 10;
		a8 = 10;
		a7 = 10;
		a6 = 10;
		a5 = 10;
		a4 = 10;
		a3 = 10;
		a2 = 10;
		a1 = 10;
		empate = 0;
		continuar =0;
		VitoriaXcount1 = 0;
		VitoriaOcount1 = 0;
		VitoriaX.setText(String.valueOf(VitoriaXcount1));
		VitoriaO.setText(String.valueOf(VitoriaOcount1));
		primeiraJogada =true;
	}
	
	private void ActuallPlayer() {
		if(primeiraJogada == true) {
			first = x.isSelected() ? "O" : "X";
		}	
		if(first.equalsIgnoreCase("X")) {
			first="O";
		}
		else {
			first="X";
		}
	}
	
	private void win() {
		if(a1 == 1 && a2 == 1 && a3 == 1) {
			AfterWinX();
		}
		if(a4 == 1 && a5 == 1 && a6 == 1) {
			AfterWinX();
		}
		if(a7 == 1 && a8 == 1 && a9 == 1) {
			AfterWinX();
		}
		if(a1 == 1 && a5 == 1 && a9 == 1) {
			AfterWinX();
		}
		if(a3 == 1 && a5 == 1 && a7 == 1) {
			AfterWinX();
		}
		if(a1 == 1 && a4 == 1 && a7 == 1) {
			AfterWinX();
		}
		if(a3 == 1 && a6 == 1 && a9 == 1) {
			AfterWinX();
		}
		if(a2 == 1 && a5 == 1 && a8 == 1) {
			AfterWinX();
		}
		
		
		if(a1 == 0 && a2 == 0 && a3 == 0) {
			AfterWinO();
		}
		if(a4 == 0 && a5 == 0 && a6 == 0) {
			AfterWinO();
		}
		if(a7 == 0 && a8 == 0 && a9 == 0) {
			AfterWinO();
		}
		if(a1 == 0 && a5 == 0 && a9 == 0) {
			AfterWinO();
		}
		if(a3 == 0 && a5 == 0 && a7 == 0) {
			AfterWinO();
		}
		if(a1 == 0 && a4 == 0 && a7 == 0) {
			AfterWinO();
		}
		if(a3 == 0 && a6 == 0 && a9 == 0) {
			AfterWinO();
		}
		if(a2 == 0 && a5 == 0 && a8 == 0) {
			AfterWinO();
		}
		if(empate == 9) {
			continuar=JOptionPane.showConfirmDialog(null,"Deseja Jogar novamente? Empate! ","Empate", JOptionPane.YES_NO_OPTION);
		if (continuar == JOptionPane.YES_OPTION) {
			
		}
			Restart();
			}
		
	}
}
		
package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculoImc {

	
// we've to set the project "habilities".
	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Color corDobotao;
	public Color corDoTexto;
	public Color corTextoBotao;
	
	
	
	
	public void criarTela() {
		
	JFrame tela = new JFrame();
	tela.setTitle(titulo); //prefixe "set" means that you will send something an object
	tela.setSize(largura, altura);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ALWAYS set this command, ALWAYS.
	tela.setLayout(null);

	
	
	
	//obter a instância do painel de conteúdo
	Container painel = tela.getContentPane();
	tela.getContentPane().setBackground(corDeFundoDaTela);
	
	//create screen components and put in the pane
	// create a label
	JLabel lblImc = new JLabel();
	lblImc.setText("IMC");
	lblImc.setBounds(30, 10, 100, 30);
	lblImc.setFont(new Font("Courier new",Font.BOLD, 32));
	lblImc.setForeground(corDoTexto);
	
	
	//
	JLabel lblNome = new JLabel();
	lblNome.setText("Nome:");
	lblNome.setBounds(30, 60, 100, 30);
	lblNome.setFont(new Font("Courier", Font.BOLD, 20));
	lblNome.setForeground(corDoTexto);
	//
	JLabel lblAltura = new JLabel();
	lblAltura.setText("Altura:");
	lblAltura.setBounds(30, 110, 100, 30);
	lblAltura.setFont(new Font("Courier", Font.BOLD, 20));
	lblAltura.setForeground(corDoTexto);
	//
	JLabel lblPeso = new JLabel();
	lblPeso.setText("Peso:");
	lblPeso.setBounds(30, 160, 100, 30);
	lblPeso.setFont(new Font("Courier", Font.BOLD, 20));
	lblPeso.setForeground(corDoTexto);
	//
	JLabel lblDataNasc = new JLabel();
	lblDataNasc.setText("Data Nasc:");
	lblDataNasc.setBounds(30, 200, 200, 50);
	lblDataNasc.setFont(new Font("Courier", Font.BOLD, 20));
	lblDataNasc.setForeground(corDoTexto);
	//
	JLabel lblResultadoImc = new JLabel();
	lblResultadoImc.setText("Seu Imc é: xxxx");
	lblResultadoImc.setBounds(30, 260, 200, 30);
	lblResultadoImc.setFont(new Font("Courier", Font.BOLD, 20));
	lblResultadoImc.setForeground(corDoTexto);
	//
	JLabel lblStatusImc = new JLabel();
	lblStatusImc.setText("O status do seu IMC: xxx");
	lblStatusImc.setBounds(30, 300, 250, 30);
	lblStatusImc.setFont(new Font("Courier", Font.BOLD, 20));
	lblStatusImc.setForeground(corDoTexto);
	//Creating a text field
	JTextField textFieldNome = new JTextField();
	textFieldNome.setBounds(30, 90, 200, 20);
	//
	JTextField textFieldAltura = new JTextField();
	textFieldAltura.setBounds(30, 140, 100, 20);
	//
	JTextField textFieldPeso = new JTextField();
	textFieldPeso.setBounds(30, 190, 50, 20);
	
	//
	JTextField textFieldDataNasc = new JTextField();
	textFieldDataNasc.setBounds(30, 240, 100, 20);

	
    //creating a button 
	
	JButton buttonCalcular = new JButton();
	buttonCalcular.setText("Calcular");
	buttonCalcular.setBounds(30, 500, 110, 30);  //  (eixo x, eixo y, width, heigth)
	buttonCalcular.setBackground(corDobotao);
	buttonCalcular.setForeground(corDoTexto);
	
	
	//we use addActionListener for gave actions to a button.
	//remember that a button has 2 actions = hold and release
	
	
	//click events 
buttonCalcular.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		 Cliente cliente = new Cliente();		
		 cliente.nome = textFieldNome.getText();
		 cliente.peso = Double.parseDouble(textFieldPeso.getText());
		 cliente.altura = Double.parseDouble(textFieldAltura.getText());
		 
		lblResultadoImc.setText(cliente.nome + " Seu Imc é " + cliente.getimc());
		lblStatusImc.setText(cliente.getStatus());
		 
		}
	}); 
	
	//add components to the pane (container)
		painel.add(lblImc);
		painel.add(buttonCalcular);
		painel.add(lblNome);
		painel.add(textFieldNome);
		painel.add(lblAltura);
		painel.add(textFieldAltura);
		painel.add(lblPeso);
		painel.add(textFieldPeso);
		painel.add(lblDataNasc);
		painel.add(textFieldDataNasc);
		painel.add(lblResultadoImc);
		painel.add(lblStatusImc);	
	
		
		
		
		
		tela.setVisible(true);
		
			
	}
			
}

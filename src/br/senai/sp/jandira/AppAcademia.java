package br.senai.sp.jandira;


import java.awt.Color;
import java.time.LocalDate;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
		FrameCalculoImc tela = new FrameCalculoImc();
		tela.titulo = "Calculadora Imc";
		tela.altura = 600;
		tela.largura = 600;
		tela.corDeFundoDaTela = new Color(119, 119, 255);
		tela.corDobotao = new Color(79, 79, 255);
		tela.corDoTexto = new Color(248, 224, 58);
		tela.criarTela();
		
		Cliente ana = new Cliente(); //"new client" reserve a space in the ram memory,so we have to attribute it something.
		Cliente pedro = new Cliente();//example in the line 17,18,20,21
		System.out.println(ana);
		System.out.println(pedro);
	
		
		ana.nome = "Ana Maria Brega";
		ana.dataDeNascimento = LocalDate.of(2005, 9, 16);
		ana.altura = 1.69;
		ana.peso = 55;
	
		
	
		
		
		
		
	    ana.getimc();
	    System.out.println(ana.getimc());
	    ana.getStatus();
	    String teste = ana.getStatus();
	  //  JOptionPane.showMessageDialog(null, teste);
	    //we call "windows" as frame, CAUSE WE ARE NOT DUMB USERSSSS
	    //we call the "main part/intern" of a frame as container
	    //Library used to create frames: JFrame //Jlabel = exactly a label //JtextField = used to create text field
	    // (30,50,40,30) eixo x, eixo y, width, heigth
	    
	    
	}

}

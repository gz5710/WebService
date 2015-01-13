/**
 * 
 */
package com.tmax;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @Author: Bruce GONG
 * @Project: Tester
 * @Package: com.tmax
 * @Filename: SwingForm
 * @Datetime: 2014年11月9日 / 下午9:18:28
 */
public class SwingForm extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jbtn1,jbtn2;
	private JPanel jpanel;

	public SwingForm() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		jbtn1 = new JButton("Test1");
		jbtn1.addActionListener(new btn1Action());
		
		jbtn2 = new JButton("Test2");
		//jbtn1.setPreferredSize(new Dimension(50,100));
		//this.setLayout(new GridLayout(1,1));
		
		jpanel = new JPanel();
		jpanel.add(jbtn1);
		jpanel.add(jbtn2);
		
		
		this.add(jpanel);
		
		//this.setPreferredSize(new Dimension(100,100));
		this.setTitle("Swing Test");
		this.setLocationByPlatform(true);
		this.setSize(new Dimension(400,400));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
}


class btn1Action implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+arg0.getID());
		System.out.println("ActionCommand: "+arg0.getActionCommand());
		System.out.println("Modifier: "+arg0.getModifiers());
		System.out.println("Source: "+arg0.getSource());
		System.out.println("When: "+arg0.getWhen());
		System.out.println("Class: "+arg0.getClass());
		System.out.println("arg: "+arg0);
	}
	
}
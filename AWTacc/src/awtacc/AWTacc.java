c/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtacc;

import java.awt.*;
import java.awt.event.*; 
public class AWTacc extends Frame implements ActionListener {
   private Label lblInput;    
   private Label lblOutput;  
   private TextField tfInput;  
   private TextField tfOutput; 
   private int sum = 0;        
   public  AWTacc () {
      setLayout(new FlowLayout());    
      lblInput = new Label("Enter an Integer: "); 
      add(lblInput);           
 
      tfInput = new TextField(10); 
      add(tfInput);               
      tfInput.addActionListener(this);
      lblOutput = new Label("The Accumulated Sum is: ");  
      add(lblOutput);          
      tfOutput = new TextField(10);
      tfOutput.setEditable(false);  
      add(tfOutput);               
 
      setTitle("AWT Accumulator");  
      setSize(350, 120); 
      setVisible(true);  
   }
   public static void main(String[] args) {
      new AWTAccumulator();
   }
   
   public void actionPerformed(ActionEvent evt) {
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      
      tfInput.setText("");  
      tfOutput.setText(sum + ""); 
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pheptoanawt1;

import java.awt. *;  
import  java.awt.event. *;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static java.time.Clock.system;
public class PHEPTOANAWT1 extends Frame implements WindowListener, ActionListener{
    Label lblA, lblB, lblKQ;
    TextField txtA, txtB , txtKQ;
    Button btnCong, btnTru, btnNhan, btnChia;
    Panel panelMain;
    public PHEPTOANAWT1() {
    setLayout (new FlowLayout ());
    setTitle ("Phép toán AWT"); 
    setSize (170, 200);
      
  lblA= new Label ("a  ="); 
  lblA.setBounds(10, 10, 80, 20);
   add (lblA);
   txtA = new TextField ("", 10);
   txtA.setBounds(100, 20, 100, 20);
   txtA.setEditable (true); 
  add(txtA);
  lblB= new Label ("b  =");
  lblB.setBounds(20, 40, 80, 20);
   add (lblB);
   txtB = new TextField ("", 10);
   txtB.setBounds(110, 40, 100, 20);
   txtB.setEditable (true); 
  add(txtB);
  btnCong= new Button("+") ;
  btnCong.setBounds(30, 60, 100, 20);
  btnCong.addActionListener(this);
  add(btnCong);
  
  
  btnTru= new Button("-") ;
  btnTru.setBounds(30, 60, 100, 20);
  btnTru.addActionListener(this);
  add(btnTru);
  
  btnNhan= new Button("*") ;
  btnNhan.setBounds(30, 60, 100, 20);
  btnNhan.addActionListener(this);
  add(btnNhan);
  
  btnChia= new Button("/") ;
  btnChia.setBounds(30, 60, 100, 20);
  btnChia.addActionListener(this);
  add(btnChia);
  lblKQ= new Label ("KQ  =");
  lblKQ.setBounds(40, 80, 80, 20);
   add (lblKQ);
  txtKQ = new TextField ("", 10);
  lblKQ.setBounds(100, 80, 100, 20);
   txtKQ.setEditable (false);
   add(txtKQ); 
      
  
  
  
  setVisible(true);
  }
    public static void main(String[] args) {
     new PHEPTOANAWT1();
}
    

    @Override
    public void actionPerformed(ActionEvent e) {
        int a =Integer.parseInt(txtA.getText());
        int b =Integer.parseInt(txtB.getText());
        
        
        if(e.getSource()==btnCong)
        {
            int tong;
            tong = a+b;
            txtKQ.setText( tong+"");
        }
        if(e.getSource()==btnTru)
        {
            int hieu;
            hieu = a-b;
            txtKQ.setText( hieu +"");
        }
        if(e.getSource()==btnNhan)
        {
            int tich;
            tich = a*b;
            txtKQ.setText( tich +"");
        }
        if(e.getSource()==btnChia)
        {
            int thuong;
            thuong = a+b;
            txtKQ.setText( thuong +"");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



      
  
   
    
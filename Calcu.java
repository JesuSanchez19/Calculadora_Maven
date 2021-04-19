package Calculadora;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import Calculadora.llamado;
public class Calcu {
 JFrame frame;
 JPanel mp;
 JPanel mp1;
 JTextField Mostrar;
  

 JButton B_1;
 JButton B_2;
 JButton B_3;
 JButton B_4;
 JButton B_5;
 JButton B_6;
 JButton B_7;
 JButton B_8;
 JButton B_9;
 JButton B_0;
 JButton B_S;
 JButton B_r;
 JButton B_I;
 JButton B_M;
 JButton B_D;
 JButton B_c;
 
 
 
 public String acum="";
 public double  a; 

 public double op;
 public String c="";
 
 
 
 
 public static void main(String arg[]){ 
  
  Calcu n=new Calcu();
  
  
 }

 
  public Calcu() {
  

  frame = new JFrame("Calculadora");
  
  frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  mp=new JPanel(new GridLayout(4,5));
  mp1=new JPanel(new GridLayout(1,1));
  
  
  

  Mostrar=new JTextField();
  

  
  B_1=new JButton("1");
  B_2=new JButton("2");
  B_3=new JButton("3");
  B_4=new JButton("4");
  B_5=new JButton("5");
  B_6=new JButton("6");
  B_7=new JButton("7");
  B_8=new JButton("8");
  B_9=new JButton("9");
  B_0=new JButton("0");
  B_S=new JButton("+");
  B_r=new JButton("-");
  B_M=new JButton("*");
  B_c=new JButton("c");
  B_I=new JButton("=");
  B_D=new JButton("/");
  
  
 
  
  
 
  
  mp1.add(Mostrar);
  mp.add(B_1);
  mp.add(B_2);
  mp.add(B_3);
  mp.add(B_S);
  mp.add(B_4);
  mp.add(B_5);
  mp.add(B_6);
  mp.add(B_r);
  mp.add(B_7);
  mp.add(B_8);
  mp.add(B_9);
  mp.add(B_M);
  mp.add(B_c);
  mp.add(B_0);
  mp.add(B_I);
  mp.add(B_D);
  

  frame.getContentPane().add(mp1,BorderLayout.CENTER);
  frame.getContentPane().add(mp,BorderLayout.SOUTH);
  

   B_1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
  
    acum=Mostrar.getText()+"1";
  
     Mostrar.setText(acum);
      }
   });
  
  B_2.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     acum=Mostrar.getText()+"2";
     Mostrar.setText(acum);
      }
   });
  B_3.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     acum=Mostrar.getText()+"3";
     Mostrar.setText(acum);
      }
   });
  B_4.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
    acum=Mostrar.getText()+"4";
     Mostrar.setText(acum);
      }
   });
  B_5.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     acum=Mostrar.getText()+"5";
     Mostrar.setText(acum);
      }
   });
  B_6.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     acum=Mostrar.getText()+"6";
     Mostrar.setText(acum);
      }
   });
  B_7.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     acum=Mostrar.getText()+"7";
     Mostrar.setText(acum);
      }
   });
  B_8.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     acum=Mostrar.getText()+"8";
     Mostrar.setText(acum);
      }
   });
  B_9.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     acum=Mostrar.getText()+"9";
     Mostrar.setText(acum);
      }
   });
  B_0.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
    acum=Mostrar.getText()+"0";
     Mostrar.setText(acum);
      }
   });
  
  B_S.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     acum=Mostrar.getText();
     a=(Double.parseDouble(acum));
    c="+";
  
     Mostrar.setText("");
      }
   });
  
 
 B_M.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e) {
   acum=Mostrar.getText();
    a=(Double.parseDouble(acum));
   c="*";
   Mostrar.setText("");
     }
  });
 
  B_r.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     acum=Mostrar.getText();
     a=(Double.parseDouble(acum));
    c="-";
     Mostrar.setText("");
      }
   });
  
  B_D.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
    acum=Mostrar.getText();
     a=(Double.parseDouble(acum));
    c="/";
     Mostrar.setText("");
      }
   });
  B_c.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     acum="";
    
    Mostrar.setText(acum);
   }
  });
  
  B_I.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
    
     acum=Mostrar.getText();
    double b=(Double.parseDouble(acum));
    
    llamado obj=new llamado();
    
    if(c=="+"){
 
      Mostrar.setText(String.valueOf(obj.suma(a,b)));
     }else{
      if(c=="-"){
       Mostrar.setText(String.valueOf(obj.resta(a, b)));

      }
      else{
       if(c=="*"){
        Mostrar.setText(String.valueOf(obj.mul(a, b)));
                      }
       else{
        if(c=="/"){
        
         Mostrar.setText(String.valueOf(obj.div(a, b)));
            
     
        }
       }
      }
      
     }
    
    }
     
   });
  
  frame.setSize(200, 200);
  //frame.setSize(170, 158);
  frame.setResizable(false);
  frame.setLocationRelativeTo(frame.getParent());
  frame.setVisible(true);
  
  
  
 }
 
 }
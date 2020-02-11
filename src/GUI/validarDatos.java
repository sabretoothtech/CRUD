/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author YAXMA
 */
public class validarDatos {
  public void ValidarNum (JTextField Num){
     Num.addKeyListener(new KeyAdapter() {
public void keyTyped(KeyEvent e){
    char c =e.getKeyChar();
    if(!Character.isDigit(c)){
       
        e.consume();
         JOptionPane.showMessageDialog(null, "Solo Números");
    }
}
     
     });
 }   

public void ValidarCartr(JTextField Num){
     Num.addKeyListener(new KeyAdapter() {
public void keyTyped(KeyEvent e){
    char c =e.getKeyChar();
    if(Character.isDigit(c)){
       
        e.consume();
         JOptionPane.showMessageDialog(null, "Solo Letras");
    }
}
     
     });
  }
  public void limitarNumdeCarac (JTextField Num, int limit ){
     Num.addKeyListener(new KeyAdapter() {
public void keyTyped(KeyEvent e){
    char c =e.getKeyChar();
    int lmt=Num.getText().length();
    if( lmt>=limit){
        e.consume();
         JOptionPane.showMessageDialog(null, "Limite de caracteres alcanzado");
    }
}
     
     });
 }
}
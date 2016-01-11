/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Castillo
 */
public class mensajeUtil {
    
    
    

public static void setWarningMsg(String text){
    Toolkit.getDefaultToolkit().beep();
    JOptionPane optionPane = new JOptionPane(text,JOptionPane.WARNING_MESSAGE);
    JDialog dialog = optionPane.createDialog("Atención!");
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
}

public static void setMsg(String text){
    Toolkit.getDefaultToolkit().beep();
    JOptionPane optionPane = new JOptionPane(text,JOptionPane.INFORMATION_MESSAGE);
    JDialog dialog = optionPane.createDialog("Información");
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
}
    
}

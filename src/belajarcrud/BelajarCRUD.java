/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarcrud;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Azriel
 */
public class BelajarCRUD {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Management System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Create an instance of FormSiswa
            FormSiswa formSiswa = new FormSiswa();
            
            // Add FormSiswa to the JFrame
            frame.add(formSiswa);
            
            // Set frame properties and pack
            frame.pack();
            frame.setVisible(true);
        });
    }
    
}
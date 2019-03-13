/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneclickbreadcontrol;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static oneclickbreadcontrol.OneClickbreadControl.jefe;
import javax.swing.JOptionPane;
/**
 *
 * @author Andres
 */
public class GestionDeArchivos implements Serializable{
   
    
        public File objetos = new File("objetos.txt");
        public FileInputStream entrada =null;
        public FileOutputStream salida =null;
        public ObjectInputStream reader = null;
        public ObjectOutputStream writer =null;

        
    void guardartodo(Jefe aThis) {
        try {
            System.out.println("Guardando");
            salida =new FileOutputStream(objetos);
            writer =new ObjectOutputStream(salida);
            writer.writeObject(jefe);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Bienvenido a OneClickbreadControl","Bienveido",JOptionPane.OK_OPTION);
            try {
                JOptionPane.showMessageDialog(null,"Bienvenido a OneClickbreadControl","Bienveido",JOptionPane.OK_OPTION);
                objetos.createNewFile();
            } catch (IOException ex1) {
                Logger.getLogger(GestionDeArchivos.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
           
        } catch (NullPointerException ex) {
            System.err.println("Null pointer");
        }
        
        
    }

    void cargar(Jefe aThis) {
        System.out.println("Cargando"); //To change body of generated methods, choose Tools | Templates
        try {
            entrada =new FileInputStream(objetos);
            
        } catch (Exception e) {
            System.out.println("No se que archivo es");
        }
        try {
            reader = new ObjectInputStream(entrada);
            
        } catch (Exception e) {
            System.out.println("Joder");
        }
        try {
           
           jefe = (Jefe) reader.readObject();
            
        } catch (Exception e) {
            System.out.println("No estoy escribiendo el archivo");
        }
        
        //UN.listSedes();
    }}


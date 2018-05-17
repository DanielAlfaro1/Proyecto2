package proyecto2_201700857;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Principal_201700857 {
   
    JFrame Ventana;
    JPanel P1;
    JTextField Usuario, Pass;
    JButton Ingresar, Crear, Salir;
    JLabel ImagenPrincipal,nombre,contra;
    
   public void CrearPanel(){
       //Añadidos
       
       //TextBox
       Usuario = new JTextField();
       Pass = new JTextField();
       Usuario.setBounds(70,0,200,30);
       Pass.setBounds(70,50,200,30);
       Usuario.setVisible(true);
       Pass.setVisible(true);
       
       //Label
       ImagenPrincipal = new JLabel();
       ImagenPrincipal.setBounds(0,100,300,300);
       ImagenPrincipal.setVisible(true);
       
       
       //Botones
       Ingresar = new JButton("INGRESAR");
       Ingresar.setBounds(100,100,105,30);
       Ingresar.addMouseListener(Boton);
       //Agregar
       P1 = new JPanel();
       P1.setLayout(null);
       P1.add(Usuario);
       P1.add(Pass);
       P1.add(Ingresar);
       P1.setVisible(true);
       
   }
   
   public void CrearVentana(){
       Ventana = new JFrame("INICIO");
       Ventana.setBounds(300,50,600,600);
       Ventana.add(P1);
       Ventana.setVisible(true);
       Ventana.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
   }
   
   public Principal_201700857(){
       CrearPanel();
       CrearVentana();
   }
   
   MouseListener Boton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==Ingresar){
                if(Usuario.getText().equals("Admin")&&Pass.getText().contains("201700857")){
                    VAdmin windo = new VAdmin();
                    Ventana.setVisible(false);
                }else{
                    
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    };
}


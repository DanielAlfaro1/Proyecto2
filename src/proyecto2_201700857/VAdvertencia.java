package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VAdvertencia {
    public JFrame Ventanita;
    public JPanel P1;
    public JLabel mensaje,icono;
    public JButton Aceptar;
    
    public void CrearPanel(){
        //Addons
        Font font = new Font("Arial Black",Font.BOLD,12);
        //Label
        mensaje = new JLabel("<html><body>EL USUARIO, CUI O EMAIL YA HAN <br>SIDO REGISTRADOS</body></html>");
        mensaje.setFont(font);
        mensaje.setBounds(140,40,300,50);
        icono = new JLabel();
        icono.setIcon(new ImageIcon("C:/Users/Bminas/Desktop/Imagenes/Advertencia.png"));
        icono.setBounds(20,20,100,100);
        //Boton
        Aceptar = new JButton("ACEPTAR");
        Aceptar.setFont(font);
        Aceptar.setBounds(200,170,150,30);
        Aceptar.addMouseListener(boton);
        //Panel y agregados
        P1 = new JPanel();
        P1.add(mensaje);
        P1.add(Aceptar);
        P1.add(icono);
        P1.setLayout(null);
        
    }
    
    public void CrearVentana(){
        Ventanita = new JFrame("ADVERTENCIA");
        Ventanita.setVisible(false);
        Ventanita.setBounds(500,200,500,250);
        Ventanita.add(P1);
        Ventanita.setDefaultCloseOperation(Ventanita.HIDE_ON_CLOSE);
    }
    
    public VAdvertencia(){
        CrearPanel();
        CrearVentana();
    }
    
    public void Mensaje(String n){
        mensaje.setText(n);
    }
   
    public void Visibilidad(){
        Ventanita.setVisible(true);
    }
    
    MouseListener boton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        if (e.getSource()==Aceptar){
            Ventanita.setVisible(false);
            Mensaje("");
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

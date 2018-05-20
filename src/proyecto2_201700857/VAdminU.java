package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VAdminU {
    JFrame Ventana;
    JPanel P1;
    JButton Crear,Modificar,Mostrar,Volver;
    JLabel Fondo;
    
    public void CrearPanel(){
        //Addons
        Font font = new Font("Arial Black",Font.BOLD,12);
        //Botones
        Crear = new JButton("CREAR");
        Crear.setBounds(20,20,100,30);
        Crear.addMouseListener(Boton);
        Modificar = new JButton("MODIFICAR");
        Modificar.setBounds(20,70,100,30);
        Modificar.addMouseListener(Boton);
        Mostrar = new JButton("MOSTRAR");
        Mostrar.setBounds(20,120,100,30);
        Mostrar.addMouseListener(Boton);
        Volver = new JButton("VOLVER");
        Volver.setBounds(270,300,100,30);
        Volver.addMouseListener(Boton);
        //LAbel
        Fondo = new JLabel();
        Fondo.setBounds(0,0,400,400);
       ImageIcon Imagen = new ImageIcon("C:/Users/Bminas/Desktop/Imagenes/Portada.jpg");
        Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(Fondo.getWidth(),Fondo.getHeight(),Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);        
        
        //Panel y agregados
        P1 = new JPanel();
        P1.setLayout(null);
        P1.add(Fondo);
        Fondo.add(Crear);
        Fondo.add(Modificar);
        Fondo.add(Mostrar);
        Fondo.add(Volver);
    }
    
    public void CrearVentana(){
        Ventana = new JFrame("PANEL DE CONTROL DE USUARIOS");
        Ventana.setBounds(200,100,400,400);
        Ventana.setUndecorated(true);
        Ventana.setVisible(false);
        Ventana.add(P1);
        Ventana.setDefaultCloseOperation(Ventana.HIDE_ON_CLOSE);
    }
    
    public VAdminU (){
        CrearPanel();
        CrearVentana();
    }
    
    MouseListener Boton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        if (e.getSource()==Crear){
            Proyecto2_201700857.Ventana2.Ventana.setVisible(true);
        }
        if(e.getSource()==Volver){
            Ventana.setVisible(false);
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

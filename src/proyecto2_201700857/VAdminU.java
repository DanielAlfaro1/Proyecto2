package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VAdminU {
    JFrame Ventana;
    JPanel P1;
    JButton Crear,Modificar,Mostrar;
    
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
        //Panel y agregados
        P1 = new JPanel();
        P1.setLayout(null);
        P1.add(Crear);
        P1.add(Modificar);
        P1.add(Mostrar);
    }
    
    public void CrearVentana(){
        Ventana = new JFrame("PANEL DE CONTROL DE USUARIOS");
        Ventana.setBounds(100,100,400,400);
        Ventana.setVisible(true);
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

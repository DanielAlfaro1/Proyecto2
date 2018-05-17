package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VAdmin {
    JFrame Ventana;
    JPanel p1;
    JButton Estampas, Usuarios, Reporte;
    
    public void CrearPanel(){
        
        //Botones
        Estampas = new JButton("ESTAMPAS");
        Estampas.setBounds(20,20,100,30);
        Estampas.addMouseListener(accion);
        Usuarios = new JButton("USUARIOS");
        Usuarios.setBounds(20,70,100,30);
        Usuarios.addMouseListener(accion);
        Reporte = new JButton("REPORTE");
        Reporte.setBounds(20,120,100,30);
        Reporte.addMouseListener(accion);
        
        //Panel y agregar
        p1 = new JPanel();
        p1.setLayout(null);
        p1.add(Estampas);
        p1.add(Usuarios);
        p1.add(Reporte);
    }
    
    public void CrearVentana(){
        Ventana = new JFrame();
        Ventana.setBounds(200,70,400,400);
        Ventana.add(p1);
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(Ventana.HIDE_ON_CLOSE);
        
    }
    
    public VAdmin(){
        CrearPanel();
        CrearVentana();
    }
    
    MouseListener accion = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Usuarios){
                VAdminU Ventanita = new VAdminU();
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

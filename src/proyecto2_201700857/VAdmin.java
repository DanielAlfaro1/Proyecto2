package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VAdmin {
    JFrame Ventana;
    JPanel p1;
    JButton Estampas, Usuarios, Reporte,Salir;
    JLabel Fondo;
    
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
        Salir = new JButton("REGRESAR");
        Salir.setBounds(150,190,100,30);
        Salir.addMouseListener(accion);
        //Label
        Fondo = new JLabel();
        Fondo.setBounds(0,0,270,270);
       ImageIcon Imagen = new ImageIcon("C:/Users/Bminas/Desktop/Imagenes/Portada.jpg");
        Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(Fondo.getWidth(),Fondo.getHeight(),Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);        
        
        //Panel y agregar
        p1 = new JPanel();
        p1.setLayout(null);
        p1.add(Fondo);
        Fondo.add(Estampas);
        Fondo.add(Usuarios);
        Fondo.add(Reporte);
        Fondo.add(Salir);
    }
    
    public void CrearVentana(){
        Ventana = new JFrame("VENTANA DE ADMINISTRADOR");
        Ventana.setBounds(500,200,270,270);
        Ventana.setUndecorated(true);
        Ventana.add(p1);
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(0);
        
    }
    
    public VAdmin(){
        CrearPanel();
        CrearVentana();
    }
    
    MouseListener accion = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Usuarios){
                Proyecto2_201700857.controlU.Ventana.setVisible(true);
            }
            if (e.getSource()==Salir){
                Ventana.setVisible(false);
                Proyecto2_201700857.Est.Ventana.setVisible(false);
                Proyecto2_201700857.Ventana2.Ventana.setVisible(false);
                Proyecto2_201700857.Ventana1.Ventana.setVisible(true);
                Proyecto2_201700857.controlU.Ventana.setVisible(false);
                if(Proyecto2_201700857.existencia!=0){
                Proyecto2_201700857.Vmostrar.Ventana.setVisible(false);
                }
                
                Proyecto2_201700857.carga.Ventana.setVisible(false);
            }
            if (e.getSource()==Estampas){
              Proyecto2_201700857.Est.Ventana.setVisible(true);  
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

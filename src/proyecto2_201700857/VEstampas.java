package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VEstampas {
    public JFrame Ventana;
    public JPanel P1;
    public JButton Cargar, Mostrar,Volver;
    public JLabel Titulo;
    
    public void CrearPanel(){
        P1 = new JPanel();
        P1.setLayout(null);
        //Addons
        Font font = new Font("Arial Black",Font.BOLD,12);
        //Botones
        Cargar = new JButton("CARGAR");
        Cargar.setFont(font);
        Cargar.setBounds(50,70,125,30);
        Cargar.addMouseListener(boton);
        Mostrar = new JButton("MOSTRAR");
        Mostrar.setFont(font);
        Mostrar.setBounds(200,70,125,30);
        Mostrar.addMouseListener(boton);
        Volver = new JButton("VOLVER");
        Volver.setFont(font);
        Volver.setBounds(125,120,125,30);
        Volver.addMouseListener(boton);
        //Label
        Titulo = new JLabel("CONTROL DE ESTAMPAS");
        Titulo.setFont(font);
        Titulo.setBounds(95,20,200,30);
        //Panel agregados
        P1.add(Cargar);
        P1.add(Mostrar);
        P1.add(Titulo);
        P1.add(Volver);
    }
    
    public void CrearVentana(){
        Ventana = new JFrame("CONTROL DE ESTAMPAS");
        Ventana.add(P1);
        Ventana.setBounds(400,250,380,200);
        Ventana.setVisible(true);
    }
    
    public VEstampas (){
        CrearPanel();
        CrearVentana();
    }
    
    MouseListener boton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Volver){
                Ventana.setVisible(false);
            }
            if(e.getSource()==Mostrar){
                if(Proyecto2_201700857.existencia!=0){
                Proyecto2_201700857.Vmostrar.Ventana.setVisible(true);
                }
            }
            if (e.getSource()==Cargar){
                Proyecto2_201700857.carga.Ventana.setVisible(true);
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

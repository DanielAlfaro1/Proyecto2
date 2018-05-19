package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class VCargarEst {
    public JFrame Ventana;
    public JPanel P1;
    public JButton Cargar, Cancelar;
    public JLabel Jugadores, Equipo, Estampas, formato1, formato2, formato3,aviso1,aviso2,aviso3;
    public JTextField players, team, stickers;
    
    public void CrearPanel(){
        //Panel
        P1 = new JPanel();
        P1.setLayout(null);
        //Addons
        Font font = new Font("Arial Black",Font.BOLD,10);
        Font font2 = new Font("Arial Black",Font.BOLD,12);
        //Labels
        Jugadores = new JLabel("ARCHIVO DE JUGADORES");
        Jugadores.setFont(font);
        Jugadores.setBounds(20,100,200,30);
        Equipo = new JLabel("ARCHIVO DE EQUIPOS");
        Equipo.setFont(font);
        Equipo.setBounds(20,50,200,30);
        Estampas = new JLabel("ARCHIVO DE ESTAMPAS");
        Estampas.setFont(font);
        Estampas.setBounds(20,150,200,30);
        formato1 = new JLabel("carpeta/nombre de archivo.csv");
        formato1.setFont(font);
        formato1.setForeground(Color.BLUE);
        formato1.setBounds(425,100,200,30);
        formato2 = new JLabel("carpeta/nombre del archivo.csv");
        formato2.setFont(font);
        formato2.setForeground(Color.blue);
        formato2.setBounds(425,50,200,30);
        formato3 = new JLabel("carpeta/nombre del archivo.csv");
        formato3.setFont(font);
        formato3.setForeground(Color.blue);
        formato3.setBounds(425,150,200,30);
        aviso1 = new JLabel("*");
        aviso1.setFont(font);
        aviso1.setForeground(Color.red);
        aviso1.setBounds(410,50,10,10);
        aviso1.setVisible(false);
        aviso2 = new JLabel("*");
        aviso2.setFont(font);
        aviso2.setForeground(Color.red);
        aviso2.setBounds(410,100,10,10);
        aviso2.setVisible(false);
        aviso3 = new JLabel("*");
        aviso3.setFont(font);
        aviso3.setForeground(Color.red);
        aviso3.setBounds(410,150,10,10);
        aviso3.setVisible(false);
        //cuadros de texto
        players = new JTextField();
        players.setFont(font);
        players.setBounds(200,100,200,30);
        team = new JTextField();
        team.setFont(font);
        team.setBounds(200,50,200,30);
        stickers = new JTextField();
        stickers.setFont(font);
        stickers.setBounds(200,150,200,30);
        //Botones
        Cargar = new JButton("CARGAR ARCHIVOS");
        Cargar.setFont(font2);
        Cargar.setBounds(75,250,200,60);
        Cargar.addMouseListener(boton);
        Cancelar = new JButton("VOLVER");
        Cancelar.setFont(font2);
        Cancelar.setBounds(370,250,150,60);
        Cancelar.addMouseListener(boton);
        //Agregar
        P1.add(Equipo);
        P1.add(Jugadores);
        P1.add(Estampas);
        P1.add(team);
        P1.add(players);
        P1.add(stickers);
        P1.add(Cargar);
        P1.add(Cancelar);
        P1.add(formato1);
        P1.add(formato2);
        P1.add(formato3);
        P1.add(aviso1);
        P1.add(aviso2);
        P1.add(aviso3);
    }
    
    public void CrearVentana(){
        Ventana = new JFrame("CARGA DE ARCHIVOS");
        Ventana.add(P1);
        Ventana.setBounds(450,150,600,380);
        Ventana.setVisible(false);
        Ventana.setDefaultCloseOperation(Ventana.HIDE_ON_CLOSE);
    }
    
    public void CargarEquipos(String direccion) throws IOException{
        BufferedReader br = null;
        try{
            br = new BufferedReader (new FileReader(direccion));
            String linea = br.readLine();
            while (null!=linea){
                String [] campos = linea.split(",");
                Proyecto2_201700857.test.Insertar(campos[0], campos[1], campos[2]);
                System.out.println("El codigo de "+campos[0]+" es "+campos[2]);
                linea = br.readLine();
            }
        }catch(Exception e) {
                    
                    } finally {
            if (null!=br){
                br.close();
            }
        }
    }
    
    public void CargarJugadores(String direccion) throws IOException{
        BufferedReader br2 = null;
        try{
            br2 = new BufferedReader (new FileReader(direccion));
            String linea = br2.readLine();
            while (null!=linea){
                String [] campos = linea.split(",");
                Proyecto2_201700857.test2.Insertar(campos[0], campos[1], campos[2],campos[3],campos[4]);
                System.out.println("El codigo de "+campos[0]+" es "+campos[4]);
                linea = br2.readLine();
            }
        }catch(Exception e) {
                    
                    } finally {
            if (null!=br2){
                br2.close();
            }
        }
    }
    
    public VCargarEst(){
        CrearPanel();
        CrearVentana();
    }
    
    MouseListener boton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Cargar){
                if(Cargar.getForeground()==Color.GREEN){
                    String equipi = "C:/Users/Bminas/Desktop/"+team.getText();
                    String Jugador = "C:/Users/Bminas/Desktop/"+players.getText();
                    String estampitas = "C:/Users/Bminas/Desktop/"+stickers.getText();
                    try {
                        CargarEquipos(equipi);
                        CargarJugadores(Jugador);
                    } catch (IOException ex) {}
                    Proyecto2_201700857.test.Ordenar(Proyecto2_201700857.test, Proyecto2_201700857.test2);
                    Proyecto2_201700857.existencia++;
                    Proyecto2_201700857.Vmostrar = new MostrarContenido();
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
            if (e.getSource()==Cargar){
                if(team.getText().equals("")||players.getText().equals("")||stickers.getText().equals("")){
                    Cargar.setForeground(Color.red);
                    if(team.getText().equals("")){
                        aviso1.setVisible(true);
                    }
                    if(players.getText().equals("")){
                        aviso2.setVisible(true);
                    }
                    if(stickers.getText().equals("")){
                        aviso3.setVisible(true);
                    }
                }
                if (!team.getText().equals("")&&!players.getText().equals("")&&!stickers.getText().equals("")){
                    Cargar.setForeground(Color.GREEN);
                }
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Cargar){
                Cargar.setForeground(Color.BLACK);
                aviso1.setVisible(false);
                aviso2.setVisible(false);
                aviso3.setVisible(false);
            }
        }
    };
}

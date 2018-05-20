package proyecto2_201700857;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Proyecto2_201700857 {

    
    public static Principal_201700857 Ventana1;
    public static Lista_User Usuarios;
    public static CrearUsuario Ventana2;
    public static VAdvertencia Ad;
    public static VExito Exito;
    public static ListaEquipo test;
    public static ListaJugadores test2;
    public static ListaEstampas test3;
    public static MostrarContenido Vmostrar;
    public static VEstampas Est;
    public static VCargarEst carga;
    public static VAdminU controlU;
    public static String Direccion = "C:/Users/Bminas/Desktop/Imagenes/Archivo equipos.csv";
    public static String Direccion2= "C:/Users/Bminas/Desktop/Imagenes/Archivo Jugadores.csv";
    public static int existencia=0;
    public static VStickers stick;
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Ventana1 = new Principal_201700857();
        Usuarios = new Lista_User();
        Ventana2 = new CrearUsuario();
        Ad = new VAdvertencia();
        test = new ListaEquipo();
        test2 = new ListaJugadores();
        test3 = new ListaEstampas();
        Exito = new VExito();
        Est = new VEstampas();
        carga = new VCargarEst();
        controlU = new VAdminU();
//        stick = new VStickers();
        int equipiños=0;
        int jugadol = 0;
//        CSVReader lector = new CSVReader(new FileReader(Direccion));
//        BufferedReader br = null;
//        try{
//            br = new BufferedReader (new FileReader(Direccion));
//            String linea = br.readLine();
//            while (null!=linea){
//                String [] campos = linea.split(",");
//                test.Insertar(campos[0], campos[1], campos[2]);
//                System.out.println("El codigo de "+campos[0]+" es "+campos[2]);
//                linea = br.readLine();
//            }
//        }catch(Exception e) {
//                    
//                    } finally {
//            if (null!=br){
//                br.close();
//                equipiños++;
//            }
//        }
//        
//        BufferedReader br2 = null;
//        try{
//            br2 = new BufferedReader (new FileReader(Direccion2));
//            String linea = br2.readLine();
//            while (null!=linea){
//                String [] campos = linea.split(",");
//                test2.Insertar(campos[0], campos[1], campos[2],campos[3],campos[4]);
//                System.out.println("El codigo de "+campos[0]+" es "+campos[4]);
//                linea = br2.readLine();
//            }
//        }catch(Exception e) {
//                    
//                    } finally {
//            if (null!=br2){
//                br2.close();
//                jugadol++;
//            }
//        }
//        
//        test.Ordenar(test, test2);
//        
//        Vmostrar = new MostrarContenido();
        }
    
    
        
    }


    


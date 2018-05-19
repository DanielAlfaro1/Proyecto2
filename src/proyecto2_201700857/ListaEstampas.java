package proyecto2_201700857;

public class ListaEstampas {
    
    class NodoEstampa{
        String Jugador;
        String Equipo;
        int Rareza;
        String zelda;
        NodoEstampa sig, ant;
        
        public NodoEstampa(){
        }
        
        public NodoEstampa(String J,String E,int R, String z){
            Jugador = J;
            Equipo = E;
            Rareza = R;
            zelda = z;
            sig = null;
            ant = null;
        }
        
    }
    
}

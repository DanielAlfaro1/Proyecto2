package proyecto2_201700857;

public class ListaEstampas {
    
    class NodoEstampa{
        String Jugador;
        String Equipo;
        String Victorias;
        String Camisola;
        String Posicion;
        String ToB;
        int Rareza;
        String zelda;
        NodoEstampa sig, ant;
        int colocado;
        
        public NodoEstampa(){
        }
        
        public NodoEstampa(String J,String E,String R, String z){
            Jugador = J;
            Equipo = E;
            Rareza = Integer.parseInt(R);
            zelda = z;
            sig = null;
            ant = null;
            colocado =0;
        }
    }
    
    NodoEstampa Inicio, Fin, Aux, AuxB;
    int Tamaño;
    
    public ListaEstampas(){
        Inicio = null;
        Tamaño = 0;
        Aux = null;
        AuxB = null;
    }
    
    public void Insertar(String Jugador, String Equipo, String Rareza, String zelda){
        NodoEstampa nuevo = new NodoEstampa(Jugador,Equipo,Rareza,zelda);
        if(Inicio == null){
            Inicio = nuevo;
            Fin = Inicio;
            Aux = Inicio;
            AuxB= Inicio;
            System.out.println("INSERSIÓN DE PRIMERA ESTAMPA");
        }else{
            nuevo.sig = Inicio;
            Inicio.ant = nuevo;
            Inicio = nuevo;
            Aux = Inicio;
            AuxB = Inicio;
            System.out.println("SE HA INGRESADO OTRA ESTAMPA");
        }
        Tamaño++;
    }
    
    int i = 0;
    public String ImprimirJugador(){
        if (Aux!=null){
            String B = Aux.Jugador;
            return (B);
        }else{
            return("");
        }
    }
    
    public void SiguienteMost(){
        if(Aux!=null&&Aux.sig!=null){
            Aux = Aux.sig;
        }
    }
    int tryes=0;
    public void SiguienteB(){
        if(AuxB.sig!=null){
            AuxB = AuxB.sig;
        }else{
            AuxB=Inicio;
        }
//        if(AuxB.sig==null){
//            AuxB=Inicio;
//        }
    }
    
    public void AnteriorB(){
        if(AuxB.ant!=null){
            AuxB = AuxB.ant;
        }
    }
    
    public void Siguiente(){
        if(Aux.sig!=null){
            Aux = Aux.sig;
        }
    }
    
    public void AnteriorMost(){
        if(Aux!=null&&Aux.ant!=null){
            Aux = Aux.ant;
        }
    }
    
    public void Anterior(){
        if(Aux.ant!=null){
            Aux = Aux.ant;
        }
    }
    
    public String ImprimirEquipo(){
        if (Aux!=null){
            String A = Aux.Equipo;
            return(A);
        }else{
            return("");
        }
    }
    
    public int ImprimirRareza(){
        if(Aux!=null){
            int C =Aux.Rareza;
            return(C);
        }else{
            return(99);
        }
    }
    
    public String ImprimirZelda(){
        if(Aux!=null){
            String z = Aux.zelda;
            return(z);
        }else{
            return("");
        }
    }
    
    public void Actualizar(){
        if(Inicio!=null){
        Aux = Inicio;
        }
    }
    
    
}

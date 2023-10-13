package pokemon;

import java.util.ArrayList;
public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos=new ArrayList<>();
    
    public  ListaMovimientos(){
     //LISTA DE MOVIMIENTOS DE CHARIZARRD
     movimientos.add(new Movimiento("Tajo Aereo",70,Tipo.VOLADOR,15));
     movimientos.add(new Movimiento("Arañozo",40,Tipo.NORMAL,35));
     movimientos.add(new Movimiento("Ascuas",40,Tipo.FUEGO,25));
     movimientos.add(new Movimiento("Garra Dragon",80,Tipo.DRAGON,15));
             
    //LISTA DE MOVIMIENTOS DE LAPRAS
     movimientos.add(new Movimiento("Gruñido",30,Tipo.NORMAL,40));
     movimientos.add(new Movimiento("Pistola Agua",40,Tipo.AGUA,25));
     movimientos.add(new Movimiento("Rayo confuso",40,Tipo.FANTASMA,25));
     movimientos.add(new Movimiento("Canto Helado",40,Tipo.DRAGON,30)); 
        
    }
    
    public Movimiento buscarMovimientoPorNombre(String nombre){
        for(Movimiento movimiento:movimientos){
            if(movimiento.getNombre().equals(nombre)){
                return movimiento;
            }
            
        }
        return null;
    }
    

   
    
}

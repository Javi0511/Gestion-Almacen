
/**
 * Implementa la parte de Modelo de Datos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ModeloArrayList extends ModeloAbs
{
    private ArrayList <Producto> lista;
    
    public ModeloArrayList()
    {
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
    	 for (int i=1; i < lista.size(); i++){
    		 if(lista.get(i).equals(p)) {
    			 return true;
    		 } 
    	 }lista.add(p);
    	 return true;
    	 
    } 
 
    public boolean borrarProducto ( int codigo ){
    	for (int i =0; i < lista.size();i++){
    		if(lista.get(i).getCodigo()==(codigo)) {
        		lista.remove(i);
        		return true;
    		}
    	}return false;
    }
    
    public Producto buscarProducto (int codigo) {
    	Producto retorno =null;
    	for (int i =0; i < lista.size();i++){
    		if(lista.get(i).getCodigo()==(codigo)) {
    			retorno =lista.get(i) ;  
             }
    	}
		return retorno;
        
    }
    
    public void listarProductos (){
    	 Iterator iter = lista.iterator();
    	 while(iter.hasNext())
    		 System.out.println(iter.next());
    		 
         }
    public void listarPocoStock() {
    	for (int i =0; i < lista.size();i++){
    		if(lista.get(i).getStock() < lista.get(i).getStock_min()) {
    			System.out.println(lista.get(i));
    		}
    	}
    }
    
    
    public boolean modificarProducto (Producto nuevo){
       return false;
    }
    
    
}    


package shopping;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
    
    private ArrayList items;
    
    public ShoppingCart(){
        items = new ArrayList();
    }
    public double getBalance(){     //Monto total de la compra
        double balance = 0.00;
        for (Iterator i =  items.iterator(); i.hasNext();) { // Comprovar valor de rango
            Productos item = (Productos)i.next();
            balance += item.getPrecio();
        }
            return balance;
    } 
    public void AddItem(Productos item){
        items.add(item);
    }
    public void RemoveItem(Productos item){
        items.remove(item);
    }
    public int getItemCount(){
        return items.size();
    }
    public void empty(){
        items.clear();
    }
    
}

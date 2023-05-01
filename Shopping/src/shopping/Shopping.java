
package shopping;

import java.util.Scanner;

/**
 *
 * @author 56978
 */
public class Shopping {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Productos p1 = new Productos("1", "Desodorante", "Frescura total", 2.00);
        Productos p2 = new Productos("2", "Condones", "1313", 3.00);
        Productos p3 = new Productos("3", "Prestobarba", "Brijida", 1.00);
        Productos p4 = new Productos("4", "Cepillo", "Pepsodent", 1.00);

        ShoppingCart sh = new ShoppingCart();
        
        String opcion;
        Scanner sc = new Scanner(System.in);
        
        

     

        System.out.println("Ingresa una opcion");
        opcion = sc.nextLine();
        
            switch (opcion)
            {
                case "1":
                    System.out.println(p1);
                    break;
                case "2":
                    System.out.println(p2);
                    break;
                case "3":
                    System.out.println(p3);
                    break;
                default:
                    System.out.println("Producto desconocido...");
                    break;
            }
    }
}

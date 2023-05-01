/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginp;

import java.util.Scanner;


/**
 *
 * @author 56978
 */
public class Main{

    
    public static void main(String[] args) {
        Usuario user1 = new Usuario("cristian", "completo");
        
        Scanner sc = new Scanner(System.in);
        
        String user = user1.getUsuario() ;
        String password = user1.getPass() ;
        
        System.out.println("Login   ");
        
        System.out.println("Usuario: ");
        user = sc.nextLine();
        
        
        System.out.println("Contraseña: ");
        password = sc.nextLine();
       
                 
        if ("cristian".equals(user) && "completo".equals(password)) {
            System.out.println(user1.AccesoCorrecto());
            System.out.println("Bienvenido " + user1.getUsuario());

        } else if (!"cristian".equals(user) && !"completo".equals(password)) {
            System.out.println("Usuario o clave incorrecta");
            
        }
        else if ("cristian".equals(user) && !"completo".equals(password)) {
            System.out.println("Has ingresado incorrectamente su contraseña");
            
        }
        
  
    }
    
}

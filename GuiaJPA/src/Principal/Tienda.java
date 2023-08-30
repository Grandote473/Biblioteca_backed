/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

/**
 *
 * @author Enzo
 */
import java.util.Scanner;
import javax.persistence.*;
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("GuiaJPAPU");
            EntityManager em = emf.createEntityManager();
        } catch (Exception e) {
        }
    }

}

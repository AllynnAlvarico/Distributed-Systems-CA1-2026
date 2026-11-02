package alvarico.allynn.DSCA1;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("collegePU");

        try {
            System.out.println("Persistence setup started successfully.");
        } finally {
            emf.close();
        }
    }
}

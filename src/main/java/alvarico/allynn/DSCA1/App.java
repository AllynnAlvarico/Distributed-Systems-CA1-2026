package alvarico.allynn.DSCA1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	
	public App() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("collegePU");
		
		fitnessGoalTests(emf);
		
	}
    public static void main( String[] args ) {
    	new App();
    }
    
    public void persistenceSetupTest(EntityManagerFactory emf) {
    	try {
            System.out.println("Persistence setup started successfully.");
        } finally {
            emf.close();
        }
    }
    
    public void fitnessGoalTests(EntityManagerFactory emf) {
    	EntityManager em = emf.createEntityManager();
    	try {
    		em.getTransaction().begin();
    		
    		FitnessGoal crossfit = new FitnessGoal(1, "Crossfit");
    		FitnessGoal gainMass = new FitnessGoal(2, "Gain Mass");
    		FitnessGoal athleticism  = new FitnessGoal(3, "Increase athleticism");
    		
    		em.persist(crossfit);
    		em.persist(gainMass);
    		em.persist(athleticism);
    		
    		em.getTransaction().commit();
    		
    		System.out.println("Fitness goals are saved successfully");
    	} finally {
    		em.close();
    	}
    }
}

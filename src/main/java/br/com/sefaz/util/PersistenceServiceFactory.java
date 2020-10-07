package br.com.sefaz.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceServiceFactory {

	private static EntityManagerFactory emf = null;
	private static EntityManager        em  = null;
	
    public static EntityManager create() {  
        try{  
            if ( emf == null )  {
                emf = Persistence.createEntityManagerFactory("myPU");  
                System.out.println("Factory = "+emf);  
            }
            em = emf.createEntityManager();  
            System.out.println("Manager = "+em);  
              
        }catch(Exception e){  
            System.out.println("Não conseguiu acesar o Banco ");  
        }  
        return em;    
    } 
	
}

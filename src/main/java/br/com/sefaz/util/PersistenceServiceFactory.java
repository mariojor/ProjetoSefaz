package br.com.sefaz.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sefaz.exception.ErrorGeneralException;
import lombok.extern.log4j.Log4j2;

@Log4j
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
            new ErrorGeneralException(e.getMessage(), e.getCause());
        }  
        return em;    
    } 
	
}

package eshop;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductDao {
    
	public ProductDao() {
	}
        
	public String submit(Product product){
            
               
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
                    
		String result = "Product submited successfully";
		try {
                    tx.begin();
                    em.persist(product);
                    tx.commit();;
		} catch (Exception e) {
			e.printStackTrace();
			result = "Product not submited(Existant Barcode)";
		}
		em.close();
		return result;
	}
	
	public List<Product> selectAllProducts() {

		List<Product> products = new ArrayList<>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); 
		EntityManager em = emf.createEntityManager();
              
		try {
			products= em.createNamedQuery("Product.getAll").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return products;
	}
	
	

}

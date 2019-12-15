package tablas;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Solucion
 *
 */
@Entity

public class Solucion implements Serializable {

	   
	@Id
	@GeneratedValue
	private int ID;
	private String Soluci�n;
	private String Uso;
	private static final long serialVersionUID = 1L;

	public Solucion() {
		super();
	}   
	
	public Solucion(String soluci�n, String uso) {
		super();
		Soluci�n = soluci�n;
		Uso = uso;
	}
	
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}   
	public String getSoluci�n() {
		return this.Soluci�n;
	}

	public void setSoluci�n(String Soluci�n) {
		this.Soluci�n = Soluci�n;
	}   
	public String getUso() {
		return this.Uso;
	}

	public void setUso(String Uso) {
		this.Uso = Uso;
	}

	public static List<Solucion> ListaSolucion() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("eclipseLinkPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		List<Solucion> resultList = manager.createQuery("SELECT A FROM  Solucion A", Solucion.class)
				.getResultList();
		manager.close();
		factory.close();
		return resultList;
	}
	
   
}

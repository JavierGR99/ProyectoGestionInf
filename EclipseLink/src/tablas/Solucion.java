package tablas;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Solucion
 *
 */
@Entity

public class Solucion implements Serializable {

	   
	@Id
	private int ID;
	private String Soluci�n;
	private String Uso;
	private static final long serialVersionUID = 1L;

	public Solucion() {
		super();
	}   
	
	public Solucion(int iD, String soluci�n, String uso) {
		super();
		ID = iD;
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
	
   
}

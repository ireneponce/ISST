package es.upm.dit.isst.tfg.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.*;


@Entity // sobre la declaración de la clase, declara que esta clase será una entidad para representar en la base de datos.
public class TFG implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id //se coloca sobre el atributo que actuara como clave primaria del modelo -- email  
	private String email; 
	private String password;
	private String name; 
	private String title;
	private int status; 
	
	@Lob //para contenidos binarios grandes
	private byte[] document; //array de bytes, se almacenara el archivo con la memoria del tfg
	private int mark;
	private String advisor; //email del tutor
	
	public TFG(){}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public byte[] getDocument() {
		return document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}

	public int getMark() {
		return mark;
	}

	public void setGrade(int mark) {
		this.mark = mark;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TFG other = (TFG) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TFG [email=" + email + ", password=" + password + ", name=" + name + ", title=" + title + ", status="
				+ status + ", document=" + Arrays.toString(document) + ", grade=" + mark + ", advisor=" + advisor
				+ "]";
	}

	
}
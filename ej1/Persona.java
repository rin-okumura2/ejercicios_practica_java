package ej1;

public class Persona {

	private String nombre;
	private String mail;
	private Genero genero; 
	private int edad;
	private Genero gusto;
	private int edadMinima ;
	private int edadMaxima;
	
	
	
	public Persona(String nombre,String mail,Genero genero ,int edad,Genero gusto,int edadMinima,int edadMaxima) {
		setEdad(edad);
		setGenero(genero);
		setGusto(gusto);
		setMail(mail);
		setNombre(nombre);
		setEdadMaxima(edadMaxima);
		setEdadMinima(edadMinima);
		
		
	}
	
	private void setNombre(String nombre) {
		if(nombre!=null) {
			this.nombre=nombre;
		}
	}
	
	private void setMail(String mail) {
		if(mail!=null) {
			this.mail=mail;
		}
	}
	
	private void setGenero(Genero genero) {
		if(genero!=null) {
			this.genero=genero;
		}
	}
	
	
	private void setGusto(Genero gusto) {
		if(gusto!=null) {
			this.gusto=gusto;
		}
	}
	
	private void setEdad(int edad) {
		if(edad>0) {
			this.edad=edad;
		}
	}
	
	private void setEdadMaxima(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}
	
	private void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	public String getNombre() {
		return this.nombre;
	}



	public String getMail() {
		// TODO Auto-generated method stub
		return this.mail;
	}
	
	
	public Genero getGenero() {
		return this.genero;
	}
	
public int getEdad() {
	return this.edad;
}
	
	public int getEdadMinima() {
		return this.edadMinima;
	}
	
	
	public int getEdadMaxima() {
		return this.edadMaxima;
	}
	
	
	
	public boolean teGusta(Persona p1) {
		boolean ok=false;
	if(this.gusto ==p1.getGenero() ||this.gusto==Genero.Indistinto) {
		
		if(p1.edad>=this.edadMinima &&  (this.edadMaxima>=p1.getEdad())) {
		ok=true;	
		}
		
	}
	return ok;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNombre();
	}
	
}

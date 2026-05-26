package ej1;

import java.util.ArrayList;

public class AppDeCitas {

	private ArrayList<Persona> personas;
	
	public AppDeCitas() {
		this.personas=new ArrayList<Persona>();
		
	}
	
private Persona buscarPersonaPorNombre(String nombre) {
Persona p=null;
int i=0;
	while(p==null&&i<this.personas.size()) {
	if(this.personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
		p=this.personas.get(i);
	}
	i++;
	
	}

	
return p;
}


private Persona buscarPersonaPorMail(String mail) {
Persona p=null;
int i=0;
	while(mail!=null&&p==null&&i<this.personas.size()) {
	if(this.personas.get(i).getMail().equalsIgnoreCase(mail)) {
		p=this.personas.get(i);
	}
	i++;
	
	}

	
return p;
}


private boolean verificarCoincidenciaParcial (Persona p1,Persona p2) {
	return p2.teGusta(p1);
}



private boolean verificarCoincidenciaTotal(Persona p1,Persona p2) {
	
	
	
	return p1.teGusta(p2)&&p2.teGusta(p1);
}
	

public ArrayList<Persona> mostrarListado(String mail) {
	Persona p1=null;
	ArrayList<Persona> lista=null;
	if(mail!=null) {
		p1=buscarPersonaPorMail(mail);
		if(p1!=null) {
			lista=new ArrayList<Persona>();
			int i=0;
			while(i<this.personas.size()) {
				if(p1!=this.personas.get(i)&&verificarCoincidenciaParcial(p1,this.personas.get(i))) {
					lista.add(this.personas.get(i));
				}
				i++;
			}
		}
		
	}

return lista;



}

public void ingresarPersona(Persona p1) {
	if(p1!=null) {
		if(buscarPersonaPorMail(p1.getMail())==null&&buscarPersonaPorNombre(p1.getNombre())==null){
			this.personas.add(p1);
			System.out.println("Registro Creado "+p1.getNombre());
		}
		else {
			System.out.println("Error De Entrada "+p1);
		}
		
	}
	
}

}

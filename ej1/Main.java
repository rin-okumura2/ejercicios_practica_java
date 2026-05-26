package ej1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppDeCitas app=new AppDeCitas();
		System.out.println(app);
		Persona carlos=new Persona( "Carlos", "carlos@mail.com", Genero.Masculino,45,Genero.Femenino,30,50);
		Persona carlosfalla=new Persona( "Carlos", "carlos@mail.com", Genero.Masculino,45,Genero.Femenino,25,35);
		Persona juan=new Persona( "Juan", "juan@mail.com", Genero.Masculino,30,Genero.Femenino,25,35);
		Persona ana =new Persona("Ana", "ana@mail.com", Genero.Femenino, 32, Genero.Masculino,28,42);
		Persona eva=new Persona("Eva", "eva@mail.com", Genero.Femenino, 32, Genero.Masculino,40,50);
		Persona maria=new Persona("Maria", "maria@mail.com", Genero.Femenino,28,Genero.Masculino,30,40);
		
		app.ingresarPersona(carlos);
		app.ingresarPersona(carlosfalla);
		app.ingresarPersona(juan);
		app.ingresarPersona(maria);
		app.ingresarPersona(eva);
		app.ingresarPersona(ana);
		
		
		System.out.println((app.mostrarListado("carlos@mail.com")));
		
		System.out.println((app.mostrarListado("juan@mail.com")));
	}

}

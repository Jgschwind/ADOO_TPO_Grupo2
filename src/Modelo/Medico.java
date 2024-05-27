package Modelo;

public class Medico extends Persona {
	private int nroMatricula;

    public Medico(String nombre, String apellido, int nroDoc, int nroMatricula) {
		super(nombre,apellido,nroDoc);
		// TODO Auto-generated constructor stub
		this.nroMatricula = nroMatricula;
	}

	


    public void  programarCita (int dni, int turnoId){

    }

    public void realizarConsulta (int turnoId){

    }
}
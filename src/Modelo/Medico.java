package Modelo;

public class Medico extends Persona {
	private int nroMatricula;

    public Medico(int nroMatricula) {
		super();
		// TODO Auto-generated constructor stub
		this.nroMatricula = nroMatricula;
	}

	public int getNroMatricula() {
		return nroMatricula;
	}

	public void setNroMatricula(int nroMatricula) {
		this.nroMatricula = nroMatricula;
	}


	public void programarCita(Paciente paciente,TurnoMedicoBuilder cita) {
		 
	}
	
	public void realizarConsulta(TurnoMedicoBuilder turno) {
		
	}
}

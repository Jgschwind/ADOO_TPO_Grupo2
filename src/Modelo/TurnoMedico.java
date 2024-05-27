package Modelo;
import java.util.Date;

public class TurnoMedico {

    private Paciente cliente;
    private Medico medicoAsignado;
    private double costoTotal;
    private int complejidad;
    private Date fechaHora;
    private String estado;
    private String motivoConsulta;


	public TurnoMedico(Paciente cliente, Medico medicoAsignado, double costoTotal, int complejidad,
			Date fechaHora, String estado, String motivoConsulta) {
		super();
		this.cliente = cliente;
		this.medicoAsignado = medicoAsignado;
		this.costoTotal = costoTotal;
		this.complejidad = complejidad;
		this.fechaHora = fechaHora;
		this.estado = estado;
		this.motivoConsulta = motivoConsulta;
	}

    private void totalPago(){

    }

	public TurnoMedico(Paciente cliente, Medico medicoAsignado, double costoTotal, int complejidad, Date fechaHora,
			String estado, String motivoConsulta) {
		super();
		this.cliente = cliente;
		this.medicoAsignado = medicoAsignado;
		this.costoTotal = costoTotal;
		this.complejidad = complejidad;
		this.fechaHora = fechaHora;
		this.estado = estado;
		this.motivoConsulta = motivoConsulta;
	}

}

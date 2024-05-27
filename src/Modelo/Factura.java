package Modelo;

public class Factura 
{
	private Paciente paciente;
	private TurnoMedico turnoMedico;
	private int total;
	private int descuento;
	
	public Factura(Paciente paciente, TurnoMedico turnoMedico, int total, int descuento)
	{
		this.paciente = paciente;
		this.turnoMedico = turnoMedico;
		this.total = total;
		this.descuento = descuento;
	}
	
	public String obtenerTotalFactura()
	{
		return "";
	}
}

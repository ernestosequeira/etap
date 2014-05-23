package etap.beans;

import java.util.Date;


public class Movimiento {

	private Integer idMovimiento;
	        private Date fecha;
	        private String estado;
	
			public Movimiento() {
			}

			public Integer getIdMovimiento() {
				return idMovimiento;
			}

			public void setIdMovimiento(Integer idMovimiento) {
				this.idMovimiento = idMovimiento;
			}

			public Date getFecha() {
				return fecha;
			}

			public void setFecha(Date fecha) {
				this.fecha = fecha;
			}

			public String getEstado() {
				return estado;
			}

			public void setEstado(String estado) {
				this.estado = estado;
			}
}

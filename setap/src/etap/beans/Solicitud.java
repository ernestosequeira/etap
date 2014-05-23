package etap.beans;

import java.util.Date;

public class Solicitud{

        private Integer idSolicitud;
        private Integer numero_referencia;
        private Date fecha_alta;
		private String objeto;
		private String fundamentacion;


		public Solicitud() {
		}


		public Integer getIdSolicitud() {
			return idSolicitud;
		}


		public void setIdSolicitud(Integer idSolicitud) {
			this.idSolicitud = idSolicitud;
		}


		public Integer getNumeroReferencia() {
			return numero_referencia;
		}


		public void setNumeroReferencia(Integer numero_referencia) {
			this.numero_referencia = numero_referencia;
		}


		public Date getFechaAlta() {
			return fecha_alta;
		}


		public void setFechaAlta(Date fecha_alta) {
			this.fecha_alta = fecha_alta;
		}


		public String getObjeto() {
			return objeto;
		}


		public void setObjeto(String objeto) {
			this.objeto = objeto;
		}


		public String getFundamentacion() {
			return fundamentacion;
		}


		public void setFundamentacion(String fundamentacion) {
			this.fundamentacion = fundamentacion;
		}

}

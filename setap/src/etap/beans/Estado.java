package etap.beans;

public class Estado {
	
	        private Integer idEstado;
	        private String nombre;
	        private String descripcion;
	        
	        public Estado() {
			}

			public Integer getIdEstado() {
				return idEstado;
			}

			public void setIdEstado(Integer idEstado) {
				this.idEstado = idEstado;
			}

			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getDescripcion() {
				return descripcion;
			}

			public void setDescripcion(String descripcion) {
				this.descripcion = descripcion;
			}	
}

package etap.beans;


public class Usuario{

    private Integer idUsuario;
	private String nombre;
    private String apellido;
    private String clave;
    private String email;
    private String telefono_contacto;
    private int nro_interno;
    private int celular_contacto;
    private String nombre_usuario;


	public Usuario() {
	}

		public Integer getIdUsuario() {
			return idUsuario;
        }

        public void setIdUsuario(Integer idUsuario) {
        	this.idUsuario = idUsuario;
        }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getClave() {
			return clave;
		}

		public void setClave(String clave) {
			this.clave = clave;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefonoContacto() {
			return telefono_contacto;
		}

		public void setTelefonoContacto(String telefono_contacto) {
			this.telefono_contacto = telefono_contacto;
		}

		public int getNroInterno() {
			return nro_interno;
		}

		public void setNroInterno(int nro_interno) {
			this.nro_interno = nro_interno;
		}

		public int getCelularContacto() {
			return celular_contacto;
		}

		public void setCelularContacto(int celular_contacto) {
			this.celular_contacto = celular_contacto;
		}

		public String getNombreUsuario() {
			return nombre_usuario;
		}

		public void setNombreUsuario(String nombre_usuario) {
			this.nombre_usuario = nombre_usuario;
		}

}

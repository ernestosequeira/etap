package etap.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import etap.beans.*;


public class SrvUsuario {
	public static LinkedList<Usuario> getUsuario(){
      		LinkedList<Usuario> listaUsuarios=new LinkedList<Usuario>();
      		try{
		
				/*parametros para la conexion*/
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/etap";
				String usuario = "root";
				String clave = "Mandrake8419";
				
				Class.forName(driver);
				Connection conexion = DriverManager.getConnection(url,usuario,clave);
         		
         		Statement st = conexion.createStatement();
        		ResultSet rs = st.executeQuery("select * from Usuario" );
        		
         		while (rs.next()){
         				Usuario usuario1 = new Usuario();
         				usuario1.setIdUsuario(rs.getInt("idUsuario"));
         				usuario1.setNombre(rs.getString("nombre"));
         				usuario1.setApellido(rs.getString("apellido"));
         				usuario1.setClave(rs.getString("clave"));
         				usuario1.setEmail(rs.getString("email"));
         				usuario1.setTelefonoContacto(rs.getString("telefono_contacto"));
         				usuario1.setNroInterno(rs.getInt("nro_interno"));
         				usuario1.setCelularContacto(rs.getInt("celular_contacto"));
         				usuario1.setNombreUsuario(rs.getString("nombre_usuario"));

            			listaUsuarios.add(usuario1);
         		}
         		rs.close();
         		st.close();
         		conexion.close();
      		}
      		catch (Exception e){
         		e.printStackTrace();
      		}
      		return listaUsuarios;
   	}
}
package etap.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import etap.beans.*;


public class SrvEstado {
	public static LinkedList<Estado> getEstado(){
      		LinkedList<Estado> listaEstados=new LinkedList<Estado>();
      		try{
		
				/*parametros para la conexion*/
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/etap";
				String usuario = "root";
				String clave = "Mandrake8419";
				
				Class.forName(driver);
				Connection conexion = DriverManager.getConnection(url,usuario,clave);
         		
         		Statement st = conexion.createStatement();
        		ResultSet rs = st.executeQuery("select * from Estado" );
        		
         		while (rs.next()){
            			Estado estado = new Estado();
            			estado.setIdEstado(rs.getInt("idEstado"));
            			estado.setNombre(rs.getString("nombre"));
            			estado.setDescripcion(rs.getString("descripcion"));
            			listaEstados.add(estado);
         		}
         		rs.close();
         		st.close();
         		conexion.close();
      		}
      		catch (Exception e){
         		e.printStackTrace();
      		}
      		return listaEstados;
   	}
}

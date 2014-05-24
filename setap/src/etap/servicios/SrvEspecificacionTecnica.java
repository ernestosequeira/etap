package etap.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import etap.beans.*;


public class SrvEspecificacionTecnica {
	public static LinkedList<EspecificacionTecnica> getEspecificacionTecnica(){
      		LinkedList<EspecificacionTecnica> listaEspecificacionesTecnicas=new LinkedList<EspecificacionTecnica>();
      		try{
		
				/*parametros para la conexion*/
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/etap";
				String usuario = "root";
				String clave = "Mandrake8419";
				
				Class.forName(driver);
				Connection conexion = DriverManager.getConnection(url,usuario,clave);
         		
         		Statement st = conexion.createStatement();
        		ResultSet rs = st.executeQuery("select * from EspecificacionTecnica" );
        		
         		while (rs.next()){
         				EspecificacionTecnica especificaciontecnica = new EspecificacionTecnica();
         				especificaciontecnica.setIdEspecificacionTecnica(rs.getInt("idEspecificacionTecnica"));
         				especificaciontecnica.setCantidad(rs.getInt("cantidad"));
         				especificaciontecnica.setCodEtap(rs.getString("cod_etap"));
         				listaEspecificacionesTecnicas.add(especificaciontecnica);
         		}
         		rs.close();
         		st.close();
         		conexion.close();
      		}
      		catch (Exception e){
         		e.printStackTrace();
      		}
      		return listaEspecificacionesTecnicas;
   	}
}
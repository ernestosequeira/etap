package etap.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import etap.beans.*;


public class SrvSolicitud {
	public static LinkedList<Solicitud> getSolicitud(){
      		LinkedList<Solicitud> listaSolicitudes=new LinkedList<Solicitud>();
      		try{
		
				/*parametros para la conexion*/
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/etap";
				String usuario = "root";
				String clave = "Mandrake8419";
				
				Class.forName(driver);
				Connection conexion = DriverManager.getConnection(url,usuario,clave);
         		
         		Statement st = conexion.createStatement();
        		ResultSet rs = st.executeQuery("select * from Solicitud" );
        		
         		while (rs.next()){
         				Solicitud solicitud = new Solicitud();
         				solicitud.setIdSolicitud(rs.getInt("idSolicitud"));
         				solicitud.setNumeroReferencia(rs.getInt("nro_referencia"));
           				solicitud.setFechaAlta(rs.getDate("fecha_alta"));
           				solicitud.setObjeto(rs.getString("objeto"));
           				solicitud.setFundamentacion(rs.getString("fundamentacion"));
            			listaSolicitudes.add(solicitud);
         		}
         		rs.close();
         		st.close();
         		conexion.close();
      		}
      		catch (Exception e){
         		e.printStackTrace();
      		}
      		return listaSolicitudes;
   	}
}

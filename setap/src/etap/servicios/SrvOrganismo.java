package etap.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import etap.beans.*;


public class SrvOrganismo {
	public static LinkedList<Organismo> getOrganismo(){
      		LinkedList<Organismo> listaOrganismos=new LinkedList<Organismo>();
      		try{
		
				/*parametros para la conexion*/
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/etap";
				String usuario = "root";
				String clave = "Mandrake8419";
				
				Class.forName(driver);
				Connection conexion = DriverManager.getConnection(url,usuario,clave);
         		
         		Statement st = conexion.createStatement();
        		ResultSet rs = st.executeQuery("select * from Organismo" );
        		
         		while (rs.next()){
            			Organismo organismo = new Organismo();
            			organismo.setIdOrganismo(rs.getInt("idOrganismo"));
            			organismo.setNombre(rs.getString("nombre"));
            			listaOrganismos.add(organismo);
         		}
         		rs.close();
         		st.close();
         		conexion.close();
      		}
      		catch (Exception e){
         		e.printStackTrace();
      		}
      		return listaOrganismos;
   	}
}

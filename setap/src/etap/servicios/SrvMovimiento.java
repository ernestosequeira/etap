package etap.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import etap.beans.*;


public class SrvMovimiento {
	public static LinkedList<Movimiento> getMovimiento(){
      		LinkedList<Movimiento> listaMovimientos=new LinkedList<Movimiento>();
      		try{
		
				/*parametros para la conexion*/
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/etap";
				String usuario = "root";
				String clave = "Mandrake8419";
				
				Class.forName(driver);
				Connection conexion = DriverManager.getConnection(url,usuario,clave);
         		
         		Statement st = conexion.createStatement();
        		ResultSet rs = st.executeQuery("select * from Movimiento" );
        		
         		while (rs.next()){
            			Movimiento movimiento = new Movimiento();
            			movimiento.setIdMovimiento(rs.getInt("idMovimiento"));
            			movimiento.setFecha(rs.getDate("fecha"));
            			movimiento.setEstado(rs.getString("estado"));
            			listaMovimientos.add(movimiento);
         		}
         		rs.close();
         		st.close();
         		conexion.close();
      		}
      		catch (Exception e){
         		e.printStackTrace();
      		}
      		return listaMovimientos;
   	}
}
package Nomina.modelo;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.log.Log;

import Nomina.utilidad.Conexion;


public class NominaDAO {
	 Conexion con = null;

	    public NominaDAO() {
	        con = Conexion.getConexion();
	    }

	    public void registrar (Nomina nomina) {
	        String sql = "INSERT INTO empleado (codigo, cedula, nombre, fechanacimiento, fechaingreso, fecharetiro)"
	                + "VALUES ('"+nomina.getCodigo()+"','"+nomina.getCedula()+"','"+nomina.getNombre()+"','"+nomina.getNacimiento()+"','"+nomina.getIngreso()+"','"+nomina.getRetiro()+"')";
	        try {
	            con.insert(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	    }
	    
	    public Nomina buscar (Nomina nomina){
	    	
	    	 String sql = "SELECT * FROM empleado WHERE codigo = "+"'"+nomina.getCodigo()+"'";
	    	 String abc="";
	    	 Nomina a = new Nomina();
		        try {
		        	
		        	ResultSet ps = con.query(sql);	    	
			        
			        if(ps.next()){
			        	a.setCodigo( ps.getString(1));
			        	a.setCedula( ps.getString(2));
			        	a.setNombre( ps.getString(3));
			        	a.setNacimiento ( ps.getString(4));
			        	a.setIngreso( ps.getString(5));
			        	a.setRetiro( ps.getString(6));
			        	}
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        
		        
		        return a;
	    	
	    }
}

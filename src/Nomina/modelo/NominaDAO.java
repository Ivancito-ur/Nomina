package Nomina.modelo;

import java.sql.SQLException;

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
}

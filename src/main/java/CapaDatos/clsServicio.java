package CapaDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;

import CapaEntidad.Servicios;

public class clsServicio {
	private String Driver = "com.mysql.cj.jdbc.Driver";
	private String URL="jdbc:mysql://localhost/db_acasamudanzas?useSSL=false&useTimezone=true&serverTimezone=UTC";
	private String Usuario="root";
	private String Contraseña="mysql";
	
	//Objetos para la conexion 
	private Connection Cn;		
	private Statement Cmd;
	private CallableStatement Stmt;
	private ResultSet Rs;
	private ArrayList<Servicios> Lista;
	
	public clsServicio() {
		try {
			Class.forName(Driver);
			Cn=DriverManager.getConnection(URL,Usuario, Contraseña);
		} catch (Exception e) {
			System.out.println("ERROR AL ACCEDER A LA BASE DE DATOS: "+e.getMessage());
		}
		
	}
	
	public ArrayList<Servicios> Listado(){
		Lista = new ArrayList<>();
		String SQL="call usp_listar_servicios";
		try {
			Cmd =Cn.createStatement();
			Rs= Cmd.executeQuery(SQL);
			while(Rs.next()) {
				Lista.add(new Servicios(Rs.getString("CLIENTE"),
						Rs.getString("FECHA"),
						Rs.getString("MONEDA"),
						Rs.getDouble("MONTO"),
						Rs.getString("SERVICIO")));
				}
			Rs.close();
			
		} catch (Exception e) {
			System.out.println("Error al listar los servicios: "+e.getMessage());
		}
		
		
		return Lista;
	}
	
	//Metodo InsertarServicios
			public void Insertar(Servicios ObjA) {
				String SQL="call insertar(?,?,?,?,?,?); ";
				try {
					Stmt=Cn.prepareCall(SQL);
					Stmt.setString(1, ObjA.getCliente());
					Stmt.setString(2, ObjA.getFecha());
					Stmt.setString(3, ObjA.getMoneda());
					Stmt.setDouble(4, ObjA.getMonto());
					Stmt.setString(5, ObjA.getServicio());
					
					
					Stmt.executeUpdate();
				}catch (Exception e) {
					System.out.println("Error: "+e.getMessage());
				}
				
			}
}

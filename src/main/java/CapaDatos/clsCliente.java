package CapaDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;
import CapaEntidad.Cliente;

public class clsCliente {

	private String Driver = "com.mysql.cj.jdbc.Driver";
	private String URL="jdbc:mysql://localhost/db_acasamudanzas?useSSL=false&useTimezone=true&serverTimezone=UTC";
	private String Usuario="root";
	private String Contraseña="mysql";
	
	private Connection Cn;		
	private Statement Cmd;
	private CallableStatement Stmt;
	private ResultSet Rs;
	private ArrayList<Cliente> Lista;
	
	public clsCliente() {
		
		try {
			Class.forName(Driver);
			Cn=DriverManager.getConnection(URL,Usuario, Contraseña);
		} catch (Exception e) {
			System.out.println("ERROR AL ACCEDER A LA BASE DE DATOS: "+e.getMessage());
		}
		
	}
	
	public ArrayList<Cliente> Listado(){
		Lista = new ArrayList<>();
		String SQL="call usp_listar_clientes";
		try {
			Cmd =Cn.createStatement();
			Rs= Cmd.executeQuery(SQL);
			while(Rs.next()) {
				Lista.add(new Cliente(Rs.getInt("CODIGO"),
						Rs.getString("NOMBRES"),
						Rs.getString("APELLIDOS"),
						Rs.getString("EMPRESA"),
						Rs.getString("RUC"),
						Rs.getString("CORREO"),
						Rs.getString("CELULAR"),
						Rs.getString("COMENTARIO"),
						Rs.getString("F.REGISTRO")));
			}
			Rs.close();}catch (Exception e) {
				System.out.println("Error al listar los clientes");
				
			}
		
		return Lista;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

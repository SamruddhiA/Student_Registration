package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Student;

public class RegisterDAO {
	
	private Connection conn;

	public RegisterDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean StudentRegister(Student St)
	{
		boolean f=false;
		
		try {
			
			String sql="insert into student(name,email,dob,address,phonenum,gender,password) values(?,?,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,St.getName());
			ps.setString(2,St.getEmail());
			ps.setString(3,St.getDob());
			ps.setString(4,St.getAddress());
			ps.setString(5,St.Phonenum());
			ps.setString(6,St.getGender());
			ps.setString(7,St.getPassword());
			
			int i=ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}

}

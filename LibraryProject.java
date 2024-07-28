package com.mysql.jdbc;

import java.sql.*;
import java.util.Scanner;
public class LibraryProject {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		String url="jdbc:mysql://localhost:3306/project";
	    String un="root";
	    String pw="admin";
	    String Query="insert into library values(?,?,?,?,?)";
	    
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    System.out.println("Driver loaded successfully");
	    System.out.println();
	    Connection con=DriverManager.getConnection(url,un,pw);
	    System.out.println("it connects java to sql");
	    System.out.println();
	    Scanner sc=new Scanner(System.in);
	    PreparedStatement st=con.prepareStatement(Query);
	    
	    System.out.print("Enter the book_id:");
	    int Book_id=sc.nextInt();
	    st.setInt(1,Book_id);
	    
	    System.out.print("Enter the Book: ");
	    String Book=sc.next();
	    st.setString(2,Book);
	    
	    System.out.print("Enter the no.of.pages:");
	    int no_of_pages=sc.nextInt();
	    st.setInt(3, no_of_pages);
	    
	    System.out.print("Enter the prize:");
	    int prize=sc.nextInt();
	    st.setInt(4, prize);
	    
	    System.out.print("Enter the Author:");
	    String Author=sc.next();
	    st.setString(5, Author);
	    System.out.println("Data inserted successfully");
	    
	    
	    st.executeUpdate();
	    sc.close();
	    con.close();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

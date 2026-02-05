//package com.xworkz.linkedin.DAO;
//
//import com.xworkz.linkedin.entity.LinkedinEntity;
//import org.springframework.stereotype.Repository;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//
//@Repository
//public class LinkedInDAO {
//    public void save(LinkedinEntity linkedinentity) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/linkedin_db",
//                    "root",
//                    "Ammu@5182603"
//            );
//            String sql = "INSERT INTO linkedin_table (id, name, email_id, phoneNumber) VALUES (?, ?, ?, ?)";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setInt(1, linkedinentity.getId());
//            ps.setString(2, linkedinentity.getName());
//            ps.setString(3, linkedinentity.getEmail_id());
//            ps.setLong(4, linkedinentity.getPhoneNumber());
//            ps.executeUpdate();
//            ps.close();
//            connection.close();
//            System.out.println("Data is Saved");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
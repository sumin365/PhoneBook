package com.java.phone;
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneDAOImpl implements PhoneDao {
	
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "C##SUMIN", "1234");
		} catch(ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} 
		
		return conn;
	}
//리스트
	@Override
	public List<PhoneVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<PhoneVO> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT id,name,hp,tel FROM phone_book ORDER BY id";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				PhoneVO vo = new PhoneVO(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch(Exception e ) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
//출력
	@Override
	public List<PhoneVO> search(String toSearch) {
		List<PhoneVO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			
			String sql = "SELECT id,name,hp,tel FROM phone_book WHERE name LIKE ? ORDER BY id";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+toSearch+"%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PhoneVO vo = new PhoneVO(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch(Exception e ) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
//등록
	@Override
	public boolean insert(PhoneVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO phone_book VALUES(seq_phone_book.NEXTVAL,?,?,?)";
		int insertedCount = 0;
		try {
			conn = getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getHp());
			pstmt.setString(3, vo.getTel());
			
			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch(Exception e ) {
				e.printStackTrace();
			}
		}
		return insertedCount==1;
	}
//삭제
	@Override
	public boolean delete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM phone_book WHERE id = ?";
		int deletedCount = 0;
		try {
			conn = getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			deletedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch(Exception e ) {
				e.printStackTrace();
			}
		}
		return deletedCount==1;
	}

}
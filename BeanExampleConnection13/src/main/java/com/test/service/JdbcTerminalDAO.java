package com.test.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.test.dao.TerminalDAO;
import com.test.util.Terminal;

public class JdbcTerminalDAO implements TerminalDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;

	}

	public void insert(Terminal terminal) {
		// TODO Auto-generated method stub
		String sql = "insert into terminal" + "(name,number) values(?,?)";
		Connection con = null;

		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, terminal.getName());
			ps.setInt(2, terminal.getTermNumber());
			ps.executeQuery();
			ps.close();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

				}
			}
		}
	}

//	public JdbcTerminalDAO(int termnum) {
//		String sql = "SELECT * FROM TERMINAL WHERE TERM_NUM=?";
//		Connection conn = null;
//		try {
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setInt(1, termnum);
//			Terminal terminal = null;
//			ResultSet rs = ps.executeQuery();
//			if (rs.next()) {
//				terminal = new Terminal(rs.getString("termname"), rs.getInt("termnum"));
//			}
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//				}
//			}
//
//		}
//	}

	public Terminal findByCustomerNumber(int termnum) {
		// TODO Auto-generated method stub
		return null;
	}
}

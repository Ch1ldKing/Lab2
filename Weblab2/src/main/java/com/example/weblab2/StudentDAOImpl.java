package com.example.weblab2;

import com.example.weblab2.Util.DBUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public void addStudent(Student student) throws SQLException {
        String sid = student.getSid();
        String name = student.getName();
        int age = student.getAge();
        Date birthday = student.getBirthday();
        String sql = "insert into student values(?, ?, ?, ?)";
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, sid);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setDate(4, birthday);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("添加学生信息失败");
        } finally {
            DBUtil.close(ps, con);
        }
    }

    @Override
    public void updateStudent(Student student) throws SQLException {
        String sid = student.getSid();
        String name = student.getName();
        int age = student.getAge();
        Date birthday = student.getBirthday();
        String sql = "update student set name = ?, age = ?, birthday = ? where sid = ?";
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(4, sid);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setDate(3, birthday);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("添加学生信息失败");
        } finally {
            DBUtil.close(ps, con);
        }
    }

    @Override
    public void deleteStudent(String sid) throws SQLException {

    }

    @Override
    public List<Student> getAllStudents() throws SQLException {
        return null;
    }

    @Override
    public Student getStudentById(String sid) throws SQLException {
        return null;
    }
    // 连接数据库和执行SQL语句的代码
    // 实现接口中定义的所有方法
    @Override
    public Student getByName(String name) throws SQLException {
        return null;
    }
}

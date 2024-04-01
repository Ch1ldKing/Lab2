package com.example.weblab2;

import java.io.*;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private StudentDAO studentDAO;

    public void init() {
        studentDAO = new StudentDAOImpl(); // 或者使用依赖注入获取实例
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "new":
                    showNewForm(request, response);
                    break;
                case "insert":
                    insertStudent(request, response);
                    break;
                case "delete":
                    studentDAO.deleteStudent(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "update":
                    studentDAO.updateStudent(request, response);
                    break;
                case "list":
                    listStudent(request, response);
                    break;
                default:
                    listStudent(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }*/

    private void listStudent(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void insertStudent(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
    }

    // 方法实现省略：insertStudent, deleteStudent, updateStudent, listStudent, showNewForm, showEditForm
}

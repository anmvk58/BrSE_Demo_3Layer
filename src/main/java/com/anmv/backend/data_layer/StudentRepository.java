package com.anmv.backend.data_layer;

import com.anmv.entity.BrSE2305;
import com.anmv.utils.JDBCUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{

    private JDBCUtils jdbcUtils;

    public StudentRepository() {
        jdbcUtils = new JDBCUtils();
    }

    @Override
    public List<BrSE2305> getListStudents() throws SQLException, IOException {
        List<BrSE2305> listStudent = new ArrayList<>();

        // Khởi tạo kết nối xuống DB
        Connection connection = jdbcUtils.getConnection();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select id, name, student_code, gender from student");

        while (resultSet.next()) {
            BrSE2305 brSE2305 = new BrSE2305(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("student_code"),
                    resultSet.getString("gender")
            );
            listStudent.add(brSE2305);
        }

        return listStudent;
    }
}

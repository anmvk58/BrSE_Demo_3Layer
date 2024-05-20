package com.anmv.backend.data_layer;

import com.anmv.entity.BrSE2305;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IStudentRepository {

    List<BrSE2305> getListStudents() throws SQLException, IOException;
}

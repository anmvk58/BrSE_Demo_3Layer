package com.anmv.backend.business_layer;

import com.anmv.entity.BrSE2305;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IStudentService {
    List<BrSE2305> getListStudents() throws SQLException, IOException;
}

package com.timemng.sbjsp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import com.timemng.sbjsp.model.EmpSchedTaskInfo;
import org.springframework.jdbc.core.RowMapper;
 
public class EmpSchedTaskMapper implements RowMapper<EmpSchedTaskInfo> {
	/*
    public static final String BASE_SQL //
            = "Select ba.Id, ba.Full_Name, ba.Balance From Bank_Account ba ";
 	*/
    public static final String BASE_SQL //
    = "Select ta.task_id, ta.task_name From task ta ";
    
    @Override
    public EmpSchedTaskInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
 
        // Long id = rs.getLong("Id");
        // String fullName = rs.getString("Full_Name");
        // double balance = rs.getDouble("Balance");
        
        Long taskId = rs.getLong("task_id");
        String taskName = rs.getString("task_name");
 
        //return new BankAccountInfo(id, fullName, balance);
        return new EmpSchedTaskInfo(taskId, taskName);
    }
 
}
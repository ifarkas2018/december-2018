package com.timemng.sbjsp.dao;

import java.util.List;

import javax.sql.DataSource;
 
// import org.o7planning.sbjdbc.exception.BankTransactionException;
import com.timemng.sbjsp.mapper.EmpSchedTaskMapper;
import com.timemng.sbjsp.model.EmpSchedTaskInfo;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
 
@Repository
@Transactional
public class EmpSchedTaskDAO extends JdbcDaoSupport {
 
    @Autowired
    public EmpSchedTaskDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
 
    public List<EmpSchedTaskInfo> getSchedules() {
        // Select ba.Id, ba.Full_Name, ba.Balance From Bank_Account ba
    	// Select ta.task_id, ta.task_name From task ta
        String sql = EmpSchedTaskMapper.BASE_SQL;
 
        Object[] params = new Object[] {};
        EmpSchedTaskMapper mapper = new EmpSchedTaskMapper();
        List<EmpSchedTaskInfo> list = this.getJdbcTemplate().query(sql, params, mapper);
 
        return list;
    }
}
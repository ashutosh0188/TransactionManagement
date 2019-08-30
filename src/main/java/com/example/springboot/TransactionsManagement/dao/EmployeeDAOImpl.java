package com.example.springboot.TransactionsManagement.dao;

import com.example.springboot.TransactionsManagement.model.Employee;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeDAOImpl extends BaseDAO implements EmployeeDAO {

    @Override
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employee " + "(code, name) VALUES (?, ?)";
        jdbcTemplate.update(sql, new Object[] {employee.getCode(), employee.getName()});
    }

    @Override
    public void deleteEmployee(long code) {
        String sql = "DELETE FROM employee WHERE code = ?";
        jdbcTemplate.update(sql, new Object[] { code });
    }

    @Override
    public Employee getEmployee(long code) {
        String sql = "SELECT code, name FROM employee WHERE code = ?";

        return jdbcTemplate.query(sql, new Object[]{code}, new ResultSetExtractor<Employee>() {
            @Override
            public Employee extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                if(resultSet!=null && resultSet.next()) {
                    Employee employee = new Employee();
                    employee.setCode(resultSet.getLong(1));
                    employee.setName(resultSet.getString(2));
                    return employee;
                }
                return null;
            }
        });
    }
}

package com.example.springboot.TransactionsManagement.dao;

import com.example.springboot.TransactionsManagement.model.Insurance;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class InsuranceDAOImpl extends BaseDAO implements InsuranceDAO {

    @Override
    public void addInsurance(Insurance insurance) {
        String sql = "INSERT INTO insurance " + "(code, name, coverage_amount) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, new Object[] {insurance.getEmpCode(), insurance.getName(), insurance.getCoverageAmount()});
    }

    @Override
    public void deleteInsurance(long code) {
        String sql = "DELETE FROM insurance WHERE code = ?";
        jdbcTemplate.update(sql, new Object[] { code });
    }

    @Override
    public Insurance getInsurance(long code) {
        String sql = "SELECT code, name, coverage_amount FROM insurance WHERE code = ?";

        return jdbcTemplate.query(sql, new Object[]{code}, new ResultSetExtractor<Insurance>() {
            @Override
            public Insurance extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                if(resultSet!=null && resultSet.next()) {
                    Insurance insurance = new Insurance();
                    insurance.setEmpCode(resultSet.getLong(1));
                    insurance.setName(resultSet.getString(2));
                    insurance.setCoverageAmount(resultSet.getInt(3));
                    return insurance;
                }
                return null;
            }
        });
    }
}

package com.dsib.modules.business.cm.dao.crud.employeeMapper;

import java.util.List;

import com.dsib.modules.business.cm.model.employee.Employee;
import com.dsib.modules.business.cm.model.employee.EmployeeExample;
import com.dsib.modules.business.cm.model.employee.EmployeeKey;
import com.dsib.modules.business.cm.model.employee.EmployeeWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper
{
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(EmployeeKey key);

    int insert(EmployeeWithBLOBs record);

    int insertSelective(EmployeeWithBLOBs record);

    List<EmployeeWithBLOBs> selectByExampleWithBLOBs(EmployeeExample example);

    List<Employee> selectByExample(EmployeeExample example);

    EmployeeWithBLOBs selectByPrimaryKey(EmployeeKey key);

    int updateByExampleSelective(@Param("record") EmployeeWithBLOBs record, @Param("example") EmployeeExample example);

    int updateByExampleWithBLOBs(@Param("record") EmployeeWithBLOBs record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(EmployeeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EmployeeWithBLOBs record);

    int updateByPrimaryKey(Employee record);
}
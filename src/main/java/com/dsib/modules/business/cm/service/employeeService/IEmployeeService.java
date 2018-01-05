package com.dsib.modules.business.cm.service.employeeService;

import com.dsib.common.services.IBaseService;
import com.dsib.modules.business.cm.model.employee.vo.EmployeeDvol;

import java.util.List;

/**
 * Created by 唐乙晧 on 2017/11/10.
 */
public interface IEmployeeService<EmployeeKey, EmployeeWithBLOBs, EmployeeExample> extends IBaseService<EmployeeKey, EmployeeWithBLOBs, EmployeeExample>
{
    List<EmployeeDvol> selectEmployeeList(EmployeeExample employeeExample);
}

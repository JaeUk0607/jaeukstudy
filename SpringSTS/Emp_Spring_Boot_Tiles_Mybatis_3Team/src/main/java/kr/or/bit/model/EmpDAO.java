package kr.or.bit.model;

import java.util.List;
import java.util.Map;

public interface EmpDAO {
 //메서드 정의
 //CRUD 기반
 int insertEmp(EmpDTO dto);
 int updateEmp(EmpDTO dto);
 int deleteEmp(int empno);
  List<EmpDTO> getEmpList();
 EmpDTO getEmp(int empno);
 List<EmpDTO> getEmpList(EmpDTO dto);
 List<EmpDTO> getEmp(Map<String, Object> map); //EmpDTO getEmp(int empno);
 
}

package com.example.ems.service;

import org.springframework.data.domain.Page;
import com.example.ems.dto.EmployeeDto;
import com.example.ems.dto.EmployeeResponseDto;

public interface EmployeeService {

    EmployeeResponseDto createEmployee(EmployeeDto dto);

    Page<EmployeeResponseDto> getAllEmployees(
            int page,
            int size,
            String sortBy,
            String direction
    );

    EmployeeResponseDto getEmployeeById(Long id);

    EmployeeResponseDto updateEmployee(Long id, EmployeeDto dto);

    void deleteEmployee(Long id);
}

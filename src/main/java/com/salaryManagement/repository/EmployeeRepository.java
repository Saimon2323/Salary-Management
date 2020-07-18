package com.salaryManagement.repository;

import com.salaryManagement.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/18/20 6:25 PM
 */

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}

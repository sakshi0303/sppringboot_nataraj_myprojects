package com.nt.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Doctor;

public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {
	
	//based on the doctor id find out age
	
	// for MYSQL, LocalDate,LocalDateTime,LocalTime are there
	@Query(nativeQuery = true,value = "select datediff(now(),dob)/365 from doctor where did=:id")
	
	
	// in ORACLE localtime is not there , so we use timestamp as localtime
	// trunk will give date part out of timestamp with date and time in oracle
	//@Query(nativeQuery = true,value = "select (sysdate-trunck(dob))/365 from doctor where did=:id")
	public float showagebyid(Integer id);

}

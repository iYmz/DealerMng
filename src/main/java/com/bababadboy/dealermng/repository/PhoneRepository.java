package com.bababadboy.dealermng.repository;

import com.bababadboy.dealermng.entity.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * to deal with sql
 * @author iYmz
 *
 */
public interface PhoneRepository extends JpaRepository<Phone,Long> {

    @Override
    List<Phone> findAll();

    @Override
    Page<Phone> findAll(Pageable pageable);


    Phone findPhoneById(Long id);
}

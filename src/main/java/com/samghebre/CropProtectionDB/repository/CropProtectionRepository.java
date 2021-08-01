package com.samghebre.CropProtectionDB.repository;

import com.samghebre.CropProtectionDB.model.CropProtectionProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CropProtectionRepository extends JpaRepository <CropProtectionProduct, Long> {
}

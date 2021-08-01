package com.samghebre.CropProtectionDB;

import com.samghebre.CropProtectionDB.model.CropProtectionProduct;
import com.samghebre.CropProtectionDB.repository.CropProtectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CropProtectionDbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CropProtectionDbApplication.class, args);

	}

	@Autowired
	private CropProtectionRepository cropProtectionRepository;

	@Override
	public void run(String... args) throws Exception {
		this.cropProtectionRepository.save(new CropProtectionProduct("ABC", "DEF", "Fungicide"));
		this.cropProtectionRepository.save(new CropProtectionProduct("GHI", "JKL", "Herbicide"));
		this.cropProtectionRepository.save(new CropProtectionProduct("MNO", "PQR", "Insecticide"));
		this.cropProtectionRepository.save(new CropProtectionProduct("STU", "VWX", "Fungicide"));
	}
}

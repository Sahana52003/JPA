package com.xworkz.company.service;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.entity.CompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceIml implements CompanyService{

    @Autowired
    CompanyDAO companyDAO;


    @Override
    public void register(CompanyDTO companyDTO) {
        System.out.println("CompanyServiceIml is Called " + companyDTO);
        CompanyEntity companyEntity=new CompanyEntity();
        companyEntity.setFName(companyDTO.getFName());
        companyEntity.setLName(companyDTO.getLName());
        companyEntity.setEmail(companyDTO.getEmail());
        companyEntity.setPassword(companyDTO.getPassword());
        companyEntity.setCompanyName(companyDTO.getCompanyName());
        companyEntity.setMobileNumber(companyDTO.getMobileNumber());
        companyDAO.saveData(companyEntity);
    }
}

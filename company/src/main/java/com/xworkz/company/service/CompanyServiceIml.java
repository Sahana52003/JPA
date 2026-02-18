package com.xworkz.company.service;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.entity.CompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceIml implements CompanyService {

    @Autowired
    CompanyDAO companyDAO;


    @Override
    public boolean register(CompanyDTO companyDTO) {

        if (companyDTO != null
                && companyDTO.getFirstName() != null
                && companyDTO.getFirstName().length() >= 4

                && companyDTO.getLastName() != null
                && companyDTO.getLastName().length() >= 1

                && companyDTO.getEmail() != null
                && companyDTO.getEmail().length() >= 15
                && companyDTO.getEmail().contains("@gmail.com")

                && companyDTO.getPassword() != null
                && companyDTO.getPassword().length() >= 5

                && companyDTO.getCompanyName() != null
                && companyDTO.getCompanyName().length() > 0

                && companyDTO.getMobileNumber() != null
                && String.valueOf(companyDTO.getMobileNumber()).length() == 10
        ) {

            CompanyEntity entity = new CompanyEntity();
            entity.setFirstName(companyDTO.getFirstName());
            entity.setLastName(companyDTO.getLastName());
            entity.setEmail(companyDTO.getEmail());
            entity.setPassword(companyDTO.getPassword());
            entity.setCompanyName(companyDTO.getCompanyName());
            entity.setMobileNumber(companyDTO.getMobileNumber());

            companyDAO.saveData(entity);
            return true;

        } else {
            return false;
        }
    }
}
package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDAOImpl implements CompanyDAO{
    @Override
    public void saveData(CompanyEntity companyEntity) {
        System.out.println("Saved Details are : " + companyEntity);
    }
}

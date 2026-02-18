package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;

import java.util.List;

public interface CompanyDAO {
    void saveData(CompanyEntity companyEntity);

   List<CompanyEntity> getCompanyData();
}

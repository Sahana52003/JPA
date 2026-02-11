package com.xworkz.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {
    private String fName;
    private String lName;
    private String email;
    private String password;
    private String companyName;
    private Long mobileNumber;
}

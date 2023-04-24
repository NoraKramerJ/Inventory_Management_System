package com.cydeo.entity;

import com.cydeo.entity.common.BaseEntity;
import com.cydeo.enums.CompanyStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name="companies")
public class Company extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;
    private String title;
    private String phone;
    private String website;

    private Address address;


}

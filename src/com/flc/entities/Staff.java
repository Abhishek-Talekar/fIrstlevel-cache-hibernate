package com.flc.entities;

import javax.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @Column(name = "staff_number")
    protected String staff_number;
    protected String staff_first_name;
    protected String staff_last_name;
    protected String designation;
    protected String email_address;
    protected String store_number;

    public String getStaff_number() {
        return staff_number;
    }

    public void setStaff_number(String staff_number) {
        this.staff_number = staff_number;
    }

    public String getStaff_first_name() {
        return staff_first_name;
    }

    public void setStaff_first_name(String staff_first_name) {
        this.staff_first_name = staff_first_name;
    }

    public String getStaff_last_name() {
        return staff_last_name;
    }

    public void setStaff_last_name(String staff_last_name) {
        this.staff_last_name = staff_last_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getStore_number() {
        return store_number;
    }

    public void setStore_number(String store_number) {
        this.store_number = store_number;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staff_number='" + staff_number + '\'' +
                ", staff_first_name='" + staff_first_name + '\'' +
                ", staff_last_name='" + staff_last_name + '\'' +
                ", designation='" + designation + '\'' +
                ", email_address='" + email_address + '\'' +
                ", store_number='" + store_number + '\'' +
                '}';
    }
}

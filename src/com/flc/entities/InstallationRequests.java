package com.flc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "installation_requests")
public class InstallationRequests implements Serializable {
    @Id
    @Column(name = "installation_req_number")
    protected String installation_req_number;
    protected Date installation_date;
    protected String status;
    protected String staff_number;

    public String getInstallation_req_number() {
        return installation_req_number;
    }

    public void setInstallation_req_number(String installation_req_number) {
        this.installation_req_number = installation_req_number;
    }

    public Date getInstallation_date() {
        return installation_date;
    }

    public void setInstallation_date(Date installation_date) {
        this.installation_date = installation_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStaff_number() {
        return staff_number;
    }

    public void setStaff_number(String staff_number) {
        this.staff_number = staff_number;
    }

    @Override
    public String toString() {
        return "InstallationRequests{" +
                "installation_req_number='" + installation_req_number + '\'' +
                ", installation_date=" + installation_date +
                ", status='" + status + '\'' +
                ", staff_number='" + staff_number + '\'' +
                '}';
    }
}

package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    public Skill() {}

    public Skill(String description, List<Job> jobs) {
        super();
        this.description = description;
        this.jobs = jobs;
    }


    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank
    @Size(min = 1, max = 255)
    private String skill;

    public Skill() {}

    public Skill(String skill) {
        super();
        this.skill = skill;
    }

    public String getSkill() {return skill;}

    public void setSkill(String skill) {this.skill = skill;}
}
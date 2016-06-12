/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcg;

/**
 *
 * @author heathen
 */
public class Skill {
    private String Name;
    private String Description;
    private int Rating;
    private boolean isActiveSkill;
    private String Specialization;

    public Skill(String Name, String Description, int Rating, boolean isActiveSkill, String Specialization){
        this.Name = Name;
        this.Description = Description;
        this.Rating = Rating;
        this.isActiveSkill = isActiveSkill;
        this.Specialization = Specialization;
    }
    
    public String getName(){
        return this.Name;
    }
    public boolean isSpecialized(){
        return !this.Specialization.isEmpty();
    }
    public String getSpecialization(){
        return this.Specialization;
    }
    public int getRating(){
        return this.Rating;
    }
}

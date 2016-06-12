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
public class HitLocation {
    private String Name;
    private Armor LocalArmor;
    private double HitChance;
    
    public HitLocation(String Name){
        this.Name = Name;
        this.LocalArmor = new Armor("No Armor");
        this.HitChance = 0.0;
    }
    public HitLocation(String Name, Armor Armor){
        this.Name = Name;
        this.LocalArmor = Armor;
        this.HitChance = 0.0;
    }
    public HitLocation(String Name, Armor Armor, float HitChance){
        this.Name = Name;
        this.LocalArmor = Armor;
        this.HitChance = HitChance;
    }
    public String GetLocationName(){
        return this.Name;
    }
    public Armor GetLocationArmor(){
        return this.LocalArmor;
    }
    public double GetLocationHitChance(){
        return this.HitChance;
    }
    public void SetName(String Name){
        this.Name = Name;
    }
    public void SetArmor(Armor Armor){
        this.LocalArmor = Armor;
    }
    public void SetArmor(double HitChance){
        this.HitChance = HitChance;
    }
}

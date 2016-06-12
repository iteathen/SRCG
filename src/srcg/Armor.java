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
public class Armor {
    private String Name;
    private int Value; //5th edition style
    private int BallisticValue;
    private int ImpactValue;
    private boolean Hardened;
    private boolean Physical;
    private boolean Astral;
    private boolean Matrix;

    public Armor(){
        this.Name = "Unnamed Armor";
        this.Value = 0;
        this.BallisticValue = 0;
        this.ImpactValue = 0;
        this.Hardened = false;
        this.Physical = false;
        this.Astral = false;
        this.Matrix = false;
    }
    public Armor(String ArmorName){
        this.Name = ArmorName;
        this.Value = 0;
        this.BallisticValue = 0;
        this.ImpactValue = 0;
        this.Hardened = false;
        this.Physical = false;
        this.Astral = false;
        this.Matrix = false;
    }
    public Armor(int ArmorValue){
        this.Name = "Unnamed Armor";
        this.Value = ArmorValue;
        this.BallisticValue = 0;
        this.ImpactValue = 0;
        this.Hardened = false;
        this.Physical = true;
        this.Astral = false;
        this.Matrix = false;
    }
    public Armor(String ArmorName, int ArmorValue){
        this.Name = ArmorName;
        this.Value = ArmorValue;
        this.BallisticValue = 0;
        this.ImpactValue = 0;
        this.Hardened = false;
        this.Physical = true;
        this.Astral = false;
        this.Matrix = false;
    }
    public Armor(String ArmorName, int ArmorValue, boolean Hardened, boolean Physical, boolean Astral, boolean Matrix){
        this.Name = ArmorName;
        this.Value = ArmorValue;
        this.BallisticValue = 0;
        this.ImpactValue = 0;
        this.Hardened = Hardened;
        this.Physical = Physical;
        this.Astral = Astral;
        this.Matrix = Matrix;
    }
    public Armor(String ArmorName, int BallisticValue, int ImpactValue){ //Only used in older versions of SR. This is not for 5th edition!
        this.Name = ArmorName;
        this.Value = 0;
        this.BallisticValue = BallisticValue;
        this.ImpactValue = ImpactValue;
        this.Hardened = false;
        this.Physical = true;
        this.Astral = false;
        this.Matrix = false;
    }
    public Armor(String ArmorName, int BallisticValue, int ImpactValue, boolean Hardened, boolean Physical, boolean Astral, boolean Matrix){
        this.Name = ArmorName;
        this.Value = 0;
        this.BallisticValue = BallisticValue;
        this.ImpactValue = ImpactValue;
        this.Hardened = Hardened;
        this.Physical = Physical;
        this.Astral = Astral;
        this.Matrix = Matrix;
    }
    public void SetHardened(boolean Hardened){
        this.Hardened = Hardened;
    }
    public void SetAstral(boolean Astral){
        this.Astral = Astral;
    }
    public void SetMatrix(boolean Matrix){
        this.Matrix = Matrix;
    }
    public void SetPhysical(boolean Physical){
        this.Physical = Physical;
    }
    public void SetArmorValue(int ArmorValue){
        this.Value = ArmorValue;
    }
    public void SetImpactArmorValue(int ArmorValue){
        this.ImpactValue = ArmorValue;
    }
    public void SetBallisticArmorValue(int ArmorValue){
        this.BallisticValue = ArmorValue;
    }
    public void SetName(String Name){
        this.Name = Name;
    }
    public int GetValue(){
        return this.Value;
    }
    public String GetName(){
        return this.Name;
    }
    public int GetBallisticValue(){
        return this.BallisticValue;
    }
    public int GetImpactValue(){
        return this.ImpactValue;
    }
    public boolean IsHardened(){
        return this.Hardened;
    }
    public boolean IsPhysical(){
        return this.Physical;
    }
    public boolean IsAstral(){
        return this.Astral;
    }
    public boolean IsMatrix(){
        return this.Matrix;
    }
}

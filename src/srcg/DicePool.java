/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcg;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author heathen
 */
public class DicePool {
    private String Name;
    private List<Dice> Pool = new ArrayList<>();
    public void DicePool(String Name){
        this.Name = Name;
    }
    public DicePool(String Name, List<Dice> Pool){
        this.Name = Name;
        this.Pool = Pool;
    }
    public void addDice(Dice Source){ //add each source seperatly
        Pool.add(Source);
    }
    public int getNumberOfDice(){
        int val=0;
        for(Dice temp : Pool){ //loop through all dice sources and take the total value
            val += temp.getAmount();
        }
        return val;
    }
    public void removeDice(Dice Target){ // This is not for ordinary dice pool adjustments. Do not use this unless you want to remove an entire contributing source.
        Pool.remove(Target);
    }
    public void addOneDice(String Source){
        Dice temp = new Dice(Source, 1);
        Pool.add(temp);
    }
    public void addDice(String Source, int Amount){
        Dice temp = new Dice(Source, Amount);
        Pool.add(temp);
    }
    public int removeDiceByDescription(String Description){ //returns the number of dice sources removed. Avoid using this if possible. Keep your dice objects!
        int i=0;
        for(Dice temp: Pool){
            if(temp.getSource().contentEquals(Description)){
                Pool.remove(temp);
                i++;
            }
        }
        return i;
    }
    public void adjustDicePool(String Reason, int Amount){
        addDice(Reason, Amount);
    }
    public String getName(){
        return this.Name;
    }
}

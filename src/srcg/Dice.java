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
public class Dice {
    private final String Source;
    private int Amount;
    public Dice(String Source, int Amount){
        this.Source = Source;
        this.Amount = Amount;
    }
    public int getAmount(){
        return Amount;
    }
    public String getSource(){
        return this.Source;
    }
    public int setAmount(int Amount){
        this.Amount = Amount;
        return this.Amount;
    }
}

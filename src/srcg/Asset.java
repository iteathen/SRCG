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
public class Asset {
    private String Name;
    private String Desciption;
    private double MarketValue; //The estimated value
    private double AdministrativeOverhead; //Any maintenance fees or other type of periodic cost go here
    private double ROI; //given as a decimal value. Example 0.01 is 1 percent.
    private double CompoundRate; // the time interval in whichs interest compounds
    private double CostInterval; // the time interval in which AdministrativeOverhead accumulates
    private boolean isMoney;
    private boolean isInvestment;
    private boolean isPhysicalAsset;
    // missing constructors and methods
}

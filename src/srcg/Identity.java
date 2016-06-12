/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcg;

import java.util.ArrayList;
import java.util.List;

/**
 * These identities do not require supporting evidence.
 * @author heathen
 */
public class Identity {
    private final String Name;
    private String Description;
    private final List<Asset> Assets = new ArrayList<>(); //Investments, houses, life style, money.. it is all assets
    public Identity(String Name, String Description){
        this.Name=Name;
        this.Description = Description;
    }
    public void addAsset(Asset newAsset){
        Assets.add(newAsset);
    }
    public void setDescription(String newDescription){
        this.Description = newDescription;
    }
    public String getDescription(){
        return this.Description;
    }
    public String getName(){
        return this.Name;
    }
    public List<Asset> getAssets(){
        return this.Assets;
    }
}

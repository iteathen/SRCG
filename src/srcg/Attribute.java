/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcg;

/**
 *
 * @author heathen
 * This class should be instantiated with values from user defined XML documents
 * 
 */
public class Attribute {
    private String Name;
    private int Value; // the formula for derived attributes should be defined in plaintext script to allow it to be modified by the users.
    private boolean Derivative; //indicates that the attribute is derived from other sources. ie the Initative attribute is derived from Reaction and Intuition.
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcg;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author heathen
 */
public class SRCharacter {
    private String PlayerName;
    private String CharacterName;
    private String CharacterStreetName;
    private String CharacterBackground;
    private String CharacterDescription;
    private List<SerialIdentifierNumber> SerialIdentifierNumbers = new ArrayList<SerialIdentifierNumber>();
    private List<Attribute> Attributes = new ArrayList<Attribute>();
    private List<Skill> Skills = new ArrayList<Skill>();
    private List<Item> Items = new ArrayList<Item>();
    private List<Power> Powers = new ArrayList<Power>();
    private List<Spells> Spells = new ArrayList<Spells>();
    private List<Quality> Qualities = new ArrayList<Quality>();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcg;

import java.util.List;
import java.util.ArrayList;

/**
 * Assets do not belong here. All assets are linked to an Identity including Nuyen.
 * @author heathen
 */
public class Character {
    private String PlayerName;
    private final List<Identity> Identities = new ArrayList<>();
    private String CharacterStreetName;
    private String CharacterBackground;
    private String CharacterDescription;
    private final List<Attribute> Attributes = new ArrayList<>();
    private final List<Skill> Skills = new ArrayList<>();
    private final List<Item> Items = new ArrayList<>();
    private final List<Power> Powers = new ArrayList<>();
    private final List<Spells> Spells = new ArrayList<>();
    private final List<Quality> Qualities = new ArrayList<>();
    private final List<DicePool> Dicepools = new ArrayList<>();
}

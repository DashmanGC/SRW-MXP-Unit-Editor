/*
 * Copyright (C) 2014 Dashman
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package srw.mxp.unit.editor;

/**
 *
 * @author Jonatan
 */
public class UnitData {
    int series;
    
    int HP;
    int EN;
    int armor;
    int mobility;
    int movement;
    int cost;
    int reward;
    int reward_pp;
    
    int ability1;
    int ability2;
    int ability3;
    int ability4;
    
    int num_parts;
    
    int ratings;
    
    int[] weapons;
    
    
    public UnitData(){
        series = 0;
        
        HP = 0;
        EN = 0;
        armor = 0;
        mobility = 0;
        movement = 0;
        cost = 0;
        reward = 0;
        reward_pp = 0;
        
        ability1 = 0;
        ability2 = 0;
        ability3 = 0;
        ability4 = 0;
        
        num_parts = 0;
        
        ratings = 0;
        
        weapons = new int[16];
    }
    
    public UnitData(int s, int hp, int en, int a, int mob, int mov, int c, int r, 
            int pp, int a1, int a2, int a3, int a4, int np, int ur, int[] weap){
        series = s;
        
        HP = hp;
        EN = en;
        armor = a;
        mobility = mob;
        movement = mov;
        cost = c;
        reward = r;
        reward_pp = pp;
        
        ability1 = a1;
        ability2 = a2;
        ability3 = a3;
        ability4 = a4;
        
        num_parts = np;
        
        ratings = ur;
        
        weapons = new int[16];
        
        System.arraycopy(weap, 0, weapons, 0, weap.length);
    }
}

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
public class WeaponData {
    int power;
    int min_range;
    int max_range;
    int map_type;
    int ammo;
    int en_cost;
    int will;
    int hit;
    int critical;
    int NT_lvl;
    int status;
    int flags40;
    int flags41;
    int flags42;
    int flags44;
    int flags45;
    int flags46;
    
    public WeaponData(){
        power = 0;
        min_range = 0;
        max_range = 0;
        map_type = 0;
        ammo = 0;
        en_cost = 0;
        will = 0;
        hit = 0;
        critical = 0;
        NT_lvl = 0;
        status = 0;
        flags40 = 0;
        flags41 = 0;
        flags42 = 0;
        flags44 = 0;
        flags45 = 0;
        flags46 = 0;
    }
    
    public WeaponData(int p, int min, int max, int mt, int a, int e, int w, int h, int c, 
            int nt, int st, int fl40, int fl41, int fl42, int fl44, int fl45, int fl46){
        power = p;
        min_range = min;
        max_range = max;
        map_type = mt;
        ammo = a;
        en_cost = e;
        will = w;
        hit = h;
        critical = c;
        NT_lvl = nt;
        status = st;
        flags40 = fl40;
        flags41 = fl41;
        flags42 = fl42;
        flags44 = fl44;
        flags45 = fl45;
        flags46 = fl46;
    }
}

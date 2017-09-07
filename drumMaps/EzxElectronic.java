/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drumMaps;

import Main.EnumPieceType;
import Main.EnumVstList;

/**
 *
 * @author Flake
 */
public enum EzxElectronic {
    
    KICK("Kick", 36, EnumPieceType.KICK),
    SNARE_1("Snare 1", 38, EnumPieceType.SNARE),
    SNARE_2("Snare 2", 40, EnumPieceType.SNARE),
    RIM("Rim", 37, EnumPieceType.SNARE),
    CLAP("Clap", 39, EnumPieceType.PAD),    
    TOM_1("Tom 1", 41, EnumPieceType.TOM),
    TOM_2("Tom 2", 43, EnumPieceType.TOM),
    TOM_3("Tom 3", 45, EnumPieceType.TOM),
    TOM_4("Tom 4", 47, EnumPieceType.TOM),   
    CRASH_1("Crash 1", 49, EnumPieceType.CRASH),
    CRASH_2("Crash 1", 51, EnumPieceType.CRASH),    
    HITS_1("Hits 1", 48, EnumPieceType.PAD),
    HITS_2("Hits 2", 50, EnumPieceType.PAD),
    HITS_3("Hits 3", 52, EnumPieceType.PAD),
    HITS_4("Hits 4", 53, EnumPieceType.PAD),
    HITS_5("Hits 5", 54, EnumPieceType.PAD),
    HITS_6("Hits 6", 55, EnumPieceType.PAD), 
    PERCUSSION_1("Percussion 1", 56, EnumPieceType.PAD),
    PERCUSSION_2("Percussion 2", 57, EnumPieceType.PAD),
    PERCUSSION_3("Percussion 3", 58, EnumPieceType.PAD),
    PERCUSSION_4("Percussion 4", 59, EnumPieceType.PAD),   
    EXTRA_1("Extra 1", 61, EnumPieceType.PAD),
    EXTRA_2("Extra 2", 62, EnumPieceType.PAD),
    EXTRA_3("Extra 3", 63, EnumPieceType.PAD),
    EXTRA_4("Extra 4", 64, EnumPieceType.PAD),
    EXTRA_5("Extra 5", 65, EnumPieceType.PAD),
    EXTRA_6("Extra 6", 66, EnumPieceType.PAD),
    EXTRA_7("Extra 7", 67, EnumPieceType.PAD),
    EXTRA_8("Extra 8", 68, EnumPieceType.PAD),
    EXTRA_9("Extra 9", 69, EnumPieceType.PAD),
    EXTRA_10("Extra 10", 70, EnumPieceType.PAD),
    EXTRA_11("Extra 11", 71, EnumPieceType.PAD),
    EXTRA_12("Extra 12", 72, EnumPieceType.PAD),
    EXTRA_13("Extra 13", 73, EnumPieceType.PAD),
    EXTRA_14("Extra 14", 74, EnumPieceType.PAD),
    EXTRA_15("Extra 15", 75, EnumPieceType.PAD),
    EXTRA_16("Extra 16", 76, EnumPieceType.PAD),   
    HATS_1("Hats 1", 42, EnumPieceType.HIHAT),
    HATS_2("Hats 2", 44, EnumPieceType.HIHAT),
    HATS_3("Hats 3", 46, EnumPieceType.HIHAT),
    HATS_4("Hats 4", 60, EnumPieceType.HIHAT);  
    
    public int note;
    public String name;
    public EnumPieceType type;

    EzxElectronic (String valName, int valNote, EnumPieceType valType){
        name = valName;
        note = valNote;
        type = valType;
    }

    public String getName(){
        return name;
    }

    public int getNote(){
        return note;
    }
        
    public EnumPieceType getPieceType(){
        return type;
    }
    
    public static String getMapVst(){
        return EnumVstList.EZX_ELECTRONIC.name();
    }
}

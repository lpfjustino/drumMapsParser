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
public enum FxpansionBFD {
    KICK_1_HIT("Kick 1 Hit", 36, EnumPieceType.KICK),
    KICK_1_HIT_NO_SNARE("Kick 1 Hit (No Snare)", 35, EnumPieceType.KICK),
    KICK_2_HIT("Kick 2 Hit", 23, EnumPieceType.KICK),
    KICK_2_HIT_NO_SNARE("Kick 2 Hit (No Snare)", 24, EnumPieceType.KICK),    
    SNARE_1_HIT("Snare 1 Hit", 38, EnumPieceType.SNARE),
    SNARE_1_SIDESTICK("Snare 1 Sidestick", 37, EnumPieceType.SNARE),
    SNARE_1_RIM("Snare 1 Rim", 40, EnumPieceType.SNARE),
    SNARE_1_DRAG("Snare 1 Drag", 39, EnumPieceType.SNARE),
    SNARE_1_FLAM("Snare 1 Flam", 41, EnumPieceType.SNARE),
    SNARE_2_HIT("Snare 2 Hit", 26, EnumPieceType.SNARE),
    SNARE_2_SIDESTICK("Snare 2 Sidestick", 25, EnumPieceType.SNARE),
    SNARE_2_RIM("Snare 2 Rim", 28, EnumPieceType.SNARE),
    SNARE_2_DRAG("Snare 2 Drag", 27, EnumPieceType.SNARE),
    SNARE_2_FLAM("Snare 2 Flam", 29, EnumPieceType.SNARE),
    FLOOR_TOM("Floor Tom Hit", 43, EnumPieceType.FLOOR_TOM),
    MID_TOM("Mid Tom Hit", 45, EnumPieceType.TOM),
    HI_TOM("High Tom Hit", 47, EnumPieceType.TOM),
    TOM_4_HIT("Tom 4 Hit", 2, EnumPieceType.TOM),
    TOM_4_ALT("Tom 4 Alt", 3, EnumPieceType.TOM),
    TOM_5_HIT("Tom 5 Hit", 4, EnumPieceType.TOM),
    TOM_5_ALT("Tom 5 Alt", 5, EnumPieceType.TOM),
    TOM_6_HIT("Tom 6 Hit", 6, EnumPieceType.TOM),
    TOM_6_ALT("Tom 6 Alt", 7, EnumPieceType.TOM),  
    PERCUSSION_HIT("Percussion Hit", 0, EnumPieceType.PERCUSSION),
    PERCUSSION_ALT("Percussion Alt", 1, EnumPieceType.PERCUSSION),
    CYMBAL_1_HIT("Cymbal 1 Hit", 49, EnumPieceType.CYMBAL),
    CYMBAL_1_BELL("Cymbal 1 Bell", 54, EnumPieceType.CYMBAL),
    CYMBAL_1_CHOKE("Cymbal 1 Choke", 57, EnumPieceType.CYMBAL),
    CYMBAL_2_HIT("Cymbal 2 Hit", 55, EnumPieceType.CYMBAL),
    CYMBAL_2_BELL("Cymbal 2 Bell", 56, EnumPieceType.CYMBAL),
    CYMBAL_2_CHOKE("Cymbal 2 Choke", 58, EnumPieceType.CYMBAL),
    CYMBAL_3_HIT("Cymbal 3 Hit", 51, EnumPieceType.CYMBAL),
    CYMBAL_3_BELL("Cymbal 3 Bell", 53, EnumPieceType.CYMBAL),
    CYMBAL_3_CHOKE("Cymbal 3 Choke", 59, EnumPieceType.CYMBAL),
    CYMBAL_4_HIT("Cymbal 4 Hit", 8, EnumPieceType.CYMBAL),
    CYMBAL_4_BELL("Cymbal 4 Bell", 9, EnumPieceType.CYMBAL),
    CYMBAL_4_CHOKE("Cymbal 4 Choke", 14, EnumPieceType.CYMBAL),
    CYMBAL_5_HIT("Cymbal 5 Hit", 10, EnumPieceType.CYMBAL),
    CYMBAL_5_BELL("Cymbal 5 Bell", 11, EnumPieceType.CYMBAL),
    CYMBAL_5_CHOKE("Cymbal 5 Choke", 15, EnumPieceType.CYMBAL),
    CYMBAL_6_HIT("Cymbal 6 Hit", 16, EnumPieceType.CYMBAL),
    CYMBAL_6_BELL("Cymbal 6 Bell", 13, EnumPieceType.CYMBAL),
    CYMBAL_6_CHOKE("Cymbal 6 Choke", 59, EnumPieceType.CYMBAL),  
    HIHAT_OPEN_TIP_GM("HiHat Open Tip (GM)", 46, EnumPieceType.HIHAT),
    HIHAT_34_OPEN_TIP("HiHat 3/4 Open Tip", 33, EnumPieceType.HIHAT_OPEN),
    HIHAT_34_OPEN_SHANK("HiHat 3/4 Open Shank", 32, EnumPieceType.HIHAT_OPEN),
    HIHAT_12_OPEN_TIP("HiHat 1/2 Open Tip", 51, EnumPieceType.HIHAT_OPEN),
    HIHAT_12_OPEN_SHANK("HiHat 1/2 Open Shank", 52, EnumPieceType.HIHAT_OPEN),
    HIHAT_14_OPEN_TIP("HiHat 1/4 Open Tip", 31, EnumPieceType.HIHAT_OPEN),
    HIHAT_14_OPEN_SHANK("HiHat 1/4 Open Tip", 30, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED_TIP("HiHat Closed Tip", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_SHANK("HiHat Closed Shank", 48, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_PEDAL_CC("HiHat Pedal CC", 4, EnumPieceType.HIHAT_CC);   

    public int note;
    public String name;
    public EnumPieceType type;
    
    FxpansionBFD (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.FXPANSION_BFD.name();
    }
}

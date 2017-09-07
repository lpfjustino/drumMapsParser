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
public enum AddictiveDrums {
    
    KICK_HIT("Kick", 36, EnumPieceType.KICK),
    SNARE_HIT("Snare Hit", 40, EnumPieceType.SNARE),
    SNARE_RIM("Snare Rim", 39, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 42, EnumPieceType.SNARE),
    TOM_1_HIT("Tom 1 Hit", 71, EnumPieceType.TOM),
    TOM_1_RIM("Tom 1 Hit", 72, EnumPieceType.TOM),
    TOM_2_HIT("Tom 2 Hit", 69, EnumPieceType.TOM),
    TOM_2_RIM("Tom 2 Hit", 70, EnumPieceType.TOM),
    TOM_3_HIT("Tom 3 Hit", 67, EnumPieceType.TOM),
    TOM_3_RIM("Tom 3 Hit", 68, EnumPieceType.TOM),
    TOM_4_HIT("Tom 4 Hit", 65, EnumPieceType.TOM),
    TOM_4_RIM("Tom 4 Hit", 66, EnumPieceType.TOM),   
    RIDE_CHOKE("Ride Cymbal Choke", 63, EnumPieceType.RIDE),
    RIDE_SHAFT("Ride Cymbal Shaft", 62, EnumPieceType.RIDE),
    RIDE_TIP("Ride Cymbal Tip", 60, EnumPieceType.RIDE),
    RIDE_BELL("Ride Cymbal Bell", 61, EnumPieceType.RIDE),   
    CYMBAL_1("Cymbal 1", 77, EnumPieceType.CYMBAL),
    CYMBAL_2("Cymbal 2", 79, EnumPieceType.CYMBAL),
    CYMBAL_3("Cymbal 3", 81, EnumPieceType.CYMBAL),
    CYMBAL_1_CHOKE("Cymbal 1 Choke", 78, EnumPieceType.CYMBAL),
    CYMBAL_2_CHOKE("Cymbal 2 Choke", 80, EnumPieceType.CYMBAL),
    CYMBAL_3_CHOKE("Cymbal 3 Choke", 82, EnumPieceType.CYMBAL),
    STICKS("Sticks", 75, EnumPieceType.PERCUSSION),
    EXTRA("Extra", 47, EnumPieceType.PAD),
    
    HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_OPENED_EDGE("HiHat Opened Edge", 65, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPENED_MAX("HiHat Opened Max", 60, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN3("HiHat Open 3", 26, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN2("HiHat Open 2", 25, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN1("HiHat Open 1", 24, EnumPieceType.HIHAT_OPEN),
    HIHAT_FOOT_SPLASH("HiHat Foot Splash", 23, EnumPieceType.HIHAT_PEDAL),
    HIHAT_CLOSED_EDGE("HiHat Closed Edge", 22, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL_CC("HiHat Pedal CC", 4, EnumPieceType.HIHAT_CC);
    
    
    public int note;
    public String name;
    public EnumPieceType type;

    AddictiveDrums (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.XLN_ADDICTIVE_DRUMS.name();
    }
}

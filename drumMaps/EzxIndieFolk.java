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
public enum EzxIndieFolk {
    
    KICK_HIT("Kick Hit", 36, EnumPieceType.KICK),
    SNARE_CENTER("Snare Center", 38, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 40, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    SNARE_RIM_ONLY("Snare Rim Only", 71, EnumPieceType.SNARE), 
    TOM_CENTER("Tom Center", 48, EnumPieceType.TOM),
    TOM_RIMSHOT("Tom Rimshot", 78, EnumPieceType.TOM),
    TOM_RIM_ONLY("Tom Rim Only", 77, EnumPieceType.TOM),   
    FLOOR_TOM_HEAD("Floor Tom Head", 43, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_RIMSHOT("Floor Tom Rimshot", 75, EnumPieceType.FLOOR_TOM),   
    FLOOR_TOM_RIM_ONLY("Floor Tom Rim Only", 74, EnumPieceType.FLOOR_TOM), 
    CRASH_A_HIT("Crash A Hit", 49, EnumPieceType.CRASH),
    CRASH_A_MUTED("Crash A Muted", 50, EnumPieceType.CRASH), 
    CRASH_B_HIT("Crash B Hit", 57, EnumPieceType.CRASH),
    CRASH_B_MUTED("Crash B Muted", 58, EnumPieceType.CRASH),  
    RIDE_SHANK("Ride Shank", 52, EnumPieceType.RIDE),
    RIDE_TIP("Ride Tip", 51, EnumPieceType.RIDE),
    RIDE_BELL("Ride Bell", 53, EnumPieceType.RIDE),
    RIDE_MUTE("Ride Mute", 54, EnumPieceType.RIDE),
    TAMBOURINE_HIT("Tambourine Hit", 76, EnumPieceType.PERCUSSION),   
    
    HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_SEQUENCE("HiHat Sequence", 65, EnumPieceType.HIHAT), 
    HIHAT_OPENED_MIN("HiHat Opened Min", 64, EnumPieceType.HIHAT_OPEN),
    HIHAT_TIGHT_TIP("HiHat Tight Tip", 63, EnumPieceType.HIHAT),
    HIHAT_TIGHT_EDGE("HiHat Tight Edge", 62, EnumPieceType.HIHAT),
    HIHAT_CLOSED_TIP("HiHat Closed Tip", 61, EnumPieceType.HIHAT_CLOSED),
    HIHAT_OPENED_MAX("HiHat Opened Max", 60, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN3("HiHat Open 3", 26, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN2("HiHat Open 2", 25, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN1("HiHat Open 1", 24, EnumPieceType.HIHAT_OPEN),
    HIHAT_FOOT_SPLASH("HiHat Foot Splash", 23, EnumPieceType.HIHAT_PEDAL),
    HIHAT_CLOSED_EDGE("HiHat Closed Edge", 22, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL_CHICK("HiHat Pedal Chick", 21, EnumPieceType.HIHAT_PEDAL);       
        
    public int note;
    public String name;
    public EnumPieceType type;

    EzxIndieFolk (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.EZX_INDIE_FOLK.name();
    }
}

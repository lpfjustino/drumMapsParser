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
public enum EzxFunkMasters {
    
    KICK_RIGHT("Kick Right", 36, EnumPieceType.KICK),
    
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    SNARE_RIGHT("Snare Right", 38, EnumPieceType.SNARE),
    SNARE_LEFT("Snare Left", 33, EnumPieceType.SNARE), 
    SNARE_RIMSHOT("Snare Rimshot", 40, EnumPieceType.SNARE),
    SNARE_RIM_ONLY("Snare Rim Only", 71, EnumPieceType.SNARE),
    TOM_1_HEAD("Tom 1 Head", 48, EnumPieceType.TOM),
    TOM_1_RIMSHOT("Tom 1 Rimshot", 82, EnumPieceType.TOM),
    TOM_1_RIM_ONLY("Tom 1 Rim Only", 81, EnumPieceType.TOM), 
    TOM_2_HEAD("Tom 2 Head", 47, EnumPieceType.TOM),
    TOM_2_RIMSHOT("Tom 2 Rimshot", 80, EnumPieceType.TOM),
    TOM_2_RIM_ONLY("Tom 2 Rim Only", 79, EnumPieceType.TOM), 
    FLOOR_TOM_HEAD("Floor Tom Head", 43, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_RIMSHOT("Floor Tom Rimshot", 75, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_RIM_ONLY("Floor Tom Rim Only", 74, EnumPieceType.FLOOR_TOM),    
    CRASH_HIT("Crash Hit", 49, EnumPieceType.CRASH),
    CRASH_BELL("Crash Bell", 85, EnumPieceType.CRASH),
    CRASH_RIDE("Crash Ride", 84, EnumPieceType.CRASH),
    CRASH_MUTE("Crash Mute", 54, EnumPieceType.CRASH),   
    RIDE_PUNCH("Ride Punch", 59, EnumPieceType.RIDE),
    RIDE_BOW("Ride Bow", 51, EnumPieceType.RIDE),
    RIDE_BELL("Ride Bell", 53, EnumPieceType.RIDE),
    RIDE_MUTE("Ride Mute", 58, EnumPieceType.RIDE),
    WOODBLOCK_HIT("Woodblock Hit", 56, EnumPieceType.PERCUSSION),
    WOODBLOCK_STICK("Woodblock Stick", 76, EnumPieceType.PERCUSSION),
    
    HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_SEQUENCE("HiHat Sequence", 65, EnumPieceType.HIHAT),
    HIHAT_TIGHT_TIP("HiHat Tight Tip", 63, EnumPieceType.HIHAT),
    HIHAT_TIGHT_EDGE("HiHat Tight Edge", 62, EnumPieceType.HIHAT),    
    HIHAT_CLOSED_TIP("HiHat Closed Tip", 61, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_EDGE("HiHat Closed Edge", 22, EnumPieceType.HIHAT_CLOSED),
    HIHAT_OPENED_MAX("HiHat Opened Max", 60, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN3("HiHat Open 3", 26, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN2("HiHat Open 2", 25, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN1("HiHat Open 1", 24, EnumPieceType.HIHAT_OPEN),
    HIHAT_FOOT_SPLASH("HiHat Foot Splash", 23, EnumPieceType.HIHAT_PEDAL), 
    HIHAT_PEDAL_CHICK("HiHat Pedal Chick", 21, EnumPieceType.HIHAT_PEDAL),   
    HIHAT_OPEN_BELL_1("HiHat Open Bell 1", 120, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_BELL_2("HiHat Open Bell 2", 121, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED_BELL("HiHat Closed Bell", 119, EnumPieceType.HIHAT_CLOSED);
    
    public int note;
    public String name;
    public EnumPieceType type;

    EzxFunkMasters (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.EZX_FUNK_MASTERS.name();
    }
    
}

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
public enum EzxJazz {
    KICK_RIGHT("Kick Right", 36, EnumPieceType.KICK),
    KICK_OPEN("Kick Open", 35, EnumPieceType.KICK),   
    SNARE_RIGHT("Snare Right", 38, EnumPieceType.SNARE),
    SNARE_LEFT("Snare Left", 33, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 40, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    SNARE_RIM_ONLY("Snare Rim Only", 71, EnumPieceType.SNARE),   
    BRUSH_HALF_CIRCLE("Brush Half Circle", 39, EnumPieceType.SNARE),
    BRUSH_FULL_CIRCLE("Brush Full Circle", 67, EnumPieceType.SNARE),
    BRUSH_SHORT_DRAG("Brush Short Drag", 66, EnumPieceType.SNARE),
    BRUSH_MUTED("Brush Muted", 68, EnumPieceType.SNARE),
    TOM_1_HEAD("Tom 1 Head", 48, EnumPieceType.TOM),
    TOM_1_RIMSHOT("Tom 1 Rimshot", 82, EnumPieceType.TOM),
    TOM_1_RIM_ONLY("Tom 1 Rim Only", 81, EnumPieceType.TOM),   
    TOM_2_HEAD("Tom 2 Head", 47, EnumPieceType.TOM),
    TOM_2_RIMSHOT("Tom 2 Rimshot", 80, EnumPieceType.TOM),
    TOM_2_RIM_ONLY("Tom 2 Rim Only", 79, EnumPieceType.TOM),   
    FLOOR_TOM_HEAD("Floor Tom Head", 43, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_RIMSHOT("Floor Tom Rimshot", 75, EnumPieceType.FLOOR_TOM),   
    FLOOR_TOM_RIM_ONLY("Floor Tom Rim Only", 74, EnumPieceType.FLOOR_TOM),  
    RIDE_CRASHED("Ride Crashed", 59, EnumPieceType.RIDE),
    RIDE_TIP_1("Ride Tip 1", 51, EnumPieceType.RIDE),
    RIDE_TIP_2("Ride Tip 2", 113, EnumPieceType.RIDE),
    RIDE_BELL_SHANK("Ride Bell Shank", 53, EnumPieceType.RIDE),
    RIDE_BELL_TIP("Ride Bell Tip", 117, EnumPieceType.RIDE),
    RIDE_MUTE("Ride Mute", 58, EnumPieceType.RIDE),   
    CRASH_CRASHED("Crash Crashed", 49, EnumPieceType.CRASH),
    CRASH_MUTED("Crash Muted", 54, EnumPieceType.CRASH), 
    
    HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_SEQUENCE_SOFT("HiHat Sequence Soft", 65, EnumPieceType.HIHAT), 
    HIHAT_SEQUENCE_HARD("HiHat Sequence Hard", 64, EnumPieceType.HIHAT_OPEN),
    HIHAT_TIGHT_TIP("HiHat Tight Tip", 63, EnumPieceType.HIHAT),
    HIHAT_TIGHT("HiHat Tight", 62, EnumPieceType.HIHAT),
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

    EzxJazz (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.EZX_JAZZ.name();
    }
}

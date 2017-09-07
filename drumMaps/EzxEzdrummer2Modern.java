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
public enum EzxEzdrummer2Modern {
    KICK_HIT("Kick Hit", 36, EnumPieceType.KICK),
    SNARE_CENTER("Snare Right", 38, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 40, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),   
    TOM_1_CENTER("Tom 1 Center", 48, EnumPieceType.TOM),
    TOM_1_RIMSHOT("Tom 1 Rimshot", 82, EnumPieceType.TOM),
    TOM_2_CENTER("Tom 2 Center", 47, EnumPieceType.TOM),
    TOM_2_RIMSHOT("Tom 2 Rimshot", 80, EnumPieceType.TOM),
    TOM_3_CENTER("Tom 3 Center", 45, EnumPieceType.TOM),
    TOM_3_RIMSHOT("Tom 3 Rimshot", 78, EnumPieceType.TOM),
    FLOOR_TOM_1_CENTER("Floor Tom 1 Center", 43, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_1_RIMSHOT("Floor Tom 1 Rimshot", 75, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_2_CENTER("Floor Tom 2 Center", 41, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_2_RIMSHOT("Floor Tom 2 Rimshot", 73, EnumPieceType.FLOOR_TOM),  
    CYMBAL_1_CRASHED("Cymbal 1 Crashed", 55, EnumPieceType.CYMBAL),
    CYMBAL_1_MUTED("Cymbal 1 Muted", 56, EnumPieceType.CYMBAL),
    CYMBAL_2_CRASHED("Cymbal 2 Crashed", 49, EnumPieceType.CYMBAL),
    CYMBAL_2_MUTED("Cymbal 2 Muted", 50, EnumPieceType.CYMBAL),
    CYMBAL_3_CRASHED("Cymbal 3 Crashed", 57, EnumPieceType.CYMBAL),
    CYMBAL_3_MUTED("Cymbal 3 Muted", 58, EnumPieceType.CYMBAL),
    CYMBAL_4_CRASHED("Cymbal 4 Crashed", 52, EnumPieceType.CYMBAL),
    CYMBAL_4_MUTED("Cymbal 4 Muted", 54, EnumPieceType.CYMBAL),
    RIDE_EDGE("Ride Cymbal Edge", 59, EnumPieceType.RIDE),
    RIDE_BOW("Ride Cymbal Bow", 51, EnumPieceType.RIDE),
    RIDE_BELL("Ride Cymbal Bell", 53, EnumPieceType.RIDE),
    RIDE_MUTED("Ride Cymbal Muted", 83, EnumPieceType.RIDE),
    
    HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_SEQUENCE_HITS("HiHat Sequence Hits", 65, EnumPieceType.HIHAT),
    //HIHAT_CLOSED_EDGE("HiHat Closed Edge", 64, DrumPieceType.HIHAT),
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

    EzxEzdrummer2Modern (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.EZX_EZDRUMMER_2_MODERN.name();
    }
}

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
public enum EzxEzdrummer2Vintage {
    
    KICK_HIT("Kick Hit", 36, EnumPieceType.KICK),
    SNARE_CENTER("Snare Right", 38, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 40, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    TOM_CENTER("Tom Center", 48, EnumPieceType.TOM),
    TOM_RIMSHOT("Tom Rimshot", 82, EnumPieceType.TOM),
    FLOOR_TOM_CENTER("Floor Tom Center", 43, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_RIMSHOT("Floor Tom Rimshot", 75, EnumPieceType.FLOOR_TOM),
    CYMBAL_1_CRASHED("Cymbal 1 Crashed", 49, EnumPieceType.CYMBAL),
    CYMBAL_1_MUTED("Cymbal 1 Muted", 50, EnumPieceType.CYMBAL),
    CYMBAL_2_CRASHED("Cymbal 2 Crashed", 57, EnumPieceType.CYMBAL),
    CYMBAL_2_MUTED("Cymbal 2 Muted", 58, EnumPieceType.CYMBAL),  
    RIDE_EDGE("Ride Cymbal Edge", 59, EnumPieceType.RIDE),
    RIDE_BOW("Ride Cymbal Bow", 51, EnumPieceType.RIDE),
    RIDE_BELL("Ride Cymbal Bell", 53, EnumPieceType.RIDE),
    RIDE_MUTED("Ride Cymbal Muted", 54, EnumPieceType.RIDE),
    
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
    HIHAT_PEDAL_CHICK("HiHat Pedal Chick", 21, EnumPieceType.HIHAT_PEDAL),
    HIHAT_CC("HiHat CC", 20, EnumPieceType.HIHAT_CC);
    
    public int note;
    public String name;
    public EnumPieceType type;

    EzxEzdrummer2Vintage (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.EZX_EZDRUMMER_2_VINTAGE.name();
    }
}

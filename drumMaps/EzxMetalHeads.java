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
public enum EzxMetalHeads {
    
    KICK_RIGHT("Kick Right", 36, EnumPieceType.KICK),
    KICK_LEFT("Kick Left", 35, EnumPieceType.KICK),
    SNARE_RIGHT("Snare Right", 38, EnumPieceType.SNARE),
    SNARE_LEFT("Snare Left", 33, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 40, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    TOM_1_CENTER("Tom 1 Center", 48, EnumPieceType.TOM),
    TOM_2_CENTER("Tom 2 Center", 47, EnumPieceType.TOM),
    TOM_3_CENTER("Tom 3 Center", 45, EnumPieceType.TOM), 
    FLOOR_TOM_1_CENTER("Floor Tom 1 Center", 43, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_2_CENTER("Floor Tom 2 Center", 41, EnumPieceType.FLOOR_TOM),
    CYMBAL_1_CRASHED("Cymbal 1 Crashed", 28, EnumPieceType.CYMBAL),
    CYMBAL_1_MUTED("Cymbal 1 Muted", 94, EnumPieceType.CYMBAL),
    CYMBAL_2_CRASHED("Cymbal 2 Crashed", 49, EnumPieceType.CYMBAL),
    CYMBAL_2_MUTED("Cymbal 2 Muted", 54, EnumPieceType.CYMBAL),
    CYMBAL_3_CRASHED("Cymbal 3 Crashed", 30, EnumPieceType.CYMBAL),
    CYMBAL_3_MUTED("Cymbal 3 Muted", 95, EnumPieceType.CYMBAL),
    CYMBAL_4_CRASHED("Cymbal 4 Crashed", 31, EnumPieceType.CYMBAL),
    CYMBAL_4_MUTED("Cymbal 4 Muted", 106, EnumPieceType.CYMBAL),
    CYMBAL_5_CRASHED("Cymbal 5 Crashed", 57, EnumPieceType.CYMBAL),
    CYMBAL_5_MUTED("Cymbal 5 Muted", 58, EnumPieceType.CYMBAL),
    CYMBAL_6_CRASHED("Cymbal 6 Crashed", 32, EnumPieceType.CYMBAL),
    CYMBAL_6_MUTED("Cymbal 6 Muted", 107, EnumPieceType.CYMBAL),
    SPLASH_CRASHED("Splash Crashed", 55, EnumPieceType.SPLASH),
    CHINA_1_CRASHED("China 1 Crashed", 27, EnumPieceType.CHINA),
    CHINA_2_CRASHED("China 2 Crashed", 52, EnumPieceType.CHINA),
    SPOCK_CRASHED("Spock Crashed", 29, EnumPieceType.CYMBAL),
    RIDE_EDGE("Ride Cymbal Edge", 59, EnumPieceType.RIDE),
    RIDE_BOW("Ride Cymbal Bow", 51, EnumPieceType.RIDE),
    RIDE_BELL("Ride Cymbal Bell", 53, EnumPieceType.RIDE),
    
    HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_SEQUENCE_HITS("HiHat Sequence Hits", 65, EnumPieceType.HIHAT),
    //HIHAT_CLOSED_EDGE("HiHat Closed Edge", 64, DrumPieceType.HIHAT),
    HIHAT_TIGHT_TIP("HiHat Tight", 63, EnumPieceType.HIHAT),
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

    EzxMetalHeads (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.EZX_METAL_HEADS.name();
    }
}

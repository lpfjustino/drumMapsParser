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
public enum EzxNashville {
    
    KICK_RIGHT("Kick Right", 36, EnumPieceType.KICK),
    SNARE_RIGHT("Snare Right", 38, EnumPieceType.SNARE),
    SNARE_LEFT("Snare Left", 33, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 40, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    TOM_1_CENTER("Tom 1 Center", 48, EnumPieceType.TOM),
    TOM_2_CENTER("Tom 2 Center", 47, EnumPieceType.TOM),
    FLOOR_TOM_CENTER("Floor Tom Center", 43, EnumPieceType.FLOOR_TOM),
    CRASH_A_CRASHED("Crash A Crashed", 49, EnumPieceType.CRASH),
    CRASH_A_MUTED("Crash A Muted", 54, EnumPieceType.CRASH),
    CRASH_B_CRASHED("Crash B Crashed", 57, EnumPieceType.CRASH),
    CRASH_B_MUTED("Crash B Muted", 58, EnumPieceType.CRASH),
    CRASH_PLUS_CRASHED("Crash + Crashed", 55, EnumPieceType.CRASH),
    CHINA_CRASHED("China Crashed", 52, EnumPieceType.CRASH), 
    RIDE_EDGE("Ride Cymbal Edge", 59, EnumPieceType.RIDE),
    RIDE_BOW("Ride Cymbal Bow", 51, EnumPieceType.RIDE),
    RIDE_BELL("Ride Cymbal Bell", 53, EnumPieceType.RIDE),
    BRUSH_RIGHT_TAP("Brush Right Tap", 68, EnumPieceType.PERCUSSION),
    BRUSH_LEFT_TAP("Brush Left Tap", 67, EnumPieceType.PERCUSSION),
    FINGERS_RING("Fingers Ring", 71, EnumPieceType.PERCUSSION),
    FINGERS_MIDDLE("Fingers Middle", 70, EnumPieceType.PERCUSSION),
    FINGERS_INDEX("Fingers Index", 69, EnumPieceType.PERCUSSION),
    FINGERS_PALM("Fingers Palm", 68, EnumPieceType.PERCUSSION),
    FINGERS_THUMB("Fingers Thumb", 67, EnumPieceType.PERCUSSION),
    FINGERS_PALM_2("Fingers Palm (2)", 66, EnumPieceType.PERCUSSION),
    HAND_OPEN_RIM("Hand Open Rim", 40, EnumPieceType.PERCUSSION),
    HAND_CLOSED_RIM("Hand Closed Rim", 39, EnumPieceType.PERCUSSION),
    HAND_OPEN_SLAP("Hand Open Slap", 38, EnumPieceType.PERCUSSION),
    HAND_CLOSED_SLAP("Hand Closed Slap", 37, EnumPieceType.PERCUSSION),
    
    HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_SEQUENCE_HITS("HiHat Sequence Hits", 65, EnumPieceType.HIHAT),
    HIHAT_TIGHT_TIP("HiHat Tight Tip", 63, EnumPieceType.HIHAT),
    HIHAT_CLOSED_TIP("HiHat Closed Tip", 61, EnumPieceType.HIHAT_CLOSED),
    HIHAT_OPENED_MAX("HiHat Opened Max", 60, EnumPieceType.HIHAT_OPEN),
    HIHAT_BELL("HiHat Bell", 56, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN3("HiHat Open 3", 26, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN2("HiHat Open 2", 25, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN1("HiHat Open 1", 24, EnumPieceType.HIHAT_OPEN),
    HIHAT_FOOT_SPLASH("HiHat Foot Splash", 23, EnumPieceType.HIHAT_PEDAL),
    HIHAT_CLOSED_EDGE("HiHat Closed Edge", 22, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL_CHICK("HiHat Pedal Chick", 21, EnumPieceType.HIHAT_PEDAL);
    
    public int note;
    public String name;
    public EnumPieceType type;

    EzxNashville (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.EZX_NASHVILLE.name();
    }
}

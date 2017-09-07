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
public enum DrumkitFromHell {
    KICK_RIGHT("Kick Right", 36, EnumPieceType.KICK),
    KICK_LEFT("Kick Left", 35, EnumPieceType.KICK),
    SNARE_RIGHT("Snare Right", 38, EnumPieceType.SNARE),
    SNARE_LEFT("Snare Left", 33, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 40, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    SNARE_RUFF("Snare Ruff", 39, EnumPieceType.SNARE),
    SNARE_HEAD("Snare Head", 70, EnumPieceType.SNARE),
    SNARE_FLAM("Snare Flam", 69, EnumPieceType.SNARE),
    TOM_1_HEAD("Tom 1 Head", 48, EnumPieceType.TOM),
    TOM_1_FLAM("Tom 1 Flam", 82, EnumPieceType.TOM),
    TOM_2_HEAD("Tom 2 Head", 47, EnumPieceType.TOM),
    TOM_2_FLAM("Tom 2 Flam", 80, EnumPieceType.TOM),
    TOM_3_HEAD("Tom 3 Head", 45, EnumPieceType.TOM),
    TOM_3_FLAM("Tom 3 Flam", 78, EnumPieceType.TOM),   
    FLOOR_TOM_1_HEAD("Floor Tom 1 Head", 43, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_1_FLAM("Floor Tom 1 Flam", 75, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_2_HEAD("Floor Tom 2 Head", 41, EnumPieceType.FLOOR_TOM),   
    FLOOR_TOM_2_FLAM("Floor Tom 2 Flam", 73, EnumPieceType.FLOOR_TOM), 
    RIDE_EDGE("Ride Cymbal Edge", 49, EnumPieceType.RIDE),
    RIDE_BOW("Ride Cymbal Bow", 51, EnumPieceType.RIDE),
    RIDE_BELL("Ride Cymbal Bell", 53, EnumPieceType.RIDE),   
    CRASH_A("Crash Cymbal A Hit", 49, EnumPieceType.CRASH),
    CRASH_A_MUTED("Crash Cymbal A Muted", 54, EnumPieceType.CRASH),
    CRASH_B("Crash Cymbal B Hit", 57, EnumPieceType.CRASH),
    CRASH_B_MUTED("Crash Cymbal B Muted", 58, EnumPieceType.CRASH),
    CRASH_B_CRESCENDO("Crash Cymbal B Crescendo", 76, EnumPieceType.CRASH),  
    CRASH_RIDE_1_EDGE("Crash Ride 1 Edge", 91, EnumPieceType.CYMBAL),
    CRASH_RIDE_1_BOW("Crash Ride 1 Bow", 89, EnumPieceType.CYMBAL),
    CRASH_RIDE_1_BELL("Crash Ride 1 Bell", 90, EnumPieceType.CYMBAL),
    CRASH_RIDE_1_CRESCENDO("Crash Ride 1 Crescendo", 92, EnumPieceType.CYMBAL),
    CRASH_RIDE_1_CRASHED("Crash Ride 1 Crashed", 28, EnumPieceType.CYMBAL),  
    CRASH_RIDE_2_EDGE("Crash Ride 2 Edge", 115, EnumPieceType.CYMBAL),
    CRASH_RIDE_2_BOW("Crash Ride 2 Bow", 116, EnumPieceType.CYMBAL),
    CRASH_RIDE_2_BELL("Crash Ride 2 Bell", 114, EnumPieceType.CYMBAL),
    CRASH_RIDE_2_CRASHED("Crash Ride 2 Crashed", 32, EnumPieceType.CYMBAL), 
    CHINA_1_EDGE("China 1 Edge", 52, EnumPieceType.CHINA),
    CHINA_1_BOW("China 1 Bow", 93, EnumPieceType.CHINA),
    CHINA_2_CRASHED("China 2 Crashed", 27, EnumPieceType.CHINA),
    CHINA_3_CRASHED("China 3 Crashed", 29, EnumPieceType.CHINA),
    SPLASH_1("Splash 1", 55, EnumPieceType.SPLASH),
    SPLASH_2("Splash 1", 30, EnumPieceType.SPLASH),
    SPLASH_3("Splash 1", 31, EnumPieceType.SPLASH),
    
    HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL),   
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

    DrumkitFromHell (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.EZX_DRUMKIT_FROM_HELL.name();
    }
}

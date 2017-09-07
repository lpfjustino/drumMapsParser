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
public enum EzxClaustrophobic {
    
    KICK("Kick", 36, EnumPieceType.KICK),
    SNARE_HIT("Snare Hit", 38, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 40, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    SNARE_SHELL_RIGHT("Snare Shell Right", 71, EnumPieceType.SNARE),
    SNARE_SHELL_LEFT("Snare Shell Left", 70, EnumPieceType.SNARE),
    SNARE_HIGH_RIGHT("High Snare Right", 68, EnumPieceType.SNARE),
    SNARE_HIGH_LEFT("High Snare Left", 66, EnumPieceType.SNARE),
    SNARE_HIGH_RIM("High Snare Rim", 69, EnumPieceType.SNARE),
    SNARE_HIGH_SIDESTICK("High Snare Sidestick", 67, EnumPieceType.SNARE),
    TOM_1_HEAD("Tom 1 Head", 48, EnumPieceType.TOM),
    TOM_1_RIM("Tom 1 Rim", 82, EnumPieceType.TOM),
    TOM_2_HEAD("Tom 2 Head", 47, EnumPieceType.TOM),
    TOM_2_RIM("Tom 2 Rim", 80, EnumPieceType.TOM),
    FLOOR_TOM_1_HEAD("Floor Tom 1 Head", 43, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_1_RIM("Floor Tom 1 Rim", 75, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_2_HEAD("Floor Tom 2 Head", 41, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_2_RIM("Floor Tom 2 Rim", 73, EnumPieceType.FLOOR_TOM),  
    RIDE_BOW("Ride Cymbal Bow", 51, EnumPieceType.RIDE),
    RIDE_EDGE("Ride Cymbal Edge", 59, EnumPieceType.RIDE),
    RIDE_BELL("Ride Cymbal Bell", 53, EnumPieceType.RIDE),
    RIDE_CRASHED_1("Ride Crashed 1", 32, EnumPieceType.RIDE),
    RIDE_CRASHED_2("Ride Crashed 2", 28, EnumPieceType.RIDE),
    CRASH_A_HIT("Crash A Hit", 49, EnumPieceType.CRASH),
    CRASH_B_HIT("Crash B Hit", 57, EnumPieceType.CRASH),
    SPLASH_HIT("Splash Hit", 55, EnumPieceType.SPLASH),
    SPLASH_CRASHED_1("Splash Crashed 1", 31, EnumPieceType.SPLASH),
    SPLASH_CRASHED_2("Splash Crashed 2", 30, EnumPieceType.SPLASH),
    CHINA_HIT("China Hit", 52, EnumPieceType.CHINA),
    CHINA_CRASHED_1("China Crashed 1", 29, EnumPieceType.CHINA),
    CHINA_CRASHED_2("China Crashed 2", 27, EnumPieceType.CHINA),   
    FOOTSTOMP("Footstomp", 34, EnumPieceType.PERCUSSION),
    FINGERSNAP("Fingersnap", 58, EnumPieceType.PERCUSSION),
    HAND_CLAPS("Hand Claps", 39, EnumPieceType.PERCUSSION),
    COWBELL_1("Cowbell 1", 56, EnumPieceType.PERCUSSION),
    COWBELL_2("Cowbell 2", 76, EnumPieceType.PERCUSSION),   
    TAMBOURINE_HIT("Tambourine Hit", 54, EnumPieceType.PERCUSSION),
    TAMBOURINE_CRESCENDO("Tambourine Crescendo", 117, EnumPieceType.PERCUSSION),
    TAMBOURINE_ON_BEAT("Tambourine On Beat", 116, EnumPieceType.PERCUSSION),
    TAMBOURINE_OFF_BEAT("Tambourine Off Beat", 115, EnumPieceType.PERCUSSION),
    TAMBOURINE_STICKS("Tambourine Sticks", 114, EnumPieceType.PERCUSSION),
    TAMBOURINE_HANDS("Tambourine Hands", 113, EnumPieceType.PERCUSSION),   
    SHAKER_CRESCENDO("Shaker Crescendo", 127, EnumPieceType.PERCUSSION),
    SHAKER_ON_BEAT("Shaker On Beat", 126, EnumPieceType.PERCUSSION),
    SHAKER_OFF_BEAT("Shaker Off Beat", 125, EnumPieceType.PERCUSSION),   
    CHIMES_UP("Chimes Up", 122, EnumPieceType.PERCUSSION),
    CHIMES_DOWN("Chimes Down", 121, EnumPieceType.PERCUSSION),   
    CABASA_LONG("Cabasa Long", 124, EnumPieceType.PERCUSSION),
    CABASA_SHORT("Cabasa Short", 123, EnumPieceType.PERCUSSION),    
    TRIANGLE_LONG("Triangle Long", 119, EnumPieceType.PERCUSSION),
    TRIANGLE_SHORT("Triangle Short", 118, EnumPieceType.PERCUSSION),
    BELLS("Bells", 120, EnumPieceType.PERCUSSION),
 
    HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
    HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_SEQUENCE_SOFT("HiHat Sequence Soft", 65, EnumPieceType.HIHAT),
    HIHAT_SEQUENCE_HARD("HiHat Sequence Hard", 64, EnumPieceType.HIHAT),
    HIHAT_TIGHT_TIP("HiHat Tight Tip", 63, EnumPieceType.HIHAT),
    HIHAT_TIGHT("HiHat Tight", 62, EnumPieceType.HIHAT),
    HIHAT_CLOSED_TIP("HiHat Closed Tip", 61, EnumPieceType.HIHAT_CLOSED),
    HIHAT_OPENED_MAX("HiHat Opened Max", 60, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN3("HiHat Open 3", 26, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN2("HiHat Open 2", 25, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN1("HiHat Open 1", 24, EnumPieceType.HIHAT_OPEN),
    HIHAT_FOOT_SPLASH("HiHat Foot Splash", 23, EnumPieceType.HIHAT_PEDAL),
    HIHAT_CLOSED_EDGE("HiHat Closed Edge", 22, EnumPieceType.HIHAT_CLOSED),
    HIHAT_PEDAL_CHICK("HiHat Pedal Chick", 21, EnumPieceType.HIHAT_PEDAL),
    HIHAT_DK_CLOSED("HiHat DK Closed", 20, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_X("HiHat ClosedX", 19, EnumPieceType.HIHAT_CLOSED);
    
    public int note;
    public String name;
    public EnumPieceType type;

    EzxClaustrophobic (String valName, int valNote, EnumPieceType valType){
        name = valName;
        note = valNote;
        type = valType;
    }
    
    public EnumPieceType getPieceType(){
        return type;
    }
    
    public String getName(){
        return name;
    }

    public int getNote(){
        return note;
    }
    
    public static String getMapVst(){
        return EnumVstList.EZX_CLAUSTROPHOBIC.name();
    }
}

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
 * @author SharpTrickster
 */
public enum NiAbbeyRoad70sTight {
    
    KICK_DAMPENED("Kick Dampened", 36, EnumPieceType.KICK),
    KICK_OPEN("Kick Open", 60, EnumPieceType.KICK),
    
    SNARE_LEFT("Snare Left Hand", 81, EnumPieceType.SNARE),
    SNARE_RIGHT("Snare Right Hand", 83, EnumPieceType.SNARE),
    SNARE_ALTERNATING("Snare L/R Alternating", 38, EnumPieceType.SNARE),
    SNARE_HALFWAY_LEFT("Snare Halfway Left Hand", 84, EnumPieceType.SNARE),
    SNARE_HALFWAY_RIGHT("Snare Halfway Right Hand", 86, EnumPieceType.SNARE),
    SNARE_HALFWAY_ALTERNATING("Snare Halfway L/R Alternating", 40, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 39, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    SNARE_FLAM("Snare Flam", 62, EnumPieceType.SNARE),
    SNARE_ROLL("Snare Roll", 63, EnumPieceType.SNARE),
    SNARE_WIRES_OFF("Snare Wires Off", 64, EnumPieceType.SNARE),
    SNARE_RIM_ONLY("Snare Rim Only", 61, EnumPieceType.SNARE),
    SNARE_TOWEL("Snare Towel", 101, EnumPieceType.SNARE),
    
    HIHAT_CLOSED_TIGHT_TIP_RIGHT("HiHat Closed Tight Tip Right", 87, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIGHT_TIP_LEFT("HiHat Closed Tight Tip Left", 85, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIGHT_TIP_ALTERNATING("HiHat Closed Tight Tip L/R Alternating", 66, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIP_RIGHT("HiHat Closed Tip Right", 92, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIP_LEFT("HiHat Closed Tip Left", 90, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIP_ALTERNATING("HiHat Closed Tip R/L Alternating", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_SHANK_RIGHT("HiHat Closed Shank Right", 97, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_SHANK_LEFT("HiHat Closed Shank Left", 94, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_SHANK_ALTERNATING("HiHat Closed Shank L/R Alternating", 68, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_PEDAL("HiHat Closed Pedal", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_OPEN_PEDAL("HiHat Open Pedal", 70, EnumPieceType.HIHAT_PEDAL),
    HIHAT_OPEN_QUARTER("HiHat Open 1/4", 76, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_HALF("HiHat Open 1/2", 77, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_THREE_QUARTERS("HiHat Open 3/4", 78, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_LOOSE("HiHat Open Loose", 79, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_FULL("HiHat Open Full", 80, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_CONTROLLER("Hihat Open Controller", 46, EnumPieceType.HIHAT_CC), //CC1 or CC4  
    
    TOM_1_CENTER_RIGHT("Tom 1 Center Right", 100, EnumPieceType.TOM),
    TOM_1_CENTER_LEFT("Tom 1 Center Left", 98, EnumPieceType.TOM),
    TOM_1_CENTER_ALTERNATING("Tom 1 Center L/R Alternating", 47, EnumPieceType.TOM),
    TOM_1_RIMSHOT("Tom 1 Rimshot", 71, EnumPieceType.TOM),
    TOM_1_RIM_ONLY("Tom 1 Rim Only", 75, EnumPieceType.TOM),
    TOM_1_TOWEL("Tom 1 Towel", 107, EnumPieceType.TOM),
    
    TOM_2_CENTER_RIGHT("Tom 2 Center Right", 96, EnumPieceType.TOM),
    TOM_2_CENTER_LEFT("Tom 2 Center Left", 95, EnumPieceType.TOM),
    TOM_2_CENTER_ALTERNATING("Tom 2 Center L/R Alternating", 45, EnumPieceType.TOM),
    TOM_2_RIMSHOT("Tom 2 Rimshot", 69, EnumPieceType.TOM),
    TOM_2_RIM_ONLY("Tom 2 Rim Only", 74, EnumPieceType.TOM),
    TOM_2_TOWEL("Tom 2 Towel", 105, EnumPieceType.TOM),
    
    FLOOR_TOM_CENTER_RIGHT("Floor Tom 1 Center Right", 89, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_CENTER_LEFT("Floor Tom 1 Center Left", 88, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_CENTER_ALTERNATING("Floor Tom 1 Center L/R Alternating", 41, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_RIMSHOT("Floor Tom 1 Rimshot", 65, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_RIM_ONLY("Floor Tom 1 Rim Only", 72, EnumPieceType.FLOOR_TOM),
    FLOOR_TOM_TOWEL("Floor Tom 1 Towel", 103, EnumPieceType.FLOOR_TOM),
    
    CRASH_1_EDGE("Crash 1 Edge", 49, EnumPieceType.CRASH),
    CRASH_1_TIP("Crash 1 Tip", 48, EnumPieceType.CRASH),
    CRASH_1_BELL("Crash 1 Bell", 50, EnumPieceType.CRASH),
    CRASH_1_CHOKE("Crash 1 Choke", 22, EnumPieceType.CRASH),
    
    CRASH_2_EDGE("Crash 2 Edge", 55, EnumPieceType.CRASH),
    CRASH_2_TIP("Crash 2 Tip", 54, EnumPieceType.CRASH),
    CRASH_2_BELL("Crash 2 Bell", 56, EnumPieceType.CRASH),
    CRASH_2_CHOKE("Crash 2 Choke", 24, EnumPieceType.CRASH),
    
    RIDE_TIP("Ride Tip", 51, EnumPieceType.RIDE),
    RIDE_BELL("Ride Bell", 53, EnumPieceType.RIDE),
    RIDE_EDGE("Ride Edge", 52, EnumPieceType.RIDE),
    RIDE_CHOKE("Ride Choke", 23, EnumPieceType.RIDE),
    
    CYMBAL_PANG_TIP("Cymbal Pang Tip", 58, EnumPieceType.CYMBAL),
    CYMBAL_PANG_EDGE("Cymbal Pang Edge", 57, EnumPieceType.CYMBAL),
    CYMBAL_PANG_CHOKE("Cymbal Pang Choke", 25, EnumPieceType.CYMBAL),
    
    PERCUSSION_TAMBOURINE_TAP("Tambourine Tap", 31, EnumPieceType.PERCUSSION),
    PERCUSSION_TAMBOURINE_SHAKE("Tambourine Shake", 32, EnumPieceType.PERCUSSION),
    PERCUSSION_CLAP_SOLO("Clap Solo", 33, EnumPieceType.PERCUSSION),
    PERCUSSION_CLAP_MULTI("Clap Multi", 34, EnumPieceType.PERCUSSION),
    PERCUSSION_STICKS_HIT("Sticks Hit", 35, EnumPieceType.PERCUSSION),
    PERCUSSION_ROTO_TOM_HIGH("Roto Tom High", 30, EnumPieceType.PERCUSSION),
    PERCUSSION_ROTO_TOM_MID("Roto Tom Mid", 29, EnumPieceType.PERCUSSION),
    PERCUSSION_ROTO_TOM_LOW("Roto Tom Low", 28, EnumPieceType.PERCUSSION);
    
    public int note;
    public String name;
    public EnumPieceType type;

    NiAbbeyRoad70sTight (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.NI_ABBEY_ROAD_70S_TIGHT.name();
    }
    
}

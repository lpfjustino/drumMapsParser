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
public enum NiAbbeyRoad50sAutumn {
    
    KICK_DAMPENED("Kick Dampened", 60, EnumPieceType.KICK),
    KICK_HALF_OPEN("Kick half Open", 36, EnumPieceType.KICK),
    KICK_SHELL_HIT("Kick Shell Hit", 31, EnumPieceType.KICK),
    
    SNARE_LEFT("Snare Left Hand", 101, EnumPieceType.SNARE),
    SNARE_RIGHT("Snare Right Hand", 103, EnumPieceType.SNARE),
    SNARE_ALTERNATING("Snare L/R Alternating", 38, EnumPieceType.SNARE),
    SNARE_HALFWAY_LEFT("Snare Halfway Left Hand", 105, EnumPieceType.SNARE),
    SNARE_HALFWAY_RIGHT("Snare Halfway Right Hand", 107, EnumPieceType.SNARE),
    SNARE_HALFWAY_ALTERNATING("Snare Halfway L/R Alternating", 40, EnumPieceType.SNARE),
    SNARE_RIMSHOT("Snare Rimshot", 39, EnumPieceType.SNARE),
    SNARE_SIDESTICK("Snare Sidestick", 37, EnumPieceType.SNARE),
    SNARE_FLAM("Snare Flam", 62, EnumPieceType.SNARE),
    SNARE_ROLL("Snare Roll", 63, EnumPieceType.SNARE),
    SNARE_WIRES_OFF("Snare Wires Off", 64, EnumPieceType.SNARE),
    SNARE_RIM_ONLY("Snare Rim Only", 61, EnumPieceType.SNARE),
    SNARE_BRUSH_TAP_LEFT("Snare Brush Tap Left Hand", 81, EnumPieceType.SNARE),
    SNARE_BRUSH_TAP_RIGHT("Snare Brush Tap Right Hand", 83, EnumPieceType.SNARE),
    SNARE_BRUSH_DIG_IN("Snare Brush Dig In", 84, EnumPieceType.SNARE),
    SNARE_BRUSH_SWISH("Snare Brush Swish", 86, EnumPieceType.SNARE),
    
    HIHAT_CLOSED_TIGHT_TIP_RIGHT("HiHat Closed Tight Tip Right", 99, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIGHT_TIP_LEFT("HiHat Closed Tight Tip Left", 97, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIGHT_TIP_ALTERNATING("HiHat Closed Tight Tip L/R Alternating", 66, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIP_RIGHT("HiHat Closed Tip Right", 104, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIP_LEFT("HiHat Closed Tip Left", 102, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_TIP_ALTERNATING("HiHat Closed Tip R/L Alternating", 42, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_SHANK_RIGHT("HiHat Closed Shank Right", 109, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_SHANK_LEFT("HiHat Closed Shank Left", 106, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_SHANK_ALTERNATING("HiHat Closed Shank L/R Alternating", 68, EnumPieceType.HIHAT_CLOSED),
    HIHAT_CLOSED_PEDAL("HiHat Closed Pedal", 44, EnumPieceType.HIHAT_PEDAL),
    HIHAT_OPEN_PEDAL("HiHat Open Pedal", 70, EnumPieceType.HIHAT_PEDAL),
    HIHAT_OPEN_QUARTER("HiHat Open 1/4", 76, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_HALF("HiHat Open 1/2", 77, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_THREE_QUARTERS("HiHat Open 3/4", 78, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_LOOSE("HiHat Open Loose", 79, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_FULL("HiHat Open Full", 80, EnumPieceType.HIHAT_OPEN),
    HIHAT_OPEN_CONTROLLER("Hihat Open Controller", 46, EnumPieceType.HIHAT_CC), //CC1 or CC4  
    HIHAT_BRUSH_OPEN("HiHat Brush Open", 85, EnumPieceType.HIHAT_OPEN),
    HIHAT_BRUSH_CLOSED_TIP("HiHat Brush Closed Tip", 87, EnumPieceType.HIHAT_CLOSED),
    HIHAT_BRUSH_OPEN_HALF("HiHat Brush Open 1/2", 90, EnumPieceType.HIHAT_OPEN),
    
    TOM_1_CENTER_RIGHT("Tom 1 Center Right", 117, EnumPieceType.TOM),
    TOM_1_CENTER_LEFT("Tom 1 Center Left", 115, EnumPieceType.TOM),
    TOM_1_CENTER_ALTERNATING("Tom 1 Center L/R Alternating", 47, EnumPieceType.TOM),
    TOM_1_RIMSHOT("Tom 1 Rimshot", 71, EnumPieceType.TOM),
    TOM_1_RIM_ONLY("Tom 1 Rim Only", 75, EnumPieceType.TOM),
    TOM_1_BRUSH_TAP("Tom 1 Brush Tap", 95, EnumPieceType.TOM),
    TOM_1_BRUSH_DIG("Tom 1 Brush Dig", 96, EnumPieceType.TOM),
    
    TOM_2_CENTER_RIGHT("Tom 2 Center Right", 113, EnumPieceType.TOM),
    TOM_2_CENTER_LEFT("Tom 2 Center Left", 112, EnumPieceType.TOM),
    TOM_2_CENTER_ALTERNATING("Tom 2 Center L/R Alternating", 45, EnumPieceType.TOM),
    TOM_2_RIMSHOT("Tom 2 Rimshot", 69, EnumPieceType.TOM),
    TOM_2_RIM_ONLY("Tom 2 Rim Only", 73, EnumPieceType.TOM),
    TOM_2_BRUSH_TAP("Tom 2 Brush Tap", 88, EnumPieceType.TOM),
    TOM_2_BRUSH_DIG("Tom 2 Brush Dig", 93, EnumPieceType.TOM),
    
    TOM_3_CENTER_RIGHT("Tom 3 Center Right", 110, EnumPieceType.TOM),
    TOM_3_CENTER_LEFT("Tom 3 Center Left", 108, EnumPieceType.TOM),
    TOM_3_CENTER_ALTERNATING("Tom 3 Center L/R Alternating", 41, EnumPieceType.TOM),
    TOM_3_RIMSHOT("Tom 3 Rimshot", 65, EnumPieceType.TOM),
    TOM_3_RIM_ONLY("Tom 3 Rim Only", 72, EnumPieceType.TOM),
    TOM_3_BRUSH_TAP("Tom 3 Brush Tap", 88, EnumPieceType.TOM),
    TOM_3_BRUSH_DIG("Tom 3 Brush Dig", 89, EnumPieceType.TOM),
    
    CRASH_1_EDGE("Crash 1 Edge", 58, EnumPieceType.CRASH),
    CRASH_1_TIP("Crash 1 Tip", 48, EnumPieceType.CRASH),
    CRASH_1_BELL("Crash 1 Bell", 50, EnumPieceType.CRASH),
    CRASH_1_CHOKE("Crash 1 Choke", 22, EnumPieceType.CRASH),
    CRASH_1_BRUSH("Crash 1 Brush", 92, EnumPieceType.CRASH),
    
    CRASH_2_EDGE("Crash 2 Edge", 55, EnumPieceType.CRASH),
    CRASH_2_TIP("Crash 2 Tip", 54, EnumPieceType.CRASH),
    CRASH_2_BELL("Crash 2 Bell", 56, EnumPieceType.CRASH),
    CRASH_2_CHOKE("Crash 2 Choke", 24, EnumPieceType.CRASH),
    CRASH_2_BRUSH("Crash 2 Brush", 94, EnumPieceType.CRASH),
    
    RIDE_TIP("Ride Tip", 59, EnumPieceType.RIDE),
    RIDE_BELL("Ride Bell", 57, EnumPieceType.RIDE),
    RIDE_EDGE("Ride Edge", 58, EnumPieceType.RIDE),
    RIDE_CHOKE("Ride Choke", 23, EnumPieceType.RIDE),
    RIDE_BRUSH_TIP("Ride Brush Tip", 95, EnumPieceType.RIDE),
    RIDE_BRUSH_SWEEP("Ride Brush Sweep", 96, EnumPieceType.RIDE),
    
    PERCUSSION_CLAP_SOLO("Clap Solo", 33, EnumPieceType.PERCUSSION),
    PERCUSSION_CLAP_MULTI("Clap Multi", 34, EnumPieceType.PERCUSSION),
    PERCUSSION_STICKS_HIT("Sticks Hit", 35, EnumPieceType.PERCUSSION),
    PERCUSSION_TRIANGLE_OPEN("Triangle Open", 30, EnumPieceType.PERCUSSION),
    PERCUSSION_TRIANGLE_MUTED("Triangle Muted", 29, EnumPieceType.PERCUSSION),
    PERCUSSION_WOODBLOCK_HIT("Woodblock Hit", 37, EnumPieceType.PERCUSSION);
    
    public int note;
    public String name;
    public EnumPieceType type;

    NiAbbeyRoad50sAutumn (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.NI_ABBEY_ROAD_50S_AUTUMN.name();
    }
    
}

/*
* There is a separate note assignment that alternates between the left and right hand samples
of the center snare, center tom, and closed hi-hat articulations when playing faster than a certain
speed. This adds a realistic sound to faster playing, as a drummer would also switch to
using both hands at fast speeds.
** There is a separate note assignment for the open hi-hat that controls the amount of hi-hat
openness depending on the position of the Modwheel controller (CC1) or a hi-hat foot controller
(CC4). At the 0 position of the controller, the open hi-hat control key plays the fully open
hi-hat. As the controller sends higher values, playing the open hi-hat control key will trigger hihat
samples that gradually become more closed.
*** There is a separate note assignment for the snare roll (Note D#3 / MIDI Number 63) that
controls the volume of the snare roll depending on the position of the Pitch controller (CC0). If
you have a MIDI device with a Pitch bend lever and move it to the left position the snare roll
will be softer, if you move it to the right the snare roll will be louder when the articulation is
played. Alternatively, if you have a Pitch bend wheel, moving it downwards into negative values
will make the snare roll softer and pushing it up into positive values will make the snare roll
louder when the articulation is played.
*/
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
public enum GmDrum{
        KICK_1("Bass Drum 1", 35, EnumPieceType.KICK),
        KICK_2("Bass Drum 2", 36, EnumPieceType.KICK),
        SIDE_STICK("Side Stick", 37, EnumPieceType.PERCUSSION),
        SNARE_1("Snare Drum 1", 38, EnumPieceType.SNARE),
        CLAP("Hand Clap", 39,EnumPieceType.PERCUSSION),
        SNARE_2("Snare Drum 2", 40, EnumPieceType.SNARE),
        LOW_FLOOR_TOM("Low Floor Tom", 41, EnumPieceType.FLOOR_TOM),
        HIGH_FLOOR_TOM("High Floor Tom", 43, EnumPieceType.FLOOR_TOM),
        LOW_TOM("Low Tom", 45, EnumPieceType.TOM),
        LOW_MID_TOM("Low-Mid Tom", 47, EnumPieceType.TOM),
        HIGH_MID_TOM("Hi-Mid Tom", 48, EnumPieceType.TOM),
        CRASH_CYMBAL_1("Crash Cymbal 1", 49, EnumPieceType.CRASH),
        HIGH_TOM("High Tom", 50, EnumPieceType.TOM),
        RIDE_CYMBAL_1("Ride Cymbal 1", 51, EnumPieceType.RIDE),
        CHINESE_CYMBAL("Chinese Cymbal", 52, EnumPieceType.CHINA),
        RIDE_BELL("Ride Bell", 53, EnumPieceType.RIDE),
        TAMBOURINE("Tambourine", 54, EnumPieceType.PERCUSSION),
        SPLASH_CYMBAL("Splash Cymbal", 55, EnumPieceType.SPLASH),
        COWBELL("Cowbell", 56, EnumPieceType.PERCUSSION),
        CRASH_CYMBAL_2("Crash Cymbal 2", 57, EnumPieceType.CRASH),
        VIBRASLAP("Vibraslap", 58, EnumPieceType.PERCUSSION),
        RIDE_CYMBAL_2("Ride Cymbal 2", 59, EnumPieceType.RIDE),
        HIGH_BONGO("Hi Bongo", 60, EnumPieceType.PERCUSSION),
        LOW_BONGO("Low Bongo", 61, EnumPieceType.PERCUSSION),
        MUTE_HIGH_CONGA("Mute Hi Conga", 62, EnumPieceType.PERCUSSION),
        OPEN_HIGH_CONGA("Open Hi Conga", 63, EnumPieceType.PERCUSSION),
        LOW_CONGA("Low Conga", 64, EnumPieceType.PERCUSSION),
        HIGH_TIMBALE("Hi Timbale", 65, EnumPieceType.PERCUSSION),
        LOW_TIMBALE("Low Timbale", 66, EnumPieceType.PERCUSSION),
        HIGH_AGOGO("Hi Agogo", 67, EnumPieceType.PERCUSSION),
        LOW_AGOGO("Low Agogo", 68, EnumPieceType.PERCUSSION),
        CABASA("Cabasa", 69, EnumPieceType.PERCUSSION),
        MARACAS("Maracas", 70, EnumPieceType.PERCUSSION),
        SHORT_WHISTLE("Short Whistle", 71, EnumPieceType.PERCUSSION),
        LONG_WHISTLE("Long Whiste", 72, EnumPieceType.PERCUSSION),
        SHORT_GUIRO("Short Guiro", 73, EnumPieceType.PERCUSSION),
        LONG_GUIRO("Long Guiro", 74, EnumPieceType.PERCUSSION),
        CLAVES("Claves", 75, EnumPieceType.PERCUSSION),
        HIGH_WOOD_BLOCK("Hi Wood Block", 76, EnumPieceType.PERCUSSION),
        LOW_WOOD_BLOCK("Low Wood Block", 77, EnumPieceType.PERCUSSION),
        MUTE_CUICA("Mute Cuica", 78, EnumPieceType.PERCUSSION),
        OPEN_CUICA("Open Cuica", 79, EnumPieceType.PERCUSSION),
        MUTE_TRIANGLE("Mute Triangle", 80, EnumPieceType.PERCUSSION),
        OPEN_TRIANGLE("Open Triangle", 81, EnumPieceType.PERCUSSION),
        
        HIHAT_OPEN("HiHat Opened (GM)", 46, EnumPieceType.HIHAT_OPEN),
        HIHAT_CLOSED("HiHat Closed (GM)", 42, EnumPieceType.HIHAT_CLOSED),
        HIHAT_PEDAL("HiHat Pedal (GM)", 44, EnumPieceType.HIHAT_PEDAL);

        public int note;
        public String name;
        public EnumPieceType type;

        GmDrum (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.GM_DRUM.name();
    }
}

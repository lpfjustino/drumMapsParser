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
 * "valNote NOT USED!"
 * Note calculated by index + 21;
 */
public enum GmPiano {
    
    A0("A0", 21, EnumPieceType.PAD),
    AS0("A#0", 22, EnumPieceType.PAD),
    B0("B0", 23, EnumPieceType.PAD),
    C1("C1", 24, EnumPieceType.PAD),
    CS1("C#1", 25, EnumPieceType.PAD),
    D1("D1", 26, EnumPieceType.PAD),
    DS1("D#1", 27, EnumPieceType.PAD),
    E1("E1", 28, EnumPieceType.PAD),
    F1("F1", 29, EnumPieceType.PAD),
    FS1("F#1", 30, EnumPieceType.PAD),
    G1("G1", 31, EnumPieceType.PAD),
    GS1("G#1", 32, EnumPieceType.PAD),
    A1("A1", 33, EnumPieceType.PAD),
    AS1("A#1", 34, EnumPieceType.PAD),
    B1("B1", 35, EnumPieceType.PAD),
    C2("C2", 36, EnumPieceType.PAD),
    CS2("C#2", 37, EnumPieceType.PAD),
    D2("D2", 38, EnumPieceType.PAD),
    DS2("D#2", 39, EnumPieceType.PAD),
    E2("E2", 40, EnumPieceType.PAD),
    F2("F2", 41, EnumPieceType.PAD),
    FS2("F#2", 42, EnumPieceType.PAD),
    G2("G2", 43, EnumPieceType.PAD),
    GS2("G#2", 44, EnumPieceType.PAD),
    A2("A2", 45, EnumPieceType.PAD),
    AS2("A#2", 46, EnumPieceType.PAD),
    B2("B2", 47, EnumPieceType.PAD),
    C3("C3", 48, EnumPieceType.PAD),
    CS3("C#3", 49, EnumPieceType.PAD),
    D3("D3", 50, EnumPieceType.PAD),
    DS3("D#3", 51, EnumPieceType.PAD),
    E3("E3", 52, EnumPieceType.PAD),
    F3("F3", 53, EnumPieceType.PAD),
    FS3("F#3", 54, EnumPieceType.PAD),
    G3("G3", 55, EnumPieceType.PAD),
    GS3("G#3", 56, EnumPieceType.PAD),
    A3("A3", 57, EnumPieceType.PAD),
    AS3("A#3", 58, EnumPieceType.PAD),
    B3("B3", 59, EnumPieceType.PAD),
    C4("C4", 60, EnumPieceType.PAD),
    CS4("C#4", 61, EnumPieceType.PAD),
    D4("D4", 62, EnumPieceType.PAD),
    DS4("D#4", 63, EnumPieceType.PAD),
    E4("E4", 64, EnumPieceType.PAD),
    F4("F4", 65, EnumPieceType.PAD),
    FS4("F#4", 66, EnumPieceType.PAD),
    G4("G4", 67, EnumPieceType.PAD),
    GS4("G#4", 68, EnumPieceType.PAD),
    A4("A4", 69, EnumPieceType.PAD),
    AS4("A#4", 70, EnumPieceType.PAD),
    B4("B4", 71, EnumPieceType.PAD),
    C5("C5", 72, EnumPieceType.PAD),
    CS5("C#5", 73, EnumPieceType.PAD),
    D5("D5", 74, EnumPieceType.PAD),
    DS5("D#5", 75, EnumPieceType.PAD),
    E5("E5", 76, EnumPieceType.PAD),
    F5("F5", 77, EnumPieceType.PAD),
    FS5("F#5", 78, EnumPieceType.PAD),
    G5("G5", 79, EnumPieceType.PAD),
    GS5("G#5", 80, EnumPieceType.PAD),
    A5("A5", 81, EnumPieceType.PAD),
    AS5("A#5", 82, EnumPieceType.PAD),
    B5("B5", 83, EnumPieceType.PAD),
    C6("C6", 84, EnumPieceType.PAD),
    CS6("C#6", 85, EnumPieceType.PAD),
    D6("D6", 86, EnumPieceType.PAD),
    DS6("D#6", 87, EnumPieceType.PAD),
    E6("E6", 88, EnumPieceType.PAD),
    F6("F6", 89, EnumPieceType.PAD),
    FS6("F#6", 90, EnumPieceType.PAD),
    G6("G6", 91, EnumPieceType.PAD),
    GS6("G#6", 92, EnumPieceType.PAD),
    A6("A6", 93, EnumPieceType.PAD),
    AS6("A#6", 94, EnumPieceType.PAD),
    B6("B6", 95, EnumPieceType.PAD),
    C7("C7", 96, EnumPieceType.PAD),
    CS7("C#7", 97, EnumPieceType.PAD),
    D7("D7", 98, EnumPieceType.PAD),
    DS7("D#7", 99, EnumPieceType.PAD),
    E7("E7", 100, EnumPieceType.PAD),
    F7("F7", 101, EnumPieceType.PAD),
    FS7("F#7", 102, EnumPieceType.PAD),
    G7("G7", 103, EnumPieceType.PAD),
    GS7("G#7", 104, EnumPieceType.PAD),
    A7("A7", 105, EnumPieceType.PAD),
    AS7("A#7", 106, EnumPieceType.PAD),
    B7("B7", 107, EnumPieceType.PAD),
    C8("C8", 108, EnumPieceType.PAD);
    
    public String name;

    GmPiano (String valName){
        name = valName;
    }

    public String getName(){
        return name;
    }

    public int getNote(){
        int num = this.ordinal() + 21;
        return num;
    }
        
    public EnumPieceType getPieceType(){
        return EnumPieceType.PAD;
    }
    
    public static String getMapVst(){
        return EnumVstList.GM_PIANO.name();
    }
}

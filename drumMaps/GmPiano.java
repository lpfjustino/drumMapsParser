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
    
    A0("A0"),
    AS0("A#0"),
    B0("B0"),
    C1("C1"),
    CS1("C#1"),
    D1("D1"),
    DS1("D#1"),
    E1("E1"),
    F1("F1"),
    FS1("F#1"),
    G1("G1"),
    GS1("G#1"),
    A1("A1"),
    AS1("A#1"),
    B1("B1"),
    C2("C2"),
    CS2("C#2"),
    D2("D2"),
    DS2("D#2"),
    E2("E2"),
    F2("F2"),
    FS2("F#2"),
    G2("G2"),
    GS2("G#2"),
    A2("A2"),
    AS2("A#2"),
    B2("B2"),
    C3("C3"),
    CS3("C#3"),
    D3("D3"),
    DS3("D#3"),
    E3("E3"),
    F3("F3"),
    FS3("F#3"),
    G3("G3"),
    GS3("G#3"),
    A3("A3"),
    AS3("A#3"),
    B3("B3"),
    C4("C4"),
    CS4("C#4"),
    D4("D4"),
    DS4("D#4"),
    E4("E4"),
    F4("F4"),
    FS4("F#4"),
    G4("G4"),
    GS4("G#4"),
    A4("A4"),
    AS4("A#4"),
    B4("B4"),
    C5("C5"),
    CS5("C#5"),
    D5("D5"),
    DS5("D#5"),
    E5("E5"),
    F5("F5"),
    FS5("F#5"),
    G5("G5"),
    GS5("G#5"),
    A5("A5"),
    AS5("A#5"),
    B5("B5"),
    C6("C6"),
    CS6("C#6"),
    D6("D6"),
    DS6("D#6"),
    E6("E6"),
    F6("F6"),
    FS6("F#6"),
    G6("G6"),
    GS6("G#6"),
    A6("A6"),
    AS6("A#6"),
    B6("B6"),
    C7("C7"),
    CS7("C#7"),
    D7("D7"),
    DS7("D#7"),
    E7("E7"),
    F7("F7"),
    FS7("F#7"),
    G7("G7"),
    GS7("G#7"),
    A7("A7"),
    AS7("A#7"),
    B7("B7"),
    C8("C8");
    
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

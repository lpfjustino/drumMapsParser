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

/*ID ( Name, Note, Type */

public enum GmSequencer {
    PAD_0,
    PAD_1,
    PAD_2,
    PAD_3,
    PAD_4,
    PAD_5,
    PAD_6,
    PAD_7,
    PAD_8,
    PAD_9,
    PAD_10,
    PAD_11,
    PAD_12,
    PAD_13,
    PAD_14,
    PAD_15,
    PAD_16,
    PAD_17,
    PAD_18,
    PAD_19,
    PAD_20,
    PAD_21,
    PAD_22,
    PAD_23,
    PAD_24,
    PAD_25,
    PAD_26,
    PAD_27,
    PAD_28,
    PAD_29,
    PAD_30,
    PAD_31,
    PAD_32,
    PAD_33,
    PAD_34,
    PAD_35,
    PAD_36;
    
    public String name;
    
    public String getName(){
        return "Pad "+this.ordinal();
    }
    
    public int getNote(){
        int num = this.ordinal();
        return num;
    }
        
    public EnumPieceType getPieceType(){
        return EnumPieceType.PAD;
    }
    
    public static String getMapVst(){
        return EnumVstList.SEQUENCER.name();
    }
}

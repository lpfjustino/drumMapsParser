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
public enum EzxLatinPercussion {
    
    TIMBALE_LO_OPEN_L("Timbale Lo Open L", 66, EnumPieceType.PERCUSSION),
    TIMBALE_LO_SIDESTROKE("Timbale Lo Sidestroke", 23, EnumPieceType.PERCUSSION),
    TIMBALE_LO_FLAM("Timbale Lo Flam", 22, EnumPieceType.PERCUSSION),
    TIMBALE_LO_OPEN_RIGHT("Timbale Lo Open Right", 21, EnumPieceType.PERCUSSION),
    TIMBALE_LO_RIMSHOT("Timbale Lo Rimshot", 20, EnumPieceType.PERCUSSION),  
    TIMBALE_HI_OPEN_L("Timbale Hi Open L", 65, EnumPieceType.PERCUSSION),
    TIMBALE_HI_SIDESTROKE("Timbale Hi Sidestroke", 17, EnumPieceType.PERCUSSION),
    TIMBALE_HI_FLAM("Timbale Hi Flam", 16, EnumPieceType.PERCUSSION),
    TIMBALE_HI_OPEN_RIGHT("Timbale Hi Open Right", 19, EnumPieceType.PERCUSSION),
    TIMBALE_HI_RIMSHOT("Timbale Hi Rimshot", 18, EnumPieceType.PERCUSSION),
    TIMBALE_HI_RUFF("Timbale Hi Ruff", 15, EnumPieceType.PERCUSSION),
    CONGA_LO_BASS_L("Conga Lo Bass L", 64, EnumPieceType.PERCUSSION),
    CONGA_HI_OPEN_L("Conga Hi Open L", 63, EnumPieceType.PERCUSSION),
    CONGA_HI_MUTED_L("Conga Hi Muted L", 62, EnumPieceType.PERCUSSION),
    BONGO_LO_OPEN_L("Bongo Lo Open L", 61, EnumPieceType.PERCUSSION),
    BONGO_HI_OPEN_L("Bongo Hi Open L", 60, EnumPieceType.PERCUSSION),
    CYMBAL_1_CRASHED("Cymbal 1 Crashed", 57, EnumPieceType.CYMBAL),
    CYMBAL_1_CRESCENDO("Cymbal 1 Crescebdo", 120, EnumPieceType.CYMBAL),
    CYMBAL_2_CRASHED("Cymbal 2 Crashed", 59, EnumPieceType.CYMBAL),
    CYMBAL_2_CRESCENDO("Cymbal 2 Crescebdo", 122, EnumPieceType.CYMBAL),
    FX_VIBRASLAP("FX Fibraslap", 58, EnumPieceType.PERCUSSION),
    FX_CHIMES("FX Chimes", 72, EnumPieceType.PERCUSSION),
    FX_CRICKETS("FX Crickets", 71, EnumPieceType.PERCUSSION),
    FX_WATERFALL("FX Waterfall", 68, EnumPieceType.PERCUSSION),
    COWBELL_STRUCK("Cowbell Struck", 56, EnumPieceType.PERCUSSION),
    BELLS("Bells", 67, EnumPieceType.PERCUSSION),   
    TAMBOURINE_OPEN("Tambourine Open", 54, EnumPieceType.PERCUSSION),
    TAMBOURINE_ON_BEAT("Tambourine On Beat", 27, EnumPieceType.PERCUSSION),
    TAMBOURINE_OFF_BEAT("Tambourine Off Beat", 26, EnumPieceType.PERCUSSION),
    TAMBOURINE_MUTED("Tambourine Muted", 25, EnumPieceType.PERCUSSION),
    TAMBOURINE_CRESCENDO("Tambourine Crescendo", 24, EnumPieceType.PERCUSSION),    
    BONGO_LO_FLAM("Bongo Lo Flam", 53, EnumPieceType.PERCUSSION),
    BONGO_LO_CRESCENDO("Bongo Lo Crescendo", 52, EnumPieceType.PERCUSSION),
    BONGO_LO_OPEN_RIGHT("Bongo Lo Open Right", 51, EnumPieceType.PERCUSSION),
    BONGO_FLAM("Bongo Flam", 32, EnumPieceType.PERCUSSION),
    BONGO_CRESCENDO("Bongo Crescendo", 31, EnumPieceType.PERCUSSION),
    BONGO_OPEN_RIGHT("Bongo Open Right", 28, EnumPieceType.PERCUSSION),
    BONGO_RIGHT_HEEL("Bongo Right Heel", 30, EnumPieceType.PERCUSSION),
    BONGO_LEFT_HEEL("Bongo Left Heel", 29, EnumPieceType.PERCUSSION),
    SHAKER_SHAKE("Shaker Shake", 50, EnumPieceType.PERCUSSION),
    SHAKER_ON_BEAT("Shaker On Beat", 49, EnumPieceType.PERCUSSION),
    SHAKER_OFF_BEAT("Shaker Off Beat", 48, EnumPieceType.PERCUSSION),
    BIG_SHAKER_SHAKE("Big Shaker Shake", 46, EnumPieceType.PERCUSSION),
    BIG_SHAKER_ON_BEAT("Big Shaker On Beat", 45, EnumPieceType.PERCUSSION),
    BIG_SHAKER_OFF_BEAT("Big Shaker Off Beat", 44, EnumPieceType.PERCUSSION),
    WOODBLOCK_BLOCK_1("Woodblock Block 1", 76, EnumPieceType.PERCUSSION),
    WOODBLOCK_BLOCK_2("Woodblock Block 2", 77, EnumPieceType.PERCUSSION),
    WOODBLOCK_BLOCK_3("Woodblock Block 3", 47, EnumPieceType.PERCUSSION),   
    CAJON_SLAP_MID_RIGHT("Cajon Slap Mid Right", 43, EnumPieceType.PERCUSSION),
    CAJON_SLAP_MID_LEFT("Cajon Slap Mid Left", 42, EnumPieceType.PERCUSSION),
    CAJON_SLAP_RIGHT("Cajon Slap Right", 41, EnumPieceType.PERCUSSION),
    CAJON_SLAP_LEFT("Cajon Slap Left", 40, EnumPieceType.PERCUSSION),
    CAJON_SIDESTICK_R("Cajon Sidestick Right", 14, EnumPieceType.PERCUSSION),
    CAJON_SIDESTICK_L("Cajon Sidestick Left", 13, EnumPieceType.PERCUSSION),
    CAJON_GHOST_RIGHT("Cajon Ghost Right", 12, EnumPieceType.PERCUSSION),
    CAJON_GHOST_LEFT("Cajon Ghost Left", 11, EnumPieceType.PERCUSSION),   
    CAJON_BASSTONE_R("Cajon Basstone Right", 10, EnumPieceType.PERCUSSION),
    CAJON_BASSTONE_L("Cajon Basstone Left", 75, EnumPieceType.PERCUSSION),
    CAJON_BRUSHED_R("Cajon Brushed Right", 87, EnumPieceType.PERCUSSION),
    CAJON_BRUSHED_L("Cajon Brushed Left", 86, EnumPieceType.PERCUSSION),
    CAJON_HIT_R("Cajon Hit Right", 85, EnumPieceType.PERCUSSION),
    CAJON_HIT_L("Cajon Hit Left", 84, EnumPieceType.PERCUSSION),
    CAJON_CRESCENDO("Cajon Crescendo", 83, EnumPieceType.PERCUSSION),
    CAJON_FLAM("Cajon Flam", 82, EnumPieceType.PERCUSSION),   
    UDU_FLAM("Udu Flam", 39, EnumPieceType.PERCUSSION),
    UDU_OPEN_CRESCENDO("Udu Open Crescendo", 38, EnumPieceType.PERCUSSION),
    UDU_SLAP_CRESCENDO("Udu Slap Crescendo", 37, EnumPieceType.PERCUSSION),
    UDU_LO_OPEN("Udu Lo Open", 36, EnumPieceType.PERCUSSION),
    UDU_HI_OPEN("Udu Hi Open", 35, EnumPieceType.PERCUSSION),
    UDU_GHOST_RIGHT("Udu Ghost Right", 34, EnumPieceType.PERCUSSION),
    UDU_GHOST_LEFT("Udu Ghost Left", 33, EnumPieceType.PERCUSSION),
    UDU_OPEN_SLAP("Udu Open Slap", 79, EnumPieceType.PERCUSSION),
    UDU_MUTED_SLAP("Udu Muted Slap", 78, EnumPieceType.PERCUSSION), 
    CAXIXI_BEAT("Caxixi Beat", 9, EnumPieceType.PERCUSSION),
    CAXIXI_SPECIAL("Caxixi Special", 8, EnumPieceType.PERCUSSION),
    CAXIXI_ON_BEAT("Caxixi On Beat", 7, EnumPieceType.PERCUSSION),
    CAXIXI_OFF_BEAT("Caxixi Off Beat", 6, EnumPieceType.PERCUSSION),
    MARACAS_CRESCENDO("Maracas Crescendo", 5, EnumPieceType.PERCUSSION),
    MARACAS_ON_BEAT("Maracas On Beat", 4, EnumPieceType.PERCUSSION),
    MARACAS_OFF_BEAT("Maracas Off Beat", 3, EnumPieceType.PERCUSSION),
    SHEKERE_CRESCENDO("Shekere Crescendo", 127, EnumPieceType.PERCUSSION),
    SHEKERE_ON_BEAT("Shekere On Beat", 126, EnumPieceType.PERCUSSION),
    SHEKERE_OFF_BEAT("Shekere Off Beat", 125, EnumPieceType.PERCUSSION),
    AFUCHE_BEAT("Afuche Beat", 69, EnumPieceType.PERCUSSION),  
    CRESCENDO_CRICKETS("Crescendo Crickets", 123, EnumPieceType.PERCUSSION),
    CRESCENDO_WATERFALL("Crescendo Waterfall", 121, EnumPieceType.PERCUSSION),
    CRESCENDO_BELLS("Crescendo Bells", 119, EnumPieceType.PERCUSSION),   
    CONGA_1_SPECIAL("Conga 1 Special", 101, EnumPieceType.PERCUSSION),
    CONGA_1_SLAP_FLAM("Conga 1 Slap Flam", 100, EnumPieceType.PERCUSSION),
    CONGA_1_OPEN_FLAM("Conga 1 Open Flam", 99, EnumPieceType.PERCUSSION),
    CONGA_1_SLAP_CRESCENDO("Conga 1 Slap Crescendo", 88, EnumPieceType.PERCUSSION),
    CONGA_1_OPEN_CRESCENDO("Conga 1 Open Crescendo", 98, EnumPieceType.PERCUSSION),
    CONGA_1_HEEL_RIGHT("Conga 1 Heel Right", 97, EnumPieceType.PERCUSSION),
    CONGA_1_HEEL_LEFT("Conga 1 Heel Left", 96, EnumPieceType.PERCUSSION),
    CONGA_1_CLOSED_SLAP_RIGHT("Conga 1 Closed Slap Right", 95, EnumPieceType.PERCUSSION),
    CONGA_1_CLOSED_LEFT("Conga 1 Closed Left", 94, EnumPieceType.PERCUSSION),
    CONGA_1_OPEN_SLAP_RIGHT("Conga 1 Open Slap Right", 93, EnumPieceType.PERCUSSION),
    CONGA_1_OPEN_LEFT("Conga 1 Open Left", 92, EnumPieceType.PERCUSSION),
    CONGA_1_BASSTONE_R("Conga 1 Basstone", 91, EnumPieceType.PERCUSSION),
    CONGA_1_OPEN_RIGHT("Conga 1 Open Right", 90, EnumPieceType.PERCUSSION),
    CONGA_1_MUTED_RIGHT("Conga 1 Muted Right", 89, EnumPieceType.PERCUSSION),
    CONGA_2_SPECIAL("Conga 2 Special", 110, EnumPieceType.PERCUSSION),
    CONGA_2_OPEN_FLAM("Conga 2 Open Flam", 109, EnumPieceType.PERCUSSION),
    CONGA_2_OPEN_CRESCENDO("Conga 2 Open Crescendo", 108, EnumPieceType.PERCUSSION),
    CONGA_2_BASSTONE_R("Conga 2 Basstone", 107, EnumPieceType.PERCUSSION),
    CONGA_2_BASSTONE_L("Conga 2 Basstone", 106, EnumPieceType.PERCUSSION),
    CONGA_2_MUTED_RIGHT("Conga 2 Muted Right", 105, EnumPieceType.PERCUSSION),
    CONGA_2_MUTED_LEFT("Conga 2 Muted Right", 104, EnumPieceType.PERCUSSION),
    CONGA_2_OPEN_RIGHT("Conga 2 Open Right", 103, EnumPieceType.PERCUSSION),
    CONGA_2_OPEN_LEFT("Conga 2 Open Right", 102, EnumPieceType.PERCUSSION),
    TRIANGLE_OPEN("Triangle Open", 81, EnumPieceType.PERCUSSION),
    TRIANGLE_MUTED("Triangle Muted", 80, EnumPieceType.PERCUSSION),
    GUIRO_LONG("Guiro Long", 74, EnumPieceType.PERCUSSION),
    GUIRO_SHORT("Guiro Short", 73, EnumPieceType.PERCUSSION);

    public int note;
    public String name;
    public EnumPieceType type;

    EzxLatinPercussion (String valName, int valNote, EnumPieceType valType){
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
        return EnumVstList.EZX_LATIN_PERCUSSION.name();
    }
}

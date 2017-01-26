package fallk.grove;

import com.google.gson.JsonElement;

final class Convert { 

    static byte getAsByte(JsonElement el) {return el.getAsByte();}
    static char getAsChar(JsonElement el) {return el.getAsCharacter();}
    static double getAsDouble(JsonElement el) {return el.getAsDouble();}
    static float getAsFloat(JsonElement el) {return el.getAsFloat();}
    static int getAsInt(JsonElement el) {return el.getAsInt();}
    static long getAsLong(JsonElement el) {return el.getAsLong();}
    static short getAsShort(JsonElement el) {return el.getAsShort();}

}

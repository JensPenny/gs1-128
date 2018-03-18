package br.com.devsource.gs1;

import java.util.Map;

/**
 * Wrapper object that gives a type to the {@link AI} - map that gets returned from a {@link Gs1128Decoder}. 
 */
public final class GS1Object{
    private final Map<AI, String> gs1Map;

    public GS1Object(Map<AI, String> gs1Map){
        this.gs1Map = gs1Map;
    }

    public String getGTIN(){
        return gs1Map.get(AIs.GTIN);
    }

    public String getBatch(){
        return gs1Map.get(AIs.BATCH_LOT);
    }

    public String getSerial(){
        return gs1Map.get(AIs.SERIAL);
    }

    /**
     * Create a {@link GS1Object} from 
     */
    public static final GS1Object createFromDataStream(final String gs1Data){
        Gs1128Engine engine = new Gs1128Engine();
        Gs1128Decoder decoder = engine.decoder();
        GS1Object wrappedGS1 = new GS1Object(decoder.decode(gs1Data));
        return wrappedGS1;
    }
}
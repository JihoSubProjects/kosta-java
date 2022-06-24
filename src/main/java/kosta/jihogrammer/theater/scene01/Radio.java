package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Product;
import kosta.jihogrammer.theater.model.VolumeAdaptor;

public class Radio extends Product implements VolumeAdaptor {

    private int volume;

    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    public Radio() {
        super("radio");
        volume = (int) (Math.random() * 10) + 1;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public int volumeUp() {
        return volume = Math.min(MAX_VOLUME, volume + 1);
    }

    @Override
    public int volumeDown() {
        return volume = Math.max(MIN_VOLUME, volume - 1);
    }

}

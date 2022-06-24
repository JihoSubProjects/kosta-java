package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Product;
import kosta.jihogrammer.theater.model.VolumeAdaptor;

public class Television extends Product implements VolumeAdaptor {

    private int volume;

    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;

    public Television(String name) {
        super(name);
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public int volumeUp() {
        return 0;
    }

    @Override
    public int volumeDown() {
        return 0;
    }

}

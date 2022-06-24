package kosta.jihogrammer.theater;

import kosta.jihogrammer.theater.scene01.SceneTurnOnRadio;
import kosta.jihogrammer.theater.scene01.SceneTurnVolumeRadio;

public class Director {
    public static void main(String[] args) {
        new SceneTurnOnRadio().action();
        new SceneTurnVolumeRadio().action();
    }
}

package ru.netology.stats;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {//+1 станция
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {
            this.currentStation = 0;
        }
    }

    public void prev() {
        this.currentStation = currentStation - 1;
        if (currentStation == -1) {
            this.currentStation = 9;
        }
    }

    public void stationInput(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void volumePlus() {
        this.currentVolume = currentVolume + 1;
        if (currentVolume >= 10) {
            this.currentVolume = 10;
        }
    }

    public void volumeMinus() {
        this.currentVolume = currentVolume - 1;
        if (currentVolume <= 0) {
            this.currentVolume = 0;
        }
    }
}
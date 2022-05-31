package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextStation(int currentStation) {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void prevStation(int currentStation) {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void reduceVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

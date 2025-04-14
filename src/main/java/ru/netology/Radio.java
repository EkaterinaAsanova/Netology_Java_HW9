package ru.netology;


public class Radio {
    private int currentRadioStationNumber;
    private int currentSoundVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber < 9)
            currentRadioStationNumber = currentRadioStationNumber + 1;
        else
            currentRadioStationNumber = 0;
    }

    public void prev() {
        if (currentRadioStationNumber > 0)
            currentRadioStationNumber = currentRadioStationNumber - 1;
        else
            currentRadioStationNumber = 9;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 100) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseSound() {
        if (currentSoundVolume < 100)
            currentSoundVolume = currentSoundVolume + 1;
    }

    public void reducingSoundLevel() {
        if (currentSoundVolume > 0)
            currentSoundVolume = currentSoundVolume - 1;
    }
}
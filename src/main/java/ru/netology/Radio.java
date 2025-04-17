package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio
{
    private int maxNumberRadioStation;
    private int minNumberRadioStation = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentRadioStationNumber;
    private int currentSoundVolume;


    public Radio(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation - 1;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (this.currentRadioStationNumber > maxNumberRadioStation)
        {
            return;
        }
        if (this.currentRadioStationNumber < minNumberRadioStation)
        {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }
    public void next()
    {
        if (currentRadioStationNumber < maxNumberRadioStation)
        {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        else
        {
            currentRadioStationNumber = minNumberRadioStation;
        }
    }
    public void prev()
    {
        if (currentRadioStationNumber > minNumberRadioStation)
        {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        else
        {
            currentRadioStationNumber = maxNumberRadioStation;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (this.currentSoundVolume < minSoundVolume)
        {
            return;
        }
        if (this.currentSoundVolume > maxSoundVolume)
        {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }
    public void increaseSound()
    {
        if (currentSoundVolume < maxSoundVolume)
        {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void reducingSoundLevel()
    {
        if (currentSoundVolume > minSoundVolume)
        {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

}
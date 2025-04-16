package ru.netology;


public class Radio
{
    private int maxNumberRadioStation;
    private int minNumberRadioStation = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentRadioStationNumber;
    private int currentSoundVolume;

    public Radio(int quantityStation)
    {
      maxNumberRadioStation = quantityStation -1;
    }

    public Radio()
    {
      maxNumberRadioStation = 10;
    }

    public int getCurrentRadioStationNumber()
    {
      return currentRadioStationNumber;
    }

    public int getMaxNumberRadioStation()
    {
        return maxNumberRadioStation;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber)
    {
      if (newCurrentRadioStationNumber > maxNumberRadioStation)
      {
        return;
      }
      if (newCurrentRadioStationNumber < minNumberRadioStation)
      {
        return;
      }
      currentRadioStationNumber = newCurrentRadioStationNumber;
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

    public int getCurrentSoundVolume()
    {
      return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume)
    {
      if (newCurrentSoundVolume < minSoundVolume)
      {
        return;
      }
      if (newCurrentSoundVolume > maxSoundVolume)
      {
        return;
      }
      currentSoundVolume = newCurrentSoundVolume;
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
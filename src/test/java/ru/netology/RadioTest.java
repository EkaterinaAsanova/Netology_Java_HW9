package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio number = new Radio();
    Radio numberWithQuantityStation = new Radio(65);
    Radio volume = new Radio();

    @Test
    public void shouldNumberStationInMiddleValue() {
        number.setCurrentRadioStationNumber(6);

        int expected = 6;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberStationAboveMax() {
        number.setCurrentRadioStationNumber(15);

        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberStationBelowMin() {
        number.setCurrentRadioStationNumber(-3);

        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolumeBelowMin() {
        volume.setCurrentSoundVolume(-100);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolumeAboveMax() {
        volume.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolumeInMiddleValues() {
        volume.setCurrentSoundVolume(50);

        int expected = 50;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationInMiddleValues() {
        number.setCurrentRadioStationNumber(5);

        number.next();

        int expected = 6;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationMaxValues() {
        number.setCurrentRadioStationNumber(10);

        number.next();

        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevtNumberStationInMiddleValues() {
        number.setCurrentRadioStationNumber(5);

        number.prev();

        int expected = 4;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevtNumberStationMinValues() {
        number.setCurrentRadioStationNumber(0);

        number.prev();

        int expected = 10;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundInMiddleValues() {
        volume.setCurrentSoundVolume(50);

        volume.increaseSound();

        int expected = 51;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundMaxValues() {
        volume.setCurrentSoundVolume(100);

        volume.increaseSound();

        int expected = 100;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducingSoundLevelInMiddleValues() {
        volume.setCurrentSoundVolume(50);

        volume.reducingSoundLevel();

        int expected = 49;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducingSoundLevelMinValues() {
        volume.setCurrentSoundVolume(0);

        volume.reducingSoundLevel();

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxNumberStation() {
        int expected = 10;
        int actual = number.getMaxNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberStationInMiddleValueWithQuantityStation() {
        numberWithQuantityStation.setCurrentRadioStationNumber(20);

        int expected = 20;
        int actual = numberWithQuantityStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberStationAboveMaxWithQuantityStation() {
        numberWithQuantityStation.setCurrentRadioStationNumber(90);

        int expected = 0;
        int actual = numberWithQuantityStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberStationBelowMinWithQuantityStation() {
        numberWithQuantityStation.setCurrentRadioStationNumber(-5);

        int expected = 0;
        int actual = numberWithQuantityStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationInMiddleValuesWithQuantityStation() {
        numberWithQuantityStation.setCurrentRadioStationNumber(50);

        numberWithQuantityStation.next();

        int expected = 51;
        int actual = numberWithQuantityStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationMaxValuesWithQuantityStation() {
        numberWithQuantityStation.setCurrentRadioStationNumber(64);

        numberWithQuantityStation.next();

        int expected = 0;
        int actual = numberWithQuantityStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberStationInMiddleValuesWithQuantityStation() {
        numberWithQuantityStation.setCurrentRadioStationNumber(6);

        numberWithQuantityStation.prev();

        int expected = 5;
        int actual = numberWithQuantityStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberStationMinValuesWithQuantityStation() {
        numberWithQuantityStation.setCurrentRadioStationNumber(0);

        numberWithQuantityStation.prev();

        int expected = 64;
        int actual = numberWithQuantityStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}

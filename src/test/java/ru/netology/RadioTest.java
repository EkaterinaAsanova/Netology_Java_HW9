package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNumberStationInMiddleValues() {
        Radio number = new Radio();

        number.setCurrentRadioStationNumber(7);

        int expected = 7;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberStationAboveMax() {
        Radio number = new Radio();

        number.setCurrentRadioStationNumber(11);

        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberStationBelowMin() {
        Radio number = new Radio();

        number.setCurrentRadioStationNumber(-3);

        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(-100);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolumeInMiddleValues() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(50);

        int expected = 50;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationInMiddleValues() {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(5);

        number.next();

        int expected = 6;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberStationMaxValues() {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(9);

        number.next();

        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevtNumberStationInMiddleValues() {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(5);

        number.prev();

        int expected = 4;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevtNumberStationMinValues() {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(0);

        number.prev();

        int expected = 9;
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundInMiddleValues() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(50);

        volume.increaseSound();

        int expected = 51;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundMaxValues() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(100);

        volume.increaseSound();

        int expected = 100;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducingSoundLevelInMiddleValues() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(50);

        volume.reducingSoundLevel();

        int expected = 49;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducingSoundLevelMinValues() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(0);

        volume.reducingSoundLevel();

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void currentStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(1);

        int actual = cond.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void currentStationNegative() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void currentStationOverLimit() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);

        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

   @Test
    void nextStation() {
        Radio cond = new Radio();

        cond.nextStation(1);

        int actual = cond.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void nextStationOverLimit() {
        Radio cond = new Radio();

        cond.nextStation(9);

        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio cond = new Radio();

        cond.prevStation(2);

        int actual = cond.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void prevStationNegative() {
        Radio cond = new Radio();

        cond.prevStation(0);

        int actual = cond.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void prevStationLimit() {
        Radio cond = new Radio();

        cond.prevStation(8);

        int actual = cond.getCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

   @Test
    void currentVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);

        int actual = cond.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeNegative() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeOverLimit() {
        Radio cond = new Radio();

        cond.setCurrentVolume(11);

        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

   @Test
    void increaseVolume() {
        Radio cond = new Radio();

        cond.increaseVolume(9);

        int actual = cond.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeOverLimit() {
        Radio cond = new Radio();

        cond.increaseVolume(10);

        int actual = cond.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume() {
        Radio cond = new Radio();

        cond.reduceVolume(1);

        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeNegative() {
        Radio cond = new Radio();

        cond.reduceVolume(-1);

        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeOverLimit() {
        Radio cond = new Radio();

        cond.reduceVolume(11);

        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}

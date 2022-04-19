package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void station1() {
        Radio rad = new Radio();
        int actual = rad.getCurrentStation();
        System.out.println(actual);
    }

    @Test
    void stationMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void stationMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void stationInput() {
        Radio rad = new Radio();
        int currentStation = 5;
        int expected = 5;
        rad.stationInput(currentStation);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void stationInput2() {
        Radio rad = new Radio();
        int currentStation = -1;
        int expected = 0;
        rad.stationInput(currentStation);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void stationInput3() {
        Radio rad = new Radio();
        int currentStation = 10;
        int expected = 0;
        rad.stationInput(currentStation);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void currentVolume() {
        Radio rad = new Radio();
        int expected = 0;
        rad.getCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void stationVolumePlus() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.volumePlus();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void stationVolumeMinus() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.volumeMinus();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
}
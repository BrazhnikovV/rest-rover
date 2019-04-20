package ru.brazhnikov.rover.dto;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlanetTest {

    @Test
    public void getName() {
        Planet planet = new Planet("Mars");
        planet.getName();

        Assert.assertTrue(planet.getName() instanceof Object);
    }

    @Test
    public void setName() {
    }
}

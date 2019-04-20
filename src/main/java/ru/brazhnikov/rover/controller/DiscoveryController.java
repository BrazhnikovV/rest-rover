package ru.brazhnikov.rover.controller;

import ru.brazhnikov.rover.dto.Planet;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@RestController
public class DiscoveryController {

    /**
     * discoverPlanet - action
     * @return
     */
    @RequestMapping( value = "/discover/planet", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE )
    public Planet discoverPlanet() {
        return new Planet("Mars" );
    }
}

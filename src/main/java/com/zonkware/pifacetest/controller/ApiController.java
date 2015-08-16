package com.zonkware.pifacetest.controller;

import com.pi4j.device.piface.PiFace;
import com.pi4j.device.piface.PiFaceLed;
import com.pi4j.device.piface.impl.PiFaceDevice;
import com.pi4j.wiringpi.Spi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ApiController {

    private PiFace piface;

    public ApiController() {
        try {
            piface = new PiFaceDevice(PiFace.DEFAULT_ADDRESS, Spi.CHANNEL_0);
        } catch (IOException e) {
            piface = null;
            e.printStackTrace();
        }
    }

    @RequestMapping("/button1")
    public String test() {
        piface.getLed(PiFaceLed.LED0).toggle();
        piface.getLed(PiFaceLed.LED1).toggle();

        return "Ok, check the first two LEDs...";
    }

    @RequestMapping("/button2")
    public String test2() {
        piface.getLed(PiFaceLed.LED2).blink(5000L);
        piface.getLed(PiFaceLed.LED3).blink(5000L);

        return "Ok, those LEDs are blinking...";
    }

    @RequestMapping("/button")
    public String test3() {
        piface.getLed(PiFaceLed.LED4).pulse(30L);
        piface.getLed(PiFaceLed.LED5).pulse(30L);

        return "Ok, those LEDs are pulseing...";
    }

}

package org.wecancodeit.evercraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class EvercraftApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvercraftApplication.class, args);
        GameCharacter mainCharacter = new GameCharacter();
        System.out.println(mainCharacter.attackHit());
    }

}

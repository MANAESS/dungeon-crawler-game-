package com.manaess.dungeoncrawler.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class HeroTest {

    @Test
    void newHeroShouldHaveFullHealth(){
        Hero hero = new Hero ("Daemon Targaryen",100, 15,5);
        assertEquals(100,hero.getCurrentHealth());
    }
  


   @Test
   void newHeroShouldBeAlive () {
        Hero hero = new Hero ("Daemon Targaryen",100, 15,5);
        assertTrue(hero.isAlive());
        }

      }
package swingy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swingy.models.enums.HeroClass;

@Getter
@Setter
public class Hero extends Unit {
    private final String name;
    private final HeroClass className;
    private Integer level;
    private Integer experience;
    private Integer attack;
    private Integer defense;
    private Integer hitPoints;
    private Artifact weapon;
    private Artifact armor;
    private Artifact helm;

    private Hero(HeroBuilder h) {
        this.name = h.getName();
        this.className = h.getClassName();
        this.level = h.getLevel();
        this.experience = h.getExperience();
        this.defense = h.getDefense();
        this.attack = h.getAttack();
        this.hitPoints = h.getHitPoints();
        this.weapon = h.getWeapon();
        this.armor = h.getArmor();
        this.helm = h.getHelm();
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class HeroBuilder {
        private String name;
        private HeroClass className;
        private int level;
        private int experience;
        private int defense;
        private int attack;
        private int hitPoints;
        private Artifact weapon;
        private Artifact armor;
        private Artifact helm;

        public Hero build() {
            return new Hero(this);
        }

        public HeroBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public HeroBuilder className(final HeroClass className) {
            this.className = className;
            return this;
        }

        public HeroBuilder level(int level) {
            this.level = level;
            return this;
        }

        public HeroBuilder experience(int experience) {
            this.experience = experience;
            return this;
        }

        public HeroBuilder attack(int attack) {
            this.attack = attack;
            return this;
        }

        public HeroBuilder defense(int defense) {
            this.defense = defense;
            return this;
        }

        public HeroBuilder hitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
            return this;
        }

        public HeroBuilder weapon(Artifact weapon) {
            this.weapon = weapon;
            return this;
        }

        public HeroBuilder armor(Artifact armor) {
            this.armor = armor;
            return this;
        }

        public HeroBuilder helm(Artifact helm) {
            this.helm = helm;
            return this;
        }
    }
}

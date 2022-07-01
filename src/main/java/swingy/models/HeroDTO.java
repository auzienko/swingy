package swingy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HeroDTO {
    private Long id;
    private String name;
    private Integer classId;
    private Integer level;
    private Integer experience;
    private Integer attack;
    private Integer defense;
    private Integer hitPoints;
    private Integer attackBonus;
    private Integer defenseBonus;
    private Integer hitPointsBonus;

    public HeroDTO(Hero hero) {
        this.name = hero.getName();
        this.classId = hero.getClassName().ordinal();
        this.level = hero.getLevel();
        this.experience = hero.getExperience();
        this.attack = hero.getAttack();
        this.defense = hero.getDefense();
        this.hitPoints = hero.getHitPoints();
        this.attackBonus = hero.getWeapon().getBonus();
        this.defenseBonus = hero.getArmor().getBonus();
        this.hitPointsBonus = hero.getHelm().getBonus();
    }
}

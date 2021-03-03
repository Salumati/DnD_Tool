val c = 1

case class CClass(classname:String)
/*
    have Class names
    can have possible magic
    has class abilities
    has allowed weapons
    has allowed amor
    has allowed skills
    has specialization

    has a hit die type (a way of calculating hit points)
 */

val fighter = CClass("Fighter")
val mage = CClass("Mage")

case class Race(racename:String)
/*
    has name
    has ability score increase (stat increase) (stat boni)
    has age range
    has alignment
    has size
    has movementSpeed
    has languages
    has subraces
    has traits (dragonbreath, ability scores, darkvision)

    functions:
    * showRaceTraits (shows all traits of a race, including age, stats increase etc.)
    * show for every single variable
    * showTraist only shows special traits (darvision, dragonbreath etc.)
 */

val human = Race("Human")
val elf = Race("Elf")

case class Character(name:String, lvl:Int, cclass:CClass, race:Race)
/*
    contains data about a dnd character including:
      * name
      * Level
      * Race
      * Class
      * Inventory
      * Background
 */

val arianwen = Character("Arianwen", 1, fighter, elf)
val aro = Character("Aro", 1, fighter, human)

case class CreateCharacter(name:String)
/*
    creates a dnd Character
    Guides the player through the process
 */

case class LvlUp(character:Character)
/*
    gives Lvl Up to a dnd Character
    automatically calculates new stats etc.
 */

case class Die(sides:Int)
/*
    Simulates a die with sides amount of sides
 */
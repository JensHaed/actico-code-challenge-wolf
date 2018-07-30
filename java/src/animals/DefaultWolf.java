package animals;

// Optional code here
public class DefaultWolf extends Animal
{
   // Optional code here

   // Available variables:
   // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
   //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
   //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
   //                   Your surroundings are updated just before being asked to move,
   //                   but may be out of date when asked to fight.
   public DefaultWolf()
   {
      super('D');
      /* Optional code here */
   }

   public Attack fight(char c)
   {
      /* Required code here. Must return an Attack. */
      return Attack.ROCK; // can be removed for something else
   }

   public Move move()
   {
      /* Required code here. Must return a Move. */
      return Move.DOWN; // can be removed for something else
   }

   private char lookLeft()
   {

      return ' ';
   }

   private char lookRight()
   {

      return ' ';
   }

   private char lookUp()
   {

      return ' ';
   }

   private char lookDown()
   {

      return ' ';
   }
}

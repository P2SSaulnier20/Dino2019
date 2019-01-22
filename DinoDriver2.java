
/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{
    public static void main (String[] args)
    {
        Dino[] pop = new Dino[100];
        System.out.print('\f');
        for(int i = 0; i<33; i++)
        {
            pop[i] = new TRex();
        }
        for(int i = 33;i<33; i++)
        {
            pop[i] = new DodoBird();
        }
        for(int i = 33; i<pop.length; i++)
        { 
            pop[i] = new SneakySnake();
        }
        for(int i = 0; i<pop.length; i++)
        {
            int rand = (int)(Math.random()*36);
            for(int j = 0; j<rand; j++)
                pop[i].ageUp();
        }
        int winCount = 0;
        int battleCount = 0;
        for(Dino d: pop)
        {
            if(d.getIsAlive()==true)
            {
                Dino defend = DinoDriver2.getDefender(pop, d);
                battleCount++;
                if(d.attack(defend)){
                    winCount++;
                }
            }
        }
        System.out.println("Total Wins: " +winCount+ " Total Battles: "+battleCount);
        getlivingDinos(pop);
        for(Dino d : pop)
        {
        System.out.println(d);
        }

        int[] nums = new int[10];  
         System.out.println(nums[0]);

        for( int i =0; i<nums.length; i++)
        {
        nums[i] = 10+i;
         }
         for( int i =0; i<nums.length; i++)
         {
         System.out.println(nums[i]);
         }
         for(int answer: nums)
         {
         System.out.println(answer);  
         }
    }

    public static int getlivingDinos( Dino[] p)
    {
        int livingCount = 0;
        for(Dino d: p)
        {
            if(d.getIsAlive() ==true)
            {
                livingCount++;
            }
        }

        System.out.println("There are "+ livingCount+ " Dinosaurs alive.");
        return livingCount;
    }

    public static Dino getDefender(Dino[] p, Dino attacker)
    {
        Dino def = null;

        do
        {
            int rand = (int)(Math.random()*p.length);
            def = p[rand];
        }
        while(def == attacker || !def.isAlive());

        return def;
        
    }
}



/**
 * Write a description of class DinoDriver3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.Scanner;
import java.util.ArrayList;
public class DinoDriver3
{
   
    public static void main(String[] args)
    {
     ArrayList<Dino> myPop = new ArrayList<Dino>();
     //prompt the user to imput the number of dinos in the population
     System.out.print("How Many Dinosaurs in the Population?");
     Scanner scan = new Scanner(System.in);
     int s = scan.nextInt();
     // fill this list with the three types 
     for(int i = 0; i < s; i++)
     {
       double num = Math.random();  
       if(num<0.33)
       {myPop.add(new TRex());}
       else if(num< 0.67)
       {myPop.add(new DodoBird());}
       else
       {myPop.add(new SneakySnake());}
     }
    for(Dino d : myPop)
    {
        System.out.println(d);
    }
        //Age up these dinos randomly
     for(Dino d: myPop)
     {
         int rand = (int)(Math.random()*33);
         for (int i=0; i<rand; i++)
         d.ageUp();
        }
    }
    public static int getLivingDinos(ArrayList<Dino> p )
    {
        int livingCount = 0;
        for( Dino d:p)
        {
            if(d.getIsAlive() ==true)
            {
                livingCount++;
            }
        }
        System.out.println("There are "+ livingCount+ " Dinosaurs alive.");
        return livingCount;
    }
    public static int getDefender(ArrayList<Dino> p , Dino attacker)
    {
     {
        Dino def;
        int rand =-1;
        do
        {
            rand = (int)(Math.random()*p.size());
            def = p.get(rand);
        }
        while( def == attacker || !def.getIsAlive() );

        return rand;
     }

    }
        
    
    }


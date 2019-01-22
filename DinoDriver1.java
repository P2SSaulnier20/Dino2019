public class DinoDriver1
{
    public static void main(String[] args)
  {
      Dino d1 = new TRex();
      Dino d2 = new DodoBird();
      d1.setHealth(100);
      d2.setHealth(100);
      int winCount = 0;
     for(int i =0; i<50; i++)
   {
        if(d1.attack(d2))
        {
         winCount++;
        }
        System.out.println(d1.toString()+"   ***     "+d2.toString());
    }
    System.out.println(""+ winCount + "out of 50 attacks");
  }
}

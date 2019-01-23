public class DodoBird extends Dino
{ 
    public DodoBird ()
    { 
        super("DodoBird"); 

    }
    public boolean attack(Dino def) 
    {
        double prob = 0.0;
        if(def.getType().equals("DodoBird"))
        { if(Math.random() < 0.55) 
            {
                this.update(def, true);
                return true; 
            } 
            else
            {
                this.update(def, false);
                return false;  
            }
        }
        else if(def.getType().equals("SneakySnake"))
        { 
            if(Math.random() < 0.9) 
            { 
                this.update(def, false);
                return false; 
            } 
            else 
            { 
                System.out.println("defend is and unknown dino");
            }
        } 
        else if(def.getType().equals("TRex")) 
        { if(Math.random() < 0.55)
            { prob = 0.5; 
            }
            else 
                prob = 0.9;
          if(Math.random() < prob)
          { 
            return true; 
          }
          else 
          {
            return false; 
          }
        }
        return false;
    }
}        
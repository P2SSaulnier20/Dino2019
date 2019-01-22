public abstract class Dino
{ 
   private String name;
   private String type;
   private int age;

   private String gender;
   private int wins;
   private int battlecount;
   private int health; //0 is dead 100 is healthy
   public boolean IsAlive;
   private int Wins;
   public Dino(String t) {
    this.type = t;
    this.age = 0;
    this.Wins = 0;
    this.health = 100;
    this.IsAlive = false;
    gender = (Math.random() > 0.5) ? "M" : "F";

   }
   public String toString()
    {
    String temp = " ";
    temp = this.type + "" + this.age + ""+ this.Wins + " " + this.health;
            return temp;
    }
    /*Setters*/
   public void setType(String t)
    {
        this.type = t;
    }
   public void setAge(int a)
    {
    this.age = a;
    }
   public void setBattlecount(int bc)
    {
    this.battlecount = bc;
    }
   public void setHealth(int h)
    {
        this.health = h;
    }
   public void setGender(String gender) {
        this.gender = gender;
    }
   public void setIsAlive(boolean isAlive) 
   {
       this.IsAlive = isAlive;
    }
   public boolean isAlive()
   {
       return IsAlive;
    }
   public void setWins(int w)
    {
    this.Wins= Wins;
   }
    /*Getters*/
   public String getType()
    {
    return this.type;
    }
   public int getAge() {
        return age;
    }
   public int getBattlecount() {
        return battlecount;
    }
   public int getHealth() {
        return health;
    }
   public String getGender() {
        return gender;
    }
   public boolean getIsAlive() {
        return this.IsAlive;
    }
   public int getWins(){
        return this.Wins;
    }
    /*Methods*/
    public boolean attack(Dino def) 
    {
     if(def != null){
      double prob = 0.0;
     if(def.getType().equals("TRex"))
      { if(Math.random() < 0.55) 
            {
                this.update(def, true);
                return true; 
            } 
      }
      else { 
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
     if(def.getType().equals("Sneak")) 
            { if(Math.random() < 0.55)
                { prob = 0.5; 
                }
               else 
              prob = 0.9;
                if(Math.random() < prob)
                { return true; 
                }
               else 
                {return false; 
                }
            }
             return false;
            }
            return false;
         }
          
   public void ageUp() 
    {
        this.age++;
       if(this.age < 10)
        this.setHealth(this.getHealth()+10);
       else if (this.age > 25)
        this.setHealth(this.getHealth()-10);
        else if (this.age>30)
        this.setHealth(this.getHealth()-30);
            this.checkHealth();
      }
   public void checkHealth()
    {
    if (this.health <= 0) ;
    {
     if(this.IsAlive == false)
     
      System.out.println("\t"+ this.toString() + " just died");
        this.IsAlive = false;
    }
    }
   public void update(Dino def, boolean winner)
   {
     this.battlecount++;
     def.setBattlecount(def.getBattlecount() + 1);
     if(winner == true)
     {
         this.wins++;
         def.setHealth(def.getHealth() -20);
         def.checkHealth();
     }
     else
     {
         def.setWins(def.getWins()+1);
         this.health = this.health - 20;
         this.checkHealth();
         
     }
    }
}


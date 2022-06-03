public abstract class duck{
    
    fly f ;
    quacking q ;
    
    public duck(){
        
    }
    
    public abstract void display();
    
    public void performFly(){
        f.flies();
    }
    
    public void performQuack(){
        q.quack();
    }
    
    public void swim(){
        System.out.println("All ducks float");
    }
}
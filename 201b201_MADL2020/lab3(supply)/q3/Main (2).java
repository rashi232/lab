/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		duck wd = new WD();
		duck rd = new RD();
		duck rhd = new RHD();
		duck ld = new LD();
		
		wd.display();
		wd.performFly();
		wd.performQuack();
		wd.swim();
		
		
		rd.display();
		rd.performFly();
		rd.performQuack();
		rd.swim();
		
		rhd.display();
		rhd.performFly();
		rhd.performQuack();
		rhd.swim();
		
		ld.display();
		ld.performFly();
		ld.performQuack();
		ld.swim();
	}
}

interface quacking{
    void quack();
}


class quacks implements quacking{
    public void quack(){
        System.out.println("Quacks");
    }
}


class silent implements quacking{
    public void quack(){
        System.out.println("Silence");
    }
}


class squeak implements quacking{
    public void quack(){
        System.out.println("squeaks");
    }
}


interface fly{
    void flies();
}



class canf implements fly{
    public void flies(){
        System.out.println("can fly");
    }
}

class cannotf implements fly{
    public void flies(){
        System.out.println("cannot fly");
    }
}



class WD extends duck{
    public WD(){
        q = new silent();
        f = new cannotf();
    }
    
    public void display(){
        System.out.println("Wooden Duck");
    }
}


class RD extends duck{
    public RD(){
        q = new squeak();
        f = new cannotf();
    }
    
    public void display(){
        System.out.println("Rubber Duck");
    }
}



class RHD extends duck{
    public RHD(){
        q = new quacks();
        f = new canf();
    }
    
    public void display(){
        System.out.println("Red head Duck");
    }
}

class LD extends duck{
    public LD(){
        q = new quacks();
        f = new canf();
    }
    
    public void display(){
        System.out.println("Lake Duck");
    }
}

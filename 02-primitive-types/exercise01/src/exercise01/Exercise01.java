package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Exercise01
{

    public static void main(String[] args)
    {   
        // ***** NÚMEROS INTEIROS *****

        byte age = 23;
        System.out.println("===============================================");
        System.out.println("Type: byte.");
        System.out.println("Size: "+Byte.BYTES+" bytes | "+Byte.SIZE+" bits.");
        System.out.println("Range: "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println("Example: age is " + age);
        System.out.println("===============================================");
        
        
        short year = 2026;
        System.out.println("===============================================");
        System.out.println("Type: short.");
        System.out.println("Size: "+Short.BYTES+" bytes | "+Short.SIZE+" bits.");
        System.out.println("Range: "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println("Example: the year is " + year);
        System.out.println("===============================================");
        
        
        int oneMillion = 1000000;
        System.out.println("===============================================");
        System.out.println("Type: int.");
        System.out.println("Size: "+Integer.BYTES+" bytes | "+Integer.SIZE+" bits.");
        System.out.println("Range: "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println("Example: One Million is "+oneMillion);
        System.out.println("===============================================");
        
        
        long distanceStar = 9460730472580L; // É necessário adicionar o sufixo 'L'.
        System.out.println("===============================================");
        System.out.println("Type: long.");
        System.out.println("Size: "+Long.BYTES+" bytes | "+Long.SIZE+" bits.");
        System.out.println("Range: "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println("Example: Distance to star: "+distanceStar+" miles.");
        System.out.println("===============================================");
        
       
        
        // NÚMEROS DECIMAIS (PONTO FLUTUANTE)
        
        
        float height = 1.83f; // É necessário adicionar o sufixo 'f'.
        System.out.println("===============================================");
        System.out.println("Type: float");
        System.out.println("Size: "+Float.BYTES+" bytes | "+Float.SIZE+" bits.");
        System.out.println("Range: "+ -Float.MAX_VALUE+" to "+Float.MAX_VALUE);
        System.out.println("Example: My height is "+height);
        System.out.println("===============================================");
        
        double price = 29.99;
        System.out.println("===============================================");
        System.out.println("Type: double");
        System.out.println("Size: "+Double.BYTES+" bytes | "+Double.SIZE+" bits.");
        System.out.println("Range: "+ -Double.MAX_VALUE+" to "+Double.MAX_VALUE);
        System.out.println("Example: the price is US$ "+price);
        System.out.println("===============================================");
        
        // CARACTERES
        char initialChar = 'A';
        System.out.println("===============================================");
        System.out.println("Type: char");
        System.out.println("Size: "+Character.BYTES+" bytes | "+Character.SIZE+" bits.");
        System.out.println("Range: "+(int)Character.MIN_VALUE+" to "+(int)Character.MAX_VALUE);
        System.out.println("Example: The initial character of word is "+initialChar);
        System.out.println("===============================================");
        
        
        // BOOLEANOS
        boolean learningJava = true;
        System.out.println("===============================================");
        System.out.println("Type: boolean");
        System.out.println("Size: 1 bit.");
        System.out.println("Range: "+Boolean.TRUE+" or "+Boolean.FALSE);
        System.out.println("Example: learning Java? "+learningJava);
        System.out.println("===============================================");
    }
    
}

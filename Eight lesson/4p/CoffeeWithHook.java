import java.io.*;
public class CoffeeWithHook extends CaffeineBeverageWithHook 
    {
    

        void addCondiments()
        {
            System.out.println("Adding Sugar and Milk");
        }

        

        void brew()
        {
            System.out.println("Dripping coffee through filter");
        }

        public String getUserInput()
        {
            String answer = null;

            System.out.println("W");

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try
            {
                answer = in.readLine();

            }catch(IOException ioe)
            {
                System.err.println("IO err to read");

            }
            if (answer == null)
            {
                return "no";
            }


            return answer;
        }
        
        boolean customerWantsCondiments()
        {
            String answer = getUserInput();

            if (answer == "yes")
            {
                return true;

            }
            else
            {
                return false;
            }
        }
        
        
    }
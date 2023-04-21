import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook
    {

       public void addCondiments()
        {
            System.out.println("Adding lemon");
        }

        

        void brew()
        {
            System.out.println("Steeping the tea");
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
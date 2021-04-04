import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the score management system at Tamkang University");

        //Variables Declaration:
        float average_calculus, average_cs50, average_entreprenurship = 0;
        final float weight_calculus = 3;
        final float weight_cs50 = 2;
        final float weight_entrepreneurship = 1; 
        float max_calculus = 0, min_calculus = 0;
        float max_cs50 = 0, min_cs50 = 0;
        float max_entrepreneurship = 0, min_entrepreneurship = 0;
        int num_student = 7;
        int num_score = 3;
        float course_id_score[][] = new float[num_student][num_score];
        float overall_score[] = new float [num_student];
    
        Scanner scan = new Scanner(System.in);
        //Acquire user input;
        System.out.println("How many student data do you want to input: ");
        num_student = scan.nextInt();

        for (int i = 0; i<num_student; i++)
        {
            System.out.println("Please input your student ID: ");
            course_id_score[i][0] = scan.nextFloat();
            for (int a = 0; a<1; a++)
            {
                System.out.println("Please input your Calculus score: ");
                course_id_score[i][a] = scan.nextFloat();
                System.out.println("Please input your CS50 score: ");
                course_id_score[i][a+1] = scan.nextFloat();
                System.out.println("Please input your Entrepreneurship score: ");
                course_id_score[i][a+2] = scan.nextFloat();
            }
            System.out.println("--------------------------------------------");
        }

        //Calculation Zone: Average
        float sum_calculus = 0, sum_cs50 = 0, sum_entrepreneship = 0;
        for (int b = 0; b<num_student; b++)
        {
            sum_calculus = course_id_score[b][0] + course_id_score[b++][0];
            sum_cs50 = course_id_score[b][1] + course_id_score[b++][1];
            sum_entrepreneship = course_id_score[b][2] + course_id_score[b][2];
        }
        average_calculus = sum_calculus / num_student;
        average_cs50 = sum_cs50 / num_student;
        average_entreprenurship = sum_entrepreneship / num_student;

        //Calcuation: Overall Score:
        for (int overall = 0; overall<num_student; overall++)
        {
            overall_score[overall] = course_id_score[overall][0] * weight_calculus + course_id_score[overall][1] * weight_cs50 + course_id_score[overall][2] * weight_entrepreneurship;
        }

        //Sorting Zone
        //1. Sorting (Overall Score)
        boolean sorted = false;
        float temp;
        while(!sorted) 
        {
            sorted = true;
                for (int i = 0; i < num_student; i++) 
                {
                    if (overall_score[i] < overall_score[i+1]) 
                    {
                        temp = overall_score[i];
                        overall_score[i] = overall_score[i+1];
                        overall_score[i+1] = temp;
                        sorted = false;
                    }
                }
        }

        //Sorting Zone:
        //Sorting Calculus
        boolean sorting_status_calculus = false;
        float temp_calculus = 0;
        while(!sorting_status_calculus) 
        {
            sorting_status_calculus = true;
                for (int i = 0; i < num_student; i++) 
                {
                    if (course_id_score[i][0] < course_id_score[i+1][0]) 
                    {
                        temp = course_id_score[i][0];
                        course_id_score[i][0] = course_id_score[i+1][0];
                        course_id_score[i+1][0] = temp_calculus;
                        sorting_status_calculus = false;
                    }
                }
        }

        //Sorting CS50
        boolean sorting_status_cs50 = false;
        float temp_cs50 = 0;
        while(!sorting_status_cs50) 
        {
            sorting_status_cs50 = true;
                for (int i = 0; i < num_student; i++) 
                {
                    if (course_id_score[i][0] < course_id_score[i+1][0]) 
                    {
                        temp = course_id_score[i][0];
                        course_id_score[i][0] = course_id_score[i+1][0];
                        course_id_score[i+1][0] = temp_cs50;
                        sorting_status_cs50 = false;
                    }
                }
        }

        //Sorting Entrepreneurship;
        boolean sorting_status_entrepreneurship = false;
        float temp_entrepreneurship = 0;
        while(!sorting_status_entrepreneurship) 
        {
            sorting_status_entrepreneurship = true;
                for (int i = 0; i < num_student; i++) 
                {
                    if (course_id_score[i][2] < course_id_score[i+1][2]) 
                    {
                        temp = course_id_score[i][2];
                        course_id_score[i][2] = course_id_score[i+1][2];
                        course_id_score[i+1][2] = temp_entrepreneurship;
                        sorting_status_entrepreneurship = false;
                    }
                }
        }

        //Organisation Zone:
        max_calculus = course_id_score[0][0];
        min_calculus = course_id_score[num_student][0];

        max_cs50 = course_id_score[0][1];
        min_cs50 = course_id_score[num_student][1];

        max_entrepreneurship = course_id_score[0][2];
        min_entrepreneurship = course_id_score[num_student][2];

        //Display (Output) Zone
        System.out.println("Score Sheet: ");
        System.out.println("--------------------------------------------");
        System.out.println("Average per course: ");
        System.out.println("Calculus Average: " +average_calculus);
        System.out.println("CS50 Average: " +average_cs50);
        System.out.println("Entrepreneurship Course Average: " +average_entreprenurship);
        System.out.println("--------------------------------------------");
        System.out.println("Max Score per course ");
        System.out.println("Calculus Max: " +max_calculus);
        System.out.println("CS50 Max: " +max_cs50);
        System.out.println("Entrepreneurship Course Max: " +max_entrepreneurship);
        System.out.println("--------------------------------------------");
        System.out.println("Min Score per course ");
        System.out.println("Calculus Min: " +min_calculus);
        System.out.println("CS50 Min: " +min_cs50);
        System.out.println("Entrepreneurship Course Min: " +min_entrepreneurship);

        for (int list = 0; list<num_student; list++)
        {
            System.out.println("("+(list+1)+"): Score ("+overall_score[list]+")");
        }

        scan.close();
    }
}
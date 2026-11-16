public class Student {

        String name;
        int id;
        double cgpa;
    public static void main(String [] arsg){

        // Creating first student object
        Student s1 = new Student();
        s1.name = "Atik";
        s1.id = 78;
        s1.cgpa = 3.40;

        // Creating second student object
        Student s2 = new Student();
        s2.name = "Maruf";
        s2.id = 49;
        s2.cgpa = 3.90;

        // Creating third student object
        Student s3 = new Student();
        s3.name = "Rakib";
        s3.id = 37;
        s3.cgpa = 3.70;

        // Printing student information
        System.out.println("Name: "+s1.name);
         System.out.println("ID: "+s1.id);
          System.out.println("CGPA: "+s1.cgpa);
           
          System.out.println();

           System.out.println("Name: "+s2.name);
         System.out.println("ID: "+s2.id);
          System.out.println("CGPA: "+s2.cgpa);

          System.out.println();
          
           System.out.println("Name: "+s3.name);
         System.out.println("ID: "+s3.id);
          System.out.println("CGPA: "+s3.cgpa);

        

        


        
    }
    
}

package myproject;
import java.util.Scanner;
public class Registration{

	
	    private String FullName;
	    private int id;
	    private int age;
	    private String sex;
	    private String college;
	    private String department;
	    private double grade;
	    private int semester;
	    private int academicYear;
	    private int numofCourses;
	    private String[] courses;

	    public Registration(String name,int id, int age, String sex, String college, 
	    		String department, double grade, int semester, int academicYear,int numofCourses,String[] courses) {
	        this.FullName = name;
	        this.id = id;
	        this.age = age;
	        this.sex = sex;
	        this.college = college;
	        this.department = department;
	        this.grade = grade;
	        this.semester = semester;
	        this.academicYear = academicYear;
	        this.numofCourses = numofCourses;
	        this.courses= courses;
	    }
	    //getter method 
	    public String getFullName() {
	        return FullName;
	    }
	    public int getid() {
	    	return id;
	    }

	    public int getAge() {
	        return age;
	    }
	    
	    public String getsex() {
	        return sex;
	    }
	    public String getcollege() {
	        return college;
	    }
	    public String getdepartment() {
	        return department;
	    }
	    public double getGrade() {
	        return grade;
	    }

	    public int getSemester() {
	        return semester;
	    }

	    public int getAcademicYear() {
	        return academicYear;
	    }
	    public int getnumofCourses() {
	    	return numofCourses;
	    }
	    public String[] getcourses() {
	    	return courses;
	    }
	    
	    //setter methods
	    public void setFullName(String name) {
	        this.FullName = name;
	    }
	    
	    public void setid(int id) {
	        this.id = id;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public void setsex(String sex) {
	        this.sex = sex;
	    }
	    
	    public void setcollege(String college) {
	        this.college = college;
	    }
	    public void setdepartment(String department) {
	        this.department = department;
	    }
	    public void setGrade(double grade) {
	        this.grade = grade;
	    }

	    public void setSemester(int semester) {
	        this.semester = semester;
	    }

	    public void setAcademicYear(int academicYear) {
	        this.academicYear = academicYear;
	    }
	    public void setnumofCourses(int numofCourses) {
	    	this.numofCourses = numofCourses;
	    }
	    public void setcourses(String[] courses) {
	    	this.courses = courses;
	    }
	    //MAIN BLOCK
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        //FULLNAME INPUT
	        System.out.println("Enter your Full Name:");
	        String FullName = scanner.nextLine();
	        while (FullName.matches(".*\\d.*")) {  //regex module to match the string input
	            System.out.println("Invalid input. Please enter your name again:");
	            FullName = scanner.nextLine();
	        }
	       // ID INPUT
	        System.out.println("Enter your id:");
	        int id = 0;
	        boolean validid = false;
	        while (!validid) {
	            try {
	                id = Integer.parseInt(scanner.nextLine());
	                validid = true;
	            }
	            catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter your id again:");
	            }
	        }
	        //AGE INPUT
	        System.out.println("Enter your age:");
	        int age = 0;
	        boolean validAge = false;
	        while (!validAge) {
	            try {
	                age = Integer.parseInt(scanner.nextLine());
	                validAge = true;
	            } 
	            catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter your age again:");
	            }
	        }
	        //SEX INPUT
	        
	        System.out.println("Enter your sex (f/m):");
	        String sex = scanner.nextLine();

	        // Validate sex input
	        while (!sex.equals("f") && !sex.equals("m")) {
	            System.out.println("Invalid input. Please enter 'f' or 'm':");
	            sex = scanner.nextLine();
	        }
	        
	        
	        //COLLEGE INPUT
	        System.out.println("Enter your college:");
	        String college = scanner.nextLine();
	      
	        while (college.matches(".*\\d.*")) { //regex module to match the string input
	            System.out.println("Invalid input. Please enter your college again:");
	            college = scanner.nextLine();
	        }
	        //DEPARTMENT INPUT
	        System.out.println("Enter your department:");
	        String department = scanner.nextLine();
	        while (department.matches(".*\\d.*")) { //regex module to match the string input
	            System.out.println("Invalid input. Please enter your department again:");
	            department = scanner.nextLine();
	        }
	        //GRADE INPUT
	        System.out.println("Enter your grade:");
	        double grade = -1;
	        boolean validGrade = false;
	        while (!validGrade) {
	            try {
	                grade = Double.parseDouble(scanner.nextLine());
	                if (grade >= 0 && grade <= 4) {
	                    validGrade = true;
	                } else {
	                    System.out.println("Invalid input. Grade should be between 0.0 and 4.0. Please enter your grade again:");
	                }
	            }
	            catch (NumberFormatException e) {
	                System.out.println("Invalid input. Grade should be a number. Please enter your grade again:");
	            }
	        }
	        //SEMESTER INPUT
	        System.out.println("Enter your semester:");
	        int semester = 0;
	        boolean validSemester = false;
	        while (!validSemester) {
	            try {
	                semester = Integer.parseInt(scanner.nextLine());
	                if (semester == 1 || semester == 2) {
	                    validSemester = true;
	                } else {
	                    System.out.println("Invalid input. Semester should be either 1 or 2. Please enter your semester again:");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Semester should be an integer. Please enter your semester again:");
	            }
	        }
	       // ACADEMICYEAR INPUT
	        System.out.println("Enter your academic year:");
	        int academicYear = 0;
	        boolean validAcademicYear = false;
	        while (!validAcademicYear) {
	            try {
	                academicYear = Integer.parseInt(scanner.nextLine());
	                if (academicYear >= 1 && academicYear <= 5) {
	                    validAcademicYear = true;
	                } else {
	                    System.out.println("Invalid input. Academic year should be between 1 and 5. Please enter your academic year again:");
	                }
	            } 
	            catch (NumberFormatException e) {
	                System.out.println("Invalid input. Academic year should be an integer. Please enter your academic year again:");
	            }
	        }
	       // NUMBER OF COURSES INPUT
	        System.out.println("Enter the number of courses:");
	        String numofCoursesString = scanner.nextLine();

	       //  Validate number of courses input
	        int numofCourses = 0;
	        boolean validNumCourses = false;
	        while (!validNumCourses) {
	            try {
	                numofCourses = Integer.parseInt(numofCoursesString);
	                validNumCourses = true;
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter an integer:");
	                numofCoursesString = scanner.nextLine();
	            }
	        }
	      //  NAME OF COURSES INPUT
	        String[] courses = new String[numofCourses];

	        for (int i = 0; i < numofCourses; i++) {
	            System.out.print("Enter the name of course " + (i + 1) + ": ");
	            courses[i] = scanner.nextLine();
	        }

	        System.out.println("The following courses have been registered:");
	        for (int i = 0; i < numofCourses; i++) {
	            System.out.println((i + 1) + ". " + courses[i]);
	        }
	    
	
	        
	        Registration student = new Registration(FullName, id, age, sex, college, department, grade, semester, academicYear,numofCourses,courses);
	        System.out.println("Name: " + student.getFullName());
	        System.out.println("id: " + student.getid());
	        System.out.println("Age: " + student.getAge());
	        System.out.println("sex: " + student.getsex());
	        System.out.println("college: " + student.getcollege());
	        System.out.println("department: " + student.getdepartment());
	        System.out.println("Grade: " + student.getGrade());
	        System.out.println("Semester: " + student.getSemester());
	        System.out.println("Academic year: " + student.getAcademicYear());
	        System.out.println("Number of courses: " + student.getnumofCourses());
	        System.out.println(student.getFullName() + " is successfully registered!");
	    }
		
	    	
	}


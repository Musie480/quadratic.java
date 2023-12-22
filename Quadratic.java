import java.lang.Math;
import java.util.Scanner;
public class Quadratic {
    void display(){
System.out.println("------------------welcome to quadratic equation calculator!!-------------------");

    }
    void two_solution(double a,double b,double c){
        System.out.println("the equation has two solutions ");
     double squareroot=(b*b)-(4*a*c);
         double root1=(-b+Math.sqrt(squareroot))/2*a;
        System.out.println("the first root is "+root1);
    double squareroot2=(b*b)-(4*a*c);
double root2=(-b-Math.sqrt(squareroot))/2*a;
System.out.println("the second root is "+root2);
    }

    void one_solution(double a,double b,double c){
      System.out.println("the equation has one solution ");
     double squareroot=(b*b)-(4*a*c);
         double result=-b+Math.sqrt(squareroot);
         double root1=result/2*a;
        System.out.println("the root is "+root1);   
    }

    void no_solution(){
        System.out.println("the equation has no solution");
        System.exit(0);
    }
public static void main(String args[]){
Quadratic q1=new Quadratic();
q1.display();
Scanner input=new Scanner(System.in);
float a,b,c;
System.out.println("please enter the value of a: ");
a=input.nextFloat();
System.out.println("please enter the value of b: ");
b=input.nextFloat();
System.out.println("please enter the value of c: ");
c=input.nextFloat();
double x=(b*b)-(4*a*c);
if (x>0){
    q1.two_solution(a,b,c);
    System.exit(0);
}
else if(x==0){
    q1.one_solution(a,b,c);
     System.exit(0);
}
else{
    q1.no_solution();
    System.exit(0);
}
}


}

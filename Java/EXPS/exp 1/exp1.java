// import java.util.Scanner;
// class exp1
// {
// 	static int a,b,c,d;

// 		static void sum(int a,int b,int c,int d)
// 		{
// 			int sumr = a + c;
// 			int sumi = b + d;
// 			System.out.println("Sum of the given complex numbers is " + sumr + "+" + sumi + "i" );
// 		}
// 		static void minus(int a,int b,int c,int d)
// 		{
// 			int minusr = a - c;
// 			int minusi = b - d;
// 			System.out.println("\nSubtraction of the given complex numbers is " + minusr + "+" + minusi + "i");
// 		}
// 		// static void mul(int a,int b,int c,int d)
// 		// {
// 		// 	int multr1 = a * c;
// 		// 	int multr2 = -(b * d);
// 		// 	int multr3 = a * d;
// 		// 	int multi = b * c;
// 		// 	int multr = multr1 + multr2 + multr3; 
// 		// 	System.out.println("\nMultiplication of the given complex numbers is " + multr + multi + "i");
// 		// }
// 		// static void div(int a, int b, int c, int d)
// 		// {
// 		// 	int div1 = a * c;
// 		// 	int div2 = b * d;
// 		// 	int div3 = b * c;
// 		// 	int div4 = a * d;
// 		// 	int divi = c^2 + d^2;
// 		// 	int divr = div1 + div2 / divi;
// 		// 	int divt = div3 - div4 / divi;
// 		// 	System.out.println("\nDivision of the given complex numbers is " + divr + "+" + divt + "i");
// 		// }

// 	public static void main(String[] args)
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the real part of the first number:");
// 		a = sc.nextInt();
// 		System.out.println("Enter the imaginary part of the first number:");
// 		b = sc.nextInt();
// 		System.out.println("Enter the real part of the second number:");
// 		c = sc.nextInt();
// 		System.out.println("Enter the imaginary part of the second number:");
// 		d = sc.nextInt();

// 		sum(a,b,c,d);
// 		minus(a,b,c,d);
// 		// mul(a,b,c,d);
// 		// div(a,b,c,d);
// 	}
// }

// import java.util.*;

// // User Defined Complex class
// class Complex {

//     // Declaring variables
//     int real, imaginary;

//     // Empty Constructor
//     Complex()
//     {
//     }

//     // Constructor to accept
//     // real and imaginary part
//     Complex(int tempReal, int tempImaginary)
//     {
//         real = tempReal;
//         imaginary = tempImaginary;
//     }

//     // Defining addComp() method
//     // for adding two complex number
//     Complex addComp(Complex C1, Complex C2)
//     {
//         // creating temporary variable
//         Complex temp = new Complex();

//         // adding real part of complex numbers
//         temp.real = C1.real + C2.real;

//         // adding Imaginary part of complex numbers
//         temp.imaginary = C1.imaginary + C2.imaginary;

//         // returning the sum
//         return temp;
//     }

//     // Defining subtractComp() method
//     // for subtracting two complex number
//     Complex subtractComp(Complex C1, Complex C2)
//     {
//         // creating temporary variable
//         Complex temp = new Complex();

//         // subtracting real part of complex numbers
//         temp.real = C1.real - C2.real;

//         // subtracting Imaginary part of complex numbers
//         temp.imaginary = C1.imaginary - C2.imaginary;

//         // returning the difference
//         return temp;
//     }

//     // Function for printing complex number
//     void printComplexNumber()
//     {
//         System.out.println("Complex number: "
//                            + real + " + "
//                            + imaginary + "i");
//     }
// }

// // Main Class
// public class exp1 {

//     // Main function
//     public static void main(String[] args)
//     {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the real part of the first number:");
// 		a = sc.nextInt();
// 		System.out.println("Enter the imaginary part of the first number:");
// 		b = sc.nextInt();
// 		System.out.println("Enter the real part of the second number:");
// 		c = sc.nextInt();
// 		System.out.println("Enter the imaginary part of the second number:");
// 		d = sc.nextInt();

//         // First Complex number
//         Complex C1 = new Complex(3, 2);

//         // printing first complex number
//         C1.printComplexNumber();

//         // Second Complex number
//         Complex C2 = new Complex(9, 5);

//         // printing second complex number
//         C2.printComplexNumber();

//         // for Storing the sum
//         Complex C3 = new Complex();

//         // calling addComp() method
//         C3 = C3.addComp(C1, C2);

//         // printing the sum
//         System.out.print("Sum of ");
//         C3.printComplexNumber();

//         // calling subtractComp() method
//         C3 = C3.subtractComp(C1, C2);

//         // printing the difference
//         System.out.print("Difference of ");
//         C3.printComplexNumber();
//     }
// }

// import java.util.Scanner;

// class Complex {
// 	double real;
// 	double img;

// 	void getdata(double real, double img) {
// 		this.real = real;
// 		this.img = img;
// 	}

// 	void add(Complex c1, Complex c2) {
// 		real = c1.real + c2.real;
// 		img = c1.img + c2.img;
// 		if (img > 0) {
// 			System.out.println("Sum of complex numbers = " + real + " + " + img + "i");
// 		} else {
// 			System.out.println("Sum of complex numbers = " + real + " " + img + "i");
// 		}
// 	}

// 	void subtract(Complex c1, Complex c2) {
// 		real = c1.real - c2.real;
// 		img = c1.img - c2.img;
// 		if (img > 0) {
// 			System.out.println("Difference of complex numbers = " + real + " + " + img + "i");
// 		} else {
// 			System.out.println("Difference of complex numbers = " + real + " " + img + "i");
// 		}
// 	}

// 	void multiply(Complex c1, Complex c2) {
// 		real = (c1.real * c2.real) + (c1.img * c2.img);
// 		img = (c1.real * c2.img) + (c2.real * c1.img);
// 		if (img > 0) {
// 			System.out.println("Product of complex numbers = " + real + " + " + img + "i");
// 		} else {
// 			System.out.println("Product of complex numbers = " + real + " " + img + "i");
// 		}

// 	}

// 	void divide(Complex c1, Complex c2) {
// 		real = ((c1.real * c2.real) + (c1.img * c2.img)) / ((c2.real) * (c2.real)) +
// 				((c2.img) * (c2.img));
// 		img = ((c2.real * c1.img) - (c1.real * c2.img)) / ((c2.real) * (c2.real)) +
// 				((c2.img) * (c2.img));
// 		if (img > 0) {
// 			System.out.println("Division of complex numbers = " + real + " + " + img + "i");
// 		} else {
// 			System.out.println("Division of complex numbers = " + real + " " + img + "i");
// 		}
// 	}
// }

// class exp1 {
// 	public static void main(String args[]) {
// 		double a, b, c, d;
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the value of real part of 1st complex number: ");
// 		a = sc.nextDouble();
// 		System.out.println("Enter the value of imaginary part of 1st complex number: ");
// 		b = sc.nextDouble();
// 		System.out.println("Enter the value of real part of 2nd complex number: ");
// 		c = sc.nextDouble();
// 		System.out.println("Enter the value of imaginary of 2nd complex number: ");
// 		d = sc.nextDouble();
// 		Complex c1 = new Complex();
// 		c1.getdata(a, b);
// 		Complex c2 = new Complex();
// 		c2.getdata(c, d);
// 		Complex c3 = new Complex();
// 		c3.add(c1, c2);
// 		Complex c4 = new Complex();
// 		c4.subtract(c1, c2);
// 		Complex c5 = new Complex();
// 		c5.multiply(c1, c2);
// 		Complex c6 = new Complex();
// 		c6.divide(c1, c2);
// 	}
// }

import java.util.*;

class ComplexNumber 
{
    public float real, imaginary;
        ComplexNumber() 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter real part: ");
            real = sc.nextInt();
            System.out.println("Enter imaginary part: ");
            imaginary= sc.nextInt();
        }
        public void sum(ComplexNumber b) 
        {
            float s = imaginary + b.imaginary;
            float r = real + b.real;
            System.out.println("Sum of the two Complex numbers is " + r + " + " + s + "i");
        }
        static void sum(ComplexNumber a, ComplexNumber b) 
        {
            float s = a.imaginary + b.imaginary;
            float r = a.real + b.real;
            System.out.println("Sum of the two Complex numbers is " + r + " + " + s + "i");
        }
        public void subtract(ComplexNumber b) 
        {
            float s = imaginary - b.imaginary;
            float r = real - b.real;
            System.out.println("Difference of the two Complex numbers is " + r + "+" + s + "i");
        }
        static void subtract(ComplexNumber a, ComplexNumber b) 
        {
            float s = a.imaginary - b.imaginary;
            float r = a.real - b.real;
            System.out.println("Difference of the two Complex numbers is " + r + "+" + s + "i");
        }
        public void multiply(ComplexNumber b) 
        {
            float s = imaginary * b.real+ real * b.imaginary;
            float r = real * b.real - imaginary * b.imaginary;
            System.out.println("Product of the two Complex numbers is " + r + "+" + s + "i");
        }
        static void multiply(ComplexNumber a,ComplexNumber b) 
        {
            float s = a.imaginary * b.real+ a.real * b.imaginary;
            float r = a.real * b.real - a.imaginary * b.imaginary;
            System.out.println("Product of the two Complex numbers is " + r + "+" + s + "i");
        }
        public void divide(ComplexNumber b) 
        {
            float s = imaginary * b.real+ real * b.imaginary * -1;
            float r = real * b.real - imaginary * b.imaginary * -1;
            float di = b.real*b.real+b.imaginary*b.imaginary;
            System.out.println("Divsion of the two Complex numbers is " + r/di + "+" + s/di + "i");
        }
        static void divide(ComplexNumber a,ComplexNumber b) 
        {
            float s = a.imaginary * b.real+ a.real * b.imaginary * -1;
            float r = a.real * b.real - a.imaginary * b.imaginary * -1;
            float di = b.real*b.real+b.imaginary*b.imaginary;
            System.out.println("Divsion of the two Complex numbers is " + r/di + "+" + s/di + "i");
        }
        }
        class exp1{
        public static void main(String[] args) 
        {
            ComplexNumber a = new ComplexNumber();
            ComplexNumber b = new ComplexNumber();
            a.sum(b);
            a.subtract(b);
            a.multiply(b);
            a.divide(b);
        }
}
package groovyDay1

class Operators {

	static main(args) {
		
		
		println("enter value for a and b ")
		Scanner sc= new Scanner(System.in)
		int a=sc.nextInt()
		int b=sc.nextInt()
		println("addition of a and b is= "+(a+b))
		//new way of adding
		println("value of a is $a and value of b is $b")
		println("addition of a and b is= "+a.plus(b))
		println("multiplication of a and b is= "+a.multiply(b))
		println("division of a and b is= "+a.div(b))
		println("subtraction of a and b is= "+a.minus(b))
		
		
	}

}

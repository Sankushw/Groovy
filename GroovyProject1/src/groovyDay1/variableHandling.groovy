package groovyDay1

import groovy.ui.SystemOutputInterceptor

class variableHandling {

	static void main(args) {
		
		int a=5;
		//loose typing--use def for variable to allow groovy to assign data type at run time
		def b=6
		String c="sanjay kushwaha";
		println("addition of a and b is= "+(a+b))
		print("name is $c")
		//$ symbol can be used inside quotes also to poit to variable
		// semi colon at the line end is not mandatory
		
		println("enter value for d")
		Scanner sc= new Scanner(System.in)
		int d=sc.nextInt()
		println("addition of a and d is= "+(a+d))
		
	}

}

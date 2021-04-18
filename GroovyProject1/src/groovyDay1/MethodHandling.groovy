
package groovyDay1

class MethodHandling {

	static main(args) {
		display()
		add(5, 7)
		int result= divide(20)
		println("divide result= "+result)
	}

	static Void display()
	{	
		println("hello world")
	}

	static Void add(int a, int b)
	{
		def result=a+b
		println("sum= "+result)
	}
	
	//below gives argument mismatch error in java but not in groovy
	static int divide(int a, int b=5)
	{
		def result=a/b
		return result
}
}

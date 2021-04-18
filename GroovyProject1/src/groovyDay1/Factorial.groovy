package groovyDay1

class Factorial {

	static main(args) {

		println("enter value to calculate its factorial")
		Scanner sc= new Scanner(System.in)
		def fc=sc.nextInt()
		int result=1
		for(int i=1; i<=fc; i++)
		{
			result=result*i
		}
		println("factorial of number is= "+result)

		// new way of writing for loop using range operator "in"
		result=1
		for(def i in fc..1)
		{
			result=result*i
		}
		println("factorial of number is= "+result)

		def i= 1..fc
		println("size of range is= "+i.size())
		for(def j in i)
		{
			println(j)
		}
		println("starting value of range  is= "+i.getFrom())
		println("ending value of range  is= "+i.getTo())
		println("value at index 3 in range  is= "+i.get(3))
		println("Does i contains value 6= "+i.contains(6))
	}
}

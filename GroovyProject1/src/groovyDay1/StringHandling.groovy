package groovyDay1

class StringHandling {

	static main(args) {
		
		println("enter a name")
		Scanner sc= new Scanner(System.in)
		String name=sc.next()
		println("name entered is= "+name)
		println("name length is= "+name.length())
		println("reverse order of name  is= "+name.reverse())
		println("value at last index is= "+name[-1])
		println("value at last index is= "+name[name.length()-1])
		println("reverse order of name  is= "+name[-1..0])
		println("values from index 2 to 4 are= "+name[2..4])
	}

}

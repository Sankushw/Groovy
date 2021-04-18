package groovyDay1

class ArrayHandling {

	static main(args) {
		
		def array=[10,20,30,40]
		println("size of array is= "+array.size())
		for(int i=0; i<array.size(); i++)
			{
				println(array[i])
			}
			println("Does i contains value 40= "+array.contains(40))
	}

}

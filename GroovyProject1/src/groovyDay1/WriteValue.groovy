package groovyDay1

class WriteValue {

	static main(args) {
		
		String filepath="C:\\Users\\SanjayKushwaha\\Desktop\\testgroovy.txt"
		File myfile= new File(filepath)
		myfile<<("\n this is my new line1")
		myfile<<("\n this is my new line2")
		def filelength=myfile.length()
		print("length of a file is "+filelength)


	}

}

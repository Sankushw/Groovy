package groovyDay1

import groovy.json.StringEscapeUtils
import groovy.swing.impl.DefaultAction

class ReadText {

	static main(args) {

		String filepath=("C:\\Users\\SanjayKushwaha\\Desktop\\testgroovy.txt")
		File myfile= new File(filepath)
		print (myfile.text)
		def list = myfile.collect{it}
		println("list=$list")
		def array = myfile as String[]
		println("array : $array")
	}
}

package groovyDay1

class ListHandling {

	static main(args) {

		def listvalue=[10,20,30,40]
		println("size of array is= "+listvalue.size())
		for(int i=0; i<listvalue.size(); i++)
		{
			println(listvalue[i])
			println(listvalue.get(i))
					
		}
		listvalue.add(50)
		def Newlistvalue=listvalue
		println("new list= "+Newlistvalue)
		listvalue.add(2,70)
		println("new list after adding 70 at index 2= "+Newlistvalue)
		//to remove value from last index---pop
		listvalue.pop()
		println("new list after pop= "+Newlistvalue)
		listvalue.remove(4)
		println("new list after removing index 4= "+Newlistvalue)
		
		def Revlist=Newlistvalue.reverse()
		println("reversed list = "+Revlist)
	}

	}

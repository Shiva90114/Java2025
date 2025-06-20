
// Function overloding - name mangling

#include<iostream>
class Demo {
	public:       
	void add(int x, int y){ //_Z3addii
		       std::cout << x+y << std::endl;


	       } 
              void add(int x, int y,int z){ //_Z3addiii
              std::cout << x+y+z << std::endl;

	   }
};
int main(){
              Demo obj;
              obj.add(20,30);
              obj.add(20,30,40);
}



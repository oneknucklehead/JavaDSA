#What is recursion:
	-> Recursion means a function calling itself.
	-> Working: the function calls are stacked on top of the other in the stack data structure. The first function that gets pushed into the stack is the function(usually the main function) which is calling the recursive function. While the function is not finished executing, it will remain in stack. When a function finishes executing, it is removed from the stack and the flow of the program is restored into where the function was called.
	->Terminologies: (1)Base condition: That condition where our recursive function will stop making new calls. No base condition implies that the function will keep making calls and the stack will be filled again and again leading to the memory of the computer to exceed the limit, thus giving STACKOVERFLOW error.
The base condition is usually represented by the answers we already have.
			(2)Recurrence relation: The equation through which the complex problem is broken into smaller problems. eg: for fibonacci number, recurrence relation is:-
			fib(N)=fib(N-1)+fib(N-2) 
			(3)Recusrsive Tree: the flow which describes how the function calls are being pushed or popped in and out of the stack memory.

#How to approach a recursive problem:
	->firstly, identify if we can breakdown the existing problem into a smaller problems
	->Find out the recurrence relation (if necessary, otherwise don't)
	->Map out the recursive tree
		->check the flow of the functions as to how they are getting in the stack	
		->Identify and focus on the left tree calls and then the right tree calls
		-> Draw the tree and pointers again and again using pen and paper
		-> use debugger to see the flow
	->See how the values and what type of values(int, char, string etc.) are returned at each step. See whether the function call will come out. In the end we will come out of the main function.


POINT TO BE NOTED: Make sure to return the result of a function call of the return type.

##Types of recurrence relation: 
	-> Linear recurrence relation (eg: fibonacci using recursion)
	-> Divide and conquer recurrence relation (eg: Binary Search) 
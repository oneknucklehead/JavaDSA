#What is Inserion sort:
-> In this algorithm, we start partially sortint the array from the left i.e, we first sort till index number 1, then till index number 2, then index number 3, so on till N.
-> For every Index: we put that index element at the correct index to the left hand side of the array.
-> Time Complexity: Worst Case - O(N^2) (When the array is sorted in the direction opposite to the direction we need)
		    Best Case  - O(N) (When the array is already sorted)
-> Why is it used?
	=> Adaptive: Steps are reduced if the array is sorted. Number of steps are reduced as compared to bubble sort.
	=> Stable sorting algorithm
	=> Used for smaller values of N. Works good when the array is partially sorted. Thus it takes part in hybrid sorting algorithms. (If a programming language has an in-built sorting algrithm, chances are that the programming language uses insertion sort somewhere behind the scene) 
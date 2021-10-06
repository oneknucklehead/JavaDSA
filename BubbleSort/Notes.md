#What is Bubble Sort:
-> It sorts elements of the given array in an increasing(or decreasing) manner.

-> With every pass, this algorithm shifts the largest element to its respective position towards the end of the array(in case of increasing) i.e it shifts the largest element to the last position, then the second largest element to the second largest position and so on.

-> It is a stable sorting algorithm i.e. something like this=> [Stable Sort](https://drive.google.com/file/d/12ypUkJVqVAavhEE9Mid8PS6OA2KmbpVM/view?usp=sharing)
	In short, it means that if two elements have the same value then the initial positioning of the values will be maintained. Example: let say we have two balls of value 10 each and first ball is of red colour and second is black. If initially the red ball was positioned before black black then even after sorting the balls on the basis of their value, the red ball will remain before the black ball.
	
-> Time complexity: Best case - O(N) (When the array is already sorted).
		    Worst case - O(N^2) (When the array is sorted in the direction opposite to the direction we need.
		    
-> Space complexity: O(1). Since no extra variables is required like copying the arrays etc.

-> Also known as exchange sort or sinking sort

-> This algorithm is also known as inplace sorting algorithm since the space complexity is constant.
	=>An in-place algorithm is an algorithm that does not need an extra space and produces an output in the same memory that contains the data by transforming the input ‘in-place’. However, a small constant extra space used for variables is allowed. 

 For more details:
 [Click here](https://www.youtube.com/watch?v=F5MZyqRp_IM)

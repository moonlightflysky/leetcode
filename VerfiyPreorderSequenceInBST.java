package lc_tree;

import java.util.Stack;

public class VerfiyPreorderSequenceInBST {
	
    public boolean verifyPreorder(int[] preorder) {
    	
    	if (preorder == null || preorder.length == 0){
    		return true;
    	}
    	
    	int N = preorder.length;
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	int min = Integer.MIN_VALUE;
    	
    	for (int i = 0; i < N; i++){
    		
    		if (preorder[i] < min){
    			return false;
    		}
    		
    		while (!stack.isEmpty() && preorder[i] > stack.peek()){
    			min = stack.pop();
    		}
    		
    		stack.push(preorder[i]);
    		
    	}
    	
    	return true;
    	
        
    }

}

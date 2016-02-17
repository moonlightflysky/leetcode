package lc_tree;

import java.util.Stack;

public class VerifyPostOrderSequenceInBST {
	
    public boolean verifyPostorder(int[] postorder) {
    	
    	if (postorder == null || postorder.length == 0){
    		return true;
    	}
    	
    	int N = postorder.length;
    	Stack<Integer> stack = new Stack<Integer>();
    	int upperbound = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < N; i++){
    		
    		while (!stack.isEmpty() && stack.peek() > postorder[i]){
    			upperbound = stack.pop();
    		}
    		
    		if (postorder[i] > upperbound){
    			return false;
    		}
    		
    		stack.push(postorder[i]);
    		
    	}
    	
    	return true;
        
    }


}

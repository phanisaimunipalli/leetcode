// Two Pointers (i=left, i+1=right) and say maxProfit=0
        // Eg: 7 1 5 3 6 4

        int left = 0;   // buy
        int right = 1;  // sell
        int maxProfit = 0;
        // 7    1   5   3   6   4
        //left  rig             prices.length
        while(right < prices.length){   // Start from right to end of array
            if(prices[left] < prices[right]){   // consider only if left is < right (buy and then sell)
                int profit = prices[right] - prices[left];
                // check the profit and if its > maxProfit, update the maxProfit or keep existing maxProfit
                maxProfit = profit > maxProfit ? profit : maxProfit;
            }else{
                // move the buy(left) pointer
                // 7    1     5   3   6   4
                //     left            
                left = right;
            }
            //irrespective of left < or > right, always move right (sell) pointer
            // because selling can only happen after buying
            // move the sell(right) pointer  
            // 7    1     5   3   6   4
            //          right     
            right = right + 1;
        }
        return maxProfit; 

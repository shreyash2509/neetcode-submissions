class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> x=new HashMap<>();
        for (int num:nums){
            x.put(num, x.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for ( int num:x.keySet()){
            int count=x.get(num);
            if(bucket[count]==null){
                bucket[count]=new ArrayList<>();
            }
            bucket[count].add(num);
        }
        
        int[] ans=new int[k];
        int index=0;
        
        for (int i=bucket.length-1;i>=0&& index<k;i--){
            if (bucket[i]!=null){
                for (int num:bucket[i]){
                    ans[index++]=num;
                    if (index==k){
                        break;
                    }
                }
            }
        }
        return ans;
    }
}

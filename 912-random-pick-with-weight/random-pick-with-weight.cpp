class Solution {
public:
    vector<int> pf;
    int total;
    Solution(vector<int>& arr) {
        total = 0;
        for(int i: arr){
            total += i;
            pf.push_back(total);
        }
    }
    
    int pickIndex() {
        int num = rand() % total + 1;
        int left = 0, right = pf.size() - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(pf[mid] < num) left = mid + 1;
            else right = mid;
        }
        return left;
    }
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(w);
 * int param_1 = obj->pickIndex();
 */
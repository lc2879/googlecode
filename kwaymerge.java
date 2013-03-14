/**
 * Definition for singly-linked list.
 * struct ListNode {
 * int val;
 * ListNode *next;
 * ListNode(int x) : val(x), next(NULL) {}
 * };
 */
#include<priority_queue>
class comp{
public:
    bool operator() (const ListNode* a, const ListNode* b)    { 
        return (a->val > b->val);
    }
};

class Solution {
public:
    ListNode *mergeKLists(vector<ListNode *> &lists) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int k = lists.size();
        if(k==0) return NULL;
        bool maxheap = false;
        priority_queue<ListNode*, vector<ListNode*>,comp> myheap;
        ListNode * output,*cur;
        for(int i=0;i<k;i++){
            if(lists[i]!=NULL) myheap.push(lists[i]);
        }
        if(myheap.empty()) return NULL;
        output = myheap.top();
        myheap.pop();
        cur = output;
        if(cur->next != NULL) myheap.push(cur->next);
        while(!myheap.empty()){
            cur->next = myheap.top();
            myheap.pop();
            cur = cur->next;
            if(cur->next != NULL) myheap.push(cur->next);
        }
        return output;
    }
};
